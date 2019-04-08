package com.example.batsukienbuttem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText user;
    private EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.etEmail);
        pass = findViewById(R.id.etPass);


        findViewById(R.id.btDN).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                get();
            }
        });
    }
    private void get() {
        String username = "admin";
        String password = "admin";

        String s = user.getText().toString();
        if(user.getText().toString().equals(username) && pass.getText().toString().equals(password)){
            Toast.makeText(getApplicationContext(), "Dang nhap thanh cong", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, InforActivity.class);
            i.putExtra("KEY_USER", s);
            startActivity(i);
        }else{
            Toast.makeText(getApplicationContext(), "Tai Khoan mat khau sai",Toast.LENGTH_LONG).show();
        }



        }

}


