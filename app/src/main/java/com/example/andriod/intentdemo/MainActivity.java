package com.example.andriod.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     private  Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      btn=(Button) findViewById(R.id.btn1);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent in=new Intent(MainActivity.this,Activity2.class);

              in.putExtra("Value1", "Android By Javatpoint");
              in.putExtra("Value2", "Simple Tutorial");
              // Set the request code to any code you like, you can identify the
              // callback via this code
              startActivity(in);
          }
      });
    }


}