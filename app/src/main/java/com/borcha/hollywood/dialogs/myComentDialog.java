package com.borcha.hollywood.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.borcha.hollywood.R;

/**
 * Created by borcha on 28.05.17..
 */

class myCommentDialog extends AlertDialog.Builder implements View.OnClickListener {


    private Context cont;
    private EditText etxtKomentar;
    private Button btnOdustajem, btnPosalji;
    LayoutInflater inflater;
    private View vi;

    public myCommentDialog(Context context, int themeResId) {
        super(context, themeResId);

        this.cont=context;
        inflater=(LayoutInflater)cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        vi=inflater.inflate(R.layout.dialog_comment,null);

        etxtKomentar=(EditText)vi.findViewById(R.id.etxtKOmentar_dialogComment);
        btnOdustajem=(Button)vi.findViewById(R.id.btnOdustajem_dialogComment);
        btnPosalji=(Button)vi.findViewById(R.id.btnPosalji_dialogComment);


        btnOdustajem.setOnClickListener(this);
        btnPosalji.setOnClickListener(this);

        setView(vi);

        show();


    }


    @Override
    public void onClick(View view) {


        switch (view.getId()){

            case R.id.btnOdustajem_dialogComment:

                Toast.makeText(cont,"Kliknuo odustajem od komentara",Toast.LENGTH_SHORT).show();
                break;


            case R.id.btnPosalji_dialogComment:

                Toast.makeText(cont,"Kliknuo posalji komentar",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
