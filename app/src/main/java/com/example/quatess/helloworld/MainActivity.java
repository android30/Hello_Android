package com.example.quatess.helloworld;


// Here our text view libraries are beeing imported so that when we click it takes us to the next page

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView; //
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Here we make out button clickable for yes and no butt
    private Button firstButton, secondButton;
    private EditText user_name_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
// HERE we set parameter for the clicked button from the activity sections
        firstButton = (Button) findViewById(R.Id.answear_yes_button);
        secondButton = (Button) findViewById(R.Id.answear_no_button);
        user_name_edit = (EditText) findViewById(R.Id.ans_name_edit);

        firstButton.setOnClickListener(new View.OnClickListener(){
              @Override
                 public void onClick(View view){
                       firstTextView.setText("You Clicked");
              }
                                       }


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void onYesButtonClick(View view) {
        //HERE WE OPEN UP A TOS WHICH IS A LITTLE POP UP WINDOW
        String usersname = String.valueOf(user_name_edit.getText());
 //IF CLICKED YES
        String yourYesResponse = "That is Great" + usersname;

        Toast.makeText(this, yourYesResponse, Toast.LENGTH_SHORT).show();

    }

    public void onNoButtonClick(View view) {
        //HERE WE OPEN UP A TOS WHICH IS A LITTLE POP UP WINDOW
        String usersname = String.valueOf(user_name_edit.getText());
        //IF CLICKED YES
        String yourNoResponse = "That is Great" + usersname;

        Toast.makeText(this, yourNoResponse, Toast.LENGTH_LONG).show();
    }
}
