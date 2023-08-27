package com.example.haider.fragmentstype1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class FragementA extends Fragment {

    TextView tv;
    Context context;

    public FragementA(Context context) {
        // Required empty public constructor
        this.context = context;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_fragement_a, container, false);
        tv=v.findViewById(R.id.txtFragOne);
        v.findViewById(R.id.btnFragOne).setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tv.setText("Hello Robin");
                Toast.makeText(context, "Frag 1 from Main", Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}