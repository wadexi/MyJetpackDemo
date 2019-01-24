package com.example.a073105.myjetpackdemo.di.component;

import com.example.a073105.myjetpackdemo.MyApplication;
import com.example.a073105.myjetpackdemo.di.module.ApplicationModule;
import com.example.a073105.myjetpackdemo.di.module.MainActivityModule;
import com.example.a073105.myjetpackdemo.net.Webservice;
import com.example.a073105.myjetpackdemo.repository.UserRepository;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ApplicationModule.class,
                MainActivityModule.class
        }
)
public interface AppComponent extends AndroidInjector<MyApplication> {


    @Component.Builder
    interface Builder{
        @BindsInstance
        AppComponent.Builder application(MyApplication application);

        AppComponent build();
    }


    Webservice getWebservice(); /*module provides*/

    UserRepository getUserRepository(); /*工作方法注入*/


}
