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
    }





}
