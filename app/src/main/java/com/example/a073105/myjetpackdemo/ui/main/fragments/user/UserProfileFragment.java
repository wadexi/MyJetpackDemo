package com.example.a073105.myjetpackdemo.ui.main.fragments.user;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a073105.myjetpackdemo.R;
import com.example.a073105.myjetpackdemo.bean.User;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


/**
 * A placeholder fragment containing a simple view.
 */
public class UserProfileFragment extends DaggerFragment {

    public static final String UID_KEY = "uid";
    private UserProfileViewModel viewModel;

    @Inject
    public ViewModelProvider.Factory viewModelFactory;

    public UserProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        String userId = getArguments().getString(UID_KEY);

        viewModel = ViewModelProviders.of(this,viewModelFactory).get(UserProfileViewModel.class);
//        viewModel.init(userId);
        viewModel.getUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                Log.e("test",user.toString());
            }
        });

        viewModel.init("");

    }
}
