package com.example.tiendaonile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PaypalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paypal)

        // Usando findViewById para acceder al botón
        val btnPay = findViewById<Button>(R.id.btnPay)

        btnPay.setOnClickListener {
            // Redirigir a la actividad de confirmación de pago (por ejemplo)
            val intent = Intent(this, Paypal2Activity::class.java)
            startActivity(intent)
        }
    }
}
