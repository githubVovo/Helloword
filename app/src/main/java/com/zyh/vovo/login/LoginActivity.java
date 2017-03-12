package com.zyh.vovo.login;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zyh.vovo.R;
import com.zyh.vovo.base.BaseActivity;
import com.zyh.vovo.bean.LoginBean;
import com.zyh.vovo.utils.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.QueryListener;

/**
 * Created by DELL-002 on 2017/2/23.
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.iv_login_logo)
    TextView ivLoginLogo;
    @BindView(R.id.iv_login_username_icon)
    ImageView ivLoginUsernameIcon;
    @BindView(R.id.et_login_username)
    EditText etLoginUsername;
    @BindView(R.id.iv_login_username_del)
    ImageView ivLoginUsernameDel;
    @BindView(R.id.ll_login_username)
    LinearLayout llLoginUsername;
    @BindView(R.id.iv_login_pwd_icon)
    ImageView ivLoginPwdIcon;
    @BindView(R.id.et_login_pwd)
    EditText etLoginPwd;
    @BindView(R.id.iv_login_pwd_del)
    ImageView ivLoginPwdDel;
    @BindView(R.id.ll_login_pwd)
    LinearLayout llLoginPwd;
    @BindView(R.id.iv_login_hold_pwd)
    ImageView ivLoginHoldPwd;
    @BindView(R.id.tv_login_forget_pwd)
    TextView tvLoginForgetPwd;
    @BindView(R.id.bt_login_submit)
    Button btLoginSubmit;
    @BindView(R.id.bt_login_register)
    Button btLoginRegister;
    @BindView(R.id.lay_login_container)
    LinearLayout layLoginContainer;
    @BindView(R.id.ll_login_layer)
    View llLoginLayer;
    @BindView(R.id.ib_login_weibo)
    ImageView ibLoginWeibo;
    @BindView(R.id.ib_login_wx)
    ImageView ibLoginWx;
    @BindView(R.id.ib_login_qq)
    ImageView ibLoginQq;
    @BindView(R.id.ll_login_options)
    LinearLayout llLoginOptions;
    @BindView(R.id.ll_login_pull)
    LinearLayout llLoginPull;
    private String userName;
    private String loginPwd;

    @Override
    public int setLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initUI() {
        ButterKnife.bind(this);
    }

    @Override
    protected void initData() {

        userName = etLoginUsername.getText().toString().trim();
        loginPwd = etLoginPwd.getText().toString().trim();
        btLoginSubmit.setOnClickListener(this);


    }

    @Override
    protected void initListener() {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.bt_login_submit:
                if (userName.equals("")  || loginPwd.equals(""))
                {
                    ToastUtils.showShortToast(R.string.login_error);
                }
                login();
                break;
            //注册
            case R.id.bt_login_register:

                userRegister();
                break;



        }
    }

    private void userRegister() {




    }

    private void login() {
        BmobQuery<LoginBean> bmobQuery = new BmobQuery<LoginBean>();
        bmobQuery.getObject("", new QueryListener<LoginBean>() {
            @Override
            public void done(LoginBean loginBean, BmobException e) {
                if(e==null){
                    //登录成功
                }else{
                    //登录失败
                    ToastUtils.showShortToast(R.string.login_uorp_error);
                }

            }
        });


    }
}
