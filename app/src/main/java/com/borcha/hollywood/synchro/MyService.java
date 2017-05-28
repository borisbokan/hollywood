package com.borcha.hollywood.synchro;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by borcha on 28.05.17..
 */

public class MyService extends Service{


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent _intent, int flags, int startId) {
        //Uzimam komentar i tip veze od intenta (MyMainAc...)
        String komentar=_intent.getStringExtra("komentar");
        int tipveze=_intent.getIntExtra("tipveze",0);

        //Prosledjujem komentar asyncTasku
        new MyAsTaKomentar(getApplicationContext(),tipveze).execute(komentar);


        //Servis se sam zaustavlja
        stopSelf();

        return START_NOT_STICKY;

    }




}
