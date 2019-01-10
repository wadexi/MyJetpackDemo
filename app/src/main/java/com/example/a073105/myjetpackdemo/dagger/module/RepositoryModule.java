package com.example.a073105.myjetpackdemo.dagger.module;



import com.example.a073105.myjetpackdemo.repository.UserRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {


    @Provides
    @Singleton
    UserRepository getUserRepository(){
        return new UserRepository();
    }
}
