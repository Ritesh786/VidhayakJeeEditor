package fujitsu.vidhayak.vidhayakjeeeditor.Fragments;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import fujitsu.vidhayak.vidhayakjeeeditor.InternalActivity.UpdateLocation;
import fujitsu.vidhayak.vidhayakjeeeditor.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements View.OnClickListener {

    Button mupdatelocation_btn;
    int i = 0;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        mupdatelocation_btn = (Button) view.findViewById(R.id.updatelocation_btn);
        mupdatelocation_btn.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {

        startActivity(new Intent(getContext(),UpdateLocation.class));

    }
}
