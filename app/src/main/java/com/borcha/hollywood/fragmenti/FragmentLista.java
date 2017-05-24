package com.borcha.hollywood.fragmenti;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.UiThread;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.borcha.hollywood.aktivnosti.MainActivity;
import com.borcha.hollywood.R;
import com.borcha.hollywood.model.Glumac;
import com.borcha.hollywood.synchro.UcitavanjeGlumacaAsync;

/**
 * Created by androiddevelopment on 20.5.17..
 */

public class FragmentLista extends Fragment implements AdapterView.OnItemClickListener {



    private View vi;
    private ListView lvListaGlumaca;
    onItemGlumacSelectListener onItemSelectGlumac;
    private int position=0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        vi=inflater.inflate(R.layout.lista_fragment,container,false);
        lvListaGlumaca=(ListView)vi.findViewById(R.id.lvListaGlumaca_lista);


        return vi;
    }




    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        new Thread(new Runnable() {
            @Override
            public void run() {
                new UcitavanjeGlumacaAsync(getActivity()).execute();
                lvListaGlumaca.setAdapter(MainActivity.getAdapterGlumci());
            }
        }).run();


        lvListaGlumaca.setOnItemClickListener(this);
    }




    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);


        try {
            onItemSelectGlumac = (onItemGlumacSelectListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
        onItemSelectGlumac.onGlumacSelect(pos);
        Glumac glu=(Glumac)adapterView.getItemAtPosition(pos);

        Toast.makeText(getActivity(),"Odabrano: " + glu.getIme() + ", " + glu.getPrezime(),Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("pos",this.position);


    }

    public interface onItemGlumacSelectListener{
       public  void onGlumacSelect(int position);


    }
}
