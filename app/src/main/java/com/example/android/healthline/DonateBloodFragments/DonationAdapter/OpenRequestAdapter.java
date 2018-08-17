package com.example.android.healthline.DonateBloodFragments.DonationAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.healthline.DonateBloodFragments.DataProvider.OpenRequestInfo;
import com.example.android.healthline.R;

import java.util.ArrayList;

public class OpenRequestAdapter extends RecyclerView.Adapter<OpenRequestAdapter.RequestViewHolder> {
    private static Context context;
    private ArrayList<OpenRequestInfo> infos;
    public OpenRequestAdapter(ArrayList<OpenRequestInfo> Infos, Context context) {
        this.infos = Infos;
        OpenRequestAdapter.context = context;
    }

    @NonNull
    @Override
    public RequestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.open_request, parent, false);
        return new RequestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RequestViewHolder holder, int position) {
        holder.reqdBlood.setText(infos.get(position).getReqdBlood());
        holder.age.setText(infos.get(position).getAge());
        holder.status.setText(infos.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return infos.size();
    }


    public static class RequestViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView reqdBlood, age, status;

        public RequestViewHolder(View itemView) {
            super(itemView);
            reqdBlood = itemView.findViewById(R.id.tv_req_blood);
            age = itemView.findViewById(R.id.tv_patient_age);
            status = itemView.findViewById(R.id.tv_status) ;
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();


        }
    }
}
