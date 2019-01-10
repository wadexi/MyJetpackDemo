package com.example.a073105.myjetpackdemo.user;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a073105.myjetpackdemo.MyApplication;
import com.example.a073105.myjetpackdemo.R;
import com.example.a073105.myjetpackdemo.bean.User;
import com.example.a073105.myjetpackdemo.dagger.component.DaggerRepositoryComponet;
import com.example.a073105.myjetpackdemo.dagger.component.RepositoryComponet;


/**
 * A placeholder fragment containing a simple view.
 */
public class UserProfileFragment extends Fragment {

    public static final String UID_KEY = "uid";
    private UserProfileViewModel viewModel;

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
//        RepositoryComponet repositoryComponet = DaggerRepositoryComponet.builder()
//                .appComponent(MyApplication.INSTANCE.getAppComponent())
//                .build();
//        repositoryComponet.inject(this);

//        String userId = getArguments().getString(UID_KEY);

        viewModel = ViewModelProviders.of(this).get(UserProfileViewModel.class);
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
