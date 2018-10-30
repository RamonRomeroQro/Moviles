package com.dejodido.prs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();

        int user = intent.getIntExtra("key", 0);
        int score = intent.getIntExtra("score", 0);


        Random myRandom = new Random();
        int computer = myRandom.nextInt(3);

        TextView r = findViewById(R.id.resultado);
        TextView s=findViewById(R.id.score2);

        TextView compu=findViewById(R.id.textView2);
        if (computer==0){
            compu.setText("rock");

        }else  if (computer==1){
            compu.setText("paper");


        }else{
            compu.setText("scissonrs");


        }

        //para roca

        if (user==0 && computer==0){
            //empate roca
            r.setText("Empate");
        }
        if (user==0 && computer==1){
            //usuario pierde por papel
            r.setText("Loses");



        }
        if (user==0 && computer==2){
            //usuario gana a scissor
            r.setText("Wins");
            score=score+1;


        }
        if (user==1 && computer==0){
            //usuario gana a roca
            r.setText("Wins");
            score=score+1;


        }
        if (user==1 && computer==1){
            //usuario empate papel
            r.setText("Empate");

        }
        if (user==1 && computer==2){
            //usuario pierde cotra tijera
            r.setText("Loses");

        }
        if (user==2 && computer==0){
            //usuario pierde conra roca
            r.setText("Loses");


        }
        if (user==2 && computer==1){
            //usuario gana contra papel
            r.setText("Wins");
            score=score+1;



        }
        if (user==2 && computer==2){
            //empate tijeras
            r.setText("Empate");

        }

        s.setText(""+score);
        final int m=score;

        //0 rock
        // 1 paper
        // 2 scisor



        Button con=findViewById(R.id.continueb);
        Button res=findViewById(R.id.restartb);


        con.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent(Result.this, MainActivity.class);
                myIntent.putExtra("score", m); //Optional parameters
                Result.this.startActivity(myIntent);




            }
        });

        res.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                Intent myIntent = new Intent(Result.this, MainActivity.class);
                myIntent.putExtra("score", 0); //Optional parameters
                Result.this.startActivity(myIntent);






            }
        });











    }
}
