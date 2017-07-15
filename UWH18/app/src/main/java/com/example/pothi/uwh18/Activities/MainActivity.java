package com.example.pothi.uwh18.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.pothi.uwh18.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvHome, tvMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHome= (TextView) findViewById(R.id.tvHome);
        tvMovie= (TextView) findViewById(R.id.tvMovie);

        tvHome.setOnClickListener(this);
        tvMovie.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
                System.out.println(v.getId());
                Intent intent =new Intent(MainActivity.this,HomeFragment.class);
                startActivity(intent);
        }


    }

