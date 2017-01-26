package mx.neuland.richmond;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AdapterSeries extends BaseAdapter{
    List<String> titulo = new ArrayList<String>();
    List<String> autor = new ArrayList<String>();
    List<Integer> imageId = new ArrayList<Integer>();
    List<Integer> flecha = new ArrayList<Integer>();
    Context context;

    private static LayoutInflater inflater=null;
    public AdapterSeries(Context activityContext, List<String> prgmTitulo, List<String> prgmAutor, List<Integer> prgmImagen, List<Integer> prmFlecha) {
        // TODO Auto-generated constructor stub
        titulo=prgmTitulo;
        autor = prgmAutor;
        context=activityContext;
        imageId=prgmImagen;
        flecha = prmFlecha;

        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return titulo.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tTitulo;
        TextView tAutor;
        ImageView img;
        ImageView fl;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        final View rowView;
        rowView = inflater.inflate(R.layout.series_item, null);

        Typeface leagueGothic = Typeface.createFromAsset(context.getAssets(), "league_gothic.otf");
        Typeface firaSansMedium = Typeface.createFromAsset(context.getAssets(), "fira_sans_medium.otf");

        holder.tTitulo=(TextView) rowView.findViewById(R.id.titulo);
        holder.tAutor=(TextView) rowView.findViewById(R.id.autor);
        holder.img=(ImageView) rowView.findViewById(R.id.imagenSerie);
        holder.fl=(ImageView) rowView.findViewById(R.id.flecha);

        holder.tTitulo.setText(titulo.get(position));
        holder.tAutor.setText(autor.get(position));

        holder.tTitulo.setTypeface(leagueGothic);
        holder.tAutor.setTypeface(firaSansMedium);

        holder.img.setImageResource(imageId.get(position));
        holder.fl.setImageResource(flecha.get(position));

        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if(titulo.get(position).equals("CUBBY HOUSE")||
                        titulo.get(position).equals("PEBBLES")||
                        titulo.get(position).equals("GUMDROPS")||
                        titulo.get(position).equals("TIPPY TOES")||
                        titulo.get(position).equals("MY FIRST LETTERS AND SOUNDS")||
                        titulo.get(position).equals("CRICKETS")||
                    titulo.get(position).equals("M@TH ADVENTURES"))
                {
                    Intent intent = new Intent(context, DetallesSerieActivity.class);
                    intent.putExtra("titulo", titulo.get(position).toString());
                    intent.putExtra("autor", autor.get(position).toString());
                    context.startActivity(intent);
                }

                else if(titulo.get(position).equals("ABRACADABRA")||
                        titulo.get(position).equals("BEEP")||
                        titulo.get(position).equals("COOL KIDS")||
                        titulo.get(position).equals("LIGHTHOUSE")||
                        titulo.get(position).equals("THUMBS UP SECOND EDITION")||
                        titulo.get(position).equals("PATHWAY TO GRAMMAR")||
                        titulo.get(position).equals("PATHWAY TO LITERATURE")||
                        titulo.get(position).equals("PATHWAY TO MATH")||
                        titulo.get(position).equals("PATHWAY TO SCIENCE")||
                        titulo.get(position).equals("SCIENCE AND GEOGRAPHY")||
                        titulo.get(position).equals("SKYROCKET")||
                        titulo.get(position).equals("SPOTLIGHT ON ENGLISH"))
                {
                    Intent intent = new Intent(context, DetallePrimaryActivity.class);
                    intent.putExtra("autor", autor.get(position).toString());
                    intent.putExtra("titulo", titulo.get(position).toString());
                    context.startActivity(intent);
                }

                else if(titulo.get(position).equals("Achievers")||
                        titulo.get(position).equals("Awesome")||
                        titulo.get(position).equals("Combined Sciences")||
                        titulo.get(position).equals("English in Motion")||
                        titulo.get(position).equals("Next Step")||
                        titulo.get(position).equals("Spotlight on Literature")||
                        titulo.get(position).equals("Stopwatch"))
                {
                    Intent intent = new Intent(context, DetalleSecondaryActivity.class);
                    intent.putExtra("autor", autor.get(position).toString());
                    intent.putExtra("titulo", titulo.get(position).toString());
                    context.startActivity(intent);
                }

                else if(titulo.get(position).equals("American Big Picture")||
                        titulo.get(position).equals("@work")||
                        titulo.get(position).equals("English ID")||
                        titulo.get(position).equals("Going Pro")||
                        titulo.get(position).equals("Identities")||
                        titulo.get(position).equals("Richmond Mazes")||
                        titulo.get(position).equals("The big picture"))
                {
                    Intent intent = new Intent(context, DetalleYoungActivity.class);
                    intent.putExtra("autor", autor.get(position).toString());
                    intent.putExtra("titulo", titulo.get(position).toString());
                    context.startActivity(intent);
                }

                else if(titulo.get(position).equals("BUSINESS Skills")||
                        titulo.get(position).equals("BUSINESS Theories")||
                        titulo.get(position).equals("English Grammar in Steps")||
                        titulo.get(position).equals("Primary Methodology Handbook")||
                        titulo.get(position).equals("Richmond Compact Dictionary")||
                        titulo.get(position).equals("Richmond Mini Dictionary")||
                        titulo.get(position).equals("Richmond Pocket Dictionary")||
                        titulo.get(position).equals("An Introduction to Teaching English to Children")||
                        titulo.get(position).equals("Visual Grammar")||
                        titulo.get(position).equals("Richmond Vocabulary Builder"))
                {
                    //Toast.makeText(context, "Contenido no disponible", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(context, DetalleSupplementaryActivity.class);
                    intent.putExtra("autor", autor.get(position).toString());
                    intent.putExtra("titulo", titulo.get(position).toString());
                    context.startActivity(intent);
                }

                else if(titulo.get(position).equals("DELTA'S Key to the TOEFL iBT")||
                        titulo.get(position).equals("TARGET KET for Schools")||
                        titulo.get(position).equals("TARGET PET")||
                        titulo.get(position).equals("Richmond Practice Tests for Cambridge English: Advanced")||
                        titulo.get(position).equals("Richmond Practice Tests for Cambridge English: First")||
                        titulo.get(position).equals("Richmond Practice Tests for IELTS")||
                        titulo.get(position).equals("Pass the TOEIC Test")||
                        titulo.get(position).equals("Richmond Practice Tests: YLE")||
                        titulo.get(position).equals("Richmond Practice Tests: ket and PET")||
                        titulo.get(position).equals("Target Cambridge English: First"))
                {

                    //Toast.makeText(context, "Contenido no disponible", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(context, DetalleExamsActivity.class);
                    intent.putExtra("autor", autor.get(position).toString());
                    intent.putExtra("titulo", titulo.get(position).toString());
                    context.startActivity(intent);
                }

                else if(titulo.get(position).equals("Ready, Set, Go!")||
                        titulo.get(position).equals("Infoquest")||
                        titulo.get(position).equals("Little Readers")||
                        titulo.get(position).equals("Super stars")||
                        titulo.get(position).equals("Popcorn readers")||
                        titulo.get(position).equals("Media readers")||
                        titulo.get(position).equals("Richmond readers")||
                        titulo.get(position).equals("DVD readers"))
                {

                    //Toast.makeText(context, "Contenido no disponible", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(context, DetalleReadersActivity.class);
                    intent.putExtra("autor", autor.get(position).toString());
                    intent.putExtra("titulo", titulo.get(position).toString());
                    context.startActivity(intent);
                }
            }
        });
        return rowView;
    }

}