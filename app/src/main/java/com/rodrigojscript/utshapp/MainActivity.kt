package com.rodrigojscript.utshapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnAlumnos: Button
    lateinit var btnAdmin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlumnos = findViewById(R.id.btnAlum)
        btnAdmin = findViewById(R.id.btnAdmin)

        btnAlumnos.setOnClickListener{
            val intento = Intent(this,  MainActivity2::class.java)
            startActivity(intento)
        }
        btnAdmin.setOnClickListener{
            val intento2 = Intent(this,  Administrativos::class.java)
            startActivity(intento2)
        }
    }
}