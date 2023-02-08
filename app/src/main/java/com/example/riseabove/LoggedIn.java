// This class represents the activity that is displayed once the user is successfully logged in.
package com.example.riseabove;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoggedIn extends AppCompatActivity {

    // This method is called when the activity is created.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Calls the superclass implementation of the onCreate method.
        super.onCreate(savedInstanceState);
        // Sets the content view for the activity to the layout specified in the activity_logged_in.xml file.
        setContentView(R.layout.activity_logged_in);
    }
}