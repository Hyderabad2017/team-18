package com.example.admin_pc.uwh18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationDonor extends AppCompatActivity {

    private Button mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_donor);
//registration through email and password for donor sign in
        mRegister  = (Button)findViewById(R.id.email_sign_in_button);
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
