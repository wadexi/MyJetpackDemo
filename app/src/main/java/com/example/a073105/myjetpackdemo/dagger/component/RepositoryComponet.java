package com.example.a073105.myjetpackdemo.dagger.component;

import com.example.a073105.myjetpackdemo.dagger.annotation.PerActivity;
import com.example.a073105.myjetpackdemo.dagger.module.RepositoryModule;
import com.example.a073105.myjetpackdemo.ui.MainActivity;
import com.example.a073105.myjetpackdemo.user.UserProfileFragment;

import dagger.Component;

@PerActivity
@Component(modules = RepositoryModule.class,dependencies = AppComponent.class)
public interface RepositoryComponet {

    void inject(MainActivity mainActivity);
    void inject(UserProfileFragment userProfileFragment);


}
