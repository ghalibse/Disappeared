package com.example.disappeared;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstButton, secondButton, thirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = (Button) findViewById(R.id.btn1);
        secondButton= (Button) findViewById(R.id.btn2);
        thirdButton = (Button) findViewById(R.id.btn3);

    }

    public void destroy(View v){

        if(v.equals(firstButton)) {
            secondButton.setVisibility(View.INVISIBLE);
            thirdButton.setVisibility(View.INVISIBLE);
        }

    }
}
