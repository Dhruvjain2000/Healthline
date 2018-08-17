package com.example.android.healthline.DonateBloodFragments.DataProvider;

public class BloodBankInfo {
    private String location, availGrps;

    public BloodBankInfo(String location, String availGrps) {
        this.location = location;
        this.availGrps = availGrps;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvailGrps() {
        return availGrps;
    }

    public void setAvailGrps(String availGrps) {
        this.availGrps = availGrps;
    }
}
