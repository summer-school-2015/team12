package com.example.Game;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import java.util.Date;
import java.util.Random;


public class MainActivityTwo extends Activity implements View.OnClickListener
//
{

    int ButtonIds[]={
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
    };

    int targetbutton;

    Random random = new Random();
    Random generator = new Random(new Date().getTime());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second);
        updateButtons();
        for(int i=0;i<ButtonIds.length; i++)
                ((Button)findViewById(ButtonIds[i])).setOnClickListener(this);
    }

    void generateTargetButton()
    {
        double randm = Math.random() * 8;
        targetbutton = ((int) randm);
    }


    void updateButtons() {
        generateTargetButton();
        for(int i=0;i<ButtonIds.length; i++) {
            Button b = ((Button) findViewById(ButtonIds[i]));
            b.setBackgroundColor(i==targetbutton ? Color.RED : Color.GREEN);
            b.invalidate();
        }
    }

  public void onClick(View v)
    {
       int RB = v.getId();
       if (ButtonIds[targetbutton] == RB)
                updateButtons();
       else {
           Intent intent = new Intent(this, MainActivityThree.class);
           startActivity(intent);
       }
    }
}