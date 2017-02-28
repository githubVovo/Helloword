package com.zyh.vovo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.jaeger.library.StatusBarUtil;
import com.jpeng.jptabbar.JPTabBar;
import com.jpeng.jptabbar.anno.NorIcons;
import com.jpeng.jptabbar.anno.SeleIcons;
import com.jpeng.jptabbar.anno.Titles;
import com.zyh.vovo.adapter.MainPagerAdapter;
import com.zyh.vovo.base.BaseActivity;
import com.zyh.vovo.fragment.EssayFragment;
import com.zyh.vovo.fragment.FirstFragment;
import com.zyh.vovo.fragment.MeFragment;
import com.zyh.vovo.fragment.MessageFragment;
import com.zyh.vovo.fragment.PublishFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private JPTabBar tabbar;

    @Titles
    private static final String[] mTitles = {"页面一","页面二","页面四","页面5"};

    @SeleIcons
    private static final int[] mSeleIcons = {R.drawable.tab1_selected,R.drawable.tab2_selected,R.mipmap.circle,R.drawable.tab3_selected,R.drawable.tab4_selected};

    @NorIcons
    private static final int[] mNormalIcons = {R.drawable.tab1_normal, R.drawable.tab2_normal,R.mipmap.circle, R.drawable.tab3_normal, R.drawable.tab4_normal};
    private ViewPager activityVP;

    private List<Fragment> list=new ArrayList<>();
    private FirstFragment firstFragment;
    private EssayFragment essayFragment;
    private MeFragment meFragment;
    private MessageFragment messageFragment;
    private PublishFragment publishFragment;

    @Override
    protected void initUI() {
        setContentView(R.layout.activity_main);
        StatusBarUtil.setTranslucent(this, 0);
        tabbar=  (JPTabBar) findViewById(R.id.activity_tabbar);
        activityVP=  (ViewPager) findViewById(R.id.activity_viewpager);

        firstFragment = new FirstFragment();
        essayFragment = new EssayFragment();
        meFragment = new MeFragment();
        messageFragment = new MessageFragment();
        publishFragment = new PublishFragment();
        list.add(firstFragment);
        list.add(essayFragment);
        list.add(publishFragment);
        list.add(messageFragment);
        list.add(meFragment);
        activityVP.setAdapter(new MainPagerAdapter(getSupportFragmentManager(),list));
        tabbar.setContainer(activityVP);
        //显示圆点模式的徽章
        //设置容器
        tabbar.ShowBadge(0,5);


    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }
}
