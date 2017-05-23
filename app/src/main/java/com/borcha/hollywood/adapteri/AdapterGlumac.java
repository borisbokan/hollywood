package com.borcha.hollywood.adapteri;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.borcha.hollywood.R;

import java.util.ArrayList;

import com.borcha.hollywood.model.Glumac;
import com.borcha.hollywood.pomocne.SlikaGlumca;
import com.borcha.hollywood.pomocne.mojDatum;

/**
 * Created by androiddevelopment on 20.5.17..
 */

public class AdapterGlumac extends ArrayAdapter<Glumac> {


    Context con;
    ImageView imgGlumac;
    TextView imePrezime,datumRodSmr;

    public AdapterGlumac(Context context, ArrayList<Glumac> _glumci) {
        super(context, R.layout.stavka_liste_glumca,_glumci);
        con = context;


    }


    @Override
    public View getView(int position, View vi, ViewGroup parent) {

        LayoutInflater ly=(LayoutInflater)con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        vi=ly.inflate(R.layout.stavka_liste_glumca,null);

        final Glumac glumac = this.getItem(position);

        imgGlumac = (ImageView) vi.findViewById(R.id.slika_glumca_stavka);
        imePrezime = (TextView) vi.findViewById(R.id.txvPrezimeIme_stavka);
        datumRodSmr=(TextView)vi.findViewById(R.id.txvGodinaRodjenjaSmrti_stavka);


        final SlikaGlumca slika=new SlikaGlumca(getContext());

        imgGlumac.setImageDrawable(slika.getSlikaGlumca(glumac.getSlika()));
        imePrezime.setText(glumac.getIme() + ", " + glumac.getPrezime());
        datumRodSmr.setText(mojDatum.getFormatiranDatum(glumac.getDatumRodjenja()));

        vi.setTag(glumac);

        return vi;
    }

}
