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
    private static String s ="";

    public static Integer a=0;



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
        s = b.getText().toString();
       // EditText c = (EditText) findViewById(R.id.raw_mat);
        //raw = b.getText().toString();

        if (s.matches("Maharashtra") | s.matches("maharashtra") | s.matches("MAHARASHTRA") ) {
            a=12;


                Intent i = new Intent(startup1.this, firebase2.class);
                i.putExtra("StateCode",a);

                startActivity(i);


           }
        else if (s.matches("Andhra Pradesh") | s.matches("andhra pradesh") | s.matches("ANDHRA PRADESH") ) {
            a=0;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);

            startActivity(i);


        }
       else if (s.matches("Arunachal Pradesh") | s.matches("arunachal pradesh") | s.matches("ARUNANCHAL PRADESH") ) {
            a=1;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);

            startActivity(i);


        }
       else if (s.matches("Assam") | s.matches("assam") | s.matches("ASSAM") ) {
            a=2;



            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);

            startActivity(i);


        }
        else if (s.matches("Bihar") | s.matches("bihar") | s.matches("BIHAR") ) {
            a=3;


            Intent i = new Intent(startup1.this, firebase2.class);

            i.putExtra("StateCode",a);

            startActivity(i);


        }
        else if (s.matches("Goa") | s.matches("GOA") | s.matches("goa") ) {
            a=4;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);

            startActivity(i);


        }
        else if (s.matches("Gujarat") | s.matches("gujarat") | s.matches("GUJURAT") ) {
            a=5;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);


            startActivity(i);


        }
        else if (s.matches("Haryana") | s.matches("haryana") | s.matches("HARYANA") ) {
            a=6;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);
            startActivity(i);


        }
        else if (s.matches("Himachal Pradesh") | s.matches("himachal pradesh") | s.matches("HIMACHAL PRADESH") ) {
            a=7;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);

            startActivity(i);


        }
        else if (s.matches("Jammu & Kashmir") | s.matches("jammu & kashmir") | s.matches("JAMMU & KASHMIR") ) {
            a=8;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);

            startActivity(i);


        }
        else if (s.matches("Karnataka") | s.matches("karnataka") | s.matches("KARNATAKA") ) {
            a=9;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);
            startActivity(i);


        }
        else if (s.matches("Kerala") | s.matches("kerala") | s.matches("KERALA") ) {
            a=10;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);
            startActivity(i);


        }
        else if (s.matches("Madhya Pradesh") | s.matches("madhya pradesh") | s.matches("MADHYA PRADESH") ) {
            a=11;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode",a);
            startActivity(i);


        }
        else if (s.matches("Manipur") | s.matches("manipur") | s.matches("MANIPUR") ) {
            a = 13;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
            else if (s.matches("Meghalaya") | s.matches("meghalaya") | s.matches("MEGHALAYA") ) {
            a = 14;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
                else if (s.matches("Mizoram") | s.matches("mizoram") | s.matches("MIZORAM") ) {
            a = 15;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
        else if (s.matches("Nagaland") | s.matches("nagaland") | s.matches("NAGALAND") ) {
            a = 16;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
        else if (s.matches("Orissa") | s.matches("orissa") | s.matches("ORISSA") ) {
            a = 17;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
        else if (s.matches("Punjab") | s.matches("punjab") | s.matches("PUNJAB") ) {
            a = 18;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
        else if (s.matches("Rajasthan") | s.matches("rajasthan") | s.matches("Rajasthan") ) {
            a = 19;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
        else if (s.matches("Sikkim") | s.matches("sikkim") | s.matches("SIKKIM") ) {
            a = 20;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
        else if (s.matches("Tamil Nadu") | s.matches("Tamil nadu") | s.matches("TAMIL NADU") ) {
            a = 21;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);
            finish();
        }
        else if (s.matches("Tripura") | s.matches("tripura") | s.matches("TRIPURA") ) {
            a = 22;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
        else if (s.matches("Uttar Pradesh") | s.matches("uttar pradesh") | s.matches("UTTAR PRADESH") ) {
            a = 23;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }
        else if (s.matches("West Bengal") | s.matches("west bengal") | s.matches("WEST BENGAL ") ) {
            a = 24;


            Intent i = new Intent(startup1.this, firebase2.class);
            i.putExtra("StateCode", a);
            startActivity(i);

        }




        else {
            Toast temp = Toast.makeText(startup1.this, "Invalid input", Toast.LENGTH_LONG);
            temp.show();

        }


    }

    public static String getData1()
    {
        return s;

    }
}
