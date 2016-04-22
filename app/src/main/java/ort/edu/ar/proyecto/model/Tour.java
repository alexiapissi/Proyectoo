package ort.edu.ar.proyecto.model;

import android.media.Image;

/**
 * Created by 41400475 on 22/04/2016.
 */
public class Tour {

    public String Nombre;
    public String Descripcion;
    public Image Foto;
    public String Ubicacion;
    public int Id;
    public int Coordenadas;

    public  Tour(String nombre, String descripcion, Image foto, String ubicacion, int id, int coordenadas){
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Foto = foto;
        this.Ubicacion = ubicacion;
        this.Id = id;
        this.Coordenadas = coordenadas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Image getFoto() {
        return Foto;
    }

    public void setFoto(Image foto) {
        Foto = foto;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCoordenadas() {
        return Coordenadas;
    }

    public void setCoordenadas(int coordenadas) {
        Coordenadas = coordenadas;
    }
}
