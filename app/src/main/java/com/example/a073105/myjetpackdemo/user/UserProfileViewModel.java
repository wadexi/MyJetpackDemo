package com.example.a073105.myjetpackdemo.user;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.a073105.myjetpackdemo.bean.User;
import com.example.a073105.myjetpackdemo.repository.UserRepository;

import javax.inject.Inject;

public class UserProfileViewModel extends ViewModel {

//    private String userId;
    private LiveData<User> user = new MutableLiveData<>();

    public UserRepository userRepository;

//    public void  init(String userId){
//        this.userId = userId;
//    }

//    public UserProfileViewModel(){
//
//    }

    @Inject
    public UserProfileViewModel(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public void init(String userId) {
//        if (this.user != null) {
//            // ViewModel is created per Fragment so
//            // we know the userId won't change
//            return;
//        }
        user = userRepository.getUser(userId);
    }

    public LiveData<User> getUser(){
        return user;
    }

}
