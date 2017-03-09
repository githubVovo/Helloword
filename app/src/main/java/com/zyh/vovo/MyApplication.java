/*
******************************* Copyright (c)*********************************\
**
**                 (c) Copyright 2015, Allen, china, shanghai
**                          All Rights Reserved
**
**                          
**                         
**-----------------------------------版本信息------------------------------------
** 版    本: V0.1
**
**------------------------------------------------------------------------------
********************************End of Head************************************\
*/
package com.zyh.vovo;

import android.app.Application;
import android.content.Context;

import com.zyh.vovo.utils.Utils;

import cn.bmob.v3.Bmob;


public class MyApplication extends Application {


    private static Context applicationContext;

    public static Context getAppContext() {
        return applicationContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        applicationContext = this.getApplicationContext();

        //第一：默认初始化
        Bmob.initialize(this, "1043872c43580fe504659fea79aeb629");

    }





}
