package com.example.batsukienbuttem;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class InforActivity extends AppCompatActivity {
    FragmentTransaction ft;
    FragmentManager fm;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor);


      String Hien = getIntent().getStringExtra("KEY_USER");
        TextView hienThi = findViewById(R.id.tvuser);
          hienThi.setText(Hien);
          fm = getSupportFragmentManager();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.layoutFragment, SchoolListfragment.newInstance("This Is Data"));
        ft.commit();

    }

    public void MoFragment(View view) {
        switch (view.getId()){
            case R.id.btGT:
                fragment= new SchoolFragment();
                ;break;
            case R.id.btTK:
                fragment= new SchoolListfragment();
                ;break;
            case R.id.btHD:
                ;break;
            case R.id.btMaps:
                ;break;
        }
        ft = fm.beginTransaction();
        ft.replace(R.id.layoutFragment,fragment);
        ft.commit();
    }
}
