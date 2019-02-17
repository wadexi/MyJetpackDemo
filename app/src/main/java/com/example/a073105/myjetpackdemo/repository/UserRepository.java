package com.example.a073105.myjetpackdemo.repository;

import android.arch.lifecycle.MutableLiveData;

import com.example.a073105.myjetpackdemo.bean.User;
import com.example.a073105.myjetpackdemo.net.Webservice;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Singleton
public class UserRepository {

    private Webservice webservice;

    @Inject
    public UserRepository(Webservice webservice){
        this.webservice = webservice;
    }


    public void getUser(String userId,final MutableLiveData<User> data){

        webservice.getUser().enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                User user =new User("error","error");
                data.setValue(user);
            }
        });

    }




}
