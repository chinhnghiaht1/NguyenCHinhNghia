package com.example.batsukienbuttem;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SchoolListfragment extends Fragment {



    public static SchoolListfragment newInstance(String data){
        SchoolListfragment fragment = new SchoolListfragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    private SchoolAdater schoolAdater;
    private List<SchoolActivity> list= new ArrayList<>();

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.school_list_fragment, null);

        RecyclerView rvSchool = view.findViewById(R.id.rvSchool);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        schoolAdater = new SchoolAdater(getContext(), list);
        rvSchool.setLayoutManager(layoutManager);
        rvSchool.setAdapter(schoolAdater);

        loadData();

        return view;

    }

    private void loadData(){

        SchoolActivity s1 = new SchoolActivity(1,"Truong DH CNTT Va TT","Thanh Pho Thai Nguyen", SchoolActivity.GRUOUP_SCHOOL1);
        list.add(s1);
        SchoolActivity s2 = new SchoolActivity(1,"Truong DH Su Pham TN","Thanh Pho Thai Nguyen", SchoolActivity.GRUOUP_SCHOOL1);
        list.add(s2);
        SchoolActivity s3 = new SchoolActivity(1,"Truong DH Y Duoc TN","Thanh Pho Thai Nguyen", SchoolActivity.GRUOUP_SCHOOL1);
        list.add(s3);
        SchoolActivity s4 = new SchoolActivity(1,"Truong Khoa Ngoai Ngu TN","Thanh Pho Thai Nguyen", SchoolActivity.GRUOUP_SCHOOL1);
        list.add(s4);
        SchoolActivity s5 = new SchoolActivity(1,"Truong DH Bach Khoa","Thu Do Ha Noi", SchoolActivity.GRUOUP_SCHOOL2);
        list.add(s5);
        SchoolActivity s6 = new SchoolActivity(1,"Truong DH Kinh Te Quoc Dan","Thu Do Ha Noi", SchoolActivity.GRUOUP_SCHOOL2);
        list.add(s6);
        schoolAdater.notifyDataSetChanged();


    }
}
