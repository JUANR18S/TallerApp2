package com.example.tallerapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import androidx.appcompat.app.AppCompatActivity

class PruebaActivity : AppCompatActivity() {

    private lateinit var etUser: TextInputEditText
    private lateinit var etPass: TextInputEditText
    private lateinit var btnEnter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba)

        etUser = findViewById(R.id.etUser)
        etPass = findViewById(R.id.etPass)
        btnEnter = findViewById(R.id.btnEnter)

        btnEnter.setOnClickListener {
            val user = etUser.text?.toString()?.trim().orEmpty()
            val pass = etPass.text?.toString()?.trim().orEmpty()

            when {
                user.isEmpty() -> {
                    etUser.error = "Campo obligatorio"
                    etUser.requestFocus()
                }
                pass.isEmpty() -> {
                    etPass.error = "Campo obligatorio"
                    etPass.requestFocus()
                }
                else -> {
                    startActivity(Intent(this, SecondActivity::class.java))
                }
            }
        }
    }
}
