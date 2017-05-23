package com.borcha.hollywood.fragmenti;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.borcha.hollywood.R;
import com.borcha.hollywood.adapteri.AdapterGlumac;
import com.borcha.hollywood.aktivnosti.MainActivity;
import com.borcha.hollywood.model.Glumac;
import com.borcha.hollywood.pomocne.SlikaGlumca;
import com.borcha.hollywood.pomocne.mojDatum;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by androiddevelopment on 20.5.17..
 */


public class FragmentDetalji extends Fragment implements FragmentLista.onItemGlumacSelectListener{


    private ImageView imgSlikaGlumca;
    private TextView tvImePrezimeGlumca,tvBiografija,txvRatingOcena;
    private RatingBar ratingBarGlumca;
    private FloatingActionButton fabDodajGlumca;
    int position=0;
    private Glumac glumac;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View vi=inflater.inflate(R.layout.detalji_fragment,container,false);

        return vi;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("pos",position);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(savedInstanceState!=null){
            position=savedInstanceState.getInt("pos",0);

        }

        imgSlikaGlumca=(ImageView)getView().findViewById(R.id.slikaGlumca_detalji);
        tvImePrezimeGlumca=(TextView)getView().findViewById(R.id.txtImePrezime_detalji);
        tvBiografija=(TextView)getView().findViewById(R.id.txvBiografija_detalji);
        ratingBarGlumca=(RatingBar)getView().findViewById(R.id.ratingBar_detalji);
        fabDodajGlumca=(FloatingActionButton)getView().findViewById(R.id.fabDodajGlumca_detalji);
        txvRatingOcena=(TextView)getView().findViewById(R.id.txvRatinOcena_detalji);
        //Podaci
        glumac=MainActivity.adGlumci.getItem( this.position);

        SlikaGlumca slika=new SlikaGlumca(getActivity());
        imgSlikaGlumca.setImageDrawable(slika.getSlikaGlumca(glumac.getSlika().toString()));

        fabDodajGlumca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Akcija dodaj novog glumca",Toast.LENGTH_SHORT).show();
            }
        });


        tvImePrezimeGlumca.setText(glumac.getIme()+ " " + glumac.getPrezime() + "\n" + mojDatum.getFormatiranDatum(glumac.getDatumRodjenja()));


        ratingBarGlumca.setRating(glumac.getRejting());
        txvRatingOcena.setText(String.format("%.2f",glumac.getRejting()));
        tvBiografija.setText(glumac.getBiografija());


    }


    public void updateContent(final int _pos) {

        this.position=_pos;

        imgSlikaGlumca=(ImageView)getView().findViewById(R.id.slikaGlumca_detalji);
        tvImePrezimeGlumca=(TextView)getView().findViewById(R.id.txtImePrezime_detalji);
        tvBiografija=(TextView)getView().findViewById(R.id.txvBiografija_detalji);
        ratingBarGlumca=(RatingBar)getView().findViewById(R.id.ratingBar_detalji);
        fabDodajGlumca=(FloatingActionButton)getView().findViewById(R.id.fabDodajGlumca_detalji);
        txvRatingOcena=(TextView)getView().findViewById(R.id.txvRatinOcena_detalji);
        //Podaci
        glumac=MainActivity.adGlumci.getItem( this.position);

        SlikaGlumca slika=new SlikaGlumca(getActivity());
        imgSlikaGlumca.setImageDrawable(slika.getSlikaGlumca(glumac.getSlika().toString()));


        tvImePrezimeGlumca.setText(glumac.getIme()+ " " + glumac.getPrezime() + "\n" + mojDatum.getFormatiranDatum(glumac.getDatumRodjenja()));

        ratingBarGlumca.setRating(glumac.getRejting());
        txvRatingOcena.setText(String.format("%.2f",glumac.getRejting()));
        tvBiografija.setText(glumac.getBiografija());



    }

    public void setContent(final int _pos) {

        this.position=_pos;

    }


    @Override
    public void onGlumacSelect(int position) {
        this.position=position;


    }
}
