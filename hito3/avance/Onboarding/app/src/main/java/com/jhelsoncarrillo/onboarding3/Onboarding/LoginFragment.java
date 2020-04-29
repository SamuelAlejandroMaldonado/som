package com.jhelsoncarrillo.onboarding3.Onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jhelsoncarrillo.onboarding3.App.App;
import com.jhelsoncarrillo.onboarding3.R;

/**
 * A simple {@link Fragment} subclass.
 */

public class LoginFragment extends Fragment
{
    private TextView textPrev;
    private ViewPager viewPager;
    private View view;
    private Button btLogin, btRegister;
    private EditText etUsername, etPassword;

    public LoginFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //initialize viewpager from main activity
        initializeInflater(inflater, container);

        //initialize components
        initializeComponents();

        //add click event to text Next and prev text
        eventClickAction();

        //return
        return view;
    }

    public void initializeInflater(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

    public void initializeComponents()
    {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textPrev = view.findViewById(R.id.textInc);

        etUsername = view.findViewById(R.id.etUsername);
        etPassword = view.findViewById(R.id.etPassword);

        btLogin = view.findViewById(R.id.btLogin);
        btRegister = view.findViewById(R.id.btRegister);
    }

    public void eventClickAction()
    {

        textPrev.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewPager.setCurrentItem(0);
            }
        });

        btLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if(username.equals("") || password.equals(""))
                {
                    Toast.makeText(getActivity(), "Ingrese el username/password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(getActivity(), App.class);
                    intent.putExtra("USERNAME", username);
                    intent.putExtra("PASSWORD", password);
                    startActivity(intent);
                    getActivity().finish();
                }


            }
        });
    }
}
