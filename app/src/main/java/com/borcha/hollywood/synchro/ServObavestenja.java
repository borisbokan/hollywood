package com.borcha.hollywood.synchro;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by borcha on 01.06.17..
 */

public class ServObavestenja extends Service {


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        return super.onStartCommand(intent, flags, startId);
    }
}
