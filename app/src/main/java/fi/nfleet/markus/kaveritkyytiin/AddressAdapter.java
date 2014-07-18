package fi.nfleet.markus.kaveritkyytiin;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by markuz on 18.7.2014.
 */
public class AddressAdapter extends ArrayAdapter<Pair<String, String>>{
    private ArrayList<Pair<String, String>> addresses;

    public AddressAdapter(Context context, int textViewResourceId, ArrayList<Pair<String, String>> addresses) {
        super(context, textViewResourceId, addresses);
        this.addresses = new ArrayList<Pair<String, String>>();
    }

    //TODO an adapter to create a ListView of CheckBoxes out of ArrayList of String pairs.
}
