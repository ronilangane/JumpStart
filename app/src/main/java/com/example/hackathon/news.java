package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class news extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Button btn = (Button) findViewById(R.id.snews);
        Button btn1 = (Button) findViewById(R.id.effect);
        Button btn2 = (Button) findViewById(R.id.scheme);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity3();
                }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }
    public void openActivity2()
    {Intent intent= new Intent(this,Act1.class);
        startActivity(intent);

    }
    public void openActivity3()
    {Intent intent= new Intent(this,Act3.class);
        startActivity(intent);

    }
    public void openActivity4()
    {Intent intent= new Intent(this,Act2.class);
        startActivity(intent);

    }

}

