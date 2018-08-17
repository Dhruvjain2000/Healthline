package com.example.android.healthline.DonateBloodFragments.DataProvider;

public class DonorInfo {
    private String mName, mGrp;

    public DonorInfo(String mName, String mGrp) {
        this.mName = mName;
        this.mGrp = mGrp;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmGrp() {
        return mGrp;
    }

    public void setmGrp(String mGrp) {
        this.mGrp = mGrp;
    }
}
