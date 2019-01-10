package com.example.a073105.myjetpackdemo.dagger.component;

import com.example.a073105.myjetpackdemo.MyApplication;
import com.example.a073105.myjetpackdemo.dagger.module.AppModule;
import com.example.a073105.myjetpackdemo.net.Webservice;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(MyApplication application);

    Webservice getWebservice();
}
