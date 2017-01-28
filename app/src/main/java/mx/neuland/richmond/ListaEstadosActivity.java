package mx.neuland.richmond;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class ListaEstadosActivity extends AppCompatActivity implements View.OnClickListener{

    List<String> Estados = new ArrayList<String>();
    Context context;
    ListView list;

    LinearLayout home;
    LinearLayout buscar;
    LinearLayout where;

    TextView textHome;
    TextView textSearch;
    TextView textWhere;

    ImageView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estados);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarLlista);
        setSupportActionBar(toolbar);

        ActionBar bar = getSupportActionBar();

        final Drawable upArrow = getResources().getDrawable(R.drawable.rsz_back_simple);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        bar.setDisplayHomeAsUpEnabled(true);

        bar.setTitle("");
        context=this;

        Typeface leagueGothic = Typeface.createFromAsset(getAssets(), "league_gothic.otf");
        textHome = (TextView)findViewById(R.id.textHome);
        textSearch = (TextView)findViewById(R.id.textSearch);
        textWhere = (TextView)findViewById(R.id.textWhere);

        textHome.setTypeface(leagueGothic);
        textSearch.setTypeface(leagueGothic);
        textWhere.setTypeface(leagueGothic);

        home = (LinearLayout)findViewById(R.id.home);
        buscar = (LinearLayout)findViewById(R.id.buscar);
        where = (LinearLayout)findViewById(R.id.where);

        home.setOnClickListener(this);
        buscar.setOnClickListener(this);
        where.setOnClickListener(this);

        search = (ImageView)findViewById(R.id.imageView8);
        search.setOnClickListener(this);

        llenarLista();
    }

    private void llenarLista() {

        llenadoDummy();
    }

    private void llenadoDummy() {

        Estados.add("Aguascalientes");
        Estados.add("Baja California");
        Estados.add("Baja California Sur");
        Estados.add("Campeche");
        Estados.add("Chiapas");
        Estados.add("Chihuahua");
        Estados.add("Coahuila");
        Estados.add("Colima");
        Estados.add("Ciudad de México");
        Estados.add("Durango");
        Estados.add("Estado de México");
        Estados.add("Guanajuato");
        Estados.add("Guerrero");
        Estados.add("Hidalgo");
        Estados.add("Jalisco");
        Estados.add("Michoacán");
        Estados.add("Morelos");
        Estados.add("Nayarit");
        Estados.add("Nuevo León");
        Estados.add("Oaxaca");
        Estados.add("Puebla");
        Estados.add("Querétaro");
        Estados.add("Quintana Roo");
        Estados.add("San Luis Potosí");
        Estados.add("Sinaloa");
        Estados.add("Sonora");
        Estados.add("Tabasco");
        Estados.add("Tamaulipas");
        Estados.add("Tlaxcala");
        Estados.add("Veracruz");
        Estados.add("Yucatán");
        Estados.add("Zacatecas");

        list=(ListView) findViewById(R.id.listaEstados);
        list.setAdapter(new AdapterEstados(context, Estados));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, MapaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.imageView8:
            {
                Intent intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            }break;

            case R.id.home:
            {
                Intent intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            }break;

            case R.id.buscar:
            {
                Intent intent = new Intent(this, SearchActivity.class);
                startActivity(intent);
            }break;

            case R.id.where:
            {
                Intent intent = new Intent(this, MapaActivity.class);
                startActivity(intent);
            }break;

        }
    }
}
