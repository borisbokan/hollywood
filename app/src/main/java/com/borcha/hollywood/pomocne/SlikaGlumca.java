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

    private  Context context;

    public SlikaGlumca(Context _context){
        this.context=_context;
    }

    public  Drawable getSlikaGlumca(String _patchFileSlika){

        Drawable drawable=null;
        InputStream is=null;
        try {
            is = this.context.getAssets().open(_patchFileSlika);
            drawable= Drawable.createFromStream(is, null);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return  drawable;


    }




}
