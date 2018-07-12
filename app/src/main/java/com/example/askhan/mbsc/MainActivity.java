package com.example.askhan.mbsc;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.TabLayout;
import android.widget.Toast;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ViewPager announceViewPager;
    CircleIndicator indicator;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.percentage);

         tabLayout = (TabLayout) findViewById(R.id.tablayout);

         tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
             @Override
             public void onTabSelected(TabLayout.Tab tab) {
                 int pos = tab.getPosition();
                 if (pos == 0){
                     Toast.makeText(MainActivity.this, ""+pos, Toast.LENGTH_SHORT).show();
                 }
                 else{
                     Toast.makeText(MainActivity.this, ""+pos, Toast.LENGTH_SHORT).show();

                 }
             }

             @Override
             public void onTabUnselected(TabLayout.Tab tab) {

             }

             @Override
             public void onTabReselected(TabLayout.Tab tab) {

             }
         });

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        announceViewPager = (ViewPager) findViewById(R.id.announceViewPager);

        indicator = (CircleIndicator) findViewById(R.id.dots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        indicator.setViewPager(viewPager);



        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentAnnouncement(),"Announcement");
        adapter.AddFragment(new FragmentLatestNews(),"Latest News");

        announceViewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(announceViewPager);
    }

}
