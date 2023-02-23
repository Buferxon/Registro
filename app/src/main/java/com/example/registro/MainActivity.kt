package com.example.registro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var ednombre: EditText
    lateinit var edapellido: EditText
    lateinit var eddireccion: EditText
    lateinit var edcelular: EditText
    lateinit var edid: EditText

    lateinit var enombre: TextView
    lateinit var eapellido: TextView
    lateinit var edireccion: TextView
    lateinit var ecelular: TextView
    lateinit var eid: TextView
    lateinit var btenviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ednombre = findViewById(R.id.ednombre)
        edapellido= findViewById(R.id.edapellido)
        eddireccion = findViewById(R.id.eddireccion)
        edcelular = findViewById(R.id.edcelular)
        edid = findViewById(R.id.edid)

        enombre = findViewById(R.id.enombre)
        eapellido = findViewById(R.id.eapellido)
        edireccion = findViewById(R.id.edireccion)
        ecelular = findViewById(R.id.ecelular)
        eid = findViewById(R.id.eid)

        btenviar = findViewById(R.id.btenviar)

    }
    fun enviar(view: View) {
        enombre.text = "Nombre: "+ednombre.text
        eapellido.text = "Apellido: "+edapellido.text
        edireccion.text = "Direccion: "+eddireccion.text
        ecelular.text = "Celular: "+edcelular.text
        eid.text = "Id: "+edid.text



    }
}