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
        ImagenSerie.add(R.drawable.visual_grammar);
        ImagenSerie.add(R.drawable.vocabulary_builder);
        ImagenSerie.add(R.drawable.english_grammar);
        ImagenSerie.add(R.drawable.primary_methodology_handbook);
        ImagenSerie.add(R.drawable.thumbs_lessons_learned);
        ImagenSerie.add(R.drawable.handbooks_for_teachers);
        ImagenSerie.add(R.drawable.thumbs_richmond_picture_dictionary);
        ImagenSerie.add(R.drawable.thumbs_richmond_first_dictionary);
        ImagenSerie.add(R.drawable.thumbs_dictionary_fully_illustrated);
        ImagenSerie.add(R.drawable.thumbs_richmond_com_poc_min_dictionary);


        Titulo.add("BUSINESS Skills");
        Titulo.add("BUSINESS Theories");
        Titulo.add("Visual Grammar");
        Titulo.add("Vocabulary Builder");
        Titulo.add("English Grammar in Steps");
        Titulo.add("Primary METHODOLOGY HANDBOOK");
        Titulo.add("Lessons Learned");
        Titulo.add("Primary Handbooks for Teachers");
        Titulo.add("Richmond Picture Dictionary");
        Titulo.add("Richmond First Dictionary");
        Titulo.add("Richmond Dictionay Fully Illustrated");
        Titulo.add("Richmond Dictionaries");

        Autor.add("Jon Marks");
        Autor.add("Angela Lilley");
        Autor.add("Jim Scrivener");
        Autor.add("Elizabeth Walter - Kate Woodford");
        Autor.add("David Bolton - Noel Goodey");
        Autor.add("Patricia Grounds - Suzanne Guerrero - Carol Lethaby - Caroline Moore - Joep van der Werff");
        Autor.add("Gabriel Díaz Maggioli - Lesley Painter-Farrell");
        Autor.add("Paul Seligson - Andy Baxter - Amanda Cant - Emma Dafouz - Michele C. Guerrini - Susan House - Ricky Lowes - Genevieve Roth - Wendy Superfine - Francesca Target  -  Julie Tice");
        Autor.add("");
        Autor.add("");
        Autor.add("");
        Autor.add("");

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
