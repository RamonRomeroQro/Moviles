package com.dejodido.udemy1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b = findViewById<Button>(R.id.button1)
        var text=findViewById<EditText>(R.id.editText1)
        var name=text.text
        var check=findViewById<CheckBox>(R.id.checkBox1)
            b.setOnClickListener(View.OnClickListener {

                if (name.isNullOrBlank()){

                    Toast.makeText(this, "Llenalo we", Toast.LENGTH_SHORT).show()
                }
                else{
                    if (check.isChecked){
                        Toast.makeText(this, "Saludos $name , eres cool", Toast.LENGTH_SHORT).show()


                    }else{
                        Toast.makeText(this, "Saludos $name ", Toast.LENGTH_SHORT).show()

                    }
                }


            })


    }


}
