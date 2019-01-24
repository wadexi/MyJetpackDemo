package com.example.a073105.myjetpackdemo.module;

import com.example.a073105.myjetpackdemo.bean.DepA;
import com.example.a073105.myjetpackdemo.bean.DepB;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;

/**
 * 可以通过添加返回子集的模块方法一次提供多个元素，并使用@ElementsIntoSet进行注释
 */
@Module
public class MyModuleB {

    @Provides
    @ElementsIntoSet
    static Set<String> provideSomeStrings(DepA depA, DepB depB){
        return new HashSet<String>(Arrays.asList("DEF","GHI"));
    }

}
