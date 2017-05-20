package aktivnosti;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.borcha.hollywood.R;

import java.util.ArrayList;

import adapteri.DrawMeniAdapter;
import model.NavigacioniMeni;

public class MainActivity extends AppCompatActivity {


    private ArrayList<NavigacioniMeni> stavkeDrawera;
    private CharSequence drawerTitle;
    private ListView drawerList;
    private DrawerLayout drawerLayout;
    private RelativeLayout drawerPane;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_play_dark);
            actionBar.setHomeButtonEnabled(true);
            actionBar.show();
        }

        //DODAJEMO STAVKE ZA DRAWER
        stavkeDrawera.add(new NavigacioniMeni("Lista glumaca","",R.mipmap.ic_action_glumac));
        stavkeDrawera.add(new NavigacioniMeni("Podesavanja","Podesavanja  aplikacije",R.mipmap.ic_action_podesavanja));


        drawerTitle = getTitle();
        drawerList = (ListView) findViewById(R.id.navList);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerPane = (RelativeLayout) findViewById(R.id.drawerPane);



        DrawMeniAdapter adDrawMeni=new DrawMeniAdapter(this,stavkeDrawera);
        drawerList.setAdapter(adDrawMeni);


        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_otvori,R.string.drawer_zatvori){
            @Override
            public void onDrawerOpened(View drawerView) {

                getSupportActionBar().setTitle(drawerTitle);
                invalidateOptionsMenu();        // Creates call to onPrepareOptionsMenu()
            }


            @Override
            public void onDrawerClosed(View drawerView) {

                getSupportActionBar().setTitle(drawerTitle);
                invalidateOptionsMenu();        // Creates call to onPrepareOptionsMenu()
            }
        };

        drawerList.setOnItemClickListener(this);


        if(savedInstanceState==null){

            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ListaFragment listaFragment= new ListaFragment();
            ft.add(R.id.exlist_fragment, listaFragment, "lista_fragment");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }

        if (findViewById(R.id.detalji_fragment) != null) {
            landscape = true;
            getFragmentManager().popBackStack();

            DetaljiFragment detaljiFragment = (DetaljiFragment) getFragmentManager().findFragmentById(R.id.detalji_fragment);
            if (detaljiFragment == null) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                detaljiFragment = new DetaljiFragment();
                ft.replace(R.id.detalji_fragment, detaljiFragment, "detalji_fragment");
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
                detaljiPrikaz=true;
            }
        }

    }


    @Override
    public void onItemSelected(int group, int position) {
        this.groPos=group;
        this.position=position;

        if (landscape) {
            // If the device is in the landscape mode updates detail fragment's content.
            DetaljiFragment detaljiFragment = (DetaljiFragment) getFragmentManager().findFragmentById(R.id.detalji_fragment);
            detaljiFragment.updateContent(group,position);
        } else {
            // If the device is in the portrait mode sets detail fragment's content and replaces master fragment with detail fragment in a fragment transaction.
            DetaljiFragment detaljiFragment = new DetaljiFragment();
            detaljiFragment.setContent(group,position);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.exlist_fragment, detaljiFragment, "detalji_fragment_2");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }



        listaPrikaz=true;
        detaljiPrikaz=false;
    }





    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch (i){
            case 0:

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ListaFragment listaFragment= new ListaFragment();
                ft.replace(R.id.exlist_fragment, listaFragment, "lista_fragment_3");
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();


                break;


            case 1:
                Intent settings = new Intent(FirstActivity.this,PodesavanjaActivty.class);
                startActivity(settings);

                break;
        }

        drawerList.setItemChecked(i, true);
        setTitle(stavkeDrawera.get(i).getNaslov());
        drawerLayout.closeDrawer(drawerPane);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_dodaj_jelo:
                Toast.makeText(this, "Action " + getString(R.string.fragment_dodaj_jelo) , Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_prepravi_jelo:
                Toast.makeText(this, "Action " + getString(R.string.fragment_prepravi_jelo), Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_obrisi_jelo:
                Toast.makeText(this, "Action " + getString(R.string.fragment_obrisi_jelo) , Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void setTitle(CharSequence title) {
        getSupportActionBar().setTitle(title);
    }



    // Method(s) that manage NavigationDrawer.

    // onPostCreate method is called ofthen onRestoreInstanceState to synchronize toggle state
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Sync the toggle state after onRestoreInstanceState has occurred.
        drawerToggle.syncState();
    }

    // onConfigurationChanged method is called when the device configuration changes to pass configuration change to the drawer toggle
    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);

        // Pass any configuration change to the drawer toggle
        drawerToggle.onConfigurationChanged(configuration);
    }



}
}
