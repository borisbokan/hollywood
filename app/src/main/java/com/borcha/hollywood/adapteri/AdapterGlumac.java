package com.borcha.hollywood.adapteri;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.borcha.hollywood.R;

import java.util.ArrayList;

import com.borcha.hollywood.model.Glumac;
import com.borcha.hollywood.pomocne.SlikaGlumca;

/**
 * Created by androiddevelopment on 20.5.17..
 */

public class AdapterGlumac extends ArrayAdapter<Glumac> {

    private final ArrayList<Glumac> glumci;
    Context con;
    ImageView imgGlumac;
    TextView imePrezime;

    public AdapterGlumac(Context context, ArrayList<Glumac> _glumci) {
        super(context, R.layout.stavka_liste_glumca);
        con = context;
        glumci = _glumci;

    }


    @Override
    public View getView(int position, View vi, ViewGroup parent) {

        Glumac glumac = this.getItem(position);

        imgGlumac = (ImageView) vi.findViewById(R.id.slika_glumca_stavka);
        imePrezime = (TextView) vi.findViewById(R.id.txvPrezimeIme_stavka);

        imgGlumac.setImageDrawable(SlikaGlumca.getSlikaGlum(con,glumac.getSlika()));
        imePrezime.setText(glumac.getIme() + ", " + glumac.getPrezime());

        return vi;
    }

}
