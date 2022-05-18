package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val widok1 = findViewById<CheckBox>(R.id.checkBox2);
        val obraz = findViewById<ImageView>(R.id.imageView);
        val tekst = findViewById<TextView>(R.id.text1);
        val widok = findViewById<CheckBox>(R.id.checkBox);
        val ile = findViewById<EditText>(R.id.editTextTextPersonName);

        var x = 0;
        findViewById<Button>(R.id.button2).setOnClickListener {
            if (x == 0) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.bongocat);
                x++;
                findViewById<TextView>(R.id.text1).text = "Bongo Cat";
            } else if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.cheems);
                x++;
                findViewById<TextView>(R.id.text1).text = "Cheems";
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.doge);
                x++;
                findViewById<TextView>(R.id.text1).text = "Doge";
            } else if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.swole_doge);
                x++;
                findViewById<TextView>(R.id.text1).text = "Swole Doge";
            } else if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.popcat);
                findViewById<TextView>(R.id.text1).text = "pop cat";
            }
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            if (x == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.bongocat);
                x--;
                findViewById<TextView>(R.id.text1).text = "Bongo Cat";
            } else if (x == 2) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.cheems);
                x--;
                findViewById<TextView>(R.id.text1).text = "Cheems";
            } else if (x == 3) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.doge);
                x--;
                findViewById<TextView>(R.id.text1).text = "Doge";
            } else if (x == 4) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.swole_doge);
                x--;
                findViewById<TextView>(R.id.text1).text = "Swole Doge";
            }


            widok1.setOnCheckedChangeListener {_, isChecked ->
                if (isChecked) {
                    obraz.visibility = View.VISIBLE
                    tekst.visibility = View.VISIBLE

                } else {
                    obraz.visibility = View.INVISIBLE
                    tekst.visibility = View.INVISIBLE
                }


                widok.setOnCheckedChangeListener { compoundButton, isChecked ->

                    if (isChecked) {
                        var wis = ile.text.toString().toFloat();
                        obraz.alpha = wis
                    } else {
                        obraz.alpha = 1f;
                    }
                }


            }

        }
    }
}