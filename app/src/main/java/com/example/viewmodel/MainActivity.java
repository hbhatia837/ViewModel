package com.example.viewmodel;

import android.nfc.Tag;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getName();
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        text = findViewById(R.id.text1);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

      // MainActivityCodeGenerator myData=new MainActivityCodeGenerator();
       MainActivityCodeGenerator model= ViewModelProviders.of(this).get(MainActivityCodeGenerator.class);
       // we want view model of this activity and want to get model class of mainactivitycodegeneratorclass.
        String myRandomNumber=model
                .getNumber();
        text.setText(myRandomNumber);
        Log.i(TAG,"Random number set");



    }



}











