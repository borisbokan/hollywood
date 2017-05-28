package com.borcha.hollywood.synchro;

import android.app.Activity;
import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.borcha.hollywood.R;
import com.borcha.hollywood.adapteri.AdapterGlumac;
import com.borcha.hollywood.fragmenti.FragmentLista;

/**
 * Created by borcha on 24.05.17..
 */

public class myAsyncTask extends AsyncTask<Void,Void,Void> {

    private Activity activity;
    private AdapterGlumac adapterGlumac;
    private FragmentLista.onItemGlumacSelectListener listaGlumacaListener;



    public myAsyncTask(Activity _activity, AdapterGlumac _adGlumac) {
        super();
        this.activity=_activity;
        this.adapterGlumac=_adGlumac;
        listaGlumacaListener=(FragmentLista.onItemGlumacSelectListener)activity;
    }


    @Override
    protected Void doInBackground(Void... voids) {


        try {

            Thread.sleep(6000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }


    private void puniListu(){
        ListView lsvGlumci=(ListView)activity.findViewById(R.id.lvListaGlumaca_lista);
        lsvGlumci.setAdapter(adapterGlumac);

        lsvGlumci.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                listaGlumacaListener.onGlumacSelect(pos);
            }
        });

    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Toast.makeText(activity,"Pocetak ucitavanja liste glumaca",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPostExecute(Void vo) {
        super.onPostExecute(vo);
        puniListu();
        Toast.makeText(activity,"Lista glumaca ucitana",Toast.LENGTH_SHORT).show();

    }


}
