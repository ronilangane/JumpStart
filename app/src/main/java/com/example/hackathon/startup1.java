package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class startup1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup1);
        Button btn1=(Button) findViewById(R.id.submit);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(v);
            }
        });
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.domain, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);



    }


    public void onButtonClick(View v) {



        EditText b = (EditText) findViewById(R.id.state);
        String state = b.getText().toString();

        if (state.matches("Maharashtra") | state.matches("maharashtra") | state.matches("MAHARASHTRA")  ) {


                Intent i = new Intent(startup1.this, startupresults.class);
                startActivity(i);
            }


        else {
            Toast temp = Toast.makeText(startup1.this, "For now app is only available for Maharashtra. Data for other states comming soon...", Toast.LENGTH_LONG);
            temp.show();

        }

    }
}
