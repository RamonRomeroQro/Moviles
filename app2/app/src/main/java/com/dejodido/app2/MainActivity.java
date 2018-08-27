package com.dejodido.app2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.buttonlp);
        Button ut = findViewById(R.id.updatetext);
        ut.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                TextView t1 = findViewById(R.id.text1);
                t1.setText("Button clicked, updated text");


            }
        });


        b1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub



                Intent newIntent = new Intent(MainActivity.this, imagenes.class);
                newIntent.putExtra("message", "imagen");
                startActivity(newIntent);


            }
        });
        Button b3 = findViewById(R.id.b3);
        b3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent newIntent = new Intent(MainActivity.this, messages.class);
                EditText ed = findViewById(R.id.edit1);
                String str=  ed.getText().toString();
                newIntent.putExtra("message", str);
                startActivity(newIntent);



            }
        });















    }
}
