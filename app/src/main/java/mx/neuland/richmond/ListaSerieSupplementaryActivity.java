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

public class ListaSerieSupplementaryActivity extends AppCompatActivity implements View.OnClickListener{

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
        setContentView(R.layout.activity_lista_serie_supplementary);

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

        fab = (FloatingActionButton)findViewById(R.id.floatingActionButton);
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

        ImagenSerie.add(R.drawable.bussinessskill);
        ImagenSerie.add(R.drawable.businesstheory);
        ImagenSerie.add(R.drawable.englishgrammar);
        ImagenSerie.add(R.drawable.methodology);
        ImagenSerie.add(R.drawable.richmondcompact);
        ImagenSerie.add(R.drawable.richmondmini);
        ImagenSerie.add(R.drawable.richmondpoket);
        ImagenSerie.add(R.drawable.teachingenglish);
        ImagenSerie.add(R.drawable.visualgrammar);
        ImagenSerie.add(R.drawable.vocabularybuilder);

        Titulo.add("BUSINESS Skills");
        Titulo.add("BUSINESS Theories");
        Titulo.add("English Grammar in Steps");
        Titulo.add("Primary Methodology Handbook");
        Titulo.add("Richmond Compact Dictionary");
        Titulo.add("Richmond Mini Dictionary");
        Titulo.add("Richmond Pocket Dictionary");
        Titulo.add("An Introduction to Teaching English to Children");
        Titulo.add("Visual Grammar");
        Titulo.add("Richmond Vocabulary Builder");

        Autor.add("");
        Autor.add("");
        Autor.add("David Bolton - Noel Goodey");
        Autor.add("");
        Autor.add("");
        Autor.add("");
        Autor.add("");
        Autor.add("Susan House");
        Autor.add("Jim Scrivener");
        Autor.add("Liz Walter");

        Flecha.add(R.drawable.a_salmon);
        Flecha.add(R.drawable.a_salmon);
        Flecha.add(R.drawable.a_salmon);
        Flecha.add(R.drawable.a_salmon);
        Flecha.add(R.drawable.a_salmon);
        Flecha.add(R.drawable.a_salmon);
        Flecha.add(R.drawable.a_salmon);
        Flecha.add(R.drawable.a_salmon);
        Flecha.add(R.drawable.a_salmon);
        Flecha.add(R.drawable.a_salmon);
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
