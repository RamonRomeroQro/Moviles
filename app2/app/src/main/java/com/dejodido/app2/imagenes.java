package com.dejodido.app2;

import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class imagenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes);
    }

    /*
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // refresh the instructions image}

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            i.setBackgroundColor(Color.rgb(255, 255, 255));
            Toast.makeText(imagenes.this,
                    "land", Toast.LENGTH_LONG).show();

        } else {
            i.setBackgroundColor(Color.rgb(255, 0, 255));
            Toast.makeText(imagenes.this,
                    "port", Toast.LENGTH_LONG).show();
        }
    }*/
    @Override
    public void onConfigurationChanged(Configuration config) {
        super.onConfigurationChanged(config);
        ImageView i = (ImageView) findViewById(R.id.imageView);

        // Check for the rotation
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            i.setBackgroundColor(Color.rgb(0, 0, 255));

            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (config.orientation == Configuration.ORIENTATION_PORTRAIT){
            i.setBackgroundColor(Color.rgb(255, 0, 0));

            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
