package com.example.roshaanfarrukh.volleyproject.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.roshaanfarrukh.volleyproject.ui.fragments.Tab1Fragment;
import com.example.roshaanfarrukh.volleyproject.ui.fragments.Tab2Fragment;
import com.example.roshaanfarrukh.volleyproject.ui.fragments.Tab3Fragment;

/**
 * Created by Roshaan Farrukh on 1/11/2018.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter{

    int mNumOfTabs;

    public ViewPagerAdapter(FragmentManager fm,int numberOfTabs) {
        super(fm);
        this.mNumOfTabs=numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:{
                Tab1Fragment tab1=new Tab1Fragment();
                return tab1;
            }
            case 1:{
                Tab2Fragment tab2=new Tab2Fragment();
                return tab2;
            }
            case 2:{
                Tab3Fragment tab3=new Tab3Fragment();
                return tab3;
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
