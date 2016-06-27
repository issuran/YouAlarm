package com.youalarm.ui;

import android.os.Bundle;
import android.projetos.br.youalarm.R;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.youalarm.fragment.DSChooseFragment;
import com.youalarm.fragment.DSRandomFragment;
import com.youalarm.fragment.DSStyleFragment;

public class DashboardActivity extends AppCompatActivity {

    //public static final String API_KEY = (R.string.google_app_id);
    private static String TAG = "DASHBOARD";

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    private DSChooseFragment dsChooseFragment;
    private DSRandomFragment dsRandomFragment;
    private DSStyleFragment  dsStyleFragment;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_screen);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/


/*

        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Choose one"));
        tabLayout.addTab(tabLayout.newTab().setText("Gender"));
        tabLayout.addTab(tabLayout.newTab().setText("Surprise me"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        final PagerAdapter adapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d(TAG, "onTabSelected Tab pos: "+ String.valueOf(tab.getPosition()));
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            //TODO: Create/Display Setting menu
            return true;
        } else if (id == R.id.action_about) {
            //TODO: Create/Display About information
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




    /******************************************************************************
    public class PageAdapter extends FragmentStatePagerAdapter {
        int mNumOfTabs;

        public PageAdapter(FragmentManager fm,int numTabs) {
            super(fm);
            this.mNumOfTabs = numTabs;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    DSChooseFragment dsChooseFragment = new DSChooseFragment();

                    return dsChooseFragment;

                case 1:
                    DSStyleFragment dsStyleFragment  = new DSStyleFragment();
                    return dsStyleFragment;

                case 2:
                    DSRandomFragment dsRandomFragment = new DSRandomFragment();
                    return dsRandomFragment;

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }
    }
     */

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
*/
     public class SectionsPagerAdapter extends FragmentPagerAdapter {

     public SectionsPagerAdapter(FragmentManager fm) {
     super(fm);
     }

     @Override
     public Fragment getItem(int position) {

     // getItem is called to instantiate the fragment for the given page.
     // Return a PlaceholderFragment (defined as a static inner class below).
     switch (position) {
     case 0:
     return dsChooseFragment = new DSChooseFragment();

     case 1:
     return dsStyleFragment = new DSStyleFragment();

     case 2:
     return dsRandomFragment = new DSRandomFragment();

     default:
     return null;
     }
     }

     @Override
     public int getCount() {
     // Show 3 total pages.
     return 3;
     }

     @Override
     public CharSequence getPageTitle(int position) {
     switch (position) {
     case 0:
     return "CHOOSE";
     case 1:
     return "STYLE";
     case 2:
     return "SURPRISE ME";
     }
     return null;
     }
     }

}
