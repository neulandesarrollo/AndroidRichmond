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

public class ThreeFragment extends Fragment{

    static String titulo1;
    static Context contexto;

    TextView tituloComponentsTeachers;
    TextView componentsTeachers;
    TextView descripcionTeachers;

    ImageView imagen1;
    ImageView imagen2;
    ImageView imagen3;
    ImageView imagen4;
    ImageView imagen5;
    ImageView imagen6;
    ImageView imagen7;
    ImageView imagen8;

    TextView texto1;
    TextView texto2;
    TextView texto3;
    TextView texto4;
    TextView texto5;
    TextView texto6;
    TextView texto7;
    TextView texto8;

    /*public ThreeFragment(String titulo, Context detallesSerieActivity) {
        titulo1 = titulo;
        contexto = detallesSerieActivity;
    }*/

    public static final ThreeFragment newInstance(String titulo, Context detallesSerieActivity)
    {
        ThreeFragment f = new ThreeFragment();
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

        View view = inflater.inflate(R.layout.fragment_three, container, false);
        tituloComponentsTeachers = (TextView)view.findViewById(R.id.tituloComponentsTeachers);
        componentsTeachers = (TextView)view.findViewById(R.id.componentsTeachers);
        descripcionTeachers = (TextView)view.findViewById(R.id.descripcionTeachers);

        imagen1 = (ImageView)view.findViewById(R.id.imagen1);
        imagen2 = (ImageView)view.findViewById(R.id.imagen2);
        imagen3 = (ImageView)view.findViewById(R.id.imagen3);
        imagen4 = (ImageView)view.findViewById(R.id.imagen4);
        imagen5 = (ImageView)view.findViewById(R.id.imagen5);
        imagen6 = (ImageView)view.findViewById(R.id.imagen6);
        imagen7 = (ImageView)view.findViewById(R.id.imagen7);
        imagen8 = (ImageView)view.findViewById(R.id.imagen8);

        texto1 = (TextView)view.findViewById(R.id.texto1);
        texto2 = (TextView)view.findViewById(R.id.texto2);
        texto3 = (TextView)view.findViewById(R.id.texto3);
        texto4 = (TextView)view.findViewById(R.id.texto4);
        texto5 = (TextView)view.findViewById(R.id.texto5);
        texto6 = (TextView)view.findViewById(R.id.texto6);
        texto7 = (TextView)view.findViewById(R.id.texto7);
        texto8 = (TextView)view.findViewById(R.id.texto8);

        tituloComponentsTeachers.setTypeface(leagueGothic);
        componentsTeachers.setTypeface(firaSansLight);
        descripcionTeachers.setTypeface(firaSansLight);

        texto1.setTypeface(firaSansLight);
        texto2.setTypeface(firaSansLight);
        texto3.setTypeface(firaSansLight);
        texto4.setTypeface(firaSansLight);
        texto5.setTypeface(firaSansLight);
        texto6.setTypeface(firaSansLight);
        texto7.setTypeface(firaSansLight);
        texto8.setTypeface(firaSansLight);

        return view;
    }

    @Override
    public void onStart(){
        super.onStart();

        if(titulo1.equals("CUBBY HOUSE"))
        {

            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.guia_maestro_cubby);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("\"Guía del Maestro (In Spanish)\n\n" +
                    "La Guía del Maestro incluye notas detalladas para desarrollar cada lección, las actividades de valores, habilidades motrices, la revisión y el ciclo de lectura.");

            imagen2.setImageResource(R.drawable.cd_class_resource_cubby);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Class & Resource CD\n\n" +
                    "Incluye un CD de Recursos para el profesor, donde encontrará las grabaciones de las canciones, cantos, rimas e historias, así como los worksheets y assessments, actividades de festividades (Holidays) y la Unidad Cero.");

            imagen3.setImageResource(R.drawable.story_cards_cubby);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Story Cards\n\n" +
                    "Cubby House incluye una historia por unidad, ilustrada en tarjetas de gran tamaño o Story Cards. Las historiasse relacionan con el tema y las estructuras de cada unidad, de modo que los alumnos puedan repasarlas en contextos y situaciones que les sean atractivos y significativos.");

            imagen4.setImageResource(R.drawable.flash_cards_cubby);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Flashcards\n\n" +
                    "Cubby House contiene flashcards que ilustran las palabras de uso más frecuente en cada unidad.");
        }

        else if(titulo1.equals("PEBBLES"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.guia_del_maestro_pebbles);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Teacher’s Guide in Spanish\n\n" +
                    "La Guía del Maestro de Pebbles cuenta con instrucciones para el maestro sobre el manejo de cada lección y con las páginas del Student’s Book intercaladas, para una rápida referencia");

            imagen2.setImageResource(R.drawable.class_cd_pebbles);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Class CD\n\n" +
                    "Incluyen las grabaciones de todas las canciones, rimas, así como de las palabras del vocabulario de cada nivel");

            imagen3.setImageResource(R.drawable.flash_cards_pebbles);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Flashcards\n\n" +
                    "Pebbles cuenta con un número de tarjetas para cada unidad, las cuales son un útil y atractivo apoyo visual para presentar y practicar el vocabulario y las estructuras.");

            imagen4.setImageResource(R.drawable.hans_on_activity_pad_pebbles);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Fun Activity Mat with Pebble Puppet");
        }

        else if(titulo1.equals("GUMDROPS"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            imagen1.setImageResource(R.drawable.teacher_guide_gumdrops);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Teacher’s Guide\n\n" +
                    "Gumdrops Teacher’s Guide offers comprehensive, step-by-step notes that are interleaved with the Student’s Book and Activity Pad pages.");

            imagen2.setImageResource(R.drawable.big_book_gumdrops);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Big Books\n\n" +
                    "The Big Book is a beautifully illustrated collection of original and traditional stories and chants that will delight and animate " +
                    "students while exposing them to natural language.");

            imagen3.setImageResource(R.drawable.posters_cutouts_gumdrops);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Posters & Cutouts\n\n" +
                    "Gumdrops posters provide the teacher with an eff ective visual tool to introduce and reinforce target vocabulary and language. Each unit comes with large, theme-related cut-out cards.");

            imagen4.setImageResource(R.drawable.teacher_cd_rom1_gumdrops);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Teacher’s Resource CD-ROM\n\n" +
                    "This includes the Gumdrops Support Booklet, which contains the series philosophy and methodology, as well as valuable tips for " +
                    "presenting language and vocabulary, developing skills and making the most of all of the Gumdrops components.");

            imagen5.setImageResource(R.drawable.class_audio_gumdrops1);
            imagen5.setVisibility(View.VISIBLE);

            texto5.setText("Class Audio\n\n" +
                    "The Class Audio includes recordings by native English speakers of all the songs chants, rhymes and stories.");

            imagen6.setImageResource(R.drawable.classroom_lenguage_cards_gumdrops);
            imagen6.setVisibility(View.VISIBLE);

            texto6.setText("Classroom Language Cards\n\n" +
                    "These visual cue cards vividly illustrate common classroom commands. Use them when you are giving students instructions along with the English command.");

            imagen7.setImageResource(R.drawable.digital_book_gumdrops);
            imagen7.setVisibility(View.VISIBLE);

            texto7.setText("Digital Book");
        }

        else if(titulo1.equals("TIPPY TOES"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            imagen1.setImageResource(R.drawable.teachers_book_tippy_toes);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Teacher’s Guide\n\n" +
                    "The Teacher’s Guide contains easy to follow teacher’s notes");

            imagen2.setImageResource(R.drawable.class_cd_tippy_toes);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Class CD\n\n" +
                    "The Class CD includes recordings by native English speakers of all the " +
                    "songs, chants, rhymes, and stories.");

            imagen3.setImageResource(R.drawable.big_book_tippy_toes);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Big Book\n\n" +
                    "The Big Book is a collection of original and traditional children’s literature that will delight and animate students.");

            imagen4.setImageResource(R.drawable.poster_tippy_toes);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Posters & Cutouts\n\n" +
                    "There is an interactive poster with cutouts for each unit. These large and colorful visual aids allow the teacher to present and practice language simply and clearly.");

            imagen5.setImageResource(R.drawable.fun_activity_mat_tippy_toes);
            imagen5.setVisibility(View.VISIBLE);

            texto5.setText("Fun Activity Mat\n\n");

            imagen6.setImageResource(R.drawable.puppet_tippy);
            imagen6.setVisibility(View.VISIBLE);

            texto6.setText("Puppets (Level 3)");

            imagen7.setImageResource(R.drawable.digital_book_tippy);
            imagen7.setVisibility(View.VISIBLE);

            texto7.setText("Digital Book");

        }

        else if(titulo1.equals("MY FIRST LETTERS AND SOUNDS"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            imagen1.setImageResource(R.drawable.class_cd_mfls);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Class CD");
        }

        else if(titulo1.equals("CRICKETS"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            imagen1.setImageResource(R.drawable.teachers_guide_crickets);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Teacher’s Guide\n\n" +
                    "The Crickets Teacher’s Guide offers comprehensive, step-by-step notes that are interleaved with the Student’s Book pages.");

            imagen2.setImageResource(R.drawable.teachers_resource_cd_class_cd_crickets);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Teacher’s Resource CD\n\n" +
                    "You can fi nd a variety of resources on this component");

            imagen3.setImageResource(R.drawable.teachers_class_cd_crickets);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Class CD\n\n" +
                    "The Class CD includes recordings of class activities and all the songs, chants, and stories.");

            imagen4.setImageResource(R.drawable.teachers_story_cards_crickets);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Story Cards\n\n" +
                    "Crickets stories expose children to authentic language used naturally. The stories are divided into scenes.");

            imagen5.setImageResource(R.drawable.teachers_flashcards_crickets);
            imagen5.setVisibility(View.VISIBLE);

            texto5.setText("Flashcards\n\n" +
                    "Crickets features 112 fl ashcards depicting the most frequent words used per unit. The flashcards include photographs to exemplify concepts vividly.");

            imagen6.setImageResource(R.drawable.teachers_classroom_languaje_flashcards_crickets);
            imagen6.setVisibility(View.VISIBLE);

            texto6.setText("Classroom Language Flashcards" +
                    "These visual cue cards vividly illustrate common classroom commands. Use them when you are giving students instructions.");

            imagen7.setImageResource(R.drawable.tales_crickets);
            imagen7.setVisibility(View.VISIBLE);

            texto7.setText("Cricket Tales\n\n" +
                    "This useful component, for both students and teachers, features fun reading activities related to each of the stories from Crickets.");

            imagen8.setImageResource(R.drawable.digital_book_crickets);
            imagen8.setVisibility(View.VISIBLE);

            texto8.setText("Digital Book");
        }

        else if(titulo1.equals("M@TH ADVENTURES"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            imagen1.setImageResource(R.drawable.math_adventures_teacher_guide);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Teacher’s Guide with Pocket Cube\n\n" +
                    "Offers comprehensive, step-by-step notes that are interleaved with the Student’s Book pages.");

            imagen2.setImageResource(R.drawable.math_adventures_resource_pack);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Resource Pack\n\n");

            imagen3.setImageResource(R.drawable.math_adventures_teacher_resource_cd);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("Teacher’s Resource CD\n\n" +
                    "Provides teachers with additional resources to enrich their lessons.");

            imagen4.setImageResource(R.drawable.digital_book_math);
            imagen4.setVisibility(View.VISIBLE);

            texto4.setText("Digital Book\n\n");

            imagen5.setImageResource(R.drawable.microsite_math);
            imagen5.setVisibility(View.VISIBLE);

            texto5.setText("Microsite\n\n" +
                    "www.richmond.com.mx/mathadventures");
        }

        //

        else if(titulo1.equals("ABRACADABRA"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_abracadabra);

        }

        else if(titulo1.equals("BEEP")) {

            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_beep);

        }

        else if(titulo1.equals("COOL KIDS")) {

            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_coolkids);

        }

        else if(titulo1.equals("LIGHTHOUSE"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_lighthouse);
        }

        else if(titulo1.equals("PATHWAY TO GRAMMAR"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_pathwaytogrammar);
        }

        else if(titulo1.equals("PATHWAY TO LITERATURE"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_pathwayliterature);
        }

        else if(titulo1.equals("PATHWAY TO MATH"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_pathwaymath);
        }

        else if(titulo1.equals("PATHWAY TO SCIENCE"))
        {

            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_pathwayscience);
        }

        else if(titulo1.equals("THUMBS UP SECOND EDITION"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_thumpsup);
        }

        else if(titulo1.equals("SCIENCE AND GEOGRAPHY"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_sciencegeography);
        }

        else if(titulo1.equals("SKYROCKET"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));
            componentsTeachers.setText(R.string.teachers_skyrocket);

            descripcionTeachers.setText("Skyrocket is a sis-level grammar book that follows the syllabus of the primary school series Skyrocket. Each unit offers short grammar explanations of the main grammar points in a direct and open way. It includes entertaining activities for students to practice in class or at home. At the end of each unit, there is a two-page reading lesson where students can consolidate all the language points studied in the lesson." +
                    "\n\n" +
                    "Skyrocket Your Grammar also offers review lessons and grammar songs!\n\n\n\n\n\n\n\n");
        }

        else if(titulo1.equals("SPOTLIGHT ON ENGLISH"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1cb0c3"));

            componentsTeachers.setText(R.string.teachers_spotlightonenglish);
        }

        //

        else if(titulo1.equals("Achievers"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#99549b"));
            componentsTeachers.setText(R.string.teachers_achievers);

        }

        else if(titulo1.equals("Awesome"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#99549b"));
            componentsTeachers.setText(R.string.teachers_awesome);
        }

        else if(titulo1.equals("Combined Sciences"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#99549b"));
            componentsTeachers.setText(R.string.teachers_combinedsciences);
        }

        else if(titulo1.equals("English in Motion"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#99549b"));
            componentsTeachers.setText(R.string.teachers_englishinmotion);
        }

        else if(titulo1.equals("Next Step"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#99549b"));
            componentsTeachers.setText(R.string.teachers_nextstep);
        }

        else if(titulo1.equals("Spotlight on Literature"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#99549b"));
            componentsTeachers.setText(R.string.teachers_spotlightonliterature);
        }

        else if(titulo1.equals("Stopwatch"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#99549b"));
            componentsTeachers.setText(R.string.teachers_stopwatch);
        }

        //

        else if(titulo1.equals("American Big Picture"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1db59b"));
            componentsTeachers.setText(R.string.teachers_americanbigpicture);


        }

        else if(titulo1.equals("@work"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1db59b"));
            componentsTeachers.setText(R.string.teachers_atwork);
        }

        else if(titulo1.equals("English ID"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1db59b"));
            componentsTeachers.setText(R.string.teachers_englishid);
        }

        else if(titulo1.equals("Going Pro"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1db59b"));
            componentsTeachers.setText(R.string.teachers_goingpro);
        }

        else if(titulo1.equals("Identities"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1db59b"));
            componentsTeachers.setText(R.string.teachers_identities);
        }

        else if(titulo1.equals("Richmond Mazes"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1db59b"));
        }

        else if(titulo1.equals("The big picture"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#1db59b"));
            componentsTeachers.setText(R.string.teachers_thebigpicture);
        }

        else if(titulo1.equals("BUSINESS Skills"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_business_skills);
        }

        else if(titulo1.equals("BUSINESS Theories"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_business_theories);
        }

        else if(titulo1.equals("Visual Grammar"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_visual_grammar);
        }

        else if(titulo1.equals("Vocabulary Builder"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("English Grammar in Steps"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Primary METHODOLOGY HANDBOOK"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Lessons Learned"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Primary Handbooks for Teachers"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Richmond Picture Dictionary"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Richmond First Dictionary"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Richmond Dictionay Fully Illustrated"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Richmond Dictionaries"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ef6264"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("DELTA'S Key to the TOEFL iBT"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("TARGET KET for Schools"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_target_ket);
        }

        else if(titulo1.equals("TARGET PET"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_target_ket);
        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: Advanced"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: First"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_target_ket);
        }

        else if(titulo1.equals("Richmond Practice Tests for IELTS"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Pass the TOEIC Test"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Richmond Practice Tests: YLE"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_empty);
        }

        else if(titulo1.equals("Richmond Practice Tests: ket and PET"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_target_ket_pet);
        }

        else if(titulo1.equals("Target Cambridge English: First"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#ffc907"));
            componentsTeachers.setText(R.string.teachers_target_ket);
        }

        else if(titulo1.equals("Ready, Set, Go!"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#018abf"));
            componentsTeachers.setText(R.string.teachers_lorem);
        }

        else if(titulo1.equals("Infoquest"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#018abf"));
            componentsTeachers.setText(R.string.teachers_lorem);
        }

        else if(titulo1.equals("Little Readers"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#018abf"));
            componentsTeachers.setText(R.string.teachers_lorem);
        }


        else if(titulo1.equals("Super stars"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#018abf"));
            componentsTeachers.setText(R.string.teachers_lorem);
        }

        else if(titulo1.equals("Popcorn readers"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#018abf"));
            componentsTeachers.setText(R.string.teachers_lorem);
        }

        else if(titulo1.equals("Media readers"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#018abf"));
            componentsTeachers.setText(R.string.teachers_lorem);
        }

        else if(titulo1.equals("Richmond readers"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#018abf"));
            componentsTeachers.setText(R.string.teachers_lorem);
        }

        else if(titulo1.equals("DVD readers"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#018abf"));
            componentsTeachers.setText(R.string.teachers_lorem);
        }

    }

    @Override
    public void onResume(){
        super.onResume();
    }

}