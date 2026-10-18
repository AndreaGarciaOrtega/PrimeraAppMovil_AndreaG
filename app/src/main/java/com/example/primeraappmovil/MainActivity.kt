package com.example.primeraappmovil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.primeraappmovil.R.id.main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val jugador = findViewById<Button>(R.id.button2) as Button

        jugador.setOnClickListener { lanzaNewPlayer() }
    }

    fun lanzaNewPlayer() {
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }
}