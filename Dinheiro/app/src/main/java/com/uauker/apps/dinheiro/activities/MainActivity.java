package com.uauker.apps.dinheiro.activities;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.uauker.apps.dinheiro.R;
import com.uauker.apps.dinheiro.fragments.DemoFragment;
import com.uauker.apps.dinheiro.fragments.ExchangeRateFragment;
import com.uauker.apps.dinheiro.fragments.RecyclerViewFragment;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    MaterialViewPager mViewPager;

    DrawerLayout mDrawer;
    ActionBarDrawerToggle mDrawerToggle;

    FragmentPagerItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("");

        adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add(R.string.action_settings, RecyclerViewFragment.class)
                .add(R.string.exchange_rate, ExchangeRateFragment.class)
                .add(R.string.app_name, DemoFragment.class)
                .add(R.string.hello_world, DemoFragment.class)
                .add(R.string.action_settings, DemoFragment.class)
                .add(R.string.app_name, DemoFragment.class)
                .create());

        mViewPager = (MaterialViewPager) findViewById(R.id.materialViewPager);
//        mViewPager.getViewPager().setAdapter(adapter);

        toolbar = mViewPager.getToolbar();
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (toolbar != null) {
            setSupportActionBar(toolbar);

            final ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
                actionBar.setDisplayShowHomeEnabled(true);
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setDisplayUseLogoEnabled(false);
                actionBar.setHomeButtonEnabled(true);
            }
        }

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawer, 0, 0);
        mDrawer.setDrawerListener(mDrawerToggle);

        mViewPager.getViewPager().setAdapter(adapter);
        mViewPager.getViewPager().setOffscreenPageLimit(mViewPager.getViewPager().getAdapter().getCount());
        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

}
