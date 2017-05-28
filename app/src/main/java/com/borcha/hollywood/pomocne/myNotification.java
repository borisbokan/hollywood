package com.borcha.hollywood.pomocne;

import android.app.Notification;
import android.content.Context;
import com.borcha.hollywood.R;

/**
 * Created by borcha on 28.05.17..
 */

public class myNotification extends Notification.Builder{


    public myNotification(Context cont,String _titl,String _text) {
        super(cont);
        setSmallIcon(R.drawable.ic_notif_komentar);
        setContentTitle(_titl);
        setContentText(_text);

    }

 }
