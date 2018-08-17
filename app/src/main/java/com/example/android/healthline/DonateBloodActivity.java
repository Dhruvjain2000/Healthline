package com.example.android.healthline;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.android.healthline.DonateBloodFragments.BloodBanksFragment;
import com.example.android.healthline.DonateBloodFragments.DonorsFragment;
import com.example.android.healthline.DonateBloodFragments.OpenRequestsFragment;

public class DonateBloodActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    DonationViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_blood);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.puzzle_viewpager);
        viewPagerAdapter = new DonationViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new DonorsFragment(), "Donor");
        viewPagerAdapter.addFragments(new BloodBanksFragment(), "Blood Bank");
        viewPagerAdapter.addFragments(new OpenRequestsFragment(), "Open Request");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        getSupportActionBar().setTitle("Donate Blood");
    }
}
