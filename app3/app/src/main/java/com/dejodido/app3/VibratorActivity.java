package com.dejodido.app3;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class VibratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrator1);
        Toast.makeText(VibratorActivity.this, "The phone is vibrating", Toast.LENGTH_LONG).show();




        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);


        v.vibrate(300);


    }
}

