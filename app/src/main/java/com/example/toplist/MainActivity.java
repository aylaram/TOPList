package com.example.toplist;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counterOC;
    final static String PREF = "history";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        AllList ALi=new AllList();



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Log.d("onCreate","Done");

        SharedPreferences prefGet = getSharedPreferences(PREF, Activity.MODE_PRIVATE);
        counterOC = prefGet.getInt("LT", 0);

        updateUI(counterOC, "???");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("onPause","Done");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("onRestart","Done");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("onStop","Done");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("onDestroy","Done");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void updateUI(int counter, String id) {
        TextView TVonCreate = findViewById(R.id.id);
        TVonCreate.setText(Integer.toString(counter));
    }
}
