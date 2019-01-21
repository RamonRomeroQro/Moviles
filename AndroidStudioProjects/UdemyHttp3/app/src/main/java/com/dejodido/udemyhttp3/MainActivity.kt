package com.dejodido.udemyhttp3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b= findViewById<Button>(R.id.bRed)

        b.setOnClickListener(View.OnClickListener {

            if (Network.isNetwork(this)){
                Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this, "NO Red", Toast.LENGTH_SHORT).show()

            }
        })
    }
}
