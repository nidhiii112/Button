package com.nidhi.button2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button btn2, btn3, btn4, btn5, btn6, btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "hey i am button2 ");
                Toast.makeText(MainActivity3.this, "hey world", Toast.LENGTH_SHORT).show();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test", "hey i am button3");
                Toast.makeText(MainActivity3.this, "this is android app", Toast.LENGTH_SHORT).show();
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test3", "hey i am button4");
                Toast.makeText(MainActivity3.this, "its second app", Toast.LENGTH_SHORT).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test4", "hey i am button5");
                Toast.makeText(MainActivity3.this, "buttonToast app", Toast.LENGTH_SHORT).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test5", "hey i am button6");
                Toast.makeText(MainActivity3.this, "heeeeeee", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
