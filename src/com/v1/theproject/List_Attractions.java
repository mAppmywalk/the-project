package com.v1.theproject;




import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class List_Attractions extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_attractions);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list_attractions, menu);
        return true;
    }
    
}
