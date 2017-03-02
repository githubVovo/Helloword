package com.zyh.vovo.login;

import com.zyh.vovo.base.BasePresenter;
import com.zyh.vovo.base.BaseView;

/**
 * Created by DELL-002 on 2017/3/1.
 */

public class LoginContract {

    interface View extends BaseView {
        void loginSuccess();
        void signSuccess();
        void showMsg(String msg);
    }

    abstract class Presenter extends BasePresenter<View> {
        public abstract void login(String name, String pass);

        public abstract void sign(String name, String pass);

        @Override
        public void onAttached() {
        }
    }


}
