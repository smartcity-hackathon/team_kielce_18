package kielce.hackathon.pl.appka;

/**
 * Created by user on 6/15/2018.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 6/14/2018.
 */

class SectionsPagerAddapter extends FragmentPagerAdapter{

    public SectionsPagerAddapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                KandydaciFragment kandydaciFragment = new KandydaciFragment();
                return kandydaciFragment;
            case 1:
                JakGlosowacFragment jakGlosowacFragment = new JakGlosowacFragment();
                return jakGlosowacFragment;
            case 2:
                OkregiWyborczeFragment okregiWyborczeFragment= new OkregiWyborczeFragment();
                return  okregiWyborczeFragment;
            case 3:
                LokaleFragment lokaleFragment = new LokaleFragment();
                return  lokaleFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position){

        switch (position){
            case 0:
                return "Kadydaci";
            case 1:
                return "Jak zaglosowac";
            case 2:
                return "Okregi Wyborcze";
            case 3:
                return "Lokale";
            default:
                return null;
        }

    }
}
