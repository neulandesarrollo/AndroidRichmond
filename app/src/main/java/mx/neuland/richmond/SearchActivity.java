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
                ,"GUMDROPS By Rebecca Lee Williams"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"TIPPY TOES By Rebecca Lee Williams"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"MY FIRST LETTERS AND SOUNDS By Rachel Gonin - Rebecca Lee Williams"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"CRICKETS By Annette Flavel - Francisco Layda - Isabel Moreno - Fanny Riva Palacio"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                ,"M@TH ADVENTURES By Rebecca Lee Williams"));

        parentRow = new ParentRow("Preschool", childRows);

        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();
        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "ABRACADABRA By Lenore Cohen - Sarah Fash"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "BEEP By Brendan Dunne - Robin Newton"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "COOL KIDS By Gabriela Zapiain - Silvia Zapiain - Joep van der Werff - Andrew Starling - Jeanette Greenwell - Ana Foncerrada"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "LIGHTHOUSE By Brendan Dunne - David Gray - Michael Downie - Juan M. Jiménez"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "THUMBS UP! SECOND EDITION By Suzanne Harris - Martyn Hobbs - Julia Keddle"));

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
                , "SKYROCKET By Sarah Fash - Andrew Starling - Lindsay Ruggles - Sarah Conway"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "SPOTLIGHT  ON ENGLISH"));

        parentRow = new ParentRow("Primary", childRows);
        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();
        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Achievers by Carolyn Barraclough - Leanne Gray - Martyn Hobbs - Julia Keddle - Jane Revell - Ken Wilson"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Awesome by Carol Lethaby - Simon Brewster"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Combined Sciences by Hina Hashmi - Vali Tamm - Carol Haddox-Baldwin - Bernice Richter"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "English in Motion by Robert Campbell - Gill Holley - Rob Metcalf"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Next Step by Carol Lethaby - Simon Brewster"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Spotlight on Literature"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Stopwatch by Simon Brewster - Viviane Kirmeliene - Alastair Lane"));

        parentRow = new ParentRow("Secondary", childRows);
        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "American Big Picture by Ben Goldstein - Ceri Jones - Bess Bradfield - Carol Lethaby - Alastair Lane - Simon Brewster - Mark Lloyd"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "@work by Luois Rogers - Anna Cowper - James Greenan - Marion Grussendorf - Pete Sharma"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "English ID by Paul Seligson - Tom Abraham - Cris Gontow - Carol Lethaby - Jose Luis Morales - Luis Otávio Barros - Ray Shoulder - Ricardo Sili - Pamela Vittorio"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Going Pro by Simon Brewster - Alastair Lane"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Identities by Paul Seligson - Luiz Otávio Barros"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond Mazes by James Styring - Alastair Lane - Victoria Boobyer"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "The big picture by Ben Goldstein - Ceri Jones - Bess Bradfield - Carol Lethaby - Alastair Lane - Simon Brewster - MArk Lloyd"));

        parentRow = new ParentRow("Young Adults", childRows);
        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "BUSINESS Skills by Jon Marks"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "BUSINESS Theories by Angela Lilley"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Visual Grammar by Jim Scrivener"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Vocabulary Builder by Elizabeth Walter - Kate Woodford"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "English Grammar in Steps by David Bolton - Noel Goodey"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Primary METHODOLOGY HANDBOOK by Patricia Grounds - Suzanne Guerrero - Carol Lethaby - Caroline Moore - Joep van der Werff"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Lessons Learned by Gabriel Díaz Maggioli - Lesley Painter-Farrell"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Primary Handbooks for Teachers by Paul Seligson - Andy Baxter - Amanda Cant - Emma Dafouz - Michele C. Guerrini - Susan House - Ricky Lowes - Genevieve Roth - Wendy Superfine - Francesca Target  -  Julie Tice"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond Picture Dictionary"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond First Dictionary"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond Dictionay Fully Illustrated"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond Dictionaries"));

        parentRow = new ParentRow("Supplementary", childRows);
        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "DELTA'S Key to the TOEFL iBT by Nancy Gallagher"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "TARGET KET for Schools by Sue Ireland - Joanna Kosta"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "TARGET PET by Sue Ireland - Joanna Kosta"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond Practice Tests for Cambridge English: Advanced by Language Testing 123"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond Practice Tests for Cambridge English: First by Diana L. Fried-Booth"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond Practice Tests for IELTS by Language Testing 123"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Pass the TOEIC Test by Miles Craven"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond Practice Tests: YLE"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond Practice Tests: ket and PET by Sue Elliott - Sue Irelan - Karen Saxby - Diana L. Fried-Booth"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Target Cambridge English: First by Bess Bradfield - Caroline Krantz"));

        parentRow = new ParentRow("Exams", childRows);
        parentList.add(parentRow);

        childRows = new ArrayList<ChildRow>();

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Ready, Set, Go!"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Infoquest"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Little Readers"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Super stars"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Popcorn readers"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Media readers"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "Richmond readers"));

        childRows.add(new ChildRow(R.drawable.circulo_rosa
                , "DVD readers"));

        parentRow = new ParentRow("Readers", childRows);
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