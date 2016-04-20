package webonise.verticalviewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        final PageFragment pageFragment = new PageFragment();
        final Bundle bundle = new Bundle();
        bundle.putString("pageCount",String.valueOf(position));
        pageFragment.setArguments(bundle);
        return pageFragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
