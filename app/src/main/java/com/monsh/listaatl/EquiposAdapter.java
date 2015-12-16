package com.monsh.listaatl;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by monsh on 16/12/2015.
 */
public class EquiposAdapter extends ArrayAdapter<Equipos> {
    Context context;
    int layoutResourceId;
    Equipos datos[] = null;

    public EquiposAdapter(Context context, int layoutResourceId, Equipos[] datos) {
        super(context, layoutResourceId, datos);

        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        EquiposHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new EquiposHolder();

            holder.imagen = (ImageView) row.findViewById(R.id.imagen);
            holder.texto = (TextView) row.findViewById(R.id.tv);

            row.setTag(holder);

        } else {
            holder = (EquiposHolder) row.getTag();
        }

        Equipos equipos = datos[position];
        holder.texto.setText(equipos.nombre);
        holder.imagen.setImageResource(equipos.icon);
        return row;
    }

    static class EquiposHolder {
        ImageView imagen;
        TextView texto;
    }
}
