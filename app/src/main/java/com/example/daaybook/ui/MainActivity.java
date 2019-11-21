package com.example.daaybook.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toolbar;

import com.example.daaybook.R;
import com.example.daaybook.ui.calendarview.CalendarFragment;
import com.example.daaybook.ui.mainpage.MainPageFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private ViewPager viewPager;
private TabLayout tabLayout;
private androidx.appcompat.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout) findViewById(R.id.tabs);
        viewPager=(ViewPager) findViewById(R.id.viewPager);
        toolbar= findViewById(R.id.toolbar);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MainPageFragment(),"Main");
        adapter.addFragment(new CalendarFragment(),"Calendar");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }


}
