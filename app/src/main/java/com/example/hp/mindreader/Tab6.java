package com.example.hp.mindreader;

import android.content.Intent;
import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import mehdi.sakout.fancybuttons.FancyButton;

import static com.example.hp.mindreader.MainActivity.a;

/**
 * Created by Hp on 6/1/2017.
 */

public class Tab6 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.t6,container,false);
        FancyButton btn1 = (FancyButton) view.findViewById(R.id.btn6);
        final TextView textView = (TextView) view.findViewById(R.id.text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),":)",Toast.LENGTH_SHORT).show();
                a=a+8;
            }
        });
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res = new Intent(getActivity(), Result.class);
                startActivity(res);

            }
        });
        return view;
    }
}
