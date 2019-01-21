package com.dejodido.udemy2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ciudades.*

class Ciudades : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        var bm= findViewById<Button>(R.id.botondf)
        var bq= findViewById<Button>(R.id.butonqro)

        bq.setOnClickListener(View.OnClickListener {

            val intent= Intent(this, MainActivity::class.java)
            intent.putExtra("ciudad", "QRO")
            startActivity(intent)

        })
        bm.setOnClickListener(View.OnClickListener {

            val intent= Intent(this, MainActivity::class.java)
            intent.putExtra("ciudad", "CDMX")
            startActivity(intent)

        })
    }
}
