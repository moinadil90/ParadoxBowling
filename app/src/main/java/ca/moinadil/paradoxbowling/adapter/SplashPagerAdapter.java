package ca.moinadil.paradoxbowling.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ca.moinadil.paradoxbowling.fragment.TutorialFragment;

/**
 * Created by Moin Adil on 18-08-02. Manages fragments in a view pager.
 */
public class SplashPagerAdapter
        extends FragmentStatePagerAdapter {

    /** To identify output from this class in the Logcat. */
    @SuppressWarnings("unused")
    private static final String TAG = "SplashPagerAdapter";

    /**
     * Default constructor.
     *
     * @param fm fragment manager
     */
    public SplashPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TutorialFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return TutorialFragment.TUTORIAL_TOTAL_PAGES;
    }
}
