package com.example.a073105.myjetpackdemo.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.a073105.myjetpackdemo.di.annotation.ViewModelKey;
import com.example.a073105.myjetpackdemo.ui.main.fragments.user.UserProfileViewModel;
import com.example.a073105.myjetpackdemo.ui.main.fragments.user.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(UserProfileViewModel.class)
    abstract ViewModel bindUserViewModel(UserProfileViewModel model);


    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
