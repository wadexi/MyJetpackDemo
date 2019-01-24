package com.example.a073105.myjetpackdemo.compoent;

import com.example.a073105.myjetpackdemo.module.MyModuleA;
import com.example.a073105.myjetpackdemo.module.MyModuleB;

import java.util.Set;

import dagger.Component;

@Component(modules = {MyModuleA.class,MyModuleB.class})
public interface MyComponent {

    Set<String> strings();

}
