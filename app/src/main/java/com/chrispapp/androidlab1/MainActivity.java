package com.chrispapp.androidlab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Creating variables
    private Button plus, minus,next;
    private TextView count;
    private int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.i("#ALC", "Activity Created");
        addGUIComponents();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                count.setText("" + i);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                count.setText("" + i);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WorkingWithImages.class);
                startActivity(i);
            }
        });



    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("#ALC", "Activity Paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("#ALC", "Activity Resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("#ALC", "Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("#ALC", "Activity Destroyed");
    }



    /*
        Adding the gui components to use later
     */
    protected void addGUIComponents() {
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        count = (TextView) findViewById(R.id.count);
        next = (Button) findViewById(R.id.next);
    }

}
