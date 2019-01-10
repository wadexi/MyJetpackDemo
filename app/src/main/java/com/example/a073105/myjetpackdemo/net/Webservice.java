package com.example.a073105.myjetpackdemo.net;

import com.example.a073105.myjetpackdemo.bean.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Webservice {

    @GET("/user/wadexi")
    Call<User> getUser();


}
