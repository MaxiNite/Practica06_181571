package mx.edu.itson.practica06_181571

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalla_pelicula.*

class DetallaPelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalla_pelicula)

        val bundle = intent.extras

        if (bundle != null){
            this.iv_Pelicula_Imagen.setImageResource(bundle.getInt("header"))
            tv_Nombre_Pelicula.setText(bundle.getString("nombre"))
            tv_Pelicula_Desc.setText(bundle.getString("sinopsis"))
        }
    }
}