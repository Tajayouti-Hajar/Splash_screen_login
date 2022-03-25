package com.example.mytp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt1= (TextView) findViewById(R.id.textView);
        TextView txt2= (TextView) findViewById(R.id.textView5);
        TextView txt3= (TextView) findViewById(R.id.textView7);

        Bundle b=getIntent().getExtras();
        String user=b.getString( "username");
        String pass=b.getString("password" );
        String usertv=b.getString("tvusername" );
        String passtv=b.getString("tvpassword" );
        txt2.setText(usertv +"  "+ user);
        txt3.setText(passtv +"   "+ pass);
        Button button2=findViewById(R.id.button2);
        View view=null;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retour(view);
            }
        });

    }

    public void retour(View view){
        Intent myIntent2=new Intent(this,MainActivity.class);
        startActivity(myIntent2);
    }
    }
