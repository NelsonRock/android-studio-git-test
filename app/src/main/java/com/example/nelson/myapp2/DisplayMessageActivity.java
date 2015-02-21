package com.example.nelson.myapp2;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intend = getIntent();
        String message = intend.getStringExtra(MainActivity.EXTRA_MESSAGE);

    //Create the text view
        TextView textview = new TextView(this);
        textview.setTextSize(40);
        textview.setText(message);

    //Set the text view as the activity layout
        setContentView(textview);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
        return true;
    }
}
