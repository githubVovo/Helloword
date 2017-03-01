package com.zyh.vovo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Toast;

import com.jaeger.library.StatusBarUtil;
import com.jpeng.jptabbar.JPTabBar;
import com.jpeng.jptabbar.OnTabSelectListener;
import com.jpeng.jptabbar.anno.NorIcons;
import com.jpeng.jptabbar.anno.SeleIcons;
import com.jpeng.jptabbar.anno.Titles;
import com.zyh.vovo.adapter.MainPagerAdapter;
import com.zyh.vovo.base.BaseActivity;
import com.zyh.vovo.fragment.EssayFragment;
import com.zyh.vovo.fragment.FirstFragment;
import com.zyh.vovo.fragment.MeFragment;
import com.zyh.vovo.fragment.MessageFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements OnTabSelectListener {

    private JPTabBar tabbar;

    @Titles
    private static final String[] mTitles = {"主页","美文","消息","我"};

    @SeleIcons
    private static final int[] mSeleIcons = {R.drawable.tab1_selected,R.drawable.tab2_selected,R.drawable.tab3_selected,R.drawable.tab4_selected};

    @NorIcons
    private static final int[] mNormalIcons = {R.drawable.tab1_normal, R.drawable.tab2_normal, R.drawable.tab3_normal, R.drawable.tab4_normal};
    private ViewPager activityVP;

    private List<Fragment> list=new ArrayList<>();
    private FirstFragment firstFragment;
    private EssayFragment essayFragment;
    private MeFragment meFragment;
    private MessageFragment messageFragment;

    @Override
    protected void initUI() {
        StatusBarUtil.setTranslucent(this, 0);
        tabbar=  (JPTabBar) findViewById(R.id.activity_tabbar);
        activityVP=  (ViewPager) findViewById(R.id.activity_viewpager);

        firstFragment = new FirstFragment();
        essayFragment = new EssayFragment();
        meFragment = new MeFragment();
        messageFragment = new MessageFragment();
        list.add(firstFragment);
        list.add(essayFragment);
        list.add(messageFragment);
        list.add(meFragment);
        activityVP.setAdapter(new MainPagerAdapter(getSupportFragmentManager(),list));
        tabbar.setContainer(activityVP);
        tabbar.setTabListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onTabSelect(int index) {

    }

    @Override    public void onClickMiddle(View middleBtn) {

        Toast.makeText(this, "11", Toast.LENGTH_SHORT).show();
    }
}
