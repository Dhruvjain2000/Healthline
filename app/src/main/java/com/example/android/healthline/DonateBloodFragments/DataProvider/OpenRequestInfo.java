package com.example.android.healthline.DonateBloodFragments.DataProvider;

public class OpenRequestInfo {
    private String reqdBlood;

    public String getReqdBlood() {
        return reqdBlood;
    }

    public void setReqdBlood(String reqdBlood) {
        this.reqdBlood = reqdBlood;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String age;
    private String status;
    public OpenRequestInfo(String reqdBlood, String age, String status) {
        this.reqdBlood = reqdBlood;
        this.age = age;
        this.status = status;
    }


}
