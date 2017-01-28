package mx.neuland.richmond;


import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TwoFragment extends Fragment{

    static String titulo1;
    static Context contexto;

    TextView components;
    TextView studentsbook;

    ImageView imagen1;
    ImageView imagen2;
    ImageView imagen3;
    ImageView imagen4;
    ImageView imagen5;
    ImageView imagen6;

    TextView texto1;
    TextView texto2;
    TextView texto3;
    TextView texto4;
    TextView texto5;
    TextView texto6;

    TextView tituloComponents;

    /*public TwoFragment(String titulo, Context detallesSerieActivity) {
        titulo1 = titulo;
        contexto = detallesSerieActivity;
    }*/

    public static final TwoFragment newInstance(String titulo, Context detallesSerieActivity)
    {
        TwoFragment f = new TwoFragment();
        titulo1 = titulo;
        contexto = detallesSerieActivity;
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Typeface leagueGothic = Typeface.createFromAsset(getContext().getAssets(), "league_gothic.otf");
        Typeface firaSansMedium = Typeface.createFromAsset(getContext().getAssets(), "fira_sans_medium.otf");
        Typeface firaSansLight = Typeface.createFromAsset(getContext().getAssets(), "fire_sans_light.otf");

        View view = inflater.inflate(R.layout.fragment_two, container, false);
        components = (TextView)view.findViewById(R.id.components);
        studentsbook = (TextView)view.findViewById(R.id.studentsbook);
        imagen1 = (ImageView)view.findViewById(R.id.imagen1);
        imagen2 = (ImageView)view.findViewById(R.id.imagen2);
        imagen3 = (ImageView)view.findViewById(R.id.imagen3);
        imagen4 = (ImageView)view.findViewById(R.id.imagen4);
        imagen5 = (ImageView)view.findViewById(R.id.imagen5);
        imagen6 = (ImageView)view.findViewById(R.id.imagen6);


        texto1 = (TextView)view.findViewById(R.id.texto1);
        texto2 = (TextView)view.findViewById(R.id.texto2);
        texto3 = (TextView)view.findViewById(R.id.texto3);
        texto4 = (TextView)view.findViewById(R.id.texto4);
        texto5 = (TextView)view.findViewById(R.id.texto5);
        texto6 = (TextView)view.findViewById(R.id.texto6);

        tituloComponents = (TextView)view.findViewById(R.id.tituloComponents);

        studentsbook.setTypeface(leagueGothic);
        components.setTypeface(firaSansLight);

        tituloComponents.setTypeface(leagueGothic);
        texto1.setTypeface(firaSansLight);
        texto2.setTypeface(firaSansLight);
        texto3.setTypeface(firaSansLight);
        texto4.setTypeface(firaSansLight);
        texto5.setTypeface(firaSansLight);
        texto6.setTypeface(firaSansLight);

        return view;
    }

    @Override
    public void onStart(){
        super.onStart();

        if(titulo1.equals("CUBBY HOUSE"))
        {
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.student_book_cubby);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Student’s Book\n\n" +
                    "El Student’s Book contiene páginas con ilustraciones o fotografías a todo color para " +
                    "representar el léxico y las estructuras de forma " +
                    "más clara, memorable y atractiva.");

            imagen2.setImageResource(R.drawable.student_cd_cubby);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Student’s CD\n\n" +
                    "Cubby House incluye un CD con las canciones, " +
                    "cantos, rimas e historias de la serie, para que " +
                    "los alumnos pueden escucharlos cuantas veces " +
                    "quieran y consoliden lo aprendido en clase.");

        }

        else if(titulo1.equals("PEBBLES"))
        {
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.student_book_pebbles);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Student’s Book\n\n" +
                    "Pebbles Student’s Book consta de nueve unidades "+
                    "temáticas con actividades variadas y "+
                    "divertidas para aprender el idioma inglés.");

            imagen2.setImageResource(R.drawable.resourse_booklet);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Resource Booklet\n\n" +
                    "Pebbles Resource Booklet contiene los siguientes " +
                    "elementos:\n" +
                    "Pop-outs, Pictionary Puzzles, Números para trazar");

            imagen3.setImageResource(R.drawable.hans_on_activity_pad);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Hands-on Activity Pad\n\n" +
                    "Pebbles Hands-on Activity Pad incluye dos " +
                    "actividades manuales para cada unidad.");

            imagen4.setImageResource(R.drawable.student_cd_pebbles);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Student’s CD\n\n" +
                    "Incluyen las grabaciones de todas las canciones, rimas, así como de las palabras del vocabulario de cada nivel");
        }

        else if(titulo1.equals("GUMDROPS"))
        {
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.student_book_gumdrops);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Student’s Book\n\n" +
                    "The Student’s Book contains full-colored pages with a variety of fun activities.");

            imagen2.setImageResource(R.drawable.activity_pad_gumdrops);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Activity Pad\n\n" +
                    "Th e Activity Pad contains detachable pages of stimulating activities that provide extra hands-on practice for developing essential readiness skills and concepts, such as drawing, coloring, fi nger-painting, and assembling.");

            imagen3.setImageResource(R.drawable.student_audio_gumdrops);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("\"Student’s Audio CD (Level 1)\n\n" +
                    "Th e Student’s Audio contains all the songs, rhymes, chants and stories from Level 1 recorded by native English Speakers for students to listen to outside the classroom.");

            imagen4.setImageResource(R.drawable.student_interactive_cd);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Student’s Audio/Interactive CD-ROM (Levels 2 and 3)");

            imagen5.setImageResource(R.drawable.student_resource_pack_gumdrops);
            imagen5.setVisibility(View.VISIBLE);

            texto5.setText("Student’s (Resource Pack)\n" +
                    "- Finger and Stick Puppets\n" +
                    "- Stickers\n" +
                    "- Mini-flashcards");
        }

        else if(titulo1.equals("TIPPY TOES"))
        {
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.student_book_tippy_toes);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Student’s Book\n\n" +
                    "The Student’s Book contains 152 full-color pages with a variety of fun and beautiful illustrations.");

            imagen2.setImageResource(R.drawable.stickers_tippy_toes);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Stickers\n\n" +
                    "Tippy Toes off ers colorful and fun Stickers that are used in every unit along with the Student’s Book. Th ey off er a motivational element to the course.");

            imagen3.setImageResource(R.drawable.activity_book_tippy_toes);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Activity Book\n\n" +
                    "The Activity Book reinforces what students learn in the classroom through a wide variety of activities.");

            imagen4.setImageResource(R.drawable.student_cd_tippy_toes);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Student’s CD\n\n" +
                    "The Student’s CD contains all the songs, rhymes, chants and stories from Level 1 for students to listen outside the classroom.");

            imagen5.setImageResource(R.drawable.interactive_cd_rom_tippy_toes);
            imagen5.setVisibility(View.VISIBLE);

            texto5.setText("Interactive CD (Levels 2 and 3)");

            imagen6.setImageResource(R.drawable.app_tippy_toes);
            imagen6.setVisibility(View.VISIBLE);

            texto6.setText("Tippy Toes App (Level 1)");

        }

        else if(titulo1.equals("MY FIRST LETTERS AND SOUNDS"))
        {

            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.student_book_mfls);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Student’s Book\n\n");

            imagen2.setImageResource(R.drawable.student_cd_mfls);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Student’s CD\n\n");

            imagen3.setImageResource(R.drawable.app_mfls);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("App\n\n");

        }

        else if(titulo1.equals("CRICKETS"))
        {
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.student_book_crickets);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Student’s Book\n\n" +
                    "The Student’s Book contains full-colored pages with both illustrations and photographs that represent concepts vividly and clearly.");

            imagen2.setImageResource(R.drawable.practice_book_crickets);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Practice Book\n\n" +
                    "The Crickets Practice Book is for use in the classroom or at home. Activities in the Practice Book correspond to the stages Explore, Explain and Evaluate of the 5Es methodology.");

            imagen3.setImageResource(R.drawable.students_cd_crickets);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Student’s CD\n\n" +
                    "The Student’s CD includes recordings by native English speakers of all the stories, songs and chants.");

            imagen4.setImageResource(R.drawable.tales_students_crickets);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Cricket Tales\n\n" +
                    "This useful component, for both students and teachers, features fun reading activities related to each of the stories from Crickets.");

            imagen5.setImageResource(R.drawable.app_crickets);
            imagen5.setVisibility(View.VISIBLE);

            texto5.setText("Crickets App\n\n" +
                    "Crickets Nursery and Level 1 feature an App with fun activities to review and practice everywhere children go!");

        }

        else if(titulo1.equals("M@TH ADVENTURES"))
        {
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.math_adventures_student_book);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Student’s Book\n\n" +
                    "Has eight contextualized units. Each unit includes twelve core lesson pages and two review pages.");

            imagen2.setImageResource(R.drawable.math_adventures_student_cd);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Student’s CD\n\n" +
                    "Includes math-related songs and chants for students to listen to in and outside the classroom.");

            imagen3.setImageResource(R.drawable.pack_sb_resoruces_cd_math);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Resource Pack\n\n" +
                    "Provides a collection of manipulative materials for children’s use. These are different types of cutouts that are used repeatedly throughout the course.");

            imagen4.setImageResource(R.drawable.microsite_students_math);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Microsite\n\n" +
                    "www.richmond.com.mx/mathadventures");
        }

        //

        else if(titulo1.equals("ABRACADABRA"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_abracadabra);
        }

        else if(titulo1.equals("BEEP")) {

            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_beep);

        }

        else if(titulo1.equals("COOL KIDS")) {

            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_coolkids);

        }

        else if(titulo1.equals("LIGHTHOUSE"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_lighthouse);
        }

        else if(titulo1.equals("PATHWAY TO GRAMMAR"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_pathway_grammar);
        }

        else if(titulo1.equals("PATHWAY TO LITERATURE"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_pathway_literature);
        }

        else if(titulo1.equals("PATHWAY TO MATH"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_pathway_math);
        }

        else if(titulo1.equals("PATHWAY TO SCIENCE"))
        {

            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_pathway_science);
        }

        else if(titulo1.equals("THUMBS UP SECOND EDITION"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_thumps_up);
        }

        else if(titulo1.equals("SCIENCE AND GEOGRAPHY"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_science_geography);
        }

        else if(titulo1.equals("SKYROCKET"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));

            components.setText(R.string.components_skyrocket);

            studentsbook.setVisibility(View.VISIBLE);
            studentsbook.setTextColor(Color.parseColor("#1cb0c3"));

            imagen1.setImageResource(R.drawable.primariaskyrockets1);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Nine units of 10 pages each, a review and a literature section every three units, dictionary and stickers.");

            imagen2.setImageResource(R.drawable.primariaskyrockets2);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Consolidates and reinforces grammar and vocabulary.");
        }

        else if(titulo1.equals("SPOTLIGHT ON ENGLISH"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1cb0c3"));
            components.setText(R.string.components_spotlight);
        }

        //

        else if(titulo1.equals("Achievers"))
        {
            tituloComponents.setTextColor(Color.parseColor("#99549b"));

            components.setText(R.string.components_achievers);
        }

        else if(titulo1.equals("Awesome"))
        {
            tituloComponents.setTextColor(Color.parseColor("#99549b"));
            components.setText(R.string.components_achievers);
        }

        else if(titulo1.equals("Combined Sciences"))
        {
            tituloComponents.setTextColor(Color.parseColor("#99549b"));

            components.setText(R.string.components_awesome);
        }

        else if(titulo1.equals("English in Motion"))
        {
            tituloComponents.setTextColor(Color.parseColor("#99549b"));

            components.setText(R.string.components_englishinmotion);
        }

        else if(titulo1.equals("Next Step"))
        {
            tituloComponents.setTextColor(Color.parseColor("#99549b"));

            components.setText(R.string.components_nextstep);
        }

        else if(titulo1.equals("Spotlight on Literature"))
        {
            tituloComponents.setTextColor(Color.parseColor("#99549b"));

            components.setText(R.string.components_spotlightliterature);
        }

        else if(titulo1.equals("Stopwatch"))
        {
            tituloComponents.setTextColor(Color.parseColor("#99549b"));

            components.setText(R.string.components_stopwatch);

            studentsbook.setVisibility(View.VISIBLE);
            studentsbook.setTextColor(Color.parseColor("#99549b"));

            imagen1.setImageResource(R.drawable.secundariastopwatchs1);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("New pages that introduce the vocabulary of each unit! " +
                    "Attractive texts that help students develop their reading skills!");

            imagen2.setImageResource(R.drawable.secundariastopwatchs2);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Activities to help students develop listening and speaking skills! " +
                    "Writing activities that take students step by step to create different pieces of writing!");
        }

        //

        else if(titulo1.equals("American Big Picture"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1db59b"));

            components.setText(R.string.components_americanbigpicture);

        }

        else if(titulo1.equals("@work"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1db59b"));

            components.setText(R.string.components_atwork);
        }

        else if(titulo1.equals("English ID"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1db59b"));

            components.setText(R.string.components_englishid);
        }

        else if(titulo1.equals("Going Pro"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1db59b"));

            components.setText(R.string.components_goingpro);

            studentsbook.setVisibility(View.VISIBLE);
            studentsbook.setTextColor(Color.parseColor("#1db59b"));

            imagen1.setImageResource(R.drawable.adultsgoingpros1);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Each block begins with an exciting opener including a separate fold-out spread in which students explore, discuss and solve a mystery or puzzle. Subsequent lessons cover listening and speaking activities thematically connected to the opener, followed by communicative grammar and vocabulary work and reading strategies.");

            imagen2.setImageResource(R.drawable.adultsgoingpros2);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Case studies to promote critical thinking. Reading and writing Tips in every block, students will find boxes with explanations and practical suggestions on how to become better readers and/or writers.");
        }

        else if(titulo1.equals("Identities"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1db59b"));

            components.setText(R.string.components_identities);
        }

        else if(titulo1.equals("Richmond Mazes"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1db59b"));

            components.setText(R.string.components_richmondmazes);
        }

        else if(titulo1.equals("The big picture"))
        {
            tituloComponents.setTextColor(Color.parseColor("#1db59b"));

            components.setText(R.string.components_thebigpicture);
        }

        else if(titulo1.equals("BUSINESS Skills"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_business_skills);
        }

        else if(titulo1.equals("BUSINESS Theories"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Visual Grammar"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_visual_grammar);
        }

        else if(titulo1.equals("Vocabulary Builder"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_vocabulary_builder);
        }

        else if(titulo1.equals("English Grammar in Steps"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_empty);
        }

        else if(titulo1.equals("Primary METHODOLOGY HANDBOOK"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_empty);
        }

        else if(titulo1.equals("Lessons Learned"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_empty);
        }

        else if(titulo1.equals("Primary Handbooks for Teachers"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_empty);
        }

        else if(titulo1.equals("Richmond Picture Dictionary"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_empty);
        }

        else if(titulo1.equals("Richmond First Dictionary"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_empty);
        }

        else if(titulo1.equals("Richmond Dictionay Fully Illustrated"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_empty);
        }

        else if(titulo1.equals("Richmond Dictionaries"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_empty);
        }

        else if(titulo1.equals("DELTA'S Key to the TOEFL iBT"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_empty);
        }

        else if(titulo1.equals("TARGET KET for Schools"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_target_ket);
        }

        else if(titulo1.equals("TARGET PET"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_target_ket);
        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: Advanced"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_richmond_test_advance);
        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: First"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_richmond_test_first);
        }

        else if(titulo1.equals("Richmond Practice Tests for IELTS"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_richmond_ielts);
        }

        else if(titulo1.equals("Pass the TOEIC Test"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_richmond_toeic);
        }

        else if(titulo1.equals("Richmond Practice Tests: YLE"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_yle);
        }

        else if(titulo1.equals("Richmond Practice Tests: ket and PET"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_ket_pet);
        }

        else if(titulo1.equals("Target Cambridge English: First"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_camb_first);
        }

        else if(titulo1.equals("Ready, Set, Go!"))
        {
            tituloComponents.setTextColor(Color.parseColor("#018abf"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Infoquest"))
        {
            tituloComponents.setTextColor(Color.parseColor("#018abf"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Little Readers"))
        {
            tituloComponents.setTextColor(Color.parseColor("#018abf"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Super stars"))
        {
            tituloComponents.setTextColor(Color.parseColor("#018abf"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Popcorn readers"))
        {
            tituloComponents.setTextColor(Color.parseColor("#018abf"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Media readers"))
        {
            tituloComponents.setTextColor(Color.parseColor("#018abf"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Richmond readers"))
        {
            tituloComponents.setTextColor(Color.parseColor("#018abf"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("DVD readers"))
        {
            tituloComponents.setTextColor(Color.parseColor("#018abf"));

            components.setText(R.string.components_lorem);
        }

    }

    @Override
    public void onResume(){
        super.onResume();
    }

}