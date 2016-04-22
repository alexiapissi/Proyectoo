package ort.edu.ar.proyecto.model;

import android.media.Image;

/**
 * Created by 41400475 on 22/04/2016.
 */
public class Usuario {

    public String Nombre;
    public Image Foto;

    public  Usuario(String nombre, Image foto){
        this.Nombre = nombre;
        this.Foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Image getFoto() {
        return Foto;
    }

    public void setFoto(Image foto) {
        Foto = foto;
    }
}


