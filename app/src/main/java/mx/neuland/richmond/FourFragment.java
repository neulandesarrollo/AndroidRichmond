package mx.neuland.richmond;


import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourFragment extends Fragment{

    String titulo1;
    Context contexto;

    TextView levelk;
    TextView level1;
    TextView level2;
    TextView level3;
    TextView level4;
    TextView level5;
    TextView level6;

    TextView levelkT;
    TextView level1T;
    TextView level2T;
    TextView level3T;
    TextView level4T;
    TextView level5T;
    TextView level6T;

    TextView ISBNSk;
    TextView ISBNS1;
    TextView ISBNS2;
    TextView ISBNS3;
    TextView ISBNS4;
    TextView ISBNS5;
    TextView ISBNS6;

    TextView ISBNSkT;
    TextView ISBNS1T;
    TextView ISBNS2T;
    TextView ISBNS3T;
    TextView ISBNS4T;
    TextView ISBNS5T;
    TextView ISBNS6T;

    TextView ISBNSAk;
    TextView ISBNSA1;
    TextView ISBNSA2;
    TextView ISBNSA3;
    TextView ISBNSA4;
    TextView ISBNSA5;
    TextView ISBNSA6;

    TextView ISBNSAkT;
    TextView ISBNSA1T;
    TextView ISBNSA2T;
    TextView ISBNSA3T;
    TextView ISBNSA4T;
    TextView ISBNSA5T;
    TextView ISBNSA6T;

    TextView thematicStudentsTitle;
    TextView thematicTeachersTitle;

    TextView tituloForTeachers;
    TextView tituloForStudents;

    TextView ISBNTeachers;
    TextView ISBNStudents;

    TextView Description;

    public FourFragment(String titulo, Context detallesSerieActivity) {
        titulo1 = titulo;
        contexto = detallesSerieActivity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_four, container, false);

        Typeface leagueGothic = Typeface.createFromAsset(getContext().getAssets(), "league_gothic.otf");
        Typeface firaSansMedium = Typeface.createFromAsset(getContext().getAssets(), "fira_sans_medium.otf");
        Typeface firaSansLight = Typeface.createFromAsset(getContext().getAssets(), "fire_sans_light.otf");

        levelk = (TextView)view.findViewById(R.id.levelk);
        level1 = (TextView)view.findViewById(R.id.level1);
        level2 = (TextView)view.findViewById(R.id.level2);
        level3 = (TextView)view.findViewById(R.id.level3);
        level4 = (TextView)view.findViewById(R.id.level4);
        level5 = (TextView)view.findViewById(R.id.level5);
        level6 = (TextView)view.findViewById(R.id.level6);

        levelkT = (TextView)view.findViewById(R.id.levelkT);
        level1T = (TextView)view.findViewById(R.id.level1T);
        level2T = (TextView)view.findViewById(R.id.level2T);
        level3T = (TextView)view.findViewById(R.id.level3T);
        level4T = (TextView)view.findViewById(R.id.level4T);
        level5T = (TextView)view.findViewById(R.id.level5T);
        level6T = (TextView)view.findViewById(R.id.level6T);

        ISBNSk = (TextView)view.findViewById(R.id.sk);
        ISBNS1 = (TextView)view.findViewById(R.id.s1);
        ISBNS2 = (TextView)view.findViewById(R.id.s2);
        ISBNS3 = (TextView)view.findViewById(R.id.s3);
        ISBNS4 = (TextView)view.findViewById(R.id.s4);
        ISBNS5 = (TextView)view.findViewById(R.id.s5);
        ISBNS6 = (TextView)view.findViewById(R.id.s6);

        ISBNSkT = (TextView)view.findViewById(R.id.tk);
        ISBNS1T = (TextView)view.findViewById(R.id.t1);
        ISBNS2T = (TextView)view.findViewById(R.id.t2);
        ISBNS3T = (TextView)view.findViewById(R.id.t3);
        ISBNS4T = (TextView)view.findViewById(R.id.t4);
        ISBNS5T = (TextView)view.findViewById(R.id.t5);
        ISBNS6T = (TextView)view.findViewById(R.id.t6);

        ISBNSAk = (TextView)view.findViewById(R.id.sak);
        ISBNSA1 = (TextView)view.findViewById(R.id.sa1);
        ISBNSA2 = (TextView)view.findViewById(R.id.sa2);
        ISBNSA3 = (TextView)view.findViewById(R.id.sa3);
        ISBNSA4 = (TextView)view.findViewById(R.id.sa4);
        ISBNSA5 = (TextView)view.findViewById(R.id.sa5);
        ISBNSA6 = (TextView)view.findViewById(R.id.sa6);

        ISBNSAkT = (TextView)view.findViewById(R.id.tak);
        ISBNSA1T = (TextView)view.findViewById(R.id.ta1);
        ISBNSA2T = (TextView)view.findViewById(R.id.ta2);
        ISBNSA3T = (TextView)view.findViewById(R.id.ta3);
        ISBNSA4T = (TextView)view.findViewById(R.id.ta4);
        ISBNSA5T = (TextView)view.findViewById(R.id.ta5);
        ISBNSA6T = (TextView)view.findViewById(R.id.ta6);

        thematicStudentsTitle = (TextView)view.findViewById(R.id.thematicStudentsTitle);

        thematicTeachersTitle = (TextView)view.findViewById(R.id.thematicTeachersTitle);

        tituloForTeachers = (TextView)view.findViewById(R.id.tituloForTeachers);
        tituloForStudents = (TextView)view.findViewById(R.id.tituloForStudents);

        ISBNTeachers = (TextView)view.findViewById(R.id.ISBNTeachers);
        ISBNStudents = (TextView)view.findViewById(R.id.ISBNStudents);

        Description = (TextView)view.findViewById(R.id.descripcion);

        thematicStudentsTitle.setTypeface(leagueGothic);
        thematicTeachersTitle.setTypeface(leagueGothic);
        tituloForTeachers.setTypeface(leagueGothic);
        tituloForStudents.setTypeface(leagueGothic);

        ISBNTeachers.setTypeface(firaSansMedium);
        ISBNStudents.setTypeface(firaSansMedium);

        Description.setTypeface(firaSansMedium);

        levelk.setTypeface(firaSansMedium);
        level1.setTypeface(firaSansMedium);
        level2.setTypeface(firaSansMedium);
        level3.setTypeface(firaSansMedium);
        level4.setTypeface(firaSansMedium);
        level5.setTypeface(firaSansMedium);
        level6.setTypeface(firaSansMedium);
        levelkT.setTypeface(firaSansMedium);
        level1T.setTypeface(firaSansMedium);
        level2T.setTypeface(firaSansMedium);
        level3T.setTypeface(firaSansMedium);
        level4T.setTypeface(firaSansMedium);
        level5T.setTypeface(firaSansMedium);
        level6T.setTypeface(firaSansMedium);

        ISBNSk.setTypeface(firaSansLight);
        ISBNS1.setTypeface(firaSansLight);
        ISBNS2.setTypeface(firaSansLight);
        ISBNS3.setTypeface(firaSansLight);
        ISBNS4.setTypeface(firaSansLight);
        ISBNS5.setTypeface(firaSansLight);
        ISBNS6.setTypeface(firaSansLight);

        ISBNSkT.setTypeface(firaSansLight);
        ISBNS1T.setTypeface(firaSansLight);
        ISBNS2T.setTypeface(firaSansLight);
        ISBNS3T.setTypeface(firaSansLight);
        ISBNS4T.setTypeface(firaSansLight);
        ISBNS5T.setTypeface(firaSansLight);
        ISBNS6T.setTypeface(firaSansLight);

        ISBNSAk.setTypeface(firaSansLight);
        ISBNSA1.setTypeface(firaSansLight);
        ISBNSA2.setTypeface(firaSansLight);
        ISBNSA3.setTypeface(firaSansLight);
        ISBNSA4.setTypeface(firaSansLight);
        ISBNSA5.setTypeface(firaSansLight);
        ISBNSA6.setTypeface(firaSansLight);

        ISBNSAkT.setTypeface(firaSansLight);
        ISBNSA1T.setTypeface(firaSansLight);
        ISBNSA2T.setTypeface(firaSansLight);
        ISBNSA3T.setTypeface(firaSansLight);
        ISBNSA4T.setTypeface(firaSansLight);
        ISBNSA5T.setTypeface(firaSansLight);
        ISBNSA6T.setTypeface(firaSansLight);

        return view;
    }

    @Override
    public void onStart(){
        super.onStart();

        if(titulo1.equals("CUBBY HOUSE"))
        {
            Description.setText("Pack Cubby House (SB+CD)\n\nLevel 1: 7506009844452\nLevel 2: 7506009844469\nLevel 3: 7506009844476");
            Description.setVisibility(View.VISIBLE);

            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Cubby House (SB+CD)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009844452\n" +
                    "Level 2: 7506009844469\n" +
                    "Level 3: 7506009844476");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Cubby House (GUIA+CLASS +FLASH)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Story Cards");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009845176\n" +
                    "Level 2: 7506009845206\n" +
                    "Level 3: 7506009845183");
            ISBNS2T.setText("Level 1: 7506009843745\n" +
                    "Level 2: 7506009843752\n" +
                    "Level 3: 7506009843769");
        }

        else if(titulo1.equals("PEBBLES"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Pebbles (SB+CD+RSC Booklet+AP)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009834934\n" +
                    "Level 2: 7506009834941\n" +
                    "Level 3: 7506009834958");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Pebbles (Guia + Class CD)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Flashcards");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Fun Activity Mat (Level 1,2 and 3)");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009835405\n" +
                    "Level 2: 7506009835412\n" +
                    "Level 3: 7506009835429");
            ISBNS2T.setText("Level 1: 9786070605161\n" +
                    "Level 2: 9786070605208\n" +
                    "Level 3: 9786070605246");
            ISBNS3T.setText("Level 1: 9786070606649\n" +
                    "Level 2: 9786070606656\n" +
                    "Level 3: 9786070606663");
        }

        else if(titulo1.equals("GUMDROPS"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Gumdrops (SB&TN+CD&CLASS CD)");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Pack Gumdrops (SB+CD+RSC Pack)");
            level3.setVisibility(View.VISIBLE);
            level3.setText("Activity Pad");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level N: 7506009837508");
            ISBNS2.setText("Level 1: 7506009837515\n" +
                    "Level 2: 7506009837522\n" +
                    "Level 3: 7506009837539");
            ISBNS3.setText("Level 1: 9786070607394\n" +
                    "Level 2: 9786070607400\n" +
                    "Level 3: 9786070607417");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Gumdrops (TG+Class CD)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Big Book");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Posters & Posters Cutouts");
            level4T.setVisibility(View.VISIBLE);
            level4T.setText("Teacher's Resource CD-ROM");
            level5T.setVisibility(View.VISIBLE);
            level5T.setText("Classroom Language Cards (Level 1,2 and 3)");
            level6T.setVisibility(View.VISIBLE);
            level6T.setText("Digital Book DVD (Level 1,2 and 3)");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009837546\n" +
                    "Level 2: 7506009837553\n" +
                    "Level 3: 7506009837560");
            ISBNS2T.setText("Level 1: 9786070607424\n" +
                    "Level 2: 9786070607431\n" +
                    "Level 3: 9786070607448");
            ISBNS3T.setText("Level 1: 7506009836471\n" +
                    "Level 2: 7506009836488\n" +
                    "Level 3: 7506009836495");
            ISBNS4T.setText("Level 1: 7506009836402\n" +
                    "Level 2: 7506009836433\n" +
                    "Level 3: 7506009836464");
            ISBNS5T.setText("Level 1: 9786070607455\n" +
                    "Level 2: 9786070607455\n" +
                    "Level 3: 9786070607455");
            ISBNS6T.setText("Level 1: 7506009844179\n" +
                    "Level 2: 7506009844179\n" +
                    "Level 3: 7506009844179");
        }

        else if(titulo1.equals("TIPPY TOES"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Tippy Toes (SB+CD+STK+MY FIRST...)");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Activity Book");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009842755\n" +
                    "Level 2: 7506009842762\n" +
                    "Level 3: 7506009842779");
            ISBNS2.setText("Level 1: 9786070602641\n" +
                    "Level 2: 9786070602658\n" +
                    "Level 3: 9786070602665");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Teacher’s Guide");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Class CD");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Big Book");
            level4T.setVisibility(View.VISIBLE);
            level4T.setText("Posters & Cutouts");
            level5T.setVisibility(View.VISIBLE);
            level5T.setText("Fun Activity Mat (Level 1,2 and 3)");
            level6T.setVisibility(View.VISIBLE);
            level6T.setText("Puppets (Level 3)");
            levelkT.setVisibility(View.VISIBLE);
            levelkT.setText("Digital Book DVD (Level 1,2 and 3)");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);
            ISBNSAkT.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9786070602672\n" +
                    "Level 2: 9786070602689\n" +
                    "Level 3: 9786070602696");
            ISBNS2T.setText("Level 1: 7506009807518\n" +
                    "Level 2: 7506009807525\n" +
                    "Level 3: 7506009807532");
            ISBNS3T.setText("Level 1: 9786070602702\n" +
                    "Level 2: 9786070602719\n" +
                    "Level 3: 9786070602726");
            ISBNS4T.setText("Level 1: 7506009807181\n" +
                    "Level 2: 7506009807198\n" +
                    "Level 3: 7506009807204");
            ISBNS5T.setText("Level 1: 9786070606649\n" +
                    "Level 2: 9786070606656\n" +
                    "Level 3: 9786070606663");
            ISBNS6T.setText("Level 3: 7506009807846");
            ISBNSAkT.setText("Level 1: 7506009844162\n" +
                    "Level 2: 7506009844162\n" +
                    "Level 3: 7506009844162");
        }

        else if(titulo1.equals("MY FIRST LETTERS AND SOUNDS"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack My First Letters & Sounds (SB + CD)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level A: 7506009842786\n" +
                    "Level B: 7506009842793\n" +
                    "Level C: 7506009842809");
        }

        else if(titulo1.equals("CRICKETS"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Crickets Nursery (SB+CLASS & RCD)");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Pack Crickets (SB+CD+TALES)");
            level3.setVisibility(View.VISIBLE);
            level3.setText("Practice Book");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level N: 7506009842489");
            ISBNS2.setText("Level 1: 7506009842571\n" +
                    "Level 2: 7506009842588\n" +
                    "Level 3: 7506009842595");
            ISBNS3.setText("Level 1: 9786070610783\n" +
                    "Level 2: 9786070610738\n" +
                    "Level 3: 9786070610745");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Crickets Teacher (TG+TR+SC+F+TA+CLF)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Flashcards (Level N)");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Digital Book DVD (Level 1,2 and 3)");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009842601\n" +
                    "Level 2: 7506009842618\n" +
                    "Level 3: 7506009842625");
            ISBNS2T.setText("Level 1: 7506009842502");
            ISBNS3T.setText("Level 2: 7506009844186\n" +
                    "Level 3: 7506009844186\n" +
                    "Level N: 7506009844186");
        }

        else if(titulo1.equals("M@TH ADVENTURES"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Math A. (SB+RESOURCE+SRCD)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 2: 7506009842816\n" +
                    "Level 3: 7506009842823");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Math A. (TG+TCD+RES+CUBE)");

            ISBNS1T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 2: 7506009842359\n" +
                    "Level 3: 7506009842366");
        }

        //

        else if(titulo1.equals("ABRACADABRA"))
        {

            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Abracadabra (SB + CD)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009840263\n" +
                    "Level 2: 7506009840270\n" +
                    "Level 3: 7506009840287\n"+
                    "Level 4: 7506009840294\n" +
                    "Level 5: 7506009840300\n" +
                    "Level 6: 7506009840317");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Abracadabra (GM+TRCD)\n\n\n\n");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Flashcards");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Digital Book CD");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009840638\n" +
                    "Level 2: 7506009840645\n" +
                    "Level 3: 7506009840652\n"+
                    "Level 4: 7506009840676\n" +
                    "Level 5: 7506009840669\n" +
                    "Level 6: 7506009840683");
            ISBNS2T.setText("Level 1: 9786070609350\n" +
                    "Level 2: 9786070609374\n" +
                    "Level 3: 9786070609367\n"+
                    "Level 4: 9786070609398\n" +
                    "Level 5: 9786070609381\n" +
                    "Level 6: 9786070610097");
            ISBNS3T.setText("Level 1: 9786070612985\n" +
                    "Level 2: 9786070613005\n" +
                    "Level 3: 9786070613029\n"+
                    "Level 4: 9786070612749\n" +
                    "Level 5: 9786070612961\n" +
                    "Level 6: 9786070612954");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));

        }

        else if(titulo1.equals("BEEP")) {

            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Beep (SB&AB+PC+ Stickers+CD)");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Pack Beep (SB&AB+PlayingCards+CD)");
            level3.setVisibility(View.VISIBLE);
            level3.setText("Pack Beep (SB&AB+CD)");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009840102\n" +
                    "Level 2: 7506009840119");
            ISBNS2.setText("Level 3: 7506009840324\n"+
                    "Level 4: 7506009840126");
            ISBNS3.setText("Level 5: 7506009840331\n" +
                    "Level 6: 7506009840133");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Beep (TB + Class CD + Flashcards)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Posters");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Digital Book CD");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009840348\n" +
                    "Level 2: 7506009840355\n" +
                    "Level 3: 7506009840362\n"+
                    "Level 4: 7506009840379\n" +
                    "Level 5: 7506009840386\n" +
                    "Level 6: 7506009840393");
            ISBNS2T.setText("Level 1: 7506009839533\n" +
                    "Level 2: 7506009839540\n" +
                    "Level 3: 7506009839557\n"+
                    "Level 4: 7506009839564\n" +
                    "Level 5: 7506009839571\n" +
                    "Level 6: 7506009839588");
            ISBNS3T.setText("Level 1: 9786070613036\n" +
                    "Level 2: 9786070612862\n" +
                    "Level 3: 9786070612909\n"+
                    "Level 4: 9786070612978\n" +
                    "Level 5: 9786070612886\n" +
                    "Level 6: 9786070612923");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));

        }

        else if(titulo1.equals("COOL KIDS")) {

            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Cool Kids SE");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Workbook");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009846265\n" +
                    "Level 2: 7506009846272\n" +
                    "Level 3: 7506009846289\n"+
                    "Level 4: 7506009846296\n" +
                    "Level 5: 7506009846302\n" +
                    "Level 6: 7506009846319");
            ISBNS2.setText("Level 1: *TBA\n" +
                    "Level 2: *TBA\n" +
                    "Level 3: *TBA\n"+
                    "Level 4: *TBA\n" +
                    "Level 5: *TBA\n" +
                    "Level 6: *TBA");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Cool Kids SE (Teacher’s Guide)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Pack Cool Kids SE (Guía del Maestro)");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009846388\n" +
                    "Level 2: 7506009846395\n" +
                    "Level 3: 7506009846401\n"+
                    "Level 4: 7506009846418\n" +
                    "Level 5: 7506009846425\n" +
                    "Level 6: 7506009846432");
            ISBNS2T.setText("Level 1: 7506009846449\n" +
                    "Level 2: 7506009846456\n" +
                    "Level 3: 7506009846463\n"+
                    "Level 4: 7506009846470\n" +
                    "Level 5: 7506009846487\n" +
                    "Level 6: 7506009846494");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));

        }

        else if(titulo1.equals("LIGHTHOUSE"))
        {

            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Lighthouse (SB + CD + Stickers)");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Activity Book");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009805163\n" +
                    "Level 2: 7506009805170\n" +
                    "Level 3: 7506009805187\n"+
                    "Level 4: 7506009805194\n" +
                    "Level 5: 7506009805200\n" +
                    "Level 6: 7506009805217");
            ISBNS2.setText("Level 1: 9786076000427\n" +
                    "Level 2: 9786076000069\n" +
                    "Level 3: 9786076000700\n"+
                    "Level 4: 9786076000458\n" +
                    "Level 5: 9786076000403\n" +
                    "Level 6: 9786076000922");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Class CDs & CR ROM");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Poster & Cutouts");
            level4T.setVisibility(View.VISIBLE);
            level4T.setText("Puzzles");
            level5T.setVisibility(View.VISIBLE);
            level5T.setText("Word Kits");
            level6T.setVisibility(View.VISIBLE);
            level6T.setText("Digital Book CD");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9786076000441\n" +
                    "Level 2: 9786076000090\n" +
                    "Level 3: 9786076000717\n"+
                    "Level 4: 9786076000106\n" +
                    "Level 5: 9786076000410\n" +
                    "Level 6: 9786076000946");
            ISBNS2T.setText("Level 1: 7506009804371\n" +
                    "Level 2: 7506009804418\n" +
                    "Level 3: 7506009804456\n"+
                    "Level 4: 7506009804494\n" +
                    "Level 5: 7506009804531\n" +
                    "Level 6: 7506009804579");
            ISBNS3T.setText("Level 1: 7506009802414\n" +
                    "Level 2: 7506009802421\n" +
                    "Level 3: 7506009802438\n"+
                    "Level 4: 7506009802445\n" +
                    "Level 5: 7506009802452\n" +
                    "Level 6: 7506009802469");
            ISBNS4T.setText("Level 1: 9786076000144\n" +
                    "Level 2: 9786076000083\n" +
                    "Level 3: 9786076000885");
            ISBNS5T.setText("Level 4: 9786076000076\n" +
                    "Level 5: 9786076000397\n" +
                    "Level 6: 9786076000953");
            ISBNS6T.setText("Level 1: 9786070608643\n" +
                    "Level 2: 9786070608650\n" +
                    "Level 3: 9786070608667\n"+
                    "Level 4: 9786070608674\n" +
                    "Level 5: 9786070608681\n" +
                    "Level 6: 9786070608698");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("PATHWAY TO GRAMMAR"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);
            level5.setVisibility(View.VISIBLE);
            level6.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("7506009842830");
            ISBNS2.setText("7506009842847");
            ISBNS3.setText("7506009842854");
            ISBNS4.setText("7506009842861");
            ISBNS5.setText("7506009842878");
            ISBNS6.setText("7506009842885");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);
            level5T.setVisibility(View.VISIBLE);
            level6T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("9786070610837");
            ISBNS2T.setText("9786070610981");
            ISBNS3T.setText("9786070610998");
            ISBNS4T.setText("9786070611001");
            ISBNS5T.setText("9786070611018");
            ISBNS6T.setText("9786070611025");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));

        }

        else if(titulo1.equals("PATHWAY TO LITERATURE"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);
            level5.setVisibility(View.VISIBLE);
            level6.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("9786070611087");
            ISBNS2.setText("9786070611032");
            ISBNS3.setText("9786070611094");
            ISBNS4.setText("9786070611100");
            ISBNS5.setText("976070611049");
            ISBNS6.setText("9786070611056");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);
            level5T.setVisibility(View.VISIBLE);
            level6T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("7506009842403");
            ISBNS2T.setText("7506009842410");
            ISBNS3T.setText("7506009842427");
            ISBNS4T.setText("7506009842434");
            ISBNS5T.setText("7506009842441");
            ISBNS6T.setText("7506009842458");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("THUMBS UP SECOND EDITION"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("PATHWAY TO MATH"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("PATHWAY TO SCIENCE"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);
            level5.setVisibility(View.VISIBLE);
            level6.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("7506009840041");
            ISBNS2.setText("7506009840058");
            ISBNS3.setText("7506009840065");
            ISBNS4.setText("7506009840072");
            ISBNS5.setText("7506009840089");
            ISBNS6.setText("7506009840096");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);
            level5T.setVisibility(View.VISIBLE);
            level6T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("7506009840409");
            ISBNS2T.setText("7506009840416");
            ISBNS3T.setText("7506009840423");
            ISBNS4T.setText("7506009840430");
            ISBNS5T.setText("7506009840447");
            ISBNS6T.setText("7506009840454");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("SCIENCE AND GEOGRAPHY"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);
            level5.setVisibility(View.VISIBLE);
            level6.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("7506009837447");
            ISBNS2.setText("7506009837454");
            ISBNS3.setText("7506009837461");
            ISBNS4.setText("7506009837478");
            ISBNS5.setText("7506009837485");
            ISBNS6.setText("7506009837492");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);
            level5T.setVisibility(View.VISIBLE);
            level6T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("9786076000489");
            ISBNS2T.setText("9786076000526");
            ISBNS3T.setText("9786076000519");
            ISBNS4T.setText("9786076000496");
            ISBNS5T.setText("9786076000663");
            ISBNS6T.setText("9786076000670");

            thematicTeachersTitle.setVisibility(View.VISIBLE);
            thematicTeachersTitle.setText("Resource Book");

            ISBNSA1T.setVisibility(View.VISIBLE);
            ISBNSA2T.setVisibility(View.VISIBLE);
            ISBNSA3T.setVisibility(View.VISIBLE);
            ISBNSA4T.setVisibility(View.VISIBLE);
            ISBNSA5T.setVisibility(View.VISIBLE);
            ISBNSA6T.setVisibility(View.VISIBLE);

            ISBNSA1T.setText("9786076001004");
            ISBNSA2T.setText("9786076000540");
            ISBNSA3T.setText("9786076000533");
            ISBNSA4T.setText("9786076000892");
            ISBNSA5T.setText("9786076001028");
            ISBNSA6T.setText("9786076001011");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("SKYROCKET"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);
            level5.setVisibility(View.VISIBLE);
            level6.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("9786070608827");
            ISBNS2.setText("9786070608834");
            ISBNS3.setText("978607060884");
            ISBNS4.setText("9786070609503");
            ISBNS5.setText("9786070609510");
            ISBNS6.setText("9786070608858");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);
            level5T.setVisibility(View.VISIBLE);
            level6T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("7506009839960");
            ISBNS2T.setText("7506009839984");
            ISBNS3T.setText("7506009840461");
            ISBNS4T.setText("7506009840478");
            ISBNS5T.setText("7506009840485");
            ISBNS6T.setText("7506009840492");

            thematicTeachersTitle.setVisibility(View.VISIBLE);
            thematicTeachersTitle.setText("Pack Skyrocket Your Grammar");

            ISBNSA1T.setVisibility(View.VISIBLE);
            ISBNSA2T.setVisibility(View.VISIBLE);
            ISBNSA3T.setVisibility(View.VISIBLE);
            ISBNSA4T.setVisibility(View.VISIBLE);
            ISBNSA5T.setVisibility(View.VISIBLE);
            ISBNSA6T.setVisibility(View.VISIBLE);

            ISBNSA1T.setText("7506009839977");
            ISBNSA2T.setText("7506009839991");
            ISBNSA3T.setText("7506009840003");
            ISBNSA4T.setText("7506009840010");
            ISBNSA5T.setText("7506009840027");
            ISBNSA6T.setText("7506009840034");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("SPOTLIGHT ON ENGLISH"))
        {
            thematicStudentsTitle.setVisibility(View.VISIBLE);

            tituloForTeachers.setVisibility(View.GONE);

            levelk.setVisibility(View.VISIBLE);
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);
            level5.setVisibility(View.VISIBLE);
            level6.setVisibility(View.VISIBLE);

            ISBNSk.setVisibility(View.VISIBLE);
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNSk.setText("7506009835900");
            ISBNS1.setText("7506009835856");
            ISBNS2.setText("7506009835863");
            ISBNS3.setText("7506009835870");
            ISBNS4.setText("7506009835887");
            ISBNS5.setText("7506009835894");
            ISBNS6.setText("7506009835900");

            ISBNSAk.setVisibility(View.VISIBLE);
            ISBNSA1.setVisibility(View.VISIBLE);
            ISBNSA2.setVisibility(View.VISIBLE);
            ISBNSA3.setVisibility(View.VISIBLE);
            ISBNSA4.setVisibility(View.VISIBLE);
            ISBNSA5.setVisibility(View.VISIBLE);
            ISBNSA6.setVisibility(View.VISIBLE);

            ISBNSk.setText("");
            ISBNS1.setText("7506009807983");
            ISBNS2.setText("7506009807990");
            ISBNS3.setText("7506009808003");
            ISBNS4.setText("7506009808010");
            ISBNS5.setText("7506009808027");
            ISBNS6.setText("7506009808034");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
            ISBNTeachers.setVisibility(View.GONE);
        }

        //

        else if(titulo1.equals("Achievers"))
        {

            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);

            ISBNS1.setText("9788466829434");
            ISBNS2.setText("9788466829069");
            ISBNS3.setText("9788466829229");
            ISBNS4.setText("9788466829137");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("7506009843646");
            ISBNS2T.setText("7506009843615");
            ISBNS3T.setText("7506009843622");
            ISBNS4T.setText("7506009843639");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Awesome"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);

            ISBNS1.setText("9786070609701");
            ISBNS2.setText("9786070609831");
            ISBNS3.setText("9786070609855");
            ISBNS4.setText("9786070609848");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("9786070609909");
            ISBNS2T.setText("9786070609916");
            ISBNS3T.setText("9786070609923");
            ISBNS4T.setText("9786070609930");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Combined Sciences"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);

            level1.setText("Biology");
            level2.setText("Physics");
            level3.setText("Chemistry");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNS1.setText("7506009843349");
            ISBNS2.setText("7506009843356");
            ISBNS3.setText("7506009843363");

            tituloForTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));

            ISBNTeachers.setVisibility(View.GONE);
        }

        else if(titulo1.equals("English in Motion"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);

            ISBNS1.setText("9788466810029");
            ISBNS2.setText("9788466814928");
            ISBNS3.setText("9788466815123");
            ISBNS4.setText("9788466815147");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("9788466808538");
            ISBNS2T.setText("9788466813594");
            ISBNS3T.setText("9788466813884");
            ISBNS4T.setText("9788466814072");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Next Step"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);

            ISBNS1.setText("7506009831179");
            ISBNS2.setText("7506009831186");
            ISBNS3.setText("7506009831193");
            ISBNS4.setText("7506009831353");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("9786070604201");
            ISBNS2T.setText("9786070604218");
            ISBNS3T.setText("9786070604225");
            ISBNS4T.setText("9786070604232");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Spotlight on Literature"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);
            level5.setVisibility(View.VISIBLE);
            level6.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("9786070607943");
            ISBNS2.setText("9786070607950");
            ISBNS3.setText("9786070607967");
            ISBNS4.setText("9786070607974");
            ISBNS5.setText("9786070607981");
            ISBNS6.setText("9786070607998");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);
            level5T.setVisibility(View.VISIBLE);
            level6T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("7506009838161");
            ISBNS2T.setText("7506009838178");
            ISBNS3T.setText("7506009838185");
            ISBNS4T.setText("7506009838192");
            ISBNS5T.setText("7506009838208");
            ISBNS6T.setText("7506009838215");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Stopwatch"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        //

        else if(titulo1.equals("American Big Picture"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);
            level5.setVisibility(View.VISIBLE);
            level6.setVisibility(View.VISIBLE);

            level1.setText("A1");
            level2.setText("A2");
            level3.setText("B1");
            level4.setText("B1+");
            level5.setText("B2");
            level6.setText("C1");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("9786070608704");
            ISBNS2.setText("9786070605697");
            ISBNS3.setText("9786070605772");
            ISBNS4.setText("9786070607066");
            ISBNS5.setText("9786070607561");
            ISBNS6.setText("9786070608728");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);
            level5T.setVisibility(View.VISIBLE);
            level6T.setVisibility(View.VISIBLE);

            level1T.setText("A1");
            level2T.setText("A2");
            level3T.setText("B1");
            level4T.setText("B1+");
            level5T.setText("B2");
            level6T.setText("C1");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("7506009835436");
            ISBNS2T.setText("7506009835443");
            ISBNS3T.setText("7506009835450");
            ISBNS4T.setText("7506009835467");
            ISBNS5T.setText("7506009835474");
            ISBNS6T.setText("7506009835481");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));

        }

        else if(titulo1.equals("@work"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);

            ISBNS1.setText("9788466813570");
            ISBNS2.setText("9788466813631");
            ISBNS3.setText("9788466814058");
            ISBNS4.setText("9788466814119");

            thematicStudentsTitle.setVisibility(View.VISIBLE);
            thematicStudentsTitle.setText("Pack @work workbook");

            ISBNSA1.setVisibility(View.VISIBLE);
            ISBNSA2.setVisibility(View.VISIBLE);
            ISBNSA3.setVisibility(View.VISIBLE);
            ISBNSA4.setVisibility(View.VISIBLE);

            ISBNSA1.setText("7506009838888");
            ISBNSA2.setText("7506009841420");
            ISBNSA3.setText("7506009839632");
            ISBNSA4.setText("7506009841444");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("9788466813600");
            ISBNS2T.setText("9788466814027");
            ISBNS3T.setText("9788466814089");
            ISBNS4T.setText("9788466814157");

            thematicTeachersTitle.setVisibility(View.VISIBLE);
            thematicTeachersTitle.setText("Class Audio CD");

            ISBNSA1T.setVisibility(View.VISIBLE);
            ISBNSA2T.setVisibility(View.VISIBLE);
            ISBNSA3T.setVisibility(View.VISIBLE);
            ISBNSA4T.setVisibility(View.VISIBLE);

            ISBNSA1T.setText("8431300228405");
            ISBNSA2T.setText("8431300228436");
            ISBNSA3T.setText("8431300228467");
            ISBNSA4T.setText("8431300228498");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("English ID"))
        {
            levelk.setVisibility(View.VISIBLE);
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);

            ISBNSk.setVisibility(View.VISIBLE);
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNSk.setText("7506009840829");
            ISBNS1.setText("9786070607615");
            ISBNS2.setText("9786070607639");
            ISBNS3.setText("9786070607653");

            levelkT.setVisibility(View.VISIBLE);
            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);

            ISBNSkT.setVisibility(View.VISIBLE);
            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNSkT.setText("7506009841178");
            ISBNS1T.setText("9786070607752");
            ISBNS2T.setText("9786070607721");
            ISBNS3T.setText("9786070607738");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("Going Pro"))
        {
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);
            level4.setVisibility(View.VISIBLE);
            level5.setVisibility(View.VISIBLE);
            level6.setVisibility(View.VISIBLE);

            level1.setText("A1");
            level2.setText("A2");
            level3.setText("B1");
            level4.setText("B1+");
            level5.setText("B2");
            level6.setText("C1");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("7506009840188");
            ISBNS2.setText("7506009839052");
            ISBNS3.setText("7506009840201");
            ISBNS4.setText("7506009839069");
            ISBNS5.setText("7506009842069");
            ISBNS6.setText("7506009842465");

            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);
            level4T.setVisibility(View.VISIBLE);
            level5T.setVisibility(View.VISIBLE);
            level6T.setVisibility(View.VISIBLE);

            level1T.setText("A1");
            level2T.setText("A2");
            level3T.setText("B1");
            level4T.setText("B1+");
            level5T.setText("B2");
            level6T.setText("C1");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("77506009843165");
            ISBNS2T.setText("7506009843172");
            ISBNS3T.setText("7506009843189");
            ISBNS4T.setText("7506009843196");
            ISBNS5T.setText("7506009843141");
            ISBNS6T.setText("7506009843295");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("Identities"))
        {
            levelk.setVisibility(View.VISIBLE);
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);

            ISBNSk.setVisibility(View.VISIBLE);
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNSk.setText("7506009840829");
            ISBNS1.setText("7506009841086");
            ISBNS2.setText("7506009841154");
            ISBNS3.setText("7506009841161");

            levelkT.setVisibility(View.VISIBLE);
            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);

            ISBNSkT.setVisibility(View.VISIBLE);
            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNSkT.setText("7506009841178");
            ISBNS1T.setText("7506009841185");
            ISBNS2T.setText("7506009841192");
            ISBNS3T.setText("7506009841208");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("Richmond Mazes"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("The big picture"))
        {
            levelk.setVisibility(View.VISIBLE);
            level1.setVisibility(View.VISIBLE);
            level2.setVisibility(View.VISIBLE);
            level3.setVisibility(View.VISIBLE);

            ISBNSk.setVisibility(View.VISIBLE);
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNSk.setText("7506009840829");
            ISBNS1.setText("7506009841086");
            ISBNS2.setText("7506009841154");
            ISBNS3.setText("7506009841161");

            levelkT.setVisibility(View.VISIBLE);
            level1T.setVisibility(View.VISIBLE);
            level2T.setVisibility(View.VISIBLE);
            level3T.setVisibility(View.VISIBLE);

            ISBNSkT.setVisibility(View.VISIBLE);
            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNSkT.setText("7506009841178");
            ISBNS1T.setText("7506009841185");
            ISBNS2T.setText("7506009841192");
            ISBNS3T.setText("7506009841208");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("BUSINESS Skills"))
        {

            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }

        else if(titulo1.equals("BUSINESS Theories"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }
        else if(titulo1.equals("English Grammar in Steps"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }

        else if(titulo1.equals("Primary Methodology Handbook"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }

        else if(titulo1.equals("Richmond Compact Dictionary"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }

        else if(titulo1.equals("Richmond Mini Dictionary"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }

        else if(titulo1.equals("Richmond Pocket Dictionary"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }

        else if(titulo1.equals("An Introduction to Teaching English to Children"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }

        else if(titulo1.equals("Visual Grammar"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }

        else if(titulo1.equals("Richmond Vocabulary Builder"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));
        }

        else if(titulo1.equals("DELTA'S Key to the Next Generation TOELF Test"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));
        }

        else if(titulo1.equals("TARGET KET for Schools"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));
        }

        else if(titulo1.equals("TARGET PET"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));
        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: Advanced"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));
        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: First"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));
        }

        else if(titulo1.equals("Richmond Practice Tests for IELTS"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));
        }

        else if(titulo1.equals("Pass the TOEIC Test: Introductory Course"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));
        }

        else if(titulo1.equals("Richmond Practice Tests - Movers"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));
        }

        else if(titulo1.equals("Ready, Set, Go!"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Infoquest"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Little Readers"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Super stars"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Popcorn readers"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Media readers"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Richmond readers"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("DVD readers"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }


    }

    @Override
    public void onResume(){
        super.onResume();
    }

}