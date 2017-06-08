package com.example.portiabosco.bethelschoolapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;
    TextView mTextView1;
    TextView mTextView2,mTextView3;
    TextView mTextView4,mTextView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=(TextView) findViewById(R.id.textView1);
        mTextView1=(TextView) findViewById(R.id.textView2);
        mTextView2=(TextView) findViewById(R.id.textView3);
        mTextView3=(TextView) findViewById(R.id.textView4);
        mTextView4=(TextView) findViewById(R.id.textView7);
        mTextView5=(TextView) findViewById(R.id.textView9);


        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Raleway-BoldItalic.ttf");
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(),  "fonts/Raleway-SemiBoldItalic.ttf");
        mTextView.setTypeface(custom_font);
        mTextView1.setTypeface(custom_font1);
        mTextView2.setTypeface(custom_font1);
        mTextView3.setTypeface(custom_font);
        mTextView4.setTypeface(custom_font);
        mTextView5.setTypeface(custom_font);




    }
}
