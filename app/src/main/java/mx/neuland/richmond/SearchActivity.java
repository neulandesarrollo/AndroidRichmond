package mx.neuland.richmond;

import android.app.SearchManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity
        implements OnQueryTextListener, SearchView.OnCloseListener{

    private SearchManager searchManager;
    private SearchView searchView;
    private MyExpandableListAdapter listAdapter;
    private ExpandableListView myList;
    private ArrayList<ParentRow> parentList = new ArrayList<ParentRow>();
    private ArrayList<ParentRow> showTheseParentList = new ArrayList<ParentRow>();
    private MenuItem searchItem;

    ActionBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bar = getSupportActionBar();
        bar.setTitle("");

        searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);

        parentList = new ArrayList<ParentRow>();
        showTheseParentList = new ArrayList<ParentRow>();

        displayList();

        expandAll();
    }

    private void loadData() {
        ArrayList<ChildRow> childRows = new ArrayList<ChildRow>();
        ParentRow parentRow = null;

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"CUBBY HOUSE By Fanny Riva Palacio - Stefania Villareal"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"PEBBLES By Marlina Bahena"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"GUMDROPS By Gabriela Zatain"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"TIPPY TOES By Rebecca Williams Salvador"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"MY FIRST LETTERS AND SOUNDS By Rachel Gonia - Rebecca Williams Salvador"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"CRICKETS By Annette Flavel - Isabel Moreno"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"M@TH ADVENTURES By Rebecca Lee Williams"));

        parentRow = new ParentRow("Preschool", childRows);

        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();
        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "ABRACADABRA By Lenore Cohen"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "BEEP By Brendan Dunne - Robin Newton"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "COOL KIDS By Gabriela Zapiain - Silvia Zapiain - Joep van der Werff - Andrew Starling - Jeanette Greenwell - Ana Foncerrada"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "LIGHTHOUSE By Michael Downie - David Gray - Juan M. Jiménez"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "THUMBS UP! SECOND EDITION By Sarah Fash - Suzanne Harris - Martyn Hobbs - Julia Keddle"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "PATHWAY TO GRAMMAR By Noelle Child"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "PATHWAY TO LITERATURE By Elizabeth Rodriguez - Stefania Villarreal - Aaron Burkholder"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "PATHWAY TO MATH"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "PATHWAY TO SCIENCE"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "SCIENCE AND GEOGRAPHY"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "SKYROCKET By Sarah Conway"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "SPOTLIGHT  ON ENGLISH"));

        parentRow = new ParentRow("Primary", childRows);
        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();
        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "ACHIEVERS"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "AWESOME"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "COMBINED SCIENCES"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "ENGLISH IN MOTION"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "NEXT STEP"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "SPOTLIGHT ON LITERATURE"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "STOPWATCH"));

        parentRow = new ParentRow("Secondary", childRows);
        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "AMERICAN BIG PICTURE"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "@WORK"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "ENGLISH ID"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "GOING PRO"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "IDENTITIES"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "RICHMOND MAZES"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "THE BIG PICTURE"));

        parentRow = new ParentRow("Young Adults", childRows);
        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "BUSINESS SKILLS"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "BUSINESS THEORIES"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "ENGLISH GRAMMAR IN STEPS"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "PRIMARY METHODOLOGY HANDBOOK"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "RICHMOND COMPACT DICTIONARY"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "RICHMOND MINI DICTIONARY"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "RICHMOND POCKET DICTIONARY"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "AN INTRODUCTION TO TEACHING ENGLISH TO CHILDREN"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "VISUAL GRAMMAR"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "RICHMOND VOCABULARY BUILDER"));

        parentRow = new ParentRow("Supplementary", childRows);
        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "DELTA'S KEY TO THE NEXT GENERATION TOELF TEST"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "TARGET KET FOR SCHOOLS"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "TARGET PET"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "RICHMOND PRACTICE TEST FOR CAMBRIDGE ENGLISH: ADVANCED"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "RICHMOND PRACTICE TEST FOR CAMBRIDGE ENGLISH: FIRST"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "RICHMOND PRACTICE TEST FOR IELTS"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "PASS THE TOEIC TEST: INTRODUCTORY COURSE"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "RICHMOND PRACTICE TEST - MOVERS"));

        parentRow = new ParentRow("Exams", childRows);
        parentList.add(parentRow);
    }

    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++) {
            myList.expandGroup(i);
        } //end for (int i = 0; i < count; i++)
    }

    private void displayList() {
        loadData();

        myList = (ExpandableListView) findViewById(R.id.expandableListView_search);
        listAdapter = new MyExpandableListAdapter(SearchActivity.this, parentList);

        myList.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mail, menu);
        searchItem = menu.findItem(R.id.action_search);
        searchView = (SearchView) MenuItemCompat.getActionView(searchItem);

        searchView.setSearchableInfo
                (searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(this);
        searchView.setOnCloseListener(this);
        searchView.requestFocus();

        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onClose() {
        bar.setBackgroundDrawable(getDrawable(R.drawable.barra));
        listAdapter.filterData("");
        expandAll();

        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        //Toast.makeText(this, "toast", Toast.LENGTH_SHORT).show();
        listAdapter.filterData(query);
        expandAll();
        return false;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onQueryTextChange(String newText) {

        if(TextUtils.isEmpty(newText) || newText.length() < 1)
        {
            bar.setBackgroundDrawable(getDrawable(R.drawable.barra));
        }

        else
        {
            bar.setBackgroundDrawable(getDrawable(R.drawable.barra_naranja));
        }
        listAdapter.filterData(newText);
        expandAll();
        return false;
    }
}