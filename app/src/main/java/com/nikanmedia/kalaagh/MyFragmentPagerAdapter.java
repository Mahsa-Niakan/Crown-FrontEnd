package com.nikanmedia.kalaagh;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    public void addFragment(Fragment fragment, String title)
    {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
    public MyFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }
    public CharSequence getPageTitle(int position){
        return mFragmentTitleList.get(position);

    }
    @Override
    public Fragment getItem(int position) {
        return  mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
