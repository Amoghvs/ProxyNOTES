package com.example.amogh.proxynotes;
/**
 * Created by amogh on 16/9/17.
 */

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {



    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the layout from video_main.xml
        setContentView(R.layout.activity_main);




        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.MyButton);
        button2 = (Button) findViewById(R.id.MyButton2);
        button3 = (Button) findViewById(R.id.MyButton3);
        button4 = (Button) findViewById(R.id.MyButton4);
        button5 = (Button) findViewById(R.id.MyButton5);
        button6 = (Button) findViewById(R.id.MyButton6);
        button7 = (Button) findViewById(R.id.MyButton7);
        button8 = (Button) findViewById(R.id.MyButton8);





        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });

        button3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });


        button4.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });


        button5.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });


        button6.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });


        button7.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });


        button8.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });






    }

}