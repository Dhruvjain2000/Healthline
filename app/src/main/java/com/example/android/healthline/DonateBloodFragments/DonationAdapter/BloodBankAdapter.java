package com.example.android.healthline.DonateBloodFragments.DonationAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.healthline.DonateBloodFragments.DataProvider.BloodBankInfo;
import com.example.android.healthline.R;

import java.util.ArrayList;

public class BloodBankAdapter extends RecyclerView.Adapter<BloodBankAdapter.BankViewHolder> {
    private static Context context;
    private ArrayList<BloodBankInfo> infos;

    public BloodBankAdapter(ArrayList<BloodBankInfo> infos, Context context){
        this.infos = infos;
        BloodBankAdapter.context = context;
    }
    @NonNull
    @Override
    public BankViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.blood_banks, parent, false);
        return new BankViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BankViewHolder holder, int position) {
        holder.mLocation.setText(infos.get(position).getLocation());
        holder.availGrp.setText(infos.get(position).getAvailGrps());
    }

    @Override
    public int getItemCount() {
        return infos.size();
    }

    public static class BankViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mLocation, availGrp;

        public BankViewHolder(View itemView) {
            super(itemView);
            mLocation = itemView.findViewById(R.id.tv_hosp_name);
            availGrp = itemView.findViewById(R.id.tv_avail_grp);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();


        }

    }
}
