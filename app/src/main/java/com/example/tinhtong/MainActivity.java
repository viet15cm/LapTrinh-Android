package com.example.tinhtong;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText edtNuma;
    Button btnSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNuma	=	(EditText)	findViewById(R.id.edtNuma);

        btnSum	=	(Button)	findViewById(R.id.btnSubmit);
        btnSum.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent myIntent	=	new Intent(getApplication(), MainActivity2.class);
                    int a	=	Integer.parseInt(edtNuma.getText().toString());

                    Bundle myBundle	=	 new Bundle();
                    myBundle.putInt("soa", a);

                    myIntent.putExtra("mysum", myBundle);
                    startActivity(myIntent);
                }
                catch(Exception ex){

                }
            }
        });
            }
}