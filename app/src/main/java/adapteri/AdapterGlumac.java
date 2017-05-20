package adapteri;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.borcha.hollywood.R;

import java.util.ArrayList;

import model.Glumac;

/**
 * Created by androiddevelopment on 20.5.17..
 */

public class AdapterGlumac extends ArrayAdapter<Glumac>{

    private final ArrayList<Glumac> glumci;
    Context con;
    ImageView imgGlumac;
    TextView imePrezime;

    public AdapterGlumac(Context context, int resource, ArrayList<Glumac> _glumci) {
        super(context, R.layout.stavka_liste_glumca);
        con=context;
        glumci=_glumci;

    }

    @NonNull
    @Override
    public View getView(int position, View vi, ViewGroup parent) {

        Glumac glumac=this.getItem(position);

        imgGlumac=(ImageView)vi.findViewById(R.id.slika_glumca_stavka);
        imePrezime=(TextView)vi.findViewById(R.id.txvPrezimeIme_stavka);

        imgGlumac.setImageResource(glumac.getSlika());
        imePrezime.setText(glumac.getIme() + ", " + glumac.getPrezime());

        return vi;
    }

}
