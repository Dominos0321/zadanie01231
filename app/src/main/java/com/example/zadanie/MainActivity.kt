package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x=0;
        findViewById<Button>(R.id.button2).setOnClickListener {
            if(x==0) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.bongocat);
                x++;
            }
            else if(x==1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.cheems);
                x++;
            }
            else if(x==2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.doge);
                x++;
            }

            else if(x==3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.swole_doge);
                x++;
            }

            else if(x==4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.popcat);
            }
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            if(x==0) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.bongocat);
                x--;
            }

            else if(x==1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.cheems);
                x--;
            }

            else if(x==2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.doge);
                x--;
            }
            else if(x==3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.swole_doge);
                x--;
            }


        }

    }
}