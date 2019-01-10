package com.example.a073105.myjetpackdemo;

import android.app.Application;

import com.example.a073105.myjetpackdemo.dagger.component.AppComponent;
import com.example.a073105.myjetpackdemo.dagger.component.DaggerAppComponent;
import com.example.a073105.myjetpackdemo.net.Webservice;

import javax.inject.Inject;

public class MyApplication extends Application {

    public static MyApplication INSTANCE;

    AppComponent appComponent;

    @Inject
    Webservice webservice;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        appComponent = DaggerAppComponent.builder().build();
        appComponent.inject(this);
        assert webservice != null;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
