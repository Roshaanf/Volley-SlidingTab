package com.example.roshaanfarrukh.volleyproject.ui.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.roshaanfarrukh.volleyproject.R;
import com.example.roshaanfarrukh.volleyproject.utils.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practise);

        tabLayout=findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));

        viewPager= findViewById(R.id.view_pager);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager(),3);
        viewPager.setAdapter(viewPagerAdapter);


        //it is causing the tabs title in tab layout to look as seleceted whenever tab changes
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



        //whenever tab is clicked or slided it passes an event
        //especially used to catch event when tab is selected by clicking on tab title rather thn sliding
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                Toast.makeText(MainActivity.this, "on tab selected listener is non", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        ///////TAB LAYOUT XML ATTRIBUTES
        //app:tabIndicatorColor="#ffff00" *changes line below text color
//        app:tabGravity="center" *center will make tabs title appear in centre in tab layout and fill will make it cover full space
//        app:tabIndicatorHeight="5dp" *changes the height of line below tab name text
//        app:tabMode="scrollable" *scrollabe is used when large number of tabs are used and only some tabs are shown in tablayout at a time and others will show after scrolling sideways
//        app:padding  properties are used to add padding in each side
//        app:tabSelectedTextColor="#ff00ff"  *selected tab color will be changed using this
//        app:tabTextColor="#00ffff"  *it will change the color of text when the tab is not selected

    }
}
