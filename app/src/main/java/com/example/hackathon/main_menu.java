package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        defineButtons();
    }
    public void defineButtons(){
        findViewById(R.id.startup).setOnClickListener(buttonClickListener);
        findViewById(R.id.history).setOnClickListener(buttonClickListener);
        findViewById(R.id.updates).setOnClickListener(buttonClickListener);
        findViewById(R.id.success).setOnClickListener(buttonClickListener);
        findViewById(R.id.button).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.startup:
                    startActivity(new Intent(main_menu.this,startup1.class));
                    break;

                case R.id.updates:
                    startActivity(new Intent(main_menu.this, news.class));
                    break;

                case R.id.success:
                    startActivity(new Intent(main_menu.this, Act.class));
                    break;
                case R.id.history:
                    startActivity(new Intent(main_menu.this, chatb.class));
                    break;
                case R.id.button:

                    startActivity(new Intent(main_menu.this, Act4.class));
                    break;



            }
        }


    };
}
