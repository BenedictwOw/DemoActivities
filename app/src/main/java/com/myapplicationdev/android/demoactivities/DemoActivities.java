package com.myapplicationdev.android.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);
        //Getting the button and setting theOnClickListener
        Button btnDone = (Button)findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                //Getting editText which user keys in name
                EditText etName = (EditText) findViewById(R.id.editTextName);
                //Getting editText which user keys in name
                EditText etAge = (EditText) findViewById(R.id.editTextAge);
                //Put name and age into an array
                String[] info = {etName.getText().toString(),etAge.getText().toString()};
                //Create an intent to start another activity called DemoActivities
                Intent i = new Intent(DemoActivities.this,DemoActivities2.class);
                //Passing string array holding the name and age to new activity
                i.putExtra("info",info);
                //start the new activity
                startActivity(i);
            };

        });
    }
}
