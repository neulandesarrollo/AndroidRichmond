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

    String titulo1;
    Context contexto;
    TextView tituloComponentsTeachers;
    TextView componentsTeachers;
    TextView descripcionTeachers;

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

    public ThreeFragment(String titulo, Context detallesSerieActivity) {
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

        texto1 = (TextView)view.findViewById(R.id.texto1);
        texto2 = (TextView)view.findViewById(R.id.texto2);
        texto3 = (TextView)view.findViewById(R.id.texto3);
        texto4 = (TextView)view.findViewById(R.id.texto4);
        texto5 = (TextView)view.findViewById(R.id.texto5);
        texto6 = (TextView)view.findViewById(R.id.texto6);

        tituloComponentsTeachers.setTypeface(leagueGothic);
        componentsTeachers.setTypeface(firaSansLight);
        descripcionTeachers.setTypeface(firaSansLight);

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

            componentsTeachers.setText(R.string.teachers_pebbles);
        }

        else if(titulo1.equals("GUMDROPS"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            componentsTeachers.setText(R.string.teachers_gumdrops);
        }

        else if(titulo1.equals("TIPPY TOES"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            componentsTeachers.setText(R.string.teachers_tippytoes);

        }

        else if(titulo1.equals("MY FIRST LETTERS AND SOUNDS"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            componentsTeachers.setText(R.string.teachers_mflas);

            descripcionTeachers.setText("My First Letters and Sounds is a three-part component that allows children to develop phonemic awareness while reinforcing the vocabulary presented in each unit. Each activity page contains clear and simple instructions. Games and activities are suggested to introduce and practice each sound.\n\n" +
                    "Phonics are an important feature in learning to read. My First Letters and Sounds series introduces children to the most common sounds and provides a foundation to literacy.\n\n\n\n\n\n\n\n");
        }

        else if(titulo1.equals("CRICKETS"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            componentsTeachers.setText(R.string.teachers_crickets);

            descripcionTeachers.setText("THE CRICKETS METHODOLOGY\n\n" +
                    "The 5 Es instructional model relies on the constructivist approach to learning, which proposes that students build their own understanding and knowledge of the world, through experiencing things and re ecting on those experiences by asking questions, exploring and assessing what they know.\n\n" +
                    "The model enables preschool children to develop cognitive, language and metacognitive skills and represents  ve stages of a sequence for teaching and learning:\n\n" +
                    "Engage:\n" +
                    "This phase starts the process. Its purpose is to raise students’ interest and get them personally involved in the lesson and allows them to make connections between past and present learning experiences.\n\n" +
                    "Explore:\n" +
                    "Students actively explore concepts or manipulate materials.\n\n" +
                    "Explain:\n" +
                    "Students explain the concepts they have been exploring or demonstrate new skills and behaviors.\n\n" +
                    "Elaborate:\n" +
                    "Its purpose is to extend students’ conceptual understanding and allow them to practice skills and behaviors through new experiences.\n\n" +
                    "Evaluate:\n" +
                    "This stage encourages learners to assess their understanding and abilities.\n\n\n\n\n\n\n\n\n");
        }

        else if(titulo1.equals("M@TH ADVENTURES"))
        {
            tituloComponentsTeachers.setTextColor(Color.parseColor("#f48b31"));
            componentsTeachers.setText(R.string.teachers_mathadventures);
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