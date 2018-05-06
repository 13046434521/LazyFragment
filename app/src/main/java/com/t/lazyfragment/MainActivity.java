package com.t.lazyfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List <Fragment>fragmentList;
    private int count = 4;
    private List <String>titles;
    private PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tablayout);
        getData();
        pageAdapter=new PageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pageAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }


    private void getData() {
        fragmentList = new ArrayList();
        titles=new ArrayList<>();
        for (int i = 0; i < count; i++) {
            titles.add("页面"+i);
        }


        fragmentList.add(Page0Fragment.newInstance(titles.get(0)));
        fragmentList.add(Page1Fragment.newInstance(titles.get(1)));
        fragmentList.add(Page2Fragment.newInstance(titles.get(2)));
        fragmentList.add(Page3Fragment.newInstance(titles.get(3)));
//        fragmentList.add(BlankFragment2.newInstance("1","2"));
    }

    private class PageAdapter extends FragmentPagerAdapter {

        public PageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }


        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }
    }
}
