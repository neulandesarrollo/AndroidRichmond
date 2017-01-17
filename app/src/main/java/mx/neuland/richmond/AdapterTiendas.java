package mx.neuland.richmond;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class AdapterTiendas extends BaseAdapter{
    List<String> Nombres = new ArrayList<String>();
    List<String> Direcciones = new ArrayList<String>();
    List<String> Telefonos = new ArrayList<String>();
    List<LatLng> Ubicaciones = new ArrayList<LatLng>();
    Context context;

    private static LayoutInflater inflater=null;
    public AdapterTiendas(Context activityContext, List<String> Nombres, List<String> Direcciones, List<String> Telefonos, List<LatLng> Ubicaciones) {
        // TODO Auto-generated constructor stub

        this.Nombres = Nombres;
        this.Direcciones = Direcciones;
        this.Telefonos = Telefonos;
        this.Ubicaciones = Ubicaciones;

        context=activityContext;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return Nombres.size();
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
        TextView tNombre;
        TextView tDireccion;
        TextView tTelefono;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        final View rowView;
        rowView = inflater.inflate(R.layout.tienda_item, null);

        Typeface leagueGothic = Typeface.createFromAsset(context.getAssets(), "league_gothic.otf");
        Typeface firaSansMedium = Typeface.createFromAsset(context.getAssets(), "fira_sans_medium.otf");

        holder.tNombre=(TextView) rowView.findViewById(R.id.textoNombre);
        holder.tDireccion=(TextView) rowView.findViewById(R.id.textoDireccion);
        holder.tTelefono=(TextView) rowView.findViewById(R.id.textoTelefono);

        holder.tNombre.setText(Nombres.get(position));
        holder.tDireccion.setText(Direcciones.get(position));
        holder.tTelefono.setText(Telefonos.get(position));

        holder.tNombre.setTypeface(leagueGothic);
        holder.tDireccion.setTypeface(firaSansMedium);
        holder.tTelefono.setTypeface(firaSansMedium);

        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(context)
                        .setTitle(Nombres.get(position))
                        .setMessage(Direcciones.get(position) + "\n" + "Teléfono: " + Telefonos.get(position))
                        .setPositiveButton("Navegar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + Ubicaciones.get(position).latitude + "," + Ubicaciones.get(position).longitude);
                                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                                mapIntent.setPackage("com.google.android.apps.maps");
                                context.startActivity(mapIntent);
                            }
                        })
                        .setNegativeButton("Llamar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                callIntent.setData(Uri.parse("tel:" + Telefonos.get(position)));
                                context.startActivity(callIntent);
                            }
                        })
                        .setIcon(R.mipmap.ic_launcher)
                        .show();
            }
        });

        return rowView;
    }

}