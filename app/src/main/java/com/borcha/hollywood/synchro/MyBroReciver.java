package com.borcha.hollywood.synchro;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.borcha.hollywood.aktivnosti.MainActivity;
import com.borcha.hollywood.pomocne.myNotification;

/**
 * Created by borcha on 28.05.17..
 */

public class MyBroReciver extends BroadcastReceiver {

    private  Context cont;
    public static final int broj_zahteva=1;



    @Override
    public void onReceive(Context context, Intent _intent) {

        this.cont=context;
        if(_intent.getAction().equals(MainActivity.MYACTION_FILTER_COMMENT_ACTOR)){
           String rezKomentar = _intent.getExtras().getString("REZULTAT");
           int tipKon=_intent.getIntExtra("tipveze",0);

            notifikacija(this.cont,"Komentar",rezKomentar,tipKon);
        }
    }

    private void notifikacija(Context _context,String _naslov,String _komentar,int _tipVeze){
        myNotification obavestenje=new myNotification(_context,_naslov,_komentar,_tipVeze);
        NotificationManager notMan=(NotificationManager)cont.getSystemService(Context.NOTIFICATION_SERVICE);
        notMan.notify(broj_zahteva,obavestenje.build());
    }
}
