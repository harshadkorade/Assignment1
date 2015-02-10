package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    EditText amount1;
    EditText amount2;
    TextView tt;
    Button calculate;
    double x=0;
    double y=0;
    double z=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount1=(EditText)findViewById(R.id.txtno1);
        amount2=(EditText)findViewById(R.id.txtno2);
        tt=(TextView)findViewById(R.id.lblresult);
        calculate=(Button)findViewById(R.id.btnadd);


        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                x=Double.parseDouble(amount1.getText().toString());
                y=Double.parseDouble(amount2.getText().toString());
                z=x+y;
                tt.setText(Double.toString(z));

                Intent i = new Intent(MainActivity.this, DisplayResult.class);
                i.putExtra("result",z);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
