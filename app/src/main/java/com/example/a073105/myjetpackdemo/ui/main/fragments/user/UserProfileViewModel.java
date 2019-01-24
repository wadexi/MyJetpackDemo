package com.example.a073105.myjetpackdemo.ui.main.fragments.user;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.example.a073105.myjetpackdemo.bean.User;
import com.example.a073105.myjetpackdemo.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserProfileViewModel extends ViewModel {

    public static final String TAG = UserProfileViewModel.class.getSimpleName();

//    private String userId;
    private MutableLiveData<User> user = new MutableLiveData<>();


    private UserRepository userRepository;


    @Inject
    public UserProfileViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
        if(userRepository == null){
            Log.i(TAG, "userRepository == null ");
        }else{
            Log.i(TAG, "userRepository != null ");
        }
    }





    public void init(String userId) {
//        if (this.user != null) {
//            // ViewModel is created per Fragment so
//            // we know the userId won't change
//            return;
//        }


        userRepository.getUser(userId,user);
    }

    public LiveData<User> getUser(){
        return user;
    }

}
