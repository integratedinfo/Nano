package com.landolabs.ape.a20150613;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * This method is called when the Spotify button is clicked.
     */
    public void toastSpotify(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Spotify streamer!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the Scores button is clicked.
     */
    public void toastScores(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my scores app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the Library button is clicked.
     */
    public void toastLibrary(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my library app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the Build It Bigger button is clicked.
     */
    public void toastBuildItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build it Bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the XYZ button is clicked.
     */
    public void toastXYZ(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my XYZ reader!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * This method is called when the Capstone button is clicked.
     */
    public void toastCapstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
