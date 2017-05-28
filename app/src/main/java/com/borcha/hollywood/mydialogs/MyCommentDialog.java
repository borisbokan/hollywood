package com.borcha.hollywood.mydialogs;

import android.app.AlertDialog;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.borcha.hollywood.R;

/**
 * Created by borcha on 28.05.17..
 */

public class MyCommentDialog extends AlertDialog.Builder{


    private EditText etxtKomentar;
    private LayoutInflater inflater;
    private View vi;

    public MyCommentDialog(Context context,String _naslovDijaloga) {
        super(context);

        setTitle(_naslovDijaloga);

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        vi = inflater.inflate(R.layout.dialog_comment, null);

        etxtKomentar = (EditText) vi.findViewById(R.id.etxtKOmentar_dialogComment);

        setView(vi);


    }


    public String getKomentar(){

        return etxtKomentar.getEditableText().toString();

    }

}
