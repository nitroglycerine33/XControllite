package com.eclipse.xcontrollite.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eclipse.xcontrollite.R;

public class GeneralSettingsFragment extends Fragment {

    public GeneralSettingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.general_settings, container, false);

        return v;
    }
}
