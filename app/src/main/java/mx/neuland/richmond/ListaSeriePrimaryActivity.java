package mx.neuland.richmond;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
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

import java.util.ArrayList;
import java.util.List;

public class ListaSeriePrimaryActivity extends AppCompatActivity implements View.OnClickListener{

    ListView list;
    List<Integer> ImagenSerie = new ArrayList<Integer>();
    List<String> Titulo = new ArrayList<String>();
    List<String> Autor = new ArrayList<String>();
    List<Integer> Flecha = new ArrayList<Integer>();

    Context context;

    FloatingActionButton fab;

    ImageView search;

    LinearLayout home;
    LinearLayout buscar;
    LinearLayout where;

    TextView textHome;
    TextView textSearch;
    TextView textWhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_serie_primary);

        Typeface leagueGothic = Typeface.createFromAsset(getAssets(), "league_gothic.otf");
        textHome = (TextView)findViewById(R.id.textHome);
        textSearch = (TextView)findViewById(R.id.textSearch);
        textWhere = (TextView)findViewById(R.id.textWhere);

        textHome.setTypeface(leagueGothic);
        textSearch.setTypeface(leagueGothic);
        textWhere.setTypeface(leagueGothic);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarLlista);
        setSupportActionBar(toolbar);

        ActionBar bar = getSupportActionBar();
        final Drawable upArrow = getResources().getDrawable(R.drawable.rsz_back_simple);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        bar.setDisplayHomeAsUpEnabled(true);

        bar.setTitle("");

        context=this;
        llenarLista();

        fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(this);

        search = (ImageView)findViewById(R.id.imageView8);
        search.setOnClickListener(this);

        home = (LinearLayout)findViewById(R.id.home);
        buscar = (LinearLayout)findViewById(R.id.buscar);
        where = (LinearLayout)findViewById(R.id.where);

        home.setOnClickListener(this);
        buscar.setOnClickListener(this);
        where.setOnClickListener(this);


    }

    private void llenarLista() {

        llenadoDummy();
        list=(ListView) findViewById(R.id.listaSeries);
        list.setAdapter(new AdapterSeries(context, Titulo, Autor, ImagenSerie, Flecha));

    }

    private void llenadoDummy() {

        ImagenSerie.add(R.drawable.abracadabra);
        ImagenSerie.add(R.drawable.beep);
        ImagenSerie.add(R.drawable.ckids1);
        ImagenSerie.add(R.drawable.lighthouse);
        ImagenSerie.add(R.drawable.tup);
        ImagenSerie.add(R.drawable.pathway_togrammar);
        ImagenSerie.add(R.drawable.patway_toliterature);
        ImagenSerie.add(R.drawable.pathway_tomath);
        ImagenSerie.add(R.drawable.pathway_toscience);
        ImagenSerie.add(R.drawable.science_and_geography);
        ImagenSerie.add(R.drawable.skyrocket);
        ImagenSerie.add(R.drawable.spotlight);

        Titulo.add("ABRACADABRA");
        Titulo.add("BEEP");
        Titulo.add("COOL KIDS");
        Titulo.add("LIGHTHOUSE");
        Titulo.add("THUMBS UP! SECOND EDITION ");
        Titulo.add("PATHWAY TO GRAMMAR");
        Titulo.add("PATHWAY TO LITERATURE");
        Titulo.add("PATHWAY TO MATH");
        Titulo.add("PATHWAY TO SCIENCE");
        Titulo.add("SCIENCE AND GEOGRAPHY");
        Titulo.add("SKYROCKET");
        Titulo.add("SPOTLIGHT ON ENGLISH");


        Autor.add("Lenore Cohen - Sarah Fash");
        Autor.add("Brendan Dunne - Robin Newton");
        Autor.add("Gabriela Zapiain - Silvia Zapiain - Joep van der Werff - Andrew Starling - Jeanette Greenwell - Ana Foncerrada");
        Autor.add("Robin Newton - Brendan Dunne - David Gray - Michael Downie - Juan M. Jiménez - ");
        Autor.add("Sarah Fash - Suzanne Harris - Martyn Hobbs - Julia Keddle");
        Autor.add("Noelle Child");
        Autor.add("Elizabeth Rodriguez - Stefania Villarreal - Aaron Burkholder");
        Autor.add("");
        Autor.add("");
        Autor.add("");
        Autor.add("Sarah Fash - Andrew Starling - Lindsay Ruggles - Sarah Conway");
        Autor.add("");

        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
        Flecha.add(R.drawable.a_turqueza);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.floatingActionButton:
            {
                Intent intent = new Intent(this, MapaActivity.class);
                startActivity(intent);

            }break;

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, MainMenuActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
