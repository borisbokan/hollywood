package com.borcha.hollywood.aktivnosti;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.borcha.hollywood.R;

/**
 * Created by androiddevelopment on 16.5.17..
 */

public class PodesavanjaActivity extends PreferenceActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.podesavanja);
    }
}
