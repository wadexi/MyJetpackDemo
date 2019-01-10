package com.example.a073105.myjetpackdemo.dagger.module;

import com.example.a073105.myjetpackdemo.net.Webservice;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    @Provides
    @Singleton
    Webservice getWebservice(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://2c18c076-f005-46d7-9ab4-07327b16965c.mock.pstmn.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(Webservice.class);
    }
}
