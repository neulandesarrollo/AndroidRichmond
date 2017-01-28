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

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class AdapterEstados extends BaseAdapter{
    List<String> estados = new ArrayList<String>();
    Context context;

    private static LayoutInflater inflater=null;
    public AdapterEstados(Context activityContext, List<String> Estados) {
        // TODO Auto-generated constructor stub
        estados = Estados;
        context=activityContext;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return estados.size();
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
        TextView tEstado;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        final View rowView;
        rowView = inflater.inflate(R.layout.estado_item, null);

        Typeface leagueGothic = Typeface.createFromAsset(context.getAssets(), "league_gothic.otf");
        Typeface firaSansMedium = Typeface.createFromAsset(context.getAssets(), "fira_sans_medium.otf");

        holder.tEstado=(TextView) rowView.findViewById(R.id.textoEstado);

        holder.tEstado.setText(estados.get(position));

        holder.tEstado.setTypeface(leagueGothic);

        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if(estados.get(position).toString().equals("Aguascalientes") ||
                        //estados.get(position).toString().equals("Coahuila") ||
                        estados.get(position).toString().equals("Colima") ||
                        estados.get(position).toString().equals("Hidalgo") ||
                        estados.get(position).toString().equals("Morelos") ||
                        estados.get(position).toString().equals("Tlaxcala"))
                {
                    Toast.makeText(context, "There are not any stores in this state", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Intent intent = new Intent(context, DetalleEstadoActivity.class);
                    intent.putExtra("estado", estados.get(position).toString());
                    context.startActivity(intent);
                }

            }
        });

        return rowView;
    }

}