package com.eclipse.xcontrollite.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.eclipse.xcontrollite.R;
import com.eclipse.xcontrollite.settings.BaseSetting.OnSettingChangedListener;
import com.eclipse.xcontrollite.settings.CheckboxSetting;

public class BatterySettingsFragment extends Fragment implements OnSettingChangedListener {

    CheckboxSetting mBatteryIndicator, mBatteryIndicatorPlugged;

    public BatterySettingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.battery_settings, container, false);

        mBatteryIndicator = (CheckboxSetting) v.findViewById(R.id.battery_percentage_indicator);
        mBatteryIndicatorPlugged = (CheckboxSetting) v.findViewById(R.id.battery_percentage_indicator_plugged);

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBatteryIndicator.setOnSettingChangedListener(this);
    }

    @Override
    public void onSettingChanged(String table, String key, String oldValue, String value) {
        if ("eclipse".equals(table)) {
            mBatteryIndicatorPlugged.setVisibility(mBatteryIndicator.isChecked() ? View.VISIBLE : View.GONE);
        }
    }
}
