package com.example.hackathon;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class firebase2 extends AppCompatActivity {
    ListView mylistView;

    ArrayList<String> myArrayList = new ArrayList<>();
    DatabaseReference mref;

    ProgressBar progressBar;
    int b=0;

    String state=startup1.getData1();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase2);
        progressBar = (ProgressBar) findViewById(R.id.pb);
        b=getIntent().getIntExtra("StateCode",12);
        final ArrayList<String> list=new ArrayList<>();
      //  final ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.activity_firebase2,list);
        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(firebase2.this,android.R.layout.simple_list_item_1, myArrayList);
        mylistView = (ListView) findViewById(R.id.list1);
        mylistView.setAdapter(adapter);
        final String c=Integer.toString(b);


        DatabaseReference reference= FirebaseDatabase.getInstance().getReference();
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                int count=0;

                list.clear();
                String value = "";
                String value1 = "";
                String value2= "";
                String value3= "";
                String value4= "";
                String value5= "";
                String value6= "";

                for(DataSnapshot snapshot: dataSnapshot.getChildren())
                {




                   String s=snapshot.getKey();
                   String p=snapshot.getValue().toString();
                 


                   if(snapshot.getKey().equals(c))

                    
                    {
                        progressBar.setVisibility(View.VISIBLE);
                       value=snapshot.child("State").getValue().toString();
                        value1=snapshot.child("% Educated Labour").getValue().toString();
                        value2=snapshot.child("% Uneducated Labour").getValue().toString();
                        value3=snapshot.child("Forest Degraded Area").getValue().toString();
                        value4=snapshot.child("Non-Forest Degraded Area - Saline & Alkaline Lands").getValue().toString();
                        value5=snapshot.child("Non-Forest Degraded Area - Total").getValue().toString();
                        value6=snapshot.child("Non-Forest Degraded Area - Water Eroded Area").getValue().toString();


                        value="State  : "+value;
                        value1="Educated Labour :"+value1+"%";
                        value2="Uneducated Labour :"+value2+"%";
                        value3="Non-Forest Degraded Area - Water Eroded Area : "+value3;
                        value4="Non-Forest Degraded Area - Saline & Alkaline Lands :"+value4;
                        value5="Non-Forest Degraded Area - Total :"+value5;
                        value6="Forest Degraded Area : "+value6;

                        myArrayList.add(value);
                        myArrayList.add(value1);
                        myArrayList.add(value2);
                        myArrayList.add(value3);
                        myArrayList.add(value4);
                        myArrayList.add(value5);
                        myArrayList.add(value6);



                        list.add(value);
                        list.add(value1);
                        list.add(value2);
                        list.add(value3);
                        list.add(value4);
                        list.add(value5);
                        list.add(value6);

                    }




                }
                adapter.notifyDataSetChanged();
                progressBar.setVisibility(View.GONE);


            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });




    }

}
