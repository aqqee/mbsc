package com.example.askhan.mbsc;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.TabLayout;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    CircleIndicator indicator;
    GridView gridView;

    int iconlist[] = {R.drawable.facilities, R.drawable.myprofile, R.drawable.programs,
            R.drawable.blackboard, R.drawable.people, R.drawable.calendar, R.drawable.news,
            R.drawable.gallery, R.drawable.social,R.drawable.emergency,R.drawable.transport,
            R.drawable.getintouch};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        indicator = (CircleIndicator) findViewById(R.id.dots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        indicator.setViewPager(viewPager);

    

    }

}
