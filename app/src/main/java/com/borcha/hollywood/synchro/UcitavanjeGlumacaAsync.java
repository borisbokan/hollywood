package com.borcha.hollywood.synchro;

import android.app.Activity;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by borcha on 24.05.17..
 */

public class UcitavanjeGlumacaAsync extends AsyncTask<Void,Void,Void> {

    private Activity activity;
    private int brojac=0;
    private ListView listaGlumaca;

    public UcitavanjeGlumacaAsync(Activity _activity) {
        super();
        this.activity=_activity;
    }


    @Override
    protected Void doInBackground(Void... voids) {


        try {
            brojac++;
            Thread.sleep(brojac*1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }




    @Override
    protected void onPreExecute() {

        Toast.makeText(activity,"Pocetak ucitavanja liste glumaca",Toast.LENGTH_SHORT).show();
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void vo) {
        super.onPostExecute(vo);

        Toast.makeText(activity,"Lista glumaca ucitana",Toast.LENGTH_SHORT).show();

    }


}
