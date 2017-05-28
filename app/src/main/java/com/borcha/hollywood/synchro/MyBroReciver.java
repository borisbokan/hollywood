package com.borcha.hollywood.synchro;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.borcha.hollywood.mydialogs.MyCommentDialog;
import com.borcha.hollywood.pomocne.myNotification;

/**
 * Created by borcha on 28.05.17..
 */

public class MyBroReciver extends BroadcastReceiver {

    private  Context cont;

    public MyBroReciver(Context _cont) {
        super();
        this.cont=_cont;
    }

    @Override
    public void onReceive(Context context, Intent _intent) {

        if(_intent.getAction().equals("MYSYNC_DATA")){
           String rezKomentar = _intent.getExtras().getString("REZULTAT");

            notifikacija(this.cont,"Komentar",rezKomentar);
        }
    }

    private void notifikacija(Context _context,String _naslov,String _komentar){
        myNotification obavestenje=new myNotification(_context,_naslov,_komentar);
        NotificationManager notMan=(NotificationManager)cont.getSystemService(Context.NOTIFICATION_SERVICE);
        notMan.notify(1,obavestenje.build());
    }
}
