package com.example.tallerapp2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var cardCalculadora: CardView
    private lateinit var cardPromedio: CardView
    private lateinit var cardConversor: CardView
    private lateinit var cardProgramas: CardView

    private lateinit var btnExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        cardCalculadora = findViewById(R.id.cardCalculadora)
        cardPromedio = findViewById(R.id.cardPromedio)
        cardConversor = findViewById(R.id.cardConversor)
        cardProgramas = findViewById(R.id.cardProgramas)
        btnExit = findViewById(R.id.btnExit)

        listOf(
            cardCalculadora, cardPromedio,
            cardConversor, cardProgramas,
            btnExit
        ).forEach { it.setOnClickListener(this) }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cardCalculadora ->
                startActivity(Intent(this, CalculadoraActivity::class.java))
            R.id.cardPromedio   ->
                startActivity(Intent(this, PromedioActivity::class.java))
            R.id.cardConversor  ->
                startActivity(Intent(this, ConversorActivity::class.java))
            R.id.cardProgramas  ->
                startActivity(Intent(this, ProgramasActivity::class.java))
            R.id.btnExit        ->
                startActivity(Intent(this, PruebaActivity::class.java))
        }
    }
}
