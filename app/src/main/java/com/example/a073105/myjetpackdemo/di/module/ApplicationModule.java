package com.example.a073105.myjetpackdemo.di.module;

import com.example.a073105.myjetpackdemo.bean.User;
import com.example.a073105.myjetpackdemo.net.Webservice;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(
        includes = {
                ViewModelModule.class
        }
)
public class ApplicationModule {


    @Provides
    @Singleton
    User provideUser(){
        return new User("baidu","logo of baidu");
    }

    @Provides
    @Singleton
    Webservice getWebservice(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://2c18c076-f005-46d7-9ab4-07327b16965c.mock.pstmn.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(Webservice.class);
    }


//    @Provides
//    @IntoMap
//    @Singleton
//    @ClassKey(UserProfileViewModel.class)
//    Provider<ViewModel> providerViewModel(){
//        return new Provider<ViewModel>() {
//
//
//            @Override
//            public ViewModel get() {
//                return UserProfileViewModel;
//            }
//        };
//    }

}
