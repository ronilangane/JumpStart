package com.example.hackathon;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Button btn = (Button) findViewById(R.id.areg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        Button btn1 = (Button) findViewById(R.id.reeg);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSignUpClick(v);
            }
        });

    }

    public void openActivity2() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);

    }


    public void onSignUpClick(View v)
    {
        EditText email = (EditText)findViewById(R.id.email);
        EditText uname = (EditText)findViewById(R.id.username);
        EditText password = (EditText)findViewById(R.id.reg_password);
        EditText cpass = (EditText)findViewById(R.id.cpass);
        EditText name=(EditText)findViewById(R.id.name);
        String unamestr= uname.getText().toString();
        String emailstr=email.getText().toString();
        String passwordstr = password.getText().toString();
        String cpassstr=cpass.getText().toString();
        String namestr=name.getText().toString();
        if(unamestr.matches("") | emailstr.matches("") | passwordstr.matches("") | namestr.matches(""))
        {
            Toast pass1 = Toast.makeText(MainActivity.this , "All Fields Are Mandatory",Toast.LENGTH_SHORT);
            pass1.show();
        }
        else {
            if (!passwordstr.equals(cpassstr) | unamestr.matches("")) {
                Toast pass = Toast.makeText(MainActivity.this, "Passwords do not match", Toast.LENGTH_SHORT);
                pass.show();
            } else {
                contact c = new contact();
                c.setUname(unamestr);
                c.setEmail(emailstr);
                c.setPass(passwordstr);

                c.setName(namestr);
                helper.insertcontact(c);
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);


            }
        }

        }


    }









        /**defineButtons();
    }

        public void defineButtons(){
            findViewById(R.id.reeg).setOnClickListener(buttonClickListener);
            findViewById(R.id.areg).setOnClickListener(buttonClickListener);

        }

        private View.OnClickListener buttonClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.reeg:
                        startActivity(new Intent(MainActivity.this,Reg_Next.class));
                        break;

                    case R.id.areg:
                        startActivity(new Intent(MainActivity.this,Login.class));
                        break;

                }
              }


        };
    }**/

       /** Button btn=(Button) findViewById(R.id.areg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }
    public void openActivity2()

    {
        Intent intent= new Intent(this,login.class);
        startActivity(intent);

    }**/







