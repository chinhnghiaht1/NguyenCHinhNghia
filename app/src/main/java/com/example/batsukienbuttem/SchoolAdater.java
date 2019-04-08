package com.example.batsukienbuttem;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SchoolAdater extends RecyclerView.Adapter<SchoolAdater.ViewHolder> {

    private Context context;
    private List<SchoolActivity> schoolList;

    public SchoolAdater(Context context, List<SchoolActivity> list){

        this.context = context;
        this.schoolList = list ;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int typeView) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_school_item,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        SchoolActivity school = schoolList.get(position);

        viewHolder.nameSchool.setText(school.getName());
        viewHolder.diaChi.setText(school.getDiachi());


        if(school.getGroupId() == school.GRUOUP_SCHOOL3){
            viewHolder.iv.setImageResource(R.drawable.ic_school3);
        }
        if(school.getGroupId() == school.GRUOUP_SCHOOL1){
            viewHolder.iv.setImageResource(R.drawable.ic_school);
        }
        if(school.getGroupId() == school.GRUOUP_SCHOOL2){
            viewHolder.iv.setImageResource(R.drawable.ic_school2);
        }
    }

    @Override
    public int getItemCount() {
        return schoolList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameSchool;
        TextView diaChi;
        ImageView iv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameSchool = itemView.findViewById(R.id.tvNameSchool);
            diaChi = itemView.findViewById(R.id.tvDiaChi);
            iv = itemView.findViewById(R.id.iv);

        }
    }
}
