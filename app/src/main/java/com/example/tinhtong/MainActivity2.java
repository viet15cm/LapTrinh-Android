package com.example.tinhtong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends Activity {
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtResult	=	(TextView)findViewById(R.id.txtResult);
        Intent myIntent = getIntent();
        Bundle	myBunble=	myIntent.getBundleExtra("mysum");
        int a	=	myBunble.getInt("soa");
        String b = "";
        /*while (a != 0) {
            int temp = a % 10;
            if (temp % 2 == 1)
                b = b+ "   " +  String.valueOf(temp);
            a /= 10;
        }
        */
         for(int i=1; i<a ; i++){
             if(i%2 !=0){
                 b = b + "   " + String.valueOf(i);
             }
         }
        txtResult.setText(" các số le là: "+ "   " + b);
    }
    }