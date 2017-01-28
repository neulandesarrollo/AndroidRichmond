package mx.neuland.richmond;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout preschool;
    LinearLayout primary;
    LinearLayout secondary;
    LinearLayout youngAdults;
    LinearLayout supplementary;
    LinearLayout exams;
    LinearLayout readers;

    private static final int REQUEST_ACCESS_FINE_LOCATION = 0;

    private View mLayout;
    TextView preschool12;

    FloatingActionButton fab;

    LinearLayout home;
    LinearLayout buscar;
    LinearLayout where;

    TextView preschoolMain;
    TextView primaryText;
    TextView secondaryText;
    TextView youngAdultsText;
    TextView supplementaryText;
    TextView examsText;
    TextView readersText;

    TextView textHome;
    TextView textSearch;
    TextView textWhere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        preschoolMain = (TextView)findViewById(R.id.preschoolMain);
        primaryText = (TextView)findViewById(R.id.primaryText);
        secondaryText = (TextView)findViewById(R.id.secondaryText);
        youngAdultsText = (TextView)findViewById(R.id.youngAdultsText);
        supplementaryText = (TextView)findViewById(R.id.supplementaryText);
        examsText = (TextView)findViewById(R.id.examsText);
        readersText = (TextView)findViewById(R.id.readersText);

        Typeface leagueGothic = Typeface.createFromAsset(getAssets(), "league_gothic.otf");
        textHome = (TextView)findViewById(R.id.textHome);
        textSearch = (TextView)findViewById(R.id.textSearch);
        textWhere = (TextView)findViewById(R.id.textWhere);

        textHome.setTypeface(leagueGothic);
        textSearch.setTypeface(leagueGothic);
        textWhere.setTypeface(leagueGothic);

        preschoolMain.setTypeface(leagueGothic);
        primaryText.setTypeface(leagueGothic);
        secondaryText.setTypeface(leagueGothic);
        youngAdultsText.setTypeface(leagueGothic);
        supplementaryText.setTypeface(leagueGothic);
        examsText.setTypeface(leagueGothic);
        readersText.setTypeface(leagueGothic);

        preschool = (LinearLayout)findViewById(R.id.preschool);
        primary = (LinearLayout)findViewById(R.id.primary);
        secondary = (LinearLayout)findViewById(R.id.secondary);
        youngAdults = (LinearLayout)findViewById(R.id.youngAdults);
        supplementary = (LinearLayout)findViewById(R.id.supplementary);
        exams = (LinearLayout)findViewById(R.id.exams);
        readers = (LinearLayout)findViewById(R.id.readers);

        preschool.setOnClickListener(this);
        primary.setOnClickListener(this);
        secondary.setOnClickListener(this);
        youngAdults.setOnClickListener(this);
        supplementary.setOnClickListener(this);
        exams.setOnClickListener(this);
        readers.setOnClickListener(this);

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            requestLocationPermission();
        }

        fab = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(this);

        home = (LinearLayout)findViewById(R.id.home);
        buscar = (LinearLayout)findViewById(R.id.buscar);
        where = (LinearLayout)findViewById(R.id.where);

        home.setOnClickListener(this);
        buscar.setOnClickListener(this);
        where.setOnClickListener(this);

    }

    private void requestLocationPermission() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION)) {
            Snackbar.make(mLayout, "Permition camera rationale",
                    Snackbar.LENGTH_INDEFINITE)
                    .setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            ActivityCompat.requestPermissions(MainMenuActivity.this,
                                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                                    REQUEST_ACCESS_FINE_LOCATION);
                        }
                    })
                    .show();
        } else {

            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_ACCESS_FINE_LOCATION);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.preschool:
            {
                Intent intent = new Intent(this, ListaSerieActivity.class);
                startActivity(intent);

            }break;

            case R.id.primary:
            {
                Intent intent = new Intent(this, ListaSeriePrimaryActivity.class);
                startActivity(intent);

            }break;

            case R.id.secondary:
            {
                Intent intent = new Intent(this, ListaSerieSecondaryActivity.class);
                startActivity(intent);
            }break;

            case R.id.youngAdults:
            {
                Intent intent = new Intent(this, ListaSerieYoungActivity.class);
                startActivity(intent);
            }break;

            case R.id.supplementary:
            {
                Intent intent = new Intent(this, ListaSerieSupplementaryActivity.class);
                startActivity(intent);
            }break;

            case R.id.exams:
            {
                Intent intent = new Intent(this, ListaSerieExamsActivity.class);
                startActivity(intent);
            }break;

            case R.id.readers:
            {
                //Toast.makeText(this, "Contenido no disponible", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, ListaSerieReadersActivity.class);
                startActivity(intent);
            }break;

            case R.id.floatingActionButton:
            {
                Intent intent = new Intent(this, MapaActivity.class);
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

    public void onBackPressed() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setMessage("Salir de Richmond?")
                .setCancelable(false)
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.activity_main_menu);
    }
}
