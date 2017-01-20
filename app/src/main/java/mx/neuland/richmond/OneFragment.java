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
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("BUSINESS Theories"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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
        else if(titulo1.equals("English Grammar in Steps"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("Primary Methodology Handbook"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("Richmond Compact Dictionary"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("Richmond Mini Dictionary"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("Richmond Pocket Dictionary"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("An Introduction to Teaching English to Children"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("Visual Grammar"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("Richmond Vocabulary Builder"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ef6264"));
            imagen.setImageResource(R.drawable.grupo_salmon);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("DELTA'S Key to the Next Generation TOELF Test"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.deltas);
            descripcion.setText(R.string.ibt);

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

        else if(titulo1.equals("TARGET KET for Schools"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.targetket);
            descripcion.setText(R.string.ketdesc);

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

        else if(titulo1.equals("TARGET PET"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.targetpet);
            descripcion.setText(R.string.pet);

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
        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: Advanced"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.cambadv);
            descripcion.setText(R.string.richadv);

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
        else if(titulo1.equals("Richmond Practice Tests for Cambridge English: First"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.first);
            descripcion.setText(R.string.richfirst);

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

        else if(titulo1.equals("Richmond Practice Tests for IELTS"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.ielts);
            descripcion.setText(R.string.ieltsdesc);

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

        else if(titulo1.equals("Pass the TOEIC Test: Introductory Course"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.toeic);
            descripcion.setText(R.string.toeicdesc);

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

        else if(titulo1.equals("Richmond Practice Tests - Movers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#ffc907"));
            imagen.setImageResource(R.drawable.grupo_amarillo);
            descripcion.setText(R.string.lorem);

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

        else if(titulo1.equals("Ready, Set, Go!"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setImageResource(R.drawable.grupo_azul);
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
            imagen.setImageResource(R.drawable.grupo_azul);
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
            imagen.setImageResource(R.drawable.grupo_azul);
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
            imagen.setImageResource(R.drawable.grupo_azul);
            descripcion.setText(R.string.starsdesc);

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

        else if(titulo1.equals("Popcorn readers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setImageResource(R.drawable.grupo_azul);
            descripcion.setText(R.string.popdesc);

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

        else if(titulo1.equals("Media readers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setImageResource(R.drawable.grupo_azul);
            descripcion.setText(R.string.mediadesc);

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

        else if(titulo1.equals("Richmond readers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setImageResource(R.drawable.grupo_azul);
            descripcion.setText(R.string.richreadersdesc);

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

        else if(titulo1.equals("DVD readers"))
        {
            tituloDetalle.setTextColor(Color.parseColor("#018abf"));
            imagen.setImageResource(R.drawable.grupo_azul);
            descripcion.setText(R.string.dvdreaddesc);

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


    }

    @Override
    public void onResume(){
        super.onResume();
    }
}
