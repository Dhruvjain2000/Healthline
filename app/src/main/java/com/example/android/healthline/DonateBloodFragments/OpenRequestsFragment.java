package com.example.android.healthline.DonateBloodFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.healthline.DonateBloodFragments.DataProvider.OpenRequestInfo;
import com.example.android.healthline.DonateBloodFragments.DonationAdapter.DonateAdapter;
import com.example.android.healthline.DonateBloodFragments.DonationAdapter.OpenRequestAdapter;
import com.example.android.healthline.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class OpenRequestsFragment extends Fragment {
    RecyclerView rv;
    OpenRequestAdapter madapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<OpenRequestInfo> mInfo;
    private String[] reqdBlood = {
            "A+",
            "AB-",
            "O+",
            "O+",
            "B+",
            "A+"
    };
    private String[] age = {
            "19",
            "27",
            "60",
            "56",
            "70",
            "45"
    };
    private String[] status = {
            "urgent",
            "normal",
            "emergency",
            "emergency",
            "urgent",
            "normal"
    };


    public OpenRequestsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_open_requests, container, false);
        mInfo = new ArrayList<>();
        for (int i = 0 ;i < status.length;i++){
            OpenRequestInfo info = new OpenRequestInfo(reqdBlood[i], age[i], status[i]);
            mInfo.add(info);
        }
        rv = view.findViewById(R.id.rv_open_req);
        madapter = new OpenRequestAdapter(mInfo, getContext());
        layoutManager = new GridLayoutManager(getContext(), 1);
        ViewCompat.setNestedScrollingEnabled(rv, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(madapter);
        rv.setHasFixedSize(true);
        setHasOptionsMenu(true);
        return view;
    }

}
