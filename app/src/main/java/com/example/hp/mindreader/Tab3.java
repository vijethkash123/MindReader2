package com.example.hp.mindreader;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hp.mindreader.R;
import static com.example.hp.mindreader.MainActivity.a;


import mehdi.sakout.fancybuttons.FancyButton;

/**
 * Created by Hp on 6/1/2017.
 */

public class Tab3 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.t3,container,false);
        FancyButton btn1 = (FancyButton) view.findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"OK !",Toast.LENGTH_SHORT).show();
                a=a+2;
            }
        });
        return view;

    }
}
