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

    String titulo1;
    Context contexto;

    TextView components;
    TextView studentsbook;

    ImageView imagen1;
    ImageView imagen2;
    ImageView imagen3;

    TextView texto1;
    TextView texto2;
    TextView texto3;

    TextView tituloComponents;

    public TwoFragment(String titulo, Context detallesSerieActivity) {
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

        View view = inflater.inflate(R.layout.fragment_two, container, false);
        components = (TextView)view.findViewById(R.id.components);
        studentsbook = (TextView)view.findViewById(R.id.studentsbook);
        imagen1 = (ImageView)view.findViewById(R.id.imagen1);
        imagen2 = (ImageView)view.findViewById(R.id.imagen2);
        imagen3 = (ImageView)view.findViewById(R.id.imagen3);

        texto1 = (TextView)view.findViewById(R.id.texto1);
        texto2 = (TextView)view.findViewById(R.id.texto2);
        texto3 = (TextView)view.findViewById(R.id.texto3);

        tituloComponents = (TextView)view.findViewById(R.id.tituloComponents);

        studentsbook.setTypeface(leagueGothic);
        components.setTypeface(firaSansLight);

        tituloComponents.setTypeface(leagueGothic);
        texto1.setTypeface(firaSansLight);
        texto2.setTypeface(firaSansLight);
        texto3.setTypeface(firaSansLight);

        return view;
    }

    @Override
    public void onStart(){
        super.onStart();

        if(titulo1.equals("CUBBY HOUSE"))
        {
           components.setText(R.string.components_cubby);
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            studentsbook.setVisibility(View.VISIBLE);
            studentsbook.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.schoolcubbyhouse1);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("Each unit ends with a page to review vocabulary and language.");

            imagen2.setImageResource(R.drawable.schoolcubbyhouses2);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("CLIL lessons explore an area related to the topic of the lesson.");

            imagen3.setImageResource(R.drawable.schoolcubbyhouse3);
            imagen3.setVisibility(View.VISIBLE);

            texto3.setText("There are beautiful pop- outs in Level 1 and cut-outs in Levels 2 and 3 to complete some activities in the Student’s Book pages.\n\n\n\n\n\n\n\n");
        }

        else if(titulo1.equals("PEBBLES"))
        {
            components.setText(R.string.components_pebbles);
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));
        }

        else if(titulo1.equals("GUMDROPS"))
        {
            components.setText(R.string.components_gumdrops);
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));
        }

        else if(titulo1.equals("TIPPY TOES"))
        {
            components.setText(R.string.components_tippytoes);
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            studentsbook.setVisibility(View.VISIBLE);
            studentsbook.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.schooltippytoess1);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("The pages of the lessons present the materials, objectives, structures and vocabulary.");

            imagen2.setImageResource(R.drawable.schooltippytoess2);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("Each lesson is divided into four sections.");

        }

        else if(titulo1.equals("MY FIRST LETTERS AND SOUNDS"))
        {
            components.setText(R.string.components_mflas);
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

        }

        else if(titulo1.equals("CRICKETS"))
        {
            components.setText(R.string.components_crickets);
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));

            studentsbook.setVisibility(View.VISIBLE);
            studentsbook.setTextColor(Color.parseColor("#f48b31"));

            imagen1.setImageResource(R.drawable.schoolcricketss1);
            imagen1.setVisibility(View.VISIBLE);

            texto1.setText("CLIL lessons explore an area related to the topic of the lesson.");

            imagen2.setImageResource(R.drawable.schooltippytoess2);
            imagen2.setVisibility(View.VISIBLE);

            texto2.setText("The Student’s Book includes the Mini-  ashcards section, a mini reproduction of the  ashcards that students can also use as a picture dictionary.");
        }

        else if(titulo1.equals("M@TH ADVENTURES"))
        {
            components.setText(R.string.components_mathadventures);
            tituloComponents.setTextColor(Color.parseColor("#f48b31"));
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

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("BUSINESS Theories"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("English Grammar in Steps"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Primary Methodology Handbook"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Richmond Compact Dictionary"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Richmond Mini Dictionary"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Richmond Pocket Dictionary"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("An Introduction to Teaching English to Children"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Visual Grammar"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Richmond Vocabulary Builder"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ef6264"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("DELTA'S Key to the Next Generation TOELF Test"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("TARGET KET for Schools"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("TARGET PET"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: Advanced"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: First"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Richmond Practice Tests for IELTS"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Pass the TOEIC Test: Introductory Course"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_lorem);
        }

        else if(titulo1.equals("Richmond Practice Tests - Movers"))
        {
            tituloComponents.setTextColor(Color.parseColor("#ffc907"));

            components.setText(R.string.components_lorem);
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