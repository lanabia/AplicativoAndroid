package br.ufc.great.greatdc;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TextView myTextView=(TextView)findViewById(R.id.textBox);
        Typeface typeFace=Typeface.createFromAsset(getAssets(),"norwester.ttf");
        //myTextView.setTypeface(typeFace);

    }
}
