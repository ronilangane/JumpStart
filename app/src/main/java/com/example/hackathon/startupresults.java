package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class startupresults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startupresults);
        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.s_labour).setOnClickListener(buttonClickListener);
        findViewById(R.id.s_location).setOnClickListener(buttonClickListener);
        findViewById(R.id.button4).setOnClickListener(buttonClickListener);
        findViewById(R.id.fund).setOnClickListener(buttonClickListener);

    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.s_location:

                    startActivity(new Intent(startupresults.this, act5.class));
                    break;
                case R.id.s_labour:
                    startActivity(new Intent(startupresults.this,Labour_n.class));


                    break;
                case R.id.button4:
                    startActivity(new Intent(startupresults.this,Avail_raw.class));

                    break;
                case R.id.fund:
                    startActivity(new Intent(startupresults.this,fund.class));

                    break;
            }
        }
    };
}




