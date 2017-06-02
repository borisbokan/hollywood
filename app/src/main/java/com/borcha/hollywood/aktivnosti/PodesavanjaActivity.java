package com.borcha.hollywood.aktivnosti;

import android.content.IntentFilter;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceActivity;
import android.widget.CheckBox;

import com.borcha.hollywood.R;
import com.borcha.hollywood.synchro.MyBroReciver;

/**
 * Created by androiddevelopment on 16.5.17..
 */

public class PodesavanjaActivity extends PreferenceActivity  {




    private MyBroReciver simRec;
    private CheckBoxPreference chbObavestenja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.podesavanja);




    }




}
