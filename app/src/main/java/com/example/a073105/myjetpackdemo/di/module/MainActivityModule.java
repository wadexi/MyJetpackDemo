package com.example.a073105.myjetpackdemo.di.module;


import com.example.a073105.myjetpackdemo.di.component.UserProfileComponent;
import com.example.a073105.myjetpackdemo.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(
        subcomponents = UserProfileComponent.class
)
public abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract MainActivity contributeMainActivity();

}
