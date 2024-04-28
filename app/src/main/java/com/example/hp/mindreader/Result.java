package com.example.hp.mindreader;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import mehdi.sakout.fancybuttons.FancyButton;

import static com.example.hp.mindreader.MainActivity.a;

/**
 * Created by Hp on 6/1/2017.
 */

public class Result extends AppCompatActivity{
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        textView= (TextView) findViewById(R.id.textView1);
        setTextView();
        FancyButton howw = (FancyButton) findViewById(R.id.howw);
        howw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.working);
            }
        });
    }
    public void setTextView()
    {
        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText("Here you go  : "+ Integer.toString(a));
    }

}
