package com.borcha.hollywood.synchro;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

/**
 * Created by borcha on 28.05.17..
 */

public class MyAsTaKomentar extends AsyncTask<String,Void,String>{

    private int tipVeze;
    private Context cont;

    public MyAsTaKomentar(Context baseContext,int _tipVeze) {
        this.tipVeze=_tipVeze;
        this.cont=baseContext;


    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... vrednost) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return vrednost[0];
    }

    @Override
    protected void onPostExecute(String proslVrednost) {
        super.onPostExecute(proslVrednost);

        Intent ints = new Intent("MYSYNC_DATA");
        ints.putExtra("tipveze",this.tipVeze);
        ints.putExtra("REZULTAT",proslVrednost);
        this.cont.sendBroadcast(ints);

    }
}
