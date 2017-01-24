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
    TextView level7T;
    TextView level8T;
    TextView level9T;
    TextView level10T;


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
    TextView ISBNS7T;


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
            level1T.setText("Pack Pebbles (Guia + Class CD)\n");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Flashcards\n\n");
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
            levelkT.setText("Digital Book DVD (Level 1,2 and 3)\n");

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
            level2T.setText("Flashcards\n\n\n\n");
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
            level1.setText("Pack Pathway to Grammar (SB + CD)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009842830\n" +
                    "Level 2: 7506009842847\n" +
                    "Level 3: 7506009842854\n"+
                    "Level 4: 7506009842861\n" +
                    "Level 5: 7506009842878\n" +
                    "Level 6: 7506009842885");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Teacher’s Booklet");

            ISBNS1T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9786070610837\n" +
                    "Level 2: 9786070610981\n" +
                    "Level 3: 9786070610998\n"+
                    "Level 4: 9786070611001\n" +
                    "Level 5: 9786070611018\n" +
                    "Level 6: 9786070611025");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));

        }

        else if(titulo1.equals("PATHWAY TO LITERATURE"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Student’s Book");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 9786070611087\n" +
                    "Level 2: 9786070611032\n" +
                    "Level 3: 9786070611094\n"+
                    "Level 4: 9786070611100\n" +
                    "Level 5: 976070611049\n" +
                    "Level 6: 9786070611056");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Teacher’s Resource CD");

            ISBNS1T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009842403\n" +
                    "Level 2: 7506009842410\n" +
                    "Level 3: 7506009842427\n"+
                    "Level 4: 7506009842434\n" +
                    "Level 5: 7506009842441\n" +
                    "Level 6: 7506009842458");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("THUMBS UP SECOND EDITION"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Thumbs Up! SE");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Practice Book");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009846203\n" +
                    "Level 2: 7506009846210\n" +
                    "Level 3: 7506009846227\n"+
                    "Level 4: 7506009846234\n" +
                    "Level 5: 7506009846241\n" +
                    "Level 6: 7506009846258");
            ISBNS2.setText("Level 1: *TBA\n" +
                    "Level 2: *TBA\n" +
                    "Level 3: *TBA\n"+
                    "Level 4: *TBA\n" +
                    "Level 5: *TBA\n" +
                    "Level 6: *TBA");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Thumbs Up! SE");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Posters & Poster Cutouts");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009846326\n" +
                    "Level 2: 7506009846333\n" +
                    "Level 3: 7506009846340\n"+
                    "Level 4: 7506009846357\n" +
                    "Level 5: 7506009846364\n" +
                    "Level 6: 7506009846371");
            ISBNS2T.setText("Level 1: 7506009846500\n" +
                    "Level 2: 7506009846517\n" +
                    "Level 3: 7506009846524\n"+
                    "Level 4: 7506009846531\n" +
                    "Level 5: 7506009846548\n" +
                    "Level 6: 7506009846555");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("PATHWAY TO MATH"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Pathway to Math (SB + AC)");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Pathway to Math Student’s Book");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009844391\n" +
                    "Level 4: 7506009844421");
            ISBNS2.setText("Level 2: 9786070612565\n" +
                    "Level 3: 9786070612572\n"+
                    "Level 5: 9786070612596\n" +
                    "Level 6: 9786070612602");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Pathway to Math (TG+R&E+EVAL+DB)");

            ISBNS1T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009845244\n" +
                    "Level 2: 7506009845251\n" +
                    "Level 3: 7506009845268\n"+
                    "Level 4: 7506009845275\n" +
                    "Level 5: 7506009845282\n" +
                    "Level 6: 7506009845299");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("PATHWAY TO SCIENCE"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Pathway to Science (SB + SB/AC)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009840041\n" +
                    "Level 2: 7506009840058\n" +
                    "Level 3: 7506009840065\n"+
                    "Level 4: 7506009840072\n" +
                    "Level 5: 7506009840089\n" +
                    "Level 6: 7506009840096");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Pathway to Science (Tg+Evaluations+R&E)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Digital Book CD");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009840409\n" +
                    "Level 2: 7506009840416\n" +
                    "Level 3: 7506009840423\n"+
                    "Level 4: 7506009840430\n" +
                    "Level 5: 7506009840447\n" +
                    "Level 6: 7506009840454");
            ISBNS2T.setText("Level 1: 9786070613180\n" +
                    "Level 2: 9786070613173\n" +
                    "Level 3: 9786070613166\n"+
                    "Level 4: 9786070613159\n" +
                    "Level 5: 9786070613142\n" +
                    "Level 6: 9786070613135");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("SCIENCE AND GEOGRAPHY"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Science & Geography (SB+CD-ROM)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009837447\n" +
                    "Level 2: 7506009837454\n" +
                    "Level 3: 7506009837461\n"+
                    "Level 4: 7506009837478\n" +
                    "Level 5: 7506009837485\n" +
                    "Level 6: 7506009837492");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Science and Geography Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Science and Geography Posters");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Science and Geography Resource Book");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9786076000489\n" +
                    "Level 2: 9786076000526\n" +
                    "Level 3: 9786076000519\n"+
                    "Level 4: 9786076000496\n" +
                    "Level 5: 9786076000663\n" +
                    "Level 6: 9786076000670");
            ISBNS2T.setText("Level 1: 7506009805668\n" +
                    "Level 2: 7506009805675\n" +
                    "Level 3: 7506009805682\n"+
                    "Level 4: 7506009805699\n" +
                    "Level 5: 7506009805705\n" +
                    "Level 6: 7506009805712");
            ISBNS3T.setText("Level 1: 9786076001004\n" +
                    "Level 2: 9786076000540\n" +
                    "Level 3: 9786076000533\n"+
                    "Level 4: 9786076000892\n" +
                    "Level 5: 9786076001028\n" +
                    "Level 6: 9786076001011");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("SKYROCKET"))
        {

            level1.setVisibility(View.VISIBLE);
            level1.setText("Student’s Book");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Pack Skyrocket (PB+CD)");
            level3.setVisibility(View.VISIBLE);
            level3.setText("Skyrocket Your Grammar Student’s Book");
            level4.setVisibility(View.VISIBLE);
            level4.setText("Pack Skyrocket (SB+PRACTICE+CD+GRAMMAR)");


            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 9786070608827\n" +
                    "Level 2: 9786070608834\n" +
                    "Level 3: 978607060884\n"+
                    "Level 4: 9786070609503\n" +
                    "Level 5: 9786070609510\n" +
                    "Level 6: 9786070608858");
            ISBNS2.setText("Level 1: 7506009839908\n" +
                    "Level 2: 7506009839915\n" +
                    "Level 3: 7506009839922\n"+
                    "Level 4: 7506009839939\n" +
                    "Level 5: 7506009839946\n" +
                    "Level 6: 7506009839953");
            ISBNS3.setText("Level 1: 9786070608995\n" +
                    "Level 2: 7506009839915\n" +
                    "Level 3: 9786070608872\n"+
                    "Level 4: 9786070609541\n" +
                    "Level 5: 9786070609558\n" +
                    "Level 6: 9786070609008");
            ISBNS4.setText("Level 1: 7506009841093\n" +
                    "Level 2: 7506009841109\n" +
                    "Level 3: 7506009841116\n"+
                    "Level 4: 7506009841123\n" +
                    "Level 5: 7506009841130\n" +
                    "Level 6: 7506009841147");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Skyrocket (TG+CA+RCD)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Pack Skyrocket Your Grammar (TG+CA)");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Posters with Word Cards");
            level4T.setVisibility(View.VISIBLE);
            level4T.setText("Digital Media Projects");
            level5T.setVisibility(View.VISIBLE);
            level5T.setText("Digital Book DVD");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009839960\n" +
                    "Level 2: 7506009839984\n" +
                    "Level 3: 7506009840461\n"+
                    "Level 4: 7506009840478\n" +
                    "Level 5: 7506009840485\n" +
                    "Level 6: 7506009840492");
            ISBNS2T.setText("Level 1: 7506009839977\n" +
                    "Level 2: 7506009839991\n" +
                    "Level 3: 7506009840003\n"+
                    "Level 4: 7506009840010\n" +
                    "Level 5: 7506009840027\n" +
                    "Level 6: 7506009840034");
            ISBNS3T.setText("Level 1: 7506009836600\n" +
                    "Level 2: 7506009836617\n" +
                    "Level 3: 7506009836624\n"+
                    "Level 4: 7506009836631\n" +
                    "Level 5: 7506009836648\n" +
                    "Level 6: 7506009836655");
            ISBNS4T.setText("Level 1: 9786076001004\n" +
                    "Level 2: 9786076000540\n" +
                    "Level 3: 7506009839861\n"+
                    "Level 4: 7506009839878\n" +
                    "Level 5: 7506009839885\n" +
                    "Level 6: 7506009839892");
            ISBNS5T.setText("Level 1: 9786070612947\n" +
                    "Level 2: 9786070612848\n" +
                    "Level 3: 9786070612824\n"+
                    "Level 4: 9786070612756\n" +
                    "Level 5: 9786070612725\n" +
                    "Level 6: 9786070613043");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        else if(titulo1.equals("SPOTLIGHT ON ENGLISH"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Student’s Spotlight");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Student’s Book");
            level3.setVisibility(View.VISIBLE);
            level3.setText("Activity Pad");
            level4.setVisibility(View.VISIBLE);
            level4.setText("Practice Book");
            level5.setVisibility(View.VISIBLE);
            level5.setText("Assessments");
            level6.setVisibility(View.VISIBLE);
            level6.setText("Pack Spotlight Thematic Library");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009835856\n" +
                    "Level 2: 7506009835863\n" +
                    "Level 3: 7506009835870\n"+
                    "Level 4: 7506009835887\n" +
                    "Level 5: 7506009835894\n" +
                    "Level 6: 7506009835900\n" +
                    "Level K: 7506009835849");
            ISBNS2.setText("Level 1: 9786070601262\n" +
                    "Level 2: 9786070601316\n" +
                    "Level 3: 9786070601408\n"+
                    "Level 4: 9786070601453\n" +
                    "Level 5: 9786070601507\n" +
                    "Level 6: 9786070601545\n" +
                    "Level K: 9786070601255");
            ISBNS3.setText("Level K: 9786070601361");
            ISBNS4.setText("Level 1: 9786070601279\n" +
                    "Level 2: 9786070601323\n" +
                    "Level 3: 9786070601415\n"+
                    "Level 4: 9786070601460\n" +
                    "Level 5: 9786070601514\n" +
                    "Level 6: 9786070601552");
            ISBNS5.setText("Level 1: 9786070601286\n" +
                    "Level 2: 9786070601330\n" +
                    "Level 3: 9786070601422\n"+
                    "Level 4: 9786070601477\n" +
                    "Level 5: 9786070601521\n" +
                    "Level 6: 9786070601569\n" +
                    "Level K: 9786070601378");
            ISBNS6.setText("Level 1: 7506009807983\n" +
                    "Level 2: 7506009807990\n" +
                    "Level 3: 7506009808003\n"+
                    "Level 4: 7506009808010\n" +
                    "Level 5: 7506009808027\n" +
                    "Level 6: 7506009808034");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Teacher’s Guide");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Assessments Teacher’s Manual");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Blackline Masters");
            level4T.setVisibility(View.VISIBLE);
            level4T.setText("Teacher’s Digital Resource");
            level5T.setVisibility(View.VISIBLE);
            level5T.setText("Audio CD");
            level6T.setVisibility(View.VISIBLE);
            level6T.setText("Poster with Cutouts");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9786070601309\n" +
                    "Level 2: 9786070601354\n" +
                    "Level 3: 9786070601439\n"+
                    "Level 4: 9786070601491\n" +
                    "Level 5: 9786070601668\n" +
                    "Level 6: 9786070601675\n" +
                    "Level K: 9786070601392");
            ISBNS2T.setText("Level 1: 9786070601293\n" +
                    "Level 2: 9786070601347\n" +
                    "Level 3: 9786070601446\n"+
                    "Level 4: 9786070601484\n" +
                    "Level 5: 9786070601538\n" +
                    "Level 6: 9786070601576\n" +
                    "Level K: 9786070601385");
            ISBNS3T.setText("Level 1: 7506009806658\n" +
                    "Level 2: 7506009806665\n" +
                    "Level 3: 7506009806672\n"+
                    "Level 4: 7506009806689\n" +
                    "Level 5: 7506009806696\n" +
                    "Level 6: 7506009806702\n" +
                    "Level K: 7506009806641");
            ISBNS4T.setText("Level 1: 7506009807723\n" +
                    "Level 2: 7506009807730\n" +
                    "Level 3: 7506009807747\n"+
                    "Level 4: 7506009807754\n" +
                    "Level 5: 7506009807761\n" +
                    "Level 6: 7506009807778");
            ISBNS5T.setText("Level 1: 7506009806580\n" +
                    "Level 2: 7506009806597\n" +
                    "Level 3: 7506009806603\n"+
                    "Level 4: 7506009806610\n" +
                    "Level 5: 7506009806627\n" +
                    "Level 6: 7506009806634\n" +
                    "Level K: 7506009806573");
            ISBNS6T.setText("Level K: 7506009806559");

            thematicTeachersTitle.setVisibility(View.VISIBLE);
            thematicTeachersTitle.setText("Big Book (Level K)");

            ISBNSA1T.setVisibility(View.VISIBLE);

            ISBNSA1T.setText("A Trip to Mexico: 9786070601644\n" +
                    "A Week Away: 9786070601637\n" +
                    "Best Friends!: 9786070601590\n"+
                    "Neeta Goes to...: 9786070601583\n" +
                    "Robert’s Pet: 9786070601620\n" +
                    "The Outdoor...: 9786070601613\n" +
                    "The Seasons: 9786070601651\n"+
                    "Where’s My Cake?: 9786070601606");

            tituloForTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            tituloForStudents.setTextColor(Color.parseColor("#1cb0c3"));
        }

        //

        else if(titulo1.equals("Achievers"))
        {

            level1.setVisibility(View.VISIBLE);
            level1.setText("Achievers Student’s Book");

            level2.setVisibility(View.VISIBLE);
            level2.setText("Pack Achievers (WB+AUDIO CD)");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 9788466829434\n" +
                    "Level 2: 9788466829069\n" +
                    "Level 3: 9788466829229\n"+
                    "Level 4: 9788466829137\n" +
                    "Level 5: 9788466829656\n" +
                    "Level 6: 9788466829335");
            ISBNS2.setText("Level 1: 7506009843455\n" +
                    "Level 2: 7506009843462\n" +
                    "Level 3: 7506009843479\n"+
                    "Level 4: 7506009843486\n" +
                    "Level 5: 7506009843493\n" +
                    "Level 6: 7506009844315");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Achievers (TG+TRB+AUDIO MATERIAL)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Teacher’s l-Book");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009843646\n" +
                    "Level 2: 7506009843615\n" +
                    "Level 3: 7506009843622\n"+
                    "Level 4: 7506009843639\n" +
                    "Level 5: 7506009843653\n" +
                    "Level 6: 7506009844483");
            ISBNS2T.setText("Level 1: 9788466829571\n" +
                    "Level 2: 9788466829380\n" +
                    "Level 3: 9788466829106\n"+
                    "Level 4: 9788466829557\n" +
                    "Level 5: 9788466829915\n" +
                    "Level 6: TBA");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Awesome"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Awesome NE Student’s Book");

            level2.setVisibility(View.VISIBLE);
            level2.setText("Pack Awesome NE (PB+RG)");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 9786070609701\n" +
                    "Level 2: 9786070609831\n" +
                    "Level 3: 9786070609855\n"+
                    "Level 4: 9786070609848");
            ISBNS2.setText("Level 1: 7506009840829\n" +
                    "Level 2: 7506009841086\n" +
                    "Level 3: 7506009841154\n"+
                    "Level 4: 7506009841161");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Awesome NE Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Awesome NE Resource Book");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Awesome NE Teacher’s CD Pack (Class+Interactive)");
            level4T.setVisibility(View.VISIBLE);
            level4T.setText("Awesome NE Poster");
            level5T.setVisibility(View.VISIBLE);
            level5T.setText("Awesome NE Digital Book DVD");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9786070609909\n" +
                    "Level 2: 9786070609916\n" +
                    "Level 3: 9786070609923\n"+
                    "Level 4: 9786070609930");
            ISBNS2T.setText("Level 1: 9786070609985\n" +
                    "Level 2: 9786070609992\n" +
                    "Level 3: 9786070610004\n"+
                    "Level 4: 9786070610011");
            ISBNS3T.setText("Level 1: 7506009841178\n" +
                    "Level 2: 7506009841185\n" +
                    "Level 3: 7506009841192\n"+
                    "Level 4: 7506009841208");
            ISBNS4T.setText("Level 1: 7506009840782\n" +
                    "Level 2: 7506009840799\n" +
                    "Level 3: 7506009840805\n"+
                    "Level 4: 7506009840812");
            ISBNS5T.setText("Level 1: 9786070613067\n" +
                    "Level 2: 9786070613098\n" +
                    "Level 3: 9786070613128\n"+
                    "Level 4: 9786070613111");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Combined Sciences"))
        {
            level1.setVisibility(View.VISIBLE);

            level1.setText("Pack Pathway to... (Sb+Digital Book)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Biology: 7506009843349\n" +
                    "Physics: 7506009843356\n" +
                    "Chemistry: 7506009843363");

            tituloForTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));

            ISBNTeachers.setVisibility(View.GONE);
        }

        else if(titulo1.equals("English in Motion"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("English In motion Students Book");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Pack English In motion (Wb+M-ROM)");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 9788466810029\n" +
                    "Level 2: 9788466814928\n" +
                    "Level 3: 9788466815123\n" +
                    "Level 4: 9788466815147");
            ISBNS2.setText("Level 1: 7506009834149\n" +
                    "Level 2: 7506009834156\n" +
                    "Level 3: 7506009834163\n" +
                    "Level 4: 7506009834170");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("English In motion Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("English In motion Class CD");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Pack English In motion (Test Book + CD Audio)");
            level4T.setVisibility(View.VISIBLE);
            level4T.setText("English In motion Test Pack+CD");
            level5T.setVisibility(View.VISIBLE);
            level5T.setText("English In motion DVD");
            level6T.setVisibility(View.VISIBLE);
            level6T.setText("English In motion Digital CD-ROM");
            levelkT.setVisibility(View.VISIBLE);
            levelkT.setText("English In motion All-In-One Resource Book");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS6T.setVisibility(View.VISIBLE);
            ISBNSAkT.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9788466808538\n" +
                    "Level 2: 9788466813594\n" +
                    "Level 3: 9788466813884\n" +
                    "Level 4: 9788466814072");
            ISBNS2T.setText("Level 1: 8431300228733\n" +
                    "Level 2: 8431300228740\n" +
                    "Level 3: 8431300228757\n" +
                    "Level 4: 8431300228771");
            ISBNS3T.setText("Level 1: 7506009838833\n" +
                    "Level 2: 7506009838840\n" +
                    "Level 3: 7506009838857\n" +
                    "Level 4: 7506009838864");
            ISBNS4T.setText("Level 1: 7506009838833\n" +
                    "Level 2: 7506009838840\n" +
                    "Level 3: 7506009838857\n" +
                    "Level 4: 7506009838864");
            ISBNS5T.setText("Level 1: 8431300228788\n" +
                    "Level 2: 8431300228801\n" +
                    "Level 3: 8431300228818\n" +
                    "Level 4: 8431300228825");
            ISBNS6T.setText("Level 1: 8431300230415\n" +
                    "Level 2: 8431300230422\n" +
                    "Level 3: 8431300230439\n" +
                    "Level 4: 8431300230446");
            ISBNSAkT.setText("Level 1: 9788466812856\n" +
                    "Level 2: 9788466813624\n" +
                    "Level 3: 9788466814041\n" +
                    "Level 4: 9788466814102");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Next Step"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Next Step (SB+CD-ROM)");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Next Step Practice Book");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009831179\n" +
                    "Level 2: 7506009831186\n" +
                    "Level 3: 7506009831193\n" +
                    "Level 4: 7506009831353");
            ISBNS2.setText("Level 1: 9786070604164\n" +
                    "Level 2: 9786070604171\n" +
                    "Level 3: 9786070604188\n" +
                    "Level 4: 9786070604195");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Next Step Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Next Step Posters");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("Next Step Teacher’s CD Pack");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9786070604201\n" +
                    "Level 2: 9786070604218\n" +
                    "Level 3: 9786070604225\n" +
                    "Level 4: 9786070604232");
            ISBNS2T.setText("Level 1: 7506009808454\n" +
                    "Level 2: 7506009808461\n" +
                    "Level 3: 7506009808478\n" +
                    "Level 4: 7506009831032");
            ISBNS3T.setText("Level 1: 7506009809185\n" +
                    "Level 2: 7506009809192\n" +
                    "Level 3: 7506009809208\n" +
                    "Level 4: 7506009809215");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Spotlight on Literature"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Spotlight On Literature Student’s Book NE");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level A: 9786070607943\n" +
                    "Level B: 9786070607950\n" +
                    "Level C: 9786070607967\n"+
                    "Level D: 9786070607974\n" +
                    "Level E: 9786070607981\n" +
                    "Level F: 9786070607998");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Spotlight On Literature (Tch+CD-ROM) NE");

            ISBNS1T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level A: 7506009838161\n" +
                    "Level B: 7506009838178\n" +
                    "Level C: 7506009838185\n"+
                    "Level D: 7506009838192\n" +
                    "Level E: 7506009838208\n" +
                    "Level F: 7506009838215");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        else if(titulo1.equals("Stopwatch"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Stopwatch (SB&WB+CD)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009844360\n" +
                    "Level 2: 7506009844377\n" +
                    "Level 3: 7506009844384\n"+
                    "Level 4: 7506009845305\n" +
                    "Level 5: 7506009845312\n" +
                    "Level 6: 7506009845329");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Stopwatch (TCH+TOOLKIT CD+DB)");

            ISBNS1T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009845213\n" +
                    "Level 2: 7506009845220\n" +
                    "Level 3: 7506009845237\n"+
                    "Level 4: 7506009846111\n" +
                    "Level 5: 7506009846128\n" +
                    "Level 6: 7506009846135");

            tituloForTeachers.setTextColor(Color.parseColor("#99549b"));
            tituloForStudents.setTextColor(Color.parseColor("#99549b"));
        }

        //

        else if(titulo1.equals("American Big Picture"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("The BIG Picture Student’s Book");
            level2.setVisibility(View.VISIBLE);
            level2.setText("The BIG Picture Pack (WB+CD)");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level A1: 9788466815673\n" +
                    "Level A2: 9788466820769\n" +
                    "Level B1: 9788466820776");
            ISBNS2.setText("Level A1: 7506009839595\n" +
                    "Level A2: 7506009834248\n" +
                    "Level B1: 7506009834255");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("The BIG Picture Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("The BIG Picture Class Audio CDs");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("The BIG Picture Digital Book");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level A1: 9788466815697\n" +
                    "Level A2: 9788466810579\n" +
                    "Level B1: 9788466810609");
            ISBNS2T.setText("Level A1: 9788466815703\n" +
                    "Level A2: 9788466812801\n" +
                    "Level B1: 9788466812825");
            ISBNS3T.setText("Level A1: 9788466815710\n" +
                    "Level A2: 9788466812818\n" +
                    "Level B1: 9788466812832");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));

        }

        else if(titulo1.equals("@work"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Student’s Book");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Pack @work Workbook");
            level3.setVisibility(View.VISIBLE);
            level3.setText("@Work Digital Workbook");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNS1.setText("Elementary: 9788466813570\n" +
                    "Pre-intermediate: 9788466813631\n" +
                    "Intermediate: 9788466814058");
            ISBNS2.setText("Elementary: 7506009838888\n" +
                    "Pre-intermediate: 7506009841420\n" +
                    "Intermediate: 7506009839632");
            ISBNS3.setText("Elementary: 8431300228429\n" +
                    "Pre-intermediate: 8431300228450\n" +
                    "Intermediate: 8431300228481");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Class Audio CD");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("@Work Digital Book");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Elementary: 9788466813600\n" +
                    "Pre-intermediate: 9788466814027\n" +
                    "Intermediate: 9788466814089");
            ISBNS2T.setText("Elementary: 8431300228405\n" +
                    "Pre-intermediate: 8431300228436\n" +
                    "Intermediate: 8431300228467");
            ISBNS3T.setText("Elementary: 8431300228412\n" +
                    "Pre-intermediate: 8431300228443\n" +
                    "Intermediate: 8431300228474");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("English ID"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("English ID Starter Student's & Workbook");
            level2.setVisibility(View.VISIBLE);
            level2.setText("English ID Student’s Book");
            level3.setVisibility(View.VISIBLE);
            level3.setText("English ID Workbook");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 9786070607776");
            ISBNS2.setText("Level 2: 9786070607615\n" +
                    "Level 3: 9786070607639");
            ISBNS3.setText("Level 2: 9786070607622\n" +
                    "Level 3: 9786070607646");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("English ID Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("English ID Class CD");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("English ID DVD");
            level4T.setVisibility(View.VISIBLE);
            level4T.setText("English ID Digital Book CD-ROM");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS4T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9786070607714\n" +
                    "Level 2: 9786070607752\n" +
                    "Level 3: 9786070607721");
            ISBNS2T.setText("Level 1: 7506009836716\n" +
                    "Level 2: 7506009836730\n" +
                    "Level 3: 7506009839137");
            ISBNS3T.setText("Level 1: 7506009836723\n" +
                    "Level 2: 7506009836747\n" +
                    "Level 3: 7506009836761");
            ISBNS4T.setText("Level 1: 9786070607899\n" +
                    "Level 2: 9786070607882\n" +
                    "Level 3: 9786070607905");

            thematicTeachersTitle.setVisibility(View.VISIBLE);
            thematicTeachersTitle.setText("English ID Student’s & Workbook");

            ISBNSA1T.setVisibility(View.VISIBLE);

            ISBNSA1T.setText("A:9786070607783 / B:9786070607790\n" +
                    "A:9786070607806 / B:9786070607813");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("Going Pro"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Pack Going Pro (SB+CD)");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 7506009840188\n" +
                    "Level 2: 7506009839052\n" +
                    "Level 3: 7506009840201");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Going Pro (TB+TRCD+DVD)");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Going Pro Digital Book CD");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 7506009843165\n" +
                    "Level 2: 7506009843172\n" +
                    "Level 3: 7506009843189");
            ISBNS2T.setText("Level 1: 9786070611520\n" +
                    "Level 2: 9786070611537\n" +
                    "Level 3: 9786070611544");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("Identities"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("iDentities Student’s Book");
            level2.setVisibility(View.VISIBLE);
            level2.setText("iDentities Workbook");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level 1: 978846682083\n" +
                    "Level 2: *TBA");
            ISBNS2.setText("Level 1: 9788466820851\n" +
                    "Level 2: *TBA");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("iDentities Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("iDentities Class CD");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level 1: 9788466820844\n" +
                    "Level 2: *TBA");
            ISBNS2T.setText("Level 1: 9788466820806\n" +
                    "Level 2: *TBA");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("Richmond Mazes"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Richmond Mazes - Escape From Pizza Plaza");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Richmond Mazes - Trouble at Paradise");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Richmond Mazes - Crisis at Clifton");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("9788466817431");
            ISBNS2.setText("9788466817448");
            ISBNS3.setText("9788466818513");

            tituloForTeachers.setTextColor(Color.parseColor("#1db59b"));
            tituloForStudents.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("The big picture"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("The BIG Picture Student’s Book");
            level2.setVisibility(View.VISIBLE);
            level2.setText("The BIG Picture Pack (WB+CD)");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Level A1: 9788466815673\n" +
                    "Level A2: 9788466820769\n" +
                    "Level B1: 9788466820776");
            ISBNS2.setText("Level A1: 7506009839595\n" +
                    "Level A2: 7506009834248\n" +
                    "Level B1: 7506009834255");


            level1T.setVisibility(View.VISIBLE);
            level1T.setText("The BIG Picture Teacher’s Book");
            level2T.setVisibility(View.VISIBLE);
            level2T.setText("The BIG Picture Class Audio CDs");
            level3T.setVisibility(View.VISIBLE);
            level3T.setText("The BIG Picture Digital Book");

            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS3T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("Level A1: 9788466815697\n" +
                    "Level A2: 9788466810579\n" +
                    "Level B1: 9788466810609");
            ISBNS2T.setText("Level A1: 9788466815703\n" +
                    "Level A2: 9788466812801\n" +
                    "Level B1: 9788466812825");
            ISBNS2T.setText("Level A1: 9788466815710\n" +
                    "Level A2: 9788466812818\n" +
                    "Level B1: 9788466812832");

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

            level1.setVisibility(View.VISIBLE);
            level1.setText("English Grammar in Steps with answers (New Edition)");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("9788466817530\n");

            level2.setVisibility(View.VISIBLE);
            level2.setText("English Grammar in Steps without answers (New Edition)");

            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS2.setText("9788466817554\n");

            level3.setVisibility(View.VISIBLE);
            level3.setText("English Grammar in Steps Practice Book with answers (New Edition)");

            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS3.setText("9788466817523\n");

            level4.setVisibility(View.VISIBLE);
            level4.setText("English Grammar in Steps Practice Book without answers (New Edition)");

            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS4.setText("9788466817547\n");


        }

        else if(titulo1.equals("Primary Methodology Handbook"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("CLIL Across Educational Levels");
            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS1T.setText("9788466802598\n");

            level2T.setVisibility(View.VISIBLE);
            level2T.setText("Helping Students to Learn");
            ISBNS2T.setVisibility(View.VISIBLE);
            ISBNS2T.setText("9788429454475\n");

            level3T.setVisibility(View.VISIBLE);
            level3T.setText("The Mixed Ability Class");
            ISBNS3T.setVisibility(View.VISIBLE);
            ISBNS3T.setText("9788429449273\n");

            level4T.setVisibility(View.VISIBLE);
            level4T.setText("An Introduction to Teaching English to Children");
            ISBNS4T.setVisibility(View.VISIBLE);
            ISBNS4T.setText("9788429450682\n");


            level5T.setVisibility(View.VISIBLE);
            level5T.setText("Helping Students to Speak");
            ISBNS5T.setVisibility(View.VISIBLE);
            ISBNS5T.setText("9788429449266\n");

            level6T.setVisibility(View.VISIBLE);
            level6T.setText("Evaluating your Students");
            ISBNS6T.setVisibility(View.VISIBLE);
            ISBNS6T.setText("9788429450675\n");

        }

        else if(titulo1.equals("Richmond Compact Dictionary"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));

            level1.setVisibility(View.VISIBLE);
            level1.setText("Richmond Compact Dictionary");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("9788466810340\n");

        }

        else if(titulo1.equals("Richmond Mini Dictionary"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));

            level1.setVisibility(View.VISIBLE);
            level1.setText("Richmond Mini Dictionary");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("9788466810333\n");

        }

        else if(titulo1.equals("Richmond Pocket Dictionary"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));

            level1.setVisibility(View.VISIBLE);
            level1.setText("Richmond Pocket Dictionary");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("9788466814164\n");
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

            level1.setVisibility(View.VISIBLE);
            level1.setText("Student’s Book with answers");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("A2: 9788466815291\n" +
                    "B1: 9788466815666\n");

            level1.setVisibility(View.VISIBLE);
            level1.setText("Student’s Book without answers");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("A2: 9788466815215\n" +
                    "B1: 9788466815246\n");
        }

        else if(titulo1.equals("Richmond Vocabulary Builder"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ef6264"));
            tituloForStudents.setTextColor(Color.parseColor("#ef6264"));

            level1.setVisibility(View.VISIBLE);
            level1.setText("Student’s Book with answers");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("B1: 9788466815277\n" +
                    "B2: 9788466815284\n");

            level1.setVisibility(View.VISIBLE);
            level1.setText("Student’s Book without answers");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("B1: 9788466815260\n" +
                    "B2: 9788466815444\n");
        }

        else if(titulo1.equals("DELTA'S Key to the TOEFL iBT"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));

            level1.setVisibility(View.VISIBLE);
            level1.setText("Essential Grammar for the iBT");
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText(" 7506009841765\n");

            level2.setVisibility(View.VISIBLE);
            level2.setText("SEVEN Practice Tests - Revised Edition");
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS2.setText("7506009841772\n");

            level3.setVisibility(View.VISIBLE);
            level3.setText("Advanced Skill Practice - Revised Edition");
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS3.setText("7506009841758\n");
        }

        else if(titulo1.equals("TARGET KET for Schools"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Target KET for Schools Student Pack (SB+CD-ROM)");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Target KET Workbook");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("7506009832596");
            ISBNS2.setText("9788466806824");


            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Target KET for Schools Teacher’s Pack (TB+Audio CD)");

            ISBNS1T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("7506009832619");

            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));


            level1.setVisibility(View.VISIBLE);
            level1.setText("Target KET for Schools Student Pack (SB+CD-ROM)");
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("7506009832596\n");

            level2.setVisibility(View.VISIBLE);
            level2.setText("Target KET Workbook");
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS2.setText("9788466806824\n");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Target KET for Schools Teacher’s Pack (TB+Audio CD)");
            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS1T.setText("7506009832619\n");
        }

        else if(titulo1.equals("TARGET PET"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Target PET Student Pack (SB+CD-ROM)");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Target PET Workbook");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("7506009832558");
            ISBNS2.setText("9788466808712");


            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Target PET Teacher’s Pack (TB+Audio CD)");

            ISBNS1T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("7506009832572");

            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));

            level1.setVisibility(View.VISIBLE);
            level1.setText("Target PET Student Pack (SB+CD-ROM)");
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("7506009832558\n");

            level2.setVisibility(View.VISIBLE);
            level2.setText("Target PET Workbook");
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS2.setText("9788466808712\n");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Target PET Teacher’s Pack (TB+Audio CD)");
            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS1T.setText("7506009832572\n");
        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: Advanced"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Richmond Practice Tests for Cambridge English: Advanced");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("9788466820714");

            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));


            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: First"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Target First Student’s Book");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Pack Target First (WB+CD)");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("9788466817493");
            ISBNS2.setText("7506009841789");


            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Target First Teacher’s Pack (TB+CD)");

            ISBNS1T.setVisibility(View.VISIBLE);

            ISBNS1T.setText("7506009841550");

            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));

            level1.setVisibility(View.VISIBLE);
            level1.setText("Student’s Book");
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("9788466817479\n");

            level2.setVisibility(View.VISIBLE);
            level2.setText("Student’s Book with answers");
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS2.setText("9788466820257\n");

            level1T.setVisibility(View.VISIBLE);
            level1T.setText("Pack Practice Tests First (TB+CD)");
            ISBNS1T.setVisibility(View.VISIBLE);
            ISBNS1T.setText("7506009841543\n");


        }

        else if(titulo1.equals("Richmond Practice Tests for IELTS"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Richmond Practice Tests for IELTS");

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("9788466817455");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));

            level1.setVisibility(View.VISIBLE);
            level1.setText("Richmond\n" +
                    "Practice Tests\n" +
                    "for IELTS");
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText("9788466817455\n");

        }

        else if(titulo1.equals("Pass the TOEIC Test"))
        {

            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Introductory: 7506009841215\n"+"Intermediate: 7506009841222\n"+"Advanced: 7506009841239");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));

            level1.setVisibility(View.VISIBLE);
            level1.setText("Introductory");
            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS1.setText(" 7506009841215\n");

            level2.setVisibility(View.VISIBLE);
            level2.setText("Intermediate");
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS2.setText("7506009841222\n");

            level3.setVisibility(View.VISIBLE);
            level3.setText("Advanced");
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS3.setText("7506009841239\n");
        }

        else if(titulo1.equals("Richmond Practice Tests: YLE"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));

            
        }

        else if(titulo1.equals("Richmond Practice Tests: ket and PET"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));


        }

        else if(titulo1.equals("Target Cambridge English: First"))
        {
            tituloForTeachers.setTextColor(Color.parseColor("#ffc907"));
            tituloForStudents.setTextColor(Color.parseColor("#ffc907"));


        }

        else if(titulo1.equals("Ready, Set, Go!"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Level 2 (K1):");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Level 3 (K2)::");
            level3.setVisibility(View.VISIBLE);
            level3.setText("Level 4 (K3)::");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNS1.setText("What Shape Is It?: 9786070606038\n"
                    +"Farm Animals: 9786070606021\n"
                    +"My Clothes: 9786070606014\n"
                    +"Helping My Family: 9786070606052");

            ISBNS2.setText("Everyday Jobs: 9786070606403\n"
                    +"Wild Animals: 9786070606045\n"
                    +"My New School: 9786070606069\n"
                    +"How Do We Get There?: 9786070606533");

            ISBNS3.setText("Our Living Earth: 9786070606564\n"
                    +"My Senses at Work: 9786070606311\n"
                    +"Animals through the Seasons: 9786070606328\n"
                    +"Take a Ride: 9786070606557");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Infoquest"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Level 1:");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Level 2:");
            level3.setVisibility(View.VISIBLE);
            level3.setText("Level 3:");
            level4.setVisibility(View.VISIBLE);
            level4.setText("Level 4:");
            level5.setVisibility(View.VISIBLE);
            level5.setText("Level 5:");
            level6.setVisibility(View.VISIBLE);
            level6.setText("Level 6:");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("In My Garden: 9789707392267\n"
                    +"Down on the Farm: 9789707392281\n"
                    +"Jeepers Creepers: 9789707392250");

            ISBNS2.setText("Fun and Games: 9789707392311\n"
                    +"Tho se Animals: 9789707392304\n"
                    +"What´s Cooking?: 9789707392328");

            ISBNS3.setText("Tap into Sap: 9789707392366");
            ISBNS4.setText("Grassland Safari: 9789707392380\n"
                    +"On the Wild Side: 9789707392403");

            ISBNS5.setText("A Way with Words: 9789707392410\n"
                    +"Getting Together: 9789707392441\n"
                    +"Cell City: 9789707392434");

            ISBNS6.setText("Close Up on Careers: 9789707392458");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Little Readers"))
        {
            ISBNS1.setVisibility(View.VISIBLE);

            ISBNS1.setText("Crickle, Crackle, Pop:  9789707392229\n"
                    +"Shake and Sh ver : 9789707392236");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Super stars"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Early Reader 1:");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Early Reader 2:");
            level3.setVisibility(View.VISIBLE);
            level3.setText("Solo Reader 1:");
            level4.setVisibility(View.VISIBLE);
            level4.setText("Solo Reader 2:");
            level5.setVisibility(View.VISIBLE);
            level5.setText("Fluent Reader 1:");
            level6.setVisibility(View.VISIBLE);
            level6.setText("Fluent Reader 2:");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);
            ISBNS6.setVisibility(View.VISIBLE);

            ISBNS1.setText("Be Healthy: 9786070606113\n"
                    +"Butterfly Life Cycle: 9786070606168\n"
                    +"Face Painting: 9786070606618\n"
                    +"Meet a Beekeeper: 9786070606571\n"
                    +"Meet an Astronaut: 9786070606144\n"
                    +"Grow Grass Creatures: 9786070606199\n"
                    +"My Community: 9786070606489\n"
                    +"Our Earth: 9786070606588\n"
                    +"Why We Need Sleep: 9786070606601");

            ISBNS2.setText("Tadpole to Frog: 9786070606137\n"
                    +"Water for Life: 9786070606472\n"
                    +"Schoolyard Games: 9786070606182\n"
                    +"Monkeys and Apes: 9786070606076\n"
                    +"Dangerous Jobs: 9786070606175\n"
                    +"Explore Eclipses: 9786070606090\n"
                    +"All about Sharks: 9786070606083\n"
                    +"Melting Ice: 9786070606120");

            ISBNS3.setText("Whales and Dolphins: 9786070606625\n"
                    +"Wild Wind storms: 9786070606151\n"
                    +"End angered Animals: 9786070606465\n"
                    +"On Safari: 9786070606373\n"
                    +"Recycling Race: 9786070606366\n"
                    +"Space Junk: 9786070606106\n"
                    +"Making Masks: 9786070606243\n"
                    +"EXPERIMENTS WITH MAGNETS: 9786070606205");

            ISBNS4.setText("Space Stations: 9786070606250\n"
                    +"Puppets Making: 9786070606274\n"
                    +"My Family Tree: 9786070606212\n"
                    +"Desert Animals: 9786070606342\n"
                    +"Why Volcanoes Erupt: 9786070606519\n"
                    +"Working with Apes: 9786070606229\n"
                    +"Radical Robos: 9786070606335\n"
                    +"ANIMALS IN CAPTIVITY: 9786070606236");

            ISBNS5.setText("The Games: 9786070606540\n"
                    +"Global Warming: 9786070606267\n"
                    +"Our Greatest Inventions: 9786070606298\n"
                    +"How Anim als Defend Themselves: 9786070606359\n"
                    +"Great Moments in History: 9786070606281\n"
                    +"Super Science Experiments: 9786070606304\n"
                    +"Magnificent Mummies: 9786070606526\n"
                    +"Secret Codes: 9786070606397");

            ISBNS6.setText("Creating Cool Gadgets: 9786070606632\n"
                    +"Explore Extreme Sports: 9786070606434\n"
                    +"How the Brain Works: 9786070606427\n"
                    +"It’s a Mystery: 9786070606595\n"
                    +"Make Your Own Web Page: 9786070606441\n"
                    +"How Aircraft Fly: 9786070606496\n"
                    +"Reptiles and Amphibians: 9786070606380\n"
                    +"Why Earth quakes Occur: 9786070606502\n"
                    +"Body Smart: 9786070606458");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Media readers"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Starter Level:");
            level2.setVisibility(View.VISIBLE);
            level2.setText("\n\n\n\n\n\n\nLevel 1:");
            level3.setVisibility(View.VISIBLE);
            level3.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nLevel 2:");
            level4.setVisibility(View.VISIBLE);
            level4.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nLevel 3:");
            level5.setVisibility(View.VISIBLE);
            level5.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nLevel 4:");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);
            ISBNS5.setVisibility(View.VISIBLE);

            ISBNS1.setText("Robin Hood: The Taxman: 9788466812214\n"
                    +"Zoey 101: Dance Contest: 9781906861063\n"
                    +"Blog Love: 9780956857705\n"
                    +"\"Storm Hawks:9781906861056\n");

            ISBNS2.setText("Malala: 9781910173602\n"
                    +"Mr. Bean’s Holiday : 9788466810197\n"
                    +"BUFFY THE VAMPIRE SLAYER: 9781904720331\n"
                    +"Transformers: 9781905775446\n"
                    +"Hotel for Dogs: 9781905775897\n"
                    +"Monster House: 9788466808729\n"
                    +"THE ADVENTURES OF MERLIN: Arthur and the Unicorn : 9781905775873\n"
                    +"One Direction: Making the dream real: 9781909221864\n"
                    +"The city of ember: 9781905775460\n"
                    +"SMALLVILLE ARRIVAL: 9788466808668\n");

            ISBNS3.setText("Muhammad Ali: 9781407169972\n"
                    +"Great Expectations: 9781909221994\n"
                    +"Selma: 9781910173718\n"
                    +"Sherlock : The Sign of Three: 9781910173497"
                    +"The Pink Panther : 9788466818704\n" +
                    "9781904720751\n"
                    +"Romeo and Juliet: 9781910173534\n"
                    +"The In-Crowd: 9788466819046\n"
                    +"Johnn y English Reborn: 9781407133720\n"
                    +"ABOUT TIME: 9781910173473\n"
                    +"THE DEVIL WEARS PRADA: 9788466812245"
                    +"STAR WARS: THE CLONE WARS: 9781905775521\n"
                    +"SENSE AND SENSIBILITY : 9781905775620\n"
                    +"GLEE: FOREING EXCHANGE: 9781909221215\n"
                    +"HOOT: 9788466810241\n"
                    +"NIGHT AT THE MUSEUM: : SECRET OF THE TOMB: 9781910173589"
                    +"The OC: The Outsider : 9781904720836\n"
                    +"The Mask of Zorro: 9781906861162\n"
                    +"Bandslam: 9781905775972\n"
                    +"Jane Eyre: 9788466810227"
                    +"Batman Begins: 9788466818698\n"
                    +"Glee : The Beginning: 9781908351333\n"
                    +"Senna: 9781909221192"
                    +"Nelson Mandela : 9781908351166\n"
                    +"TRANSFORMERS: Revenge of the Fallen: 9781909221222\n"
                    +"ROBIN HOOD: The Silver Arrow and the Slaves: 9788466810234\n"
                    +"DJ Ambition: 9788466819053");

            ISBNS4.setText("12 Years a Slave: 9781910173527\n"
                    +"Suffragette: 9781910173398\n"
                    +"The Imitation Game: 9781910173411\n"
                    +"Black Gold: 9781905775569\n"
                    +"Bob Marley : 9781908351982\n"
                    +"MICHAEL JACKS ON : The Man, The Music, The Mystery: 9788466812771\n"
                    +"Angela’s Ashes: 9788466810302"
                    +"Made in Dagenham: 9781908351203\n"
                    +"Glee : Summer Break: 9781909221253\n"
                    +"TRANSFORMERS : THE DARK OF MOON: 9781909221260\n"
                    +"Pride & Prejudice: 9788466810265\n"
                    +"SHERL OCK: The Hounds of Basker ville: 9781909221246\n"
                    +"Life of PI: 9781909221789\n"
                    +"Touching the Void: 9781905775095\n"
                    +"The Story of Chanel: 9781906861858\n"
                    +"The Queen: 9788466812276\n"
                    +"TThe OC: The Gamble: 9781904720850\n"
                    +"The OC: The Misfits: 9781904720874\n"
                    +"VANITY FAIR: 9781906861186");

            ISBNS5.setText("An Education: 9781906861018\n"
                    +"Nowhere Boy: Before The Beatles – the story of John Lennon: 9781906861032\n"
                    +"A Lion Called Christian 9781906861223\n"
                    +"Slumdog Millionaire: 9781906861216");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Popcorn readers"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Starter Level:");
            level2.setVisibility(View.VISIBLE);
            level2.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nLevel 1:");
            level3.setVisibility(View.VISIBLE);
            level3.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nLevel 2:");
            level4.setVisibility(View.VISIBLE);
            level4.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nLevel 3:");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);
            ISBNS4.setVisibility(View.VISIBLE);

            ISBNS1.setText("Meet the Turtles: 9781909221819\n"
                    +"Meet the Smurfs!: 9781910173442\n"
                    +"Who are the Smurfs?: 9781910173435\n"
                    +"\"SpongeBob squarepants :\n" +
                    "Underwater Friends\": 9781909221833\n"
                    +"Mr. Bean: A day at the beach: 9781909221796\n"
                    +"\"How to Train Your Dragon:\n" +
                    "Hic up and Friends: \n 9781910173756\n"
                    + "\"SpongeBob squarepants :\n" +
                    "SpongeBob’s New Toy: \n9781909221895\n"
                    +"Mr. Bean: Guide to London: \n 9781910173046 \n"
                    +"Meet the Croods: \n9781910173770\n"
                    +"The Animals of Kung Fu Panda:\n 9781910173794");

            ISBNS2.setText("Ice Age 4: 9781407169910\n"
                    +"The Jungle Book : 9781908351500\n"
                    +"MR. BEAN ROYAL BEAN: 9781906861469\n"
                    +"Madagascar: 9781906861575\n"
                    +"Shrek: 9781906861551\n"
                    +"Over the Hedge: 9781909221291\n"
                    +"Kung Fu Panda : Holidays: 9781909221284\n"
                    +"Rio: Blu and Jewel: 9781908351258\n"
                    +"THE PENGUINS OF MADAGASCAR: 9781909221307\n"
                    +"Gargamel’s Magic Spell: 9781910173558\n"
                    +"SpongeBob Square Pants : Talent Show: 9781909221901\n"
                    +"Cloudy with the Chane of Meatballs: 9781910173459\n"
                    +"Rise of the Turtles: 9781909221888\n"
                    +"Ice Age: 9781906861599\n"
                    +"The Jungle Book : Cobra’s Egg: 9781908351524\n"
                    +"Snoopy and Charlie Brown: The Peanuts Movie: 9781910173510\n"
                    +"How to Train Your Dragon: 9781910173817");

            ISBNS3.setText("The little prince & the rose: 9781407169941\n"
                    +"ANGRY BIRDS: 9781407169927\n"
                    +"MADAGASCAR: Escape Africa: 9781906861650\n"
                    +"Mr. Bean: Toothache: 9781906861483"
                    +"PUSS in boots : The Outlaw: 9781909221338\n"
                    +"Shrek 2: 9781906861636\n"
                    +"The Smurfs 2: 9781910173541"
                    +"Rango: 9781906861995\n"
                    +"Peanuts classic: Snoopy and Friends: 9781910173565\n"
                    +"Cloudy with the Chance: of Meatballs 2: 9781910173466"
                    +"Time Jump : Back to the Stone Age: 9781908351647\n"
                    +"The Turtles : Kraang Attack!: 9781910173015\n"
                    +"How to Train Your Dragon 2: 9781910173831\n"
                    +"Turbo : 9781910173855\n"
                    +"SpongeBob Square Pants : Wormy: 9781910173008");

            ISBNS4.setText("The Smurfs : The Lost Village: 9781407169958\n"
                    +"Home: 9781910173879\n"
                    +"SpongeBob Square Pants :DoodleBob: 9781909221826\n"
                    +"Rio: Looking for Blu: 9781908351128"
                    +"The Turtles : Donnie’s Robot: 9781910173022\n"
                    +"Shrek Forever After: 9781906861308\n"
                    +"Madagascar 3: Europe’s Most Wanted: 9781909221352"
                    +"Peanuts classic:The Ice-Skating Competition: 9781910173572\n"
                    +"Kung Fu Panda 2: 9781906861834\n"
                    +"Shrek the Third: 9781906861735\n"
                    +"MR BEAN: THE PALACE OF BEAN: 9781906861506\n"
                    +"Ice Age 3: Dawn of the Dinosaurs: 9781906861773\n");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("Richmond readers"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Level 3:");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Level 4:");
            level3.setVisibility(View.VISIBLE);
            level3.setText("Level 5:");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);
            ISBNS3.setVisibility(View.VISIBLE);

            ISBNS1.setText("P.R. and Prejudice: 9786070606113\n"
                    +"The Canterville Ghost: 9786070606168\n"
                    +"Dr. Jekyll & Mr. Hyde: 9786070606618\n"
                    +"Frankenstein: 9786070606571");

            ISBNS2.setText("Medical Match: 9786070606137\n"
                    +"A Floral Arrangement: 9786070606472\n"
                    +"Sense & Sensibility: 9786070606182\n"
                    +"Dracula: 9786070606076\n"
                    +"A Trip to London: 9786070606175");

            ISBNS3.setText("Elizabet h II:The Diamond Queen: 9786070606625\n"
                    +"Steve Jobs : th e man behind Apple: 9786070606151\n"
                    +"SHERLOCK HOLMES: 9786070606465");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }

        else if(titulo1.equals("DVD readers"))
        {
            level1.setVisibility(View.VISIBLE);
            level1.setText("Level A2:");
            level2.setVisibility(View.VISIBLE);
            level2.setText("Level B1:");

            ISBNS1.setVisibility(View.VISIBLE);
            ISBNS2.setVisibility(View.VISIBLE);

            ISBNS1.setText("Brilliant Britain: The Seaside: 9786070606915\n"
                    +"Take Away My Takeaway: Hong Kong: 9786070606861\n"
                    +"Take Away My Takeaway: Texas: 9786070606854\n"
                    +"999 Emergency: 9781909221383\n"+
                    "The British Royal Family: 9781909221390");

            ISBNS2.setText("Brilliant Brita in: Tea: 9786070606908\n"
                    +"Changing World: 9781909221413\n"
                    +"Take Away My Takeaway : Italy: 9786070606878\n"
                    +"Eccentric Britain: 9781909221406\n"+
                    "Brilliant Brita in: Breakfasts: 9786070606892\n"
                    +"Take Away My Takeaway : New Orleans: 9786070606885");

            tituloForStudents.setVisibility(View.GONE);
            tituloForTeachers.setVisibility(View.GONE);
            ISBNStudents.setVisibility(View.GONE);
            ISBNTeachers.setVisibility(View.GONE);

            tituloForTeachers.setTextColor(Color.parseColor("#018abf"));
            tituloForStudents.setTextColor(Color.parseColor("#018abf"));
        }


    }

    @Override
    public void onResume(){
        super.onResume();
    }

}