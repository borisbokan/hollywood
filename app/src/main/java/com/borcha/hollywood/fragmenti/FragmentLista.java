package com.borcha.hollywood.fragmenti;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.borcha.hollywood.R;
import com.borcha.hollywood.adapteri.AdapterGlumac;
import com.borcha.hollywood.model.Glumac;

import java.util.ArrayList;

/**
 * Created by androiddevelopment on 20.5.17..
 */

public class FragmentLista extends Fragment implements AdapterView.OnItemClickListener {


    private View vi;
    private ListView lvListaGlumaca;
    onItemGlumacSelect onItemSelectGlumac;
    private AdapterGlumac  adGlumci;
    private static ArrayList<Glumac> arGlumci;

    public static FragmentLista newInstance(ArrayList<Glumac> _glumci){

        FragmentLista fraLis=new FragmentLista();
        arGlumci=_glumci;
        return fraLis;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        vi=inflater.inflate(R.layout.lista_fragment,null);
        lvListaGlumaca=(ListView)vi.findViewById(R.id.lvListaGlumaca_lista);



        return vi;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        adGlumci=new AdapterGlumac(getActivity(),arGlumci);
        lvListaGlumaca.setAdapter(adGlumci);

        lvListaGlumaca.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            onItemSelectGlumac.onGlumacSelect(position);

    }



    public interface onItemGlumacSelect{
        public void onGlumacSelect(int position);
    }
}
