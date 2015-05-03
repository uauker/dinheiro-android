package com.uauker.apps.dinheiro.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.uauker.apps.dinheiro.R;

public class MainPagerAdapter extends FragmentPagerAdapter {

    Context context;

    String[] tabsText;

    public MainPagerAdapter(FragmentManager fm, Context context) {
        super(fm);

        this.context = context;
        tabsText = this.context.getResources().getStringArray(R.array.tabs);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return this.tabsText.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.tabsText[position];
    }
}
