package mx.neuland.richmond;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class OneFragment extends Fragment{

    TextView tituloDetalle;
    TextView autorDetalle;
    String titulo1;
    String autor1;
    Context contexto;
    ImageView imagen;
    TextView descripcion;

    ImageView uno;
    ImageView dos;
    ImageView tres;
    ImageView cuatro;
    ImageView cinco;
    ImageView seis;
    ImageView siete;
    ImageView extra;
    ImageView sample;
    ImageView scope;

    ImageView cefr;

    ImageView table;
    ImageView portadas;

    public OneFragment(String titulo, String autor, Context detallesSerieActivity) {
        titulo1 = titulo;
        autor1 = autor;
        contexto = detallesSerieActivity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);
        tituloDetalle = (TextView) view.findViewById(R.id.tituloPreschool);
        autorDetalle = (TextView) view.findViewById(R.id.autorPreschool);
        imagen = (ImageView)view.findViewById(R.id.imagenPack);
        descripcion = (TextView)view.findViewById(R.id.descripcion);

        Typeface leagueGothic = Typeface.createFromAsset(getContext().getAssets(), "league_gothic.otf");
        Typeface firaSansMedium = Typeface.createFromAsset(getContext().getAssets(), "fira_sans_medium.otf");
        Typeface firaSansLight = Typeface.createFromAsset(getContext().getAssets(), "fire_sans_light.otf");

        tituloDetalle.setTypeface(leagueGothic);
        autorDetalle.setTypeface(firaSansMedium);
        descripcion.setTypeface(firaSansLight);

        uno = (ImageView)view.findViewById(R.id.uno);
        dos = (ImageView)view.findViewById(R.id.dos);
        tres = (ImageView)view.findViewById(R.id.tres);
        cuatro = (ImageView)view.findViewById(R.id.cuatro);
        cinco = (ImageView)view.findViewById(R.id.cinco);
        seis = (ImageView)view.findViewById(R.id.seis);
        siete = (ImageView)view.findViewById(R.id.siete);
        extra = (ImageView)view.findViewById(R.id.extra);
        sample = (ImageView)view.findViewById(R.id.sample);
        scope = (ImageView)view.findViewById(R.id.scope);

        cefr = (ImageView)view.findViewById(R.id.cefr);

        table = (ImageView)view.findViewById(R.id.table);
        portadas = (ImageView)view.findViewById(R.id.portadas);

        return view;
    }

    @Override
    public void onStart(){
        super.onStart();

        tituloDetalle.setText(titulo1);
        autorDetalle.setText(autor1);

        if(titulo1.equals("CUBBY HOUSE"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#f48b31"));
            imagen.setImageResource(R.drawable.cubbypack);
            descripcion.setText(R.string.cubbyhouse);
            uno.setImageResource(R.drawable.i3_levels);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i1_3hours);
            dos.setVisibility(View.VISIBLE);

            cinco.setVisibility(View.VISIBLE);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/cubbyhouse/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SS-Cubby%20House.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("PEBBLES"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#f48b31"));
            imagen.setImageResource(R.drawable.pebblespack);
            descripcion.setText(R.string.pebbles);

            uno.setImageResource(R.drawable.i3_levels);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i1_3hours);
            dos.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/pebbles/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSpebbles_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("GUMDROPS"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#f48b31"));
            imagen.setImageResource(R.drawable.gumdropspack);
            descripcion.setText(R.string.gumdrops);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i4_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i3_5hours);
            tres.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/gumdrops/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSgumdrops.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("TIPPY TOES"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#f48b31"));
            imagen.setImageResource(R.drawable.tippytoespack);
            descripcion.setText(R.string.tippytoes);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i3_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i7hours);
            tres.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.app);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/tippytoes/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SStippy_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("MY FIRST LETTERS AND SOUNDS"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#f48b31"));
            imagen.setImageResource(R.drawable.mflspack);
            descripcion.setText(R.string.mfls);

            uno.setImageResource(R.drawable.app);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.audio_cd);
            dos.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/lettersandsounds/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSMyFirstLetters.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        else if(titulo1.equals("CRICKETS"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#f48b31"));
            imagen.setImageResource(R.drawable.cricketspack);
            descripcion.setText(R.string.crikets);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i4_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i10hours);
            tres.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.app);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.videos);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/crickets/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSCrickets.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("M@TH ADVENTURES"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#f48b31"));
            imagen.setImageResource(R.drawable.mathadventurespack);
            descripcion.setText(R.string.math_adventures);

            dos.setImageResource(R.drawable.i2_levels);
            dos.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.audio_cd);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_resources);
            seis.setVisibility(View.VISIBLE);


            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/mathadventures/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSMathAdventures.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        //

        else if(titulo1.equals("ABRACADABRA"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.abracadabrapack);
            descripcion.setText(R.string.abacadabra);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.abracadabra_cefr);

            uno.setImageResource(R.drawable.american_english);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i10hours);
            tres.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.clil);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/abracadabra/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSAbracadabra_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("BEEP")) {

            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.beeppack);
            descripcion.setText(R.string.beep);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.beep_cefr);

            uno.setImageResource(R.drawable.american_english);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i10hours);
            tres.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.clil);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/beep/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSBeep_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        else if(titulo1.equals("COOL KIDS")) {

            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.packcoolkids);
            descripcion.setText(R.string.cool_kids);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.cool_kids_second_edition_cefr);

            uno.setImageResource(R.drawable.american_english);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i3_5hours);
            tres.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.microsite);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        else if(titulo1.equals("LIGHTHOUSE"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.lighthousepack);
            descripcion.setText(R.string.lighthouse);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.lighthouse_cefr);

            uno.setImageResource(R.drawable.american_english);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i3_5hours);
            tres.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/lighthouse/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSlighthouse_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        else if(titulo1.equals("PATHWAY TO GRAMMAR"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.pathway_grammarpack);
            descripcion.setText(R.string.pathway_grammar);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.oathway_to_grammar_cefr);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.app);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.exam_friendly);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/pathwaytogrammar/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSPathwaytogrammar.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("PATHWAY TO LITERATURE"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.pathwayliteraturepack);
            descripcion.setText(R.string.pathway_literature);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.microsite);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/pathwaytoliterature/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setVisibility(View.GONE);
        }

        else if(titulo1.equals("PATHWAY TO MATH"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.pathwaymathpack);
            descripcion.setText(R.string.pathway_math);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.microsite);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.clil);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/pathwaytomath/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSpathwaytomath_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("THUMBS UP SECOND EDITION"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.thumbsuppack);
            descripcion.setText(R.string.thumps_up);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.thumb_up_second_edition_cefr);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.richmondspiral);
            dos.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.american_english);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.i6_levels);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.i7_10hours);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.clil);
            siete.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.microsite);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.microsite);
            cuatro.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/pathwaytoscience/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSpathwaytoscience_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        else if(titulo1.equals("PATHWAY TO SCIENCE"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.pathwaysciencepack);
            descripcion.setText(R.string.path_science);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.videos);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.clil);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/pathwaytoscience/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSpathwaytoscience_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

        }

        else if(titulo1.equals("SCIENCE AND GEOGRAPHY"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.sciencepack);
            descripcion.setText(R.string.science_geography);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.science_and_geography_cefr);

            uno.setImageResource(R.drawable.i6_levels);
            uno.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.clil);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/scienceandgeography/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSScienceG_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("SKYROCKET"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.skyrocketpack);
            descripcion.setText(R.string.skyrocket);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.skyrocket_cefr);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i6_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i5_7_5hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.microsite);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/skyrocket/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSSkyrocket_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("SPOTLIGHT ON ENGLISH"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1cb0c3"));
            imagen.setImageResource(R.drawable.spotlightpack);
            descripcion.setText(R.string.spotlight);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.spotlight_on_english_cefr);

            uno.setImageResource(R.drawable.american_english);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i10hours);
            tres.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.clil);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/spotlightonenglish/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSspotlight_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        //

        else if(titulo1.equals("Achievers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#99549b"));
            imagen.setImageResource(R.drawable.achieverspack);
            descripcion.setText(R.string.achievers);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.achievers_cefr);

            uno.setImageResource(R.drawable.richmondspiral);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i6_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i5mashours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.microsite);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/achievers/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSAchievers.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("Awesome"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#99549b"));
            imagen.setImageResource(R.drawable.awesomepack);
            descripcion.setText(R.string.awesome);

            uno.setImageResource(R.drawable.richmondspiral);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i4_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i5mashours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.microsite);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/awesome/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSAwesome_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("Combined Sciences"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#99549b"));
            imagen.setImageResource(R.drawable.pathwaybiologypack);
            descripcion.setText(R.string.combined_sciences);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.combined_sciences_cefr);

            uno.setImageResource(R.drawable.i3_levels);
            uno.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.microsite);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/combinedsciences/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSCombinedSciences.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("English in Motion"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#99549b"));
            imagen.setImageResource(R.drawable.englishinmotionpack);
            descripcion.setText(R.string.english_motion);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.english_in_motion_cefr);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i4_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i3_5hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.clil);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.microsite);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.audio_cd);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/englishinmotion/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSenglishin_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("Next Step"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#99549b"));
            imagen.setImageResource(R.drawable.nextsteppack);
            descripcion.setText(R.string.next_steps);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.next_step_cefr);

            uno.setImageResource(R.drawable.richmondsolution);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i4_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i3_5hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.digital_book);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.audio_cd);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_resources);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/nextstep/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSnextstep_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("Spotlight on Literature"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#99549b"));
            imagen.setImageResource(R.drawable.spotlightonliteraturepack);
            descripcion.setText(R.string.spotlight_on_literature);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.spotlight_on_literature_new_edition_cefr);

            uno.setImageResource(R.drawable.american_english);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.microsite);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/spotlightonliterature/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSSpotlightL_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("Stopwatch"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#99549b"));
            imagen.setImageResource(R.drawable.stopwatchpack);
            descripcion.setText(R.string.stopwatch);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.stopwatch_cefr);

            uno.setImageResource(R.drawable.american_english);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i3_5hours);
            tres.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.app);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/stopwatch/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSStopwatch.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        //

        else if(titulo1.equals("American Big Picture"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1db59b"));
            imagen.setImageResource(R.drawable.bigpicturepack);
            descripcion.setText(R.string.american_big_picture);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.american_big_picture_cefr);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i6_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i90_120hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.app);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.videos);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/americanbigpicture/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSAmericanBigPicture.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("@work"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1db59b"));
            imagen.setImageResource(R.drawable.workpack);
            descripcion.setText(R.string.at_work);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.a_work_cefr);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i4_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i90_120hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.videos);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setVisibility(View.GONE);

            scope.setVisibility(View.GONE);
        }

        else if(titulo1.equals("English ID"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1db59b"));
            imagen.setImageResource(R.drawable.englishidpack);
            descripcion.setText(R.string.english_id);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.english_id_cefr);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i4_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i80_120hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.dvd);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_book);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/englishid/html5/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSenglishId_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("Going Pro"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1db59b"));
            imagen.setImageResource(R.drawable.goingpropack);
            descripcion.setText(R.string.going_pro);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.going_pro_cefr);

            uno.setImageResource(R.drawable.american_english);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.i6_levels);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i90_120hours);
            tres.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.dvd);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.videos);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.audio_cd);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/goingpro/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SS/SSGoingPro_g.pdf");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        else if(titulo1.equals("Identities"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1db59b"));
            imagen.setImageResource(R.drawable.identitiespack);
            descripcion.setText(R.string.identities);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.identities_cefr);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i2_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i90_120hours);
            cuatro.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.videos);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Uri uri = Uri.parse("http://www.richmond.com.mx/SU/identities/index.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(contexto, "Scope & Sequence not available", Toast.LENGTH_SHORT).show();
                }
            });
        }

        else if(titulo1.equals("Richmond Mazes"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1db59b"));
            imagen.setImageResource(R.drawable.escapepack);
            descripcion.setText(R.string.richmond_mazes);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.richmond_mazes_cefr);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i4_levels);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.app);
            seis.setVisibility(View.VISIBLE);

            sample.setVisibility(View.GONE);

            scope.setVisibility(View.GONE);
        }

        else if(titulo1.equals("The big picture"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#1db59b"));
            imagen.setImageResource(R.drawable.thebigpicturepack);
            descripcion.setText(R.string.the_big_picture);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.the_big_picture_cefr);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i6_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i90_120hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.app);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.videos);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(contexto, "Sample Unit not available", Toast.LENGTH_SHORT).show();
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(contexto, "Scope & Sequence not available", Toast.LENGTH_SHORT).show();
                }
            });
        }

        else if(titulo1.equals("BUSINESS Skills"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.business_skills);
            descripcion.setText(R.string.business_skills);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.business_skills_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i2_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.total_45hours);
            cuatro.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.videos);
            cinco.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("BUSINESS Theories"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.business_theories);
            descripcion.setText(R.string.business_theories);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.business_theories_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.total_35hours);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.videos);
            cuatro.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.digital_resources);
            cinco.setVisibility(View.VISIBLE);
        }
        else if(titulo1.equals("Visual Grammar"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.visual_grammar);
            descripcion.setText(R.string.visual_grammar);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.visual_grammar_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i2_levels);
            tres.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.app);
            extra.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.audio_cd);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Vocabulary Builder"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.vocabulary_builder);
            descripcion.setText(R.string.vocabulary_builder);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.vocabulary_builder_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i2_levels);
            tres.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.audio_cd);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("English Grammar in Steps"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.english_grammar);
            descripcion.setText(R.string.english_grammar);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.english_grammar_in_steps_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i2_levels);
            tres.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Primary METHODOLOGY HANDBOOK"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.primary_methodology_handbook);
            descripcion.setText(R.string.primary_meth_handbook);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            dos.setImageResource(R.drawable.digital_resources);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.audio_cd);
            tres.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Lessons Learned"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.lessons_learned);
            descripcion.setText(R.string.lessons_learned);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            dos.setImageResource(R.drawable.nuevo);
            dos.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Primary Handbooks for Teachers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.handbooks_for_teachers);
            descripcion.setText(R.string.primary_handbook);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);
        }

        else if(titulo1.equals("Richmond Picture Dictionary"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.richmond_picture_dictionary);
            descripcion.setText(R.string.richmond_picture_dict);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);
        }

        else if(titulo1.equals("Richmond First Dictionary"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.richmond_first_dictionay);
            descripcion.setText(R.string.richmond_first_dict);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);
        }

        else if(titulo1.equals("Richmond Dictionay Fully Illustrated"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.dictionary_fully_illustrated);
            descripcion.setText(R.string.richmond_dict_fully);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);
        }

        else if(titulo1.equals("Richmond Dictionaries"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.richmond_com_poc_min_dictionary);
            descripcion.setText(R.string.richmond_dictionaries);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.app);
            uno.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("DELTA'S Key to the TOEFL iBT"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.deltas_key);
            descripcion.setText(R.string.ibt);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("TARGET KET for Schools"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.targetket);
            descripcion.setText(R.string.ketdesc);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.target_ket_for_schools_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("TARGET PET"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.targetpet);
            descripcion.setText(R.string.pet);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.microsite);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }
        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: Advanced"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.cambadv);
            descripcion.setText(R.string.richadv);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.richmond_pratice_test_for_cambridge_english_advanced_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }
        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: First"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.first);
            descripcion.setText(R.string.richfirst);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.richmond_practice_test_for_cambridge_english_first_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Richmond Practice Tests for IELTS"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.ielts);
            descripcion.setText(R.string.ieltsdesc);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Pass the TOEIC Test"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.pass_the_toic_test);
            descripcion.setText(R.string.toeicdesc);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.i3_levels);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Richmond Practice Tests: YLE"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.richmond_practice_tests);
            descripcion.setText(R.string.yledesc);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.richmond_practice_test_yle_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.i3_levels);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Richmond Practice Tests: ket and PET"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.practice_tests_ket_pet);
            descripcion.setText(R.string.ketpetdesc);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.richmond_practice_test_ket_and_pet_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Target Cambridge English: First"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.target_cambridge_english_first);
            descripcion.setText(R.string.targetfirstdesc);

            cefr.setVisibility(View.VISIBLE);
            cefr.setImageResource(R.drawable.target_cambrige_english_first_cefr);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.exam_friendly);
            tres.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.audio_cd);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);
        }

        else if(titulo1.equals("Ready, Set, Go!"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setVisibility(View.GONE);

            table.setVisibility(View.VISIBLE);
            table.setImageResource(R.drawable.ready_set_go_table);

            portadas.setVisibility(View.VISIBLE);
            portadas.setImageResource(R.drawable.portadas_ready_set_go);

            descripcion.setText(R.string.readysetdesc);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i6_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i90_120hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.app);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.videos);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(contexto, "Sample Unit not available", Toast.LENGTH_SHORT).show();
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(contexto, "Scope & Sequence not available", Toast.LENGTH_SHORT).show();
                }
            });
        }

        else if(titulo1.equals("Infoquest"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setVisibility(View.GONE);

            portadas.setVisibility(View.VISIBLE);
            portadas.setImageResource(R.drawable.portadas_infoquest);

            descripcion.setText(R.string.infoquestdesc);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i6_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i90_120hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.app);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.videos);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(contexto, "Sample Unit not available", Toast.LENGTH_SHORT).show();
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(contexto, "Scope & Sequence not available", Toast.LENGTH_SHORT).show();
                }
            });
        }

        else if(titulo1.equals("Little Readers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setVisibility(View.GONE);

            //portadas.setVisibility(View.VISIBLE);
            //portadas.setImageResource(R.drawable.portadas_ready_set_go);

            descripcion.setText(R.string.littlereaddesc);

            uno.setImageResource(R.drawable.richmondlearning);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.american_english);
            dos.setVisibility(View.VISIBLE);

            tres.setImageResource(R.drawable.i6_levels);
            tres.setVisibility(View.VISIBLE);

            cuatro.setImageResource(R.drawable.i90_120hours);
            cuatro.setVisibility(View.VISIBLE);

            extra.setImageResource(R.drawable.app);
            extra.setVisibility(View.VISIBLE);

            cinco.setImageResource(R.drawable.videos);
            cinco.setVisibility(View.VISIBLE);

            seis.setImageResource(R.drawable.digital_book);
            seis.setVisibility(View.VISIBLE);

            siete.setImageResource(R.drawable.digital_resources);
            siete.setVisibility(View.VISIBLE);

            sample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(contexto, "Sample Unit not available", Toast.LENGTH_SHORT).show();
                }
            });

            scope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(contexto, "Scope & Sequence not available", Toast.LENGTH_SHORT).show();
                }
            });
        }

        else if(titulo1.equals("Super stars"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setVisibility(View.GONE);

            table.setVisibility(View.VISIBLE);
            table.setImageResource(R.drawable.super_stars_table);

            portadas.setVisibility(View.VISIBLE);
            portadas.setImageResource(R.drawable.portadas_superstars);

            descripcion.setText(R.string.starsdesc);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

        }

        else if(titulo1.equals("Popcorn readers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setVisibility(View.GONE);

            table.setVisibility(View.VISIBLE);
            table.setImageResource(R.drawable.popcorn_readers_table);

            portadas.setVisibility(View.VISIBLE);
            portadas.setImageResource(R.drawable.portadas_popcorn);

            descripcion.setText(R.string.popdesc);

            uno.setImageResource(R.drawable.microsite);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.audio_cd);
            dos.setVisibility(View.VISIBLE);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);

        }

        else if(titulo1.equals("Media readers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setVisibility(View.GONE);

            table.setVisibility(View.VISIBLE);
            table.setImageResource(R.drawable.media_readers_table);

            descripcion.setText(R.string.mediadesc);

            uno.setImageResource(R.drawable.microsite);
            uno.setVisibility(View.VISIBLE);

            dos.setImageResource(R.drawable.audio_cd);
            dos.setVisibility(View.VISIBLE);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);
        }

        else if(titulo1.equals("Richmond readers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setVisibility(View.GONE);

            table.setVisibility(View.VISIBLE);
            table.setImageResource(R.drawable.richmond_readers_table);

            descripcion.setText(R.string.richreadersdesc);

            uno.setImageResource(R.drawable.microsite);
            uno.setVisibility(View.VISIBLE);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);
        }

        else if(titulo1.equals("DVD readers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setVisibility(View.GONE);

            table.setVisibility(View.VISIBLE);
            table.setImageResource(R.drawable.dvd_readers_table);

            descripcion.setText(R.string.dvdreaddesc);

            uno.setImageResource(R.drawable.dvd);
            uno.setVisibility(View.VISIBLE);

            sample.setVisibility(View.GONE);
            scope.setVisibility(View.GONE);
        }


    }

    @Override
    public void onResume(){
        super.onResume();
    }
}
