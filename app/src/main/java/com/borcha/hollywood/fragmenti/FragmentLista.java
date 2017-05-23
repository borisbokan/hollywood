package com.borcha.hollywood.fragmenti;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.borcha.hollywood.aktivnosti.MainActivity;
import com.borcha.hollywood.R;
/**
 * Created by androiddevelopment on 20.5.17..
 */

public class FragmentLista extends Fragment  {



    private View vi;
    private ListView lvListaGlumaca;
    onItemGlumacSelectListener onItemSelectGlumac;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        vi=inflater.inflate(R.layout.lista_fragment,container,false);

        return vi;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        lvListaGlumaca=(ListView)getView().findViewById(R.id.lvListaGlumaca_lista);

        lvListaGlumaca.setAdapter(MainActivity.getAdapterGlumci());
        lvListaGlumaca.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                onItemSelectGlumac.onGlumacSelect(position);
            }
        });

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


    public interface onItemGlumacSelectListener{
        void onGlumacSelect(int position);
    }
}
