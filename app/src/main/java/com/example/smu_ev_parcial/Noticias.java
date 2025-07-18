package com.example.smu_ev_parcial;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
public class Noticias {

    private String descripcion;
    private String imagen;
    private String fecha;
    private String link;

    public Noticias(JSONObject a) throws JSONException {

        descripcion =  a.getString("ntTitular").toString();
        imagen =  "https://uteq.edu.ec/assets/images/news/pagina/"+a.getString("ntUrlPortada").toString() ;
        fecha = a.getString("ntFecha").toString() ;
        link = "https://uteq.edu.ec/es/comunicacion/noticia/"+a.getString("ntUrlNoticia").toString() ;
    }
    public static ArrayList<Noticias> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Noticias> noticas = new ArrayList<>();

        for (int i = 0; i < datos.length() && i<20; i++) {
            noticas.add(new Noticias(datos.getJSONObject(i)));
        }
        return noticas;
    }


    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }



}
