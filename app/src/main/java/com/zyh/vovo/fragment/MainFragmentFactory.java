package com.zyh.vovo.fragment;

import android.support.v4.app.Fragment;
import android.util.SparseArray;


/**
 * Created by DELL-002 on 2017/3/1.
 */

public class MainFragmentFactory {
    private static SparseArray listF = new SparseArray<Fragment>();

    public static Fragment createFragment(int position) {
        Fragment fragment = null;
        fragment = (Fragment) listF.get(position);

        if (fragment == null) {
            switch (position) {
                case 1:
                    fragment = new FirstFragment();
                    break;
                case 2:
                    fragment = new EssayFragment();

                    break;
                case 3:
                   fragment = new MessageFragment();
                    break;
                case 4:
                    fragment = new MeFragment();
                    break;
            }

        }
        listF.append(position, fragment);
        return fragment;
    }


    public static int fragmentSize() {

        return listF.size();
    }

}
