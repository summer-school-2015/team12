package com.example.Game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import org.w3c.dom.Text;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;


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


    EditText t;
    int targetbutton;
    int score = 0;
    int z = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        DrawButtons();
        updateButtons();
        for(int i=0;i<ButtonIds.length; i++)
                ((Button)findViewById(ButtonIds[i])).setOnClickListener(this);
    }

    void generateTargetButton()
    {
        double randm = Math.random() * 8;
        targetbutton = ((int) randm);
    }


    void DrawButtons()
    {
        for(int i=0;i<ButtonIds.length; i++) {
            Button b = ((Button) findViewById(ButtonIds[i]));
            b.setBackgroundColor(Color.GREEN);
            b.invalidate();
        }
    }

    void updateButtons() {
      //  pause();
        generateTargetButton();
            Button b = ((Button) findViewById(ButtonIds[targetbutton]));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.setBackgroundColor(Color.RED);
        b.invalidate();
            //стартуем таймер
    }

  /*  void pause()
    {
        double randz = Math.random() * 2000 + 500;
        z = ((int) randz);

        try {
            Thread.sleep(z);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

  public void onClick(View v)
    {
       int RB = v.getId();
       if (ButtonIds[targetbutton] == RB)  {   //проверка на таймер
           score+=5;

           //останавливаем таймер

           //проверка на ускорение
           Button b = ((Button) findViewById(ButtonIds[targetbutton]));
           b.setBackgroundColor(Color.GREEN);
           b.invalidate();

           t = (EditText) findViewById(R.id.editText);
           t.setText("Score: " + score);
           t.invalidate();
           //красим в зеленый
           updateButtons();
       }
       else {
           Intent intent = new Intent(this, MainActivityThree.class);
           intent.putExtra("score", t.getText().toString());
           startActivity(intent);
           finish();
       }
    }
}