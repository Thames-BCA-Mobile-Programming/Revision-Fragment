package com.api.fragmentdemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    LoginFragment loginFragment;
    ResultFragment resultFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginFragment = new LoginFragment();
        resultFragment = new ResultFragment();
        if(savedInstanceState==null){
            FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().add(R.id.fragment_login,loginFragment)
                        .commit();
                fragmentManager.beginTransaction().add(R.id.fragment_result,resultFragment)
                        .commit();

        }



    }
}