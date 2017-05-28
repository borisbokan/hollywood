package com.borcha.hollywood.pomocne;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Drawable;

import com.borcha.hollywood.R;

/**
 * Created by borcha on 28.05.17..
 */

public class myNotification extends Notification.Builder{


    public myNotification(Context cont,String _titl,String _text,int _tipKon) {
        super(cont);
        setSmallIcon(ikonaTipaVeze(_tipKon));
        setContentTitle(_titl);
        setContentText(_text);

    }



    private int ikonaTipaVeze(int _tip){

        if(_tip == ReviewerTools.TYPE_NOT_CONNECTED){
            return R.drawable.nema_konekcije;
        }else if(_tip==ReviewerTools.TYPE_WIFI){
            return R.drawable.konekcija_wifi;
        }else{
            return R.drawable.konekcija_mob;
        }

    }


 }
