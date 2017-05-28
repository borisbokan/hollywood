package com.borcha.hollywood.dialogs;

import android.app.AlertDialog;
import android.content.Context;

import com.borcha.hollywood.R;

/**
 * Created by borcha on 28.05.17..
 */

class myCommentDialog extends AlertDialog.Builder {


    public myCommentDialog(Context context, int themeResId) {
        super(context, themeResId);

        setView(R.layout.dialog_comment);


    }
}
