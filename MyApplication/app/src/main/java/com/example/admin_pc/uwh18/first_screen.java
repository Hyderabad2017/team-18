package com.example.admin_pc.uwh18;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by BINDHU on 7/15/2017.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admin_pc.uwh18.R;

public class first_screen extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Button next = (Button) findViewById(R.id.button_donor);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), LoginActivity.class);
                startActivityForResult(myIntent,0);
            }

        });
    }
}