package com.example.a073105.myjetpackdemo;


import com.example.a073105.myjetpackdemo.di.component.DaggerAppComponent;
import com.example.a073105.myjetpackdemo.net.Webservice;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MyApplication extends DaggerApplication  {

    public static MyApplication INSTANCE;


    @Inject
    Webservice webservice;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
