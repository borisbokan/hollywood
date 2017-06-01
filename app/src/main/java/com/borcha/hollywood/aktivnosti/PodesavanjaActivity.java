package com.borcha.hollywood.aktivnosti;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;
import android.widget.CheckBox;

import com.borcha.hollywood.R;
import com.borcha.hollywood.synchro.ServObavestenja;

/**
 * Created by androiddevelopment on 16.5.17..
 */

public class PodesavanjaActivity extends PreferenceActivity implements View.OnClickListener {


    private CheckBox chbObavestenja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.podesavanja);

        chbObavestenja=(CheckBox)findViewById(R.id.chbPrikaz_obaestenja_notif);

        chbObavestenja.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ServObavestenja obavestenja=new ServObavestenja();
    }
}
