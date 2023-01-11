package com.nidhi.button2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Button22 extends AppCompatActivity {
    Button22 button2,button3,button4,button5,button6,button7,button8,button9,button10;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button2 =  findViewById(R.id.view);
        button3 = (Button2) findViewById(R.id.button3);
        button4 = (Button2) findViewById(R.id.button4);
        button5 = (Button2) findViewById(R.id.button5);
        button6 = (Button2) findViewById(R.id.button6);
        button7 = (Button2) findViewById(R.id.button7);
        button8 = (Button2) findViewById(R.id.button8);
        button9 = (Button2) findViewById(R.id.button9);
        button10 = (Button2) findViewById(R.id.button10);
        View button = findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.d("test", "hey i am button2 ");};
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test2", "hey i am button3");};
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test3", "hey i am button4"); };
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test4", "hey i am button5");};
        });
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test5", "hey i am button6"); };
        });
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test6", "hey i am button7"); };
        });
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test7", "hey i am button8"); };
        });
        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test8", "hey i am button9"); };
        });
        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test9", "hey i am button10"); };
        });
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("test10", "hey i am only button"); };
        });
    }
}

}
