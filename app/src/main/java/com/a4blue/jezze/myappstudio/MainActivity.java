package com.a4blue.jezze.myappstudio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void popup(View view){
        Context context = getApplicationContext();
        Button b = (Button)view;                    //received from stackoverflow help
        String name = b.getText().toString();      //received from StackOverflow help
        String text = "This button will launch my " + name + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);  //toast learned from Google API
        toast.show();
    }

    public void title(View view){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        TextView t = (TextView)view;
        //String title = t.getText().toString();
        String text = "Nothing to do with this yet";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
