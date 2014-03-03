package com.v1.theproject;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Public_Walks extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_walks);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.public_walks, menu);
        return true;
    }
    
}
