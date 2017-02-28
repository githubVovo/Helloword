package com.zyh.vovo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by DELL-002 on 2017/2/28.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> listF;

    public MainPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.listF=list;
    }

    @Override
    public Fragment getItem(int position) {
        return listF.get(position);
    }


    @Override
    public int getCount() {
        return listF.size();
    }
}
