package com.v1.theproject;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Homepage extends Activity 
{
	private Button mapPage;
	private Button walksPage;
	private Button attractionsPage;
	private Button loginPage;
	private Button settingsPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hompage);
        
        //set up button to Map with listener
        mapPage = (Button)findViewById(R.id.bMap);
        mapPage.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) 
			{
				mapPage();
			}
		});
        
        //set up button to Walks with listener
        walksPage = (Button)findViewById(R.id.bWalks);
        walksPage.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) 
			{
				walksPage();
			}
		});

        //set up button to Attractions with listener
        attractionsPage = (Button)findViewById(R.id.bAttractions);
        attractionsPage.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) 
			{
				attractionsPage();
			}
		});

        //set up button to Login with listener
        loginPage = (Button)findViewById(R.id.bLogin);
        loginPage.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) 
			{
				loginPage();
			}
		});

        //set up button to Settings with listener
        settingsPage = (Button)findViewById(R.id.bSettings);
        settingsPage.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) 
			{
				settingsPage();
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.homepage, menu);
        return true;
    }
    
    protected void mapPage()
    {
    	Intent pageMap = new Intent(this, Map.class);
    	startActivity(pageMap);
    }

    protected void walksPage()
    {
    	Intent pageWalks = new Intent(this, Public_Walks.class);
    	startActivity(pageWalks);
    }

    protected void attractionsPage()
    {
    	Intent pageWalks = new Intent(this, List_Attractions.class);
    	startActivity(pageWalks);
    }

    protected void loginPage()
    {
    	Intent pageWalks = new Intent(this, Login.class);
    	startActivity(pageWalks);
    }

    protected void settingsPage()
    {
    	Intent pageWalks = new Intent(this, Settings.class);
    	startActivity(pageWalks);
    }
    
}