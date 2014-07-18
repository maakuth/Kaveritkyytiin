package fi.nfleet.markus.kaveritkyytiin;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Log;
import android.util.Pair;

import java.util.ArrayList;

/**
 * Searches for friends with addresses in Android Contact list
 */
public class FriendFinder {
    private ContactsContract contactsContract;
    private Context context;
    private String TAG = "FriendFinder";

    public FriendFinder(Context i_context) {
        contactsContract = new ContactsContract();
        context = i_context;
    }

    public ArrayList<Pair<String, String>> getContactsWithAddresses()
    {
        ArrayList<Pair<String, String>> resultContacts = new ArrayList<Pair<String, String>>();

        resultContacts.add(new Pair<String, String>("Markus", "Pajatie 8, 40500 Jyväskylä"));
        resultContacts.add(new Pair<String, String>("Ane", "Taitoniekantie 9, 40500 Jyväskylä"));
        resultContacts.add(new Pair<String, String>("Jarkko", "Tuohitie 42, 40500 Jyväskylä"));

        return resultContacts;

        //FIXME: Don't use mockup, actual look up the addresses

        /*

        ContentResolver cr = context.getContentResolver();
        Cursor cursor;

        try {
            Uri uri = ContactsContract.Contacts.CONTENT_URI;

            String[] projection = new String[]
                    {
                            ContactsContract.Contacts.DISPLAY_NAME,
                            ContactsContract.CommonDataKinds.StructuredPostal.STREET //FIXME This is invalid column for some reason.
                    };

            String where = ContactsContract.Contacts.IN_VISIBLE_GROUP + " = '1'";
            String[] selectionArgs = null;

            String sortOrder = ContactsContract.Contacts.DISPLAY_NAME;

            cursor = cr.query(uri, projection, where, selectionArgs, sortOrder);

            while (cursor.moveToNext())
            {
                Pair<String, String> resultrow = new Pair<String, String>(
                        cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)),
                        cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_ITEM_TYPE))
                );
                resultContacts.add(resultrow);

                cursor.getString(cursor.getPosition());

            }
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
            Log.e(TAG, "Error"  + message, ex);
        }

*/

        return resultContacts;
    }
}
