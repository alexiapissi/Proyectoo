package ort.edu.ar.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ort.edu.ar.proyecto.model.Tour;

public class Busqueda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
    }

    public void btnMostrar (View v){

        ImageView foto   = (ImageView) findViewById(R.id.FotoTour);
        ImageView fotoUsuario   = (ImageView) findViewById(R.id.FotoUsuario);
        TextView nombre   = (TextView) findViewById(R.id.NombreTour);
        TextView descripcion   = (TextView) findViewById(R.id.DescripcionTour);
        TextView ubicacion   = (TextView) findViewById(R.id.UbicacionTour);
        TextView nombreUsuario   = (TextView) findViewById(R.id.NombreUsuario);

        ImageView likes;
        likes = (ImageView) findViewById(R.id.Like);
        likes.setImageResource(R.drawable.Likes);





    }
}
