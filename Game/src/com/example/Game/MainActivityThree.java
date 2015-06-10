package com.example.Game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 10/06/2015.
 */

public class MainActivityThree extends Activity implements View.OnClickListener {
    Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button9:
                Intent intent = new Intent(this, MainActivityTwo.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
