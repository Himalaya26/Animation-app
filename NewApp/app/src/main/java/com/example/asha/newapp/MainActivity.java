package com.example.asha.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int i=0;
    ImageView cat;

  /*  public void clk(View view){

        ball= findViewById(R.id.ball);
        if(i%2==1)
        ball.setImageResource(R.drawable.cat);
        else
        ball.setImageResource(R.drawable.ball);
        i++;
    }

    public void fade(View view) {

        ball= findViewById(R.id.ball);
        cat= findViewById(R.id.cat);
        ball.animate().alpha(0f).setDuration(2000);
        cat.animate().alpha(1f).setDuration(2000);
        ball.setTranslationX(300f);
        cat.setTranslationX(-300f);

    } */

    public void fade2(View view) {

        cat= findViewById(R.id.cat);
        cat.animate().rotation(90f).setDuration(2000);
    }

    public void clk(View view) {
        cat = findViewById(R.id.cat);
        cat.animate().rotation(180f).setDuration(2000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
