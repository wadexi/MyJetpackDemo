package com.example.a073105.myjetpackdemo.di.component;

import com.example.a073105.myjetpackdemo.di.module.ViewModelModule;
import com.example.a073105.myjetpackdemo.ui.main.fragments.user.UserProfileFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface UserProfileComponent extends AndroidInjector<UserProfileFragment> {


    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<UserProfileFragment>{

    }

}
