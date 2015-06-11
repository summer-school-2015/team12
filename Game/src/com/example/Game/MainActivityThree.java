package com.example.Game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by User on 10/06/2015.
 */

public class MainActivityThree extends Activity implements View.OnClickListener {
    Button button;
    Button button2;
    TextView sc;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
        String fscore = getIntent().getStringExtra("score");
        sc = (TextView) findViewById(R.id.editText);
        sc.setText(sc.getText().toString() + " " + fscore);
        sc.invalidate();
        button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button10);
        button2.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button9:
                Intent intent = new Intent(this, MainActivityTwo.class);
                startActivity(intent);
                finish();
                break;
            case R.id.button10:
                finish();
            default:
                break;
        }
    }
}
