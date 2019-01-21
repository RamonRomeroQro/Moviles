package com.dejodido.udemy2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var temp:TextView?=null
    var ciudad:TextView?=null
    var status:TextView?=null
    var ciudadcreada:Ciudad?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        temp=findViewById(R.id.tvGrados)
        ciudad=findViewById(R.id.tvCiudad)
        status=findViewById(R.id.tvEstatus)

        var intent = intent.getStringExtra("ciudad")
        if (intent=="CDMX"){

            ciudadcreada=Ciudad(intent, 22, "ok")

        }else if (intent=="QRO"){
            ciudadcreada=Ciudad(intent, 18, "ok+++")


        }else{
            Toast.makeText(this, "Error: $intent", Toast.LENGTH_SHORT).show()

        }

        ciudad?.text = ciudadcreada?.name
        temp?.text = ciudadcreada?.temp.toString()
        status?.text = ciudadcreada?.status



    }
}
