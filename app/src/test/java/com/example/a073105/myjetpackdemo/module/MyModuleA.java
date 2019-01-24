package com.example.a073105.myjetpackdemo.module;

import com.example.a073105.myjetpackdemo.bean.DepA;
import com.example.a073105.myjetpackdemo.bean.DepB;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class MyModuleA {

    @Provides
    @IntoSet
    static String provideOneString(DepA depA, DepB depB){
        return "ABC";
    }




}
