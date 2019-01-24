package com.example.a073105.myjetpackdemo.di.module;

import com.example.a073105.myjetpackdemo.ui.main.fragments.user.UserProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract UserProfileFragment contributeUserFragment();

}
