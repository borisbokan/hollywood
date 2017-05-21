package com.borcha.hollywood.pomocne;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

import com.borcha.hollywood.model.Glumac;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by borcha on 21.05.17..
 */

public class SlikaGlumca {

    private static Context cont;

    public static Drawable getSlikaGlum(Context _cont,String _patchFileSlika){
        cont=_cont;

        Drawable drawable=null;
        InputStream is=null;
        try {
            is = cont.getAssets().open(_patchFileSlika);
            drawable = Drawable.createFromStream(is, null);

        } catch (IOException e) {
            e.printStackTrace();
        }


        return drawable;
    }




}
