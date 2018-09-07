package com.dejodido.prs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button r = findViewById(R.id.rock);
        Intent intent = getIntent();
        final int score = intent.getIntExtra("score", 0);

        TextView s0= findViewById(R.id.score1);
        s0.setText(""+score);


        r.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent(MainActivity.this, Result.class);
                myIntent.putExtra("key", 0); //Optional parameters
                myIntent.putExtra("score", score); //Optional parameters

                MainActivity.this.startActivity(myIntent);




            }
        });

        Button p = findViewById(R.id.paper);
        p.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent(MainActivity.this, Result.class);
                myIntent.putExtra("key", 1); //Optional parameters
                myIntent.putExtra("score", score); //Optional parameters

                MainActivity.this.startActivity(myIntent);




            }
        });

        Button s = findViewById(R.id.scissors);
        s.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent(MainActivity.this, Result.class);
                myIntent.putExtra("key", 2); //Optional parameters
                myIntent.putExtra("score", score); //Optional parameters
                MainActivity.this.startActivity(myIntent);





            }
        });


    }
}
