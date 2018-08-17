package com.example.android.healthline.DonateBloodFragments.DonationAdapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.healthline.DonateBloodFragments.DataProvider.DonorInfo;
import com.example.android.healthline.R;

import java.util.ArrayList;

public class DonateAdapter extends RecyclerView.Adapter<DonateAdapter.DonateViewHolder> {
    @SuppressLint("StaticFieldLeak")
    private static Context context;
    private ArrayList<DonorInfo> donorInfos;

    public DonateAdapter(ArrayList<DonorInfo> donorInfos, Context context) {
        this.donorInfos = donorInfos;
        DonateAdapter.context = context;
    }

    @NonNull
    @Override
    public DonateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_small_apps, parent, false);
//        return new AppsViewHolder(view);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_donors, parent, false);
        return new DonateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DonateViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.mName.setText(donorInfos.get(position).getmName());
        holder.mGroup.setText(donorInfos.get(position).getmGrp());

    }

    @Override
    public int getItemCount() {
        return donorInfos.size();
    }


    public static class DonateViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mName, mGroup ;

        public DonateViewHolder(View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.tv_name);
            mGroup = itemView.findViewById(R.id.tv_group);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();


        }

    }
}



