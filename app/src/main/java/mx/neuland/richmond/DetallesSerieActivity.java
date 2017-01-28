package mx.neuland.richmond;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetallesSerieActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    String titulo;
    String autor;

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
        setContentView(R.layout.activity_detalles_serie);

        Typeface leagueGothic = Typeface.createFromAsset(getAssets(), "league_gothic.otf");
        textHome = (TextView)findViewById(R.id.textHome);
        textSearch = (TextView)findViewById(R.id.textSearch);
        textWhere = (TextView)findViewById(R.id.textWhere);

        textHome.setTypeface(leagueGothic);
        textSearch.setTypeface(leagueGothic);
        textWhere.setTypeface(leagueGothic);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            titulo = extras.getString("titulo");
            autor = extras.getString("autor");
        }

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar bar = getSupportActionBar();
        final Drawable upArrow = getResources().getDrawable(R.drawable.rsz_back_simple);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        bar.setDisplayHomeAsUpEnabled(true);
        bar.setTitle("");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

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



    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(OneFragment.newInstance(titulo, autor, DetallesSerieActivity.this), "Description");
        adapter.addFragment(TwoFragment.newInstance(titulo, DetallesSerieActivity.this), "For Students");
        adapter.addFragment(ThreeFragment.newInstance(titulo, DetallesSerieActivity.this), "For Teachers");
        adapter.addFragment(FourFragment.newInstance(titulo, DetallesSerieActivity.this), "ISBNs");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.floatingActionButton:
            {
                Intent intent = new Intent(this, MapaActivity.class);
                intent.putExtra("origen", 2);
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

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, ListaSerieActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.activity_detalles_serie);
    }
}
