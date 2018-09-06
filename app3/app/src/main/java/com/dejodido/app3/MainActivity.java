package com.dejodido.app3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.vibra);
        b1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(MainActivity.this, "The phone is vibrating", Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(MainActivity.this, VibratorActivity.class);
                myIntent.putExtra("key", "vibra"); //Optional parameters
                MainActivity.this.startActivity(myIntent);




            }
        });


        Button b2 = findViewById(R.id.prox);
        b1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent myIntent = new Intent(MainActivity.this, ProximityActivity.class);
                myIntent.putExtra("message", "prox");//Optional parameters
                MainActivity.this.startActivity(myIntent);





            }
        });

        Button b3 = findViewById(R.id.notbar);
        b1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent myIntent = new Intent(MainActivity.this, Notify.class);
                myIntent.putExtra("message", "notification");//Optional parameters
                MainActivity.this.startActivity(myIntent);





            }
        });


        /*

         * By calling the first activity, you should trigger the vibration and
         * launch a toast that says “The phone is vibrating”
         * – By calling the second activity, you should activate the proximity
         * sensor and, when you are close enough, trigger an alert “You're close”
         * – By calling the third activity, launch a bar notification saying
         * anything you want (try to implement Firebase Cloud Messaging)
         * – Don't forget to add the proper permissions to your Android Manifest
         * */

    }
}

