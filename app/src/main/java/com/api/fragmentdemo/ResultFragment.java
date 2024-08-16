package com.api.fragmentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResultFragment extends Fragment {
String emailFetechedFromLoginFragment;
String passwordFetechedFromLoginFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            Bundle args = getArguments();
            emailFetechedFromLoginFragment = args.getString("email");
            passwordFetechedFromLoginFragment = args.getString("password");

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView;
        View myView=  inflater.inflate(R.layout.fragment_result, container, false);
        textView = myView.findViewById(R.id.result_tv);
        if(emailFetechedFromLoginFragment == null || passwordFetechedFromLoginFragment ==null){
            textView.setText("Press Login to send data");
        }else{
            textView.setText("Email is :" +emailFetechedFromLoginFragment +"\n"+ "Password is :"+passwordFetechedFromLoginFragment);
        }


        return myView;
    }
}