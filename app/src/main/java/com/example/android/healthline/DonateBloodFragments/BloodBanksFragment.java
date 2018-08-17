package com.example.android.healthline.DonateBloodFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.healthline.DonateBloodFragments.DataProvider.BloodBankInfo;
import com.example.android.healthline.DonateBloodFragments.DataProvider.OpenRequestInfo;
import com.example.android.healthline.DonateBloodFragments.DonationAdapter.BloodBankAdapter;
import com.example.android.healthline.DonateBloodFragments.DonationAdapter.OpenRequestAdapter;
import com.example.android.healthline.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BloodBanksFragment extends Fragment {

    RecyclerView rv;
    BloodBankAdapter madapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<BloodBankInfo> mInfo;
    private String[] address = {
            "Kelley A. Fleming 196 Woodside Circle Mobile, FL 36602 Phone:240-256-1942",
            "Michael I. Days 3756 Preston Street Wichita, KS 67213 Phone:857-778-1265",
            "Donald M. Palmer 2595 Pearlman Avenue Sudbury, MA 01776 Phone:293-112-459",
            "Micheal R. Porterfield 508 Virginia Street Chicago, IL 60653 Phone:346-523-454",
            "Nathan K. Flores 1516 Holt Street West Palm Beach, FL 33401 Phone:561-352-5973",
            "Michael I. Days 3756 Preston Street Wichita, KS 67213 Phone:857-778-1265"
    };
    private String[] avail_grp = {
            "A+, AB-, O+, A+",
            "AB-, O+, A+",
            "O+, A+",
            "O+, AB-, A+",
            "B+, O+, A+",
            "A+, AB-, O+"
    };

    public BloodBanksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blood_banks, container, false);
        mInfo = new ArrayList<>();
        for(int i = 0;i<avail_grp.length;i++){
            BloodBankInfo info = new BloodBankInfo(address[i], avail_grp[i]);
            mInfo.add(info);
        }
        rv = view.findViewById(R.id.rv_blood_bank);
        madapter = new BloodBankAdapter(mInfo, getContext());
        layoutManager = new GridLayoutManager(getContext(), 1);
        ViewCompat.setNestedScrollingEnabled(rv, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(madapter);
        rv.setHasFixedSize(true);
        setHasOptionsMenu(true);
        return view;
    }
}
