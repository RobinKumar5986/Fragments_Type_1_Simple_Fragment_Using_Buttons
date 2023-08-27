package com.example.haider.fragmentstype1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    Button f1,f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1=findViewById(R.id.btnFragA);
        f2=findViewById(R.id.btnFragB);

        //----------Initially Fragment 2 will be in check ------//
        frameSetter(new FragmentB(),0);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameSetter(new FragementA(MainActivity.this),1);
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameSetter(new FragmentB(),1);
            }
        });

    }
    private void frameSetter(Fragment fragment,int flag) {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        if(flag==0)
            transaction.add(R.id.layFrame,fragment);
        else
            transaction.replace(R.id.layFrame,fragment);
        transaction.commit();


    }
}