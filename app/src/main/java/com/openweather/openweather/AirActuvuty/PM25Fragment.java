package com.openweather.openweather.AirActuvuty;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openweather.openweather.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PM25Fragment extends Fragment {


    public PM25Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pm25, container, false);
    }

}
