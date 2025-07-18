package com.example.smu_ev_parcial;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptadorNoticias extends ArrayAdapter<Noticias>{
    public AdaptadorNoticias(Context context, ArrayList<Noticias> datos)  {
        super(context, R.layout.item, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item, null);



        TextView txtDescripcion = (TextView)item.findViewById(R.id.txtDescripcion);
        txtDescripcion.setText(getItem(position).getDescripcion());

        TextView txtFecha = (TextView)item.findViewById(R.id.txtFecha);
        txtFecha.setText(getItem(position).getFecha());

        TextView txtLink = (TextView)item.findViewById(R.id.txtLink);
        txtLink.setText(getItem(position).getLink());


        ImageView imageView = (ImageView)item.findViewById(R.id.imgNoticias);
        Glide.with(this.getContext())
                .load(getItem(position).getImagen())
                .into(imageView);

        return(item);
    }

}
