package com.api.fragmentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginFragment extends Fragment {
    EditText loginEt,passwordEt;
    Button loginButton;
//    EditText passwordEt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_login, container, false);
        loginEt = v.findViewById(R.id.login_email_et);
        passwordEt = v.findViewById(R.id.login_email_password);
        loginButton = v.findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Email: "+loginEt.getText() +"\t" +"Password: "+ passwordEt.getText(), Toast.LENGTH_SHORT).show();
                //TO send data to Result Fragment
                ResultFragment resultFragment =new ResultFragment();

                Bundle bundle =new Bundle();
                bundle.putString("email",loginEt.getText().toString());
                bundle.putString("password",passwordEt.getText().toString());
                resultFragment.setArguments(bundle);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().add(R.id.fragment_result,resultFragment).commit();

                loginEt.setText("");
                passwordEt.setText("");

//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                fragmentManager.beginTransaction()
//                        .replace(R.id.fragment_result, resultFragment)
//                        .addToBackStack(null)
//                        .commit();

            }
        });
        return v;
    }
}