package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn1 = (Button) findViewById(R.id.login1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(v);
            }
        });

    }
    public void onButtonClick(View v)
    {


            EditText a= (EditText)findViewById(R.id.uname_l);
            String str =a.getText().toString();
            EditText b =(EditText)findViewById(R.id.password_l);
            String pass=b.getText().toString();
            String password = helper.searchPass(str);

                if (pass.equals(password) & !str.matches("") & ! password.matches("") ) {
                    Intent i = new Intent(Login.this, main_menu.class);
                    i.putExtra("Username", str);
                    startActivity(i);
                } else {
                    Toast temp = Toast.makeText(Login.this, "Username or Password incorrect", Toast.LENGTH_SHORT);
                    temp.show();
                }


    }

    }


