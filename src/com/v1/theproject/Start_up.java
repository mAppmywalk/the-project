package com.v1.theproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Start_up extends Activity 
{
	private Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        
        //set up button to Homepage with listener
        nextPage = (Button)findViewById(R.id.button1);
        nextPage.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) 
			{
				homePage();
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start_up, menu);
        return true;
    }
    
    protected void homePage()
    {
    	Intent page2 = new Intent(this, Homepage.class);
    	startActivity(page2);
    }
}
