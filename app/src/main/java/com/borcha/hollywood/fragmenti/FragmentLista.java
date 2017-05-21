package com.borcha.hollywood.fragmenti;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.borcha.hollywood.R;
import com.borcha.hollywood.adapteri.AdapterGlumac;
import com.borcha.hollywood.model.AdapterPodaci;
import com.borcha.hollywood.model.Glumac;

import java.util.ArrayList;

/**
 * Created by androiddevelopment on 20.5.17..
 */

@SuppressLint("ValidFragment")
public class FragmentLista extends Fragment implements AdapterView.OnItemClickListener {


    private final Context cont;
    private View vi;
    private ListView lvListaGlumaca;
    onItemGlumacSelect onItemSelectGlumac;
    private AdapterGlumac  adGlumci;
    private  ArrayList<Glumac> arGlumci;
    private int position;


    @SuppressLint("ValidFragment")
    public FragmentLista(Context _cont, ArrayList<Glumac> _podaci){
        this.cont=_cont;
        this.arGlumci=_podaci;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        vi=inflater.inflate(R.layout.lista_fragment,container,false);
        lvListaGlumaca=(ListView)vi.findViewById(R.id.lvListaGlumaca_lista);



        return vi;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(savedInstanceState!=null){
            position=savedInstanceState.getInt("pos",0);
        }



        adGlumci=new AdapterGlumac(getActivity(),this.arGlumci);
        lvListaGlumaca.setAdapter(adGlumci);

        lvListaGlumaca.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            onItemSelectGlumac.onGlumacSelect(position);


    }


    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);


        try {
            onItemSelectGlumac = (onItemGlumacSelect) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }


    public interface onItemGlumacSelect{
        public void onGlumacSelect(int position);
    }
}
