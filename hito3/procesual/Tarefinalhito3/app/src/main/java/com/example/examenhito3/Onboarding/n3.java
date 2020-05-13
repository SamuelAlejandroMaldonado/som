package com.example.examenhito3.Onboarding;

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

import com.example.examenhito3.App.CalcBasica;
import com.example.examenhito3.App.CalcCientiffica;
import com.example.examenhito3.App.CalcCustom;
import com.example.examenhito3.R;


/**
 * A simple {@link Fragment} subclass.
 */

public class n3 extends Fragment
{

    private ViewPager viewPager;
    private View view;
    private Button  bti,d1,d2,d3,s1,s2,s3;
    private EditText etsel,etUser;

    public n3()
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
        view = inflater.inflate(R.layout.fragment_n3, container, false);
    }

    public void initializeComponents()
    {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);


        d1 = view.findViewById(R.id.d1);
        d2 = view.findViewById(R.id.d2);
        d3 = view.findViewById(R.id.d3);
        s1 = view.findViewById(R.id.s1);
        s2 = view.findViewById(R.id.s2);
       s3 = view.findViewById(R.id.s3);
        etsel = view.findViewById(R.id.etselect);
        etUser = view.findViewById(R.id.etUsername);
        bti = view.findViewById(R.id.btnIn);
    }

    public void eventClickAction()
    {
d1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "Calculadora con operaciones simples básica", Toast.LENGTH_SHORT).show();
    }
});
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones avanzadas", Toast.LENGTH_SHORT).show();
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones para programadores", Toast.LENGTH_SHORT).show();
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              etsel.setText("Basica");
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etsel.setText("Cientifica");
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etsel.setText("Custom");
            }
        });

        bti.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String selct = etsel.getText().toString().trim();
                String username = etUser.getText().toString().trim();

                if(username.equals("") || selct .equals(""))
                {
                    Toast.makeText(getActivity(), "Ingrese Select/Username", Toast.LENGTH_SHORT).show();
                }
                else if(selct.equals("Custom"))
                {
                    Intent intent = new Intent(getActivity(), CalcCustom.class);
                    intent.putExtra("US", username);
                    intent.putExtra("AS", selct);
                    startActivity(intent);
                    getActivity().finish();
                }
                else if(selct.equals("Basica"))
                {
                    Intent intent = new Intent(getActivity(), CalcBasica.class);
                    intent.putExtra("US", username);
                    intent.putExtra("AS", selct);
                    startActivity(intent);
                    getActivity().finish();
                }
                else if(selct.equals("Cientifica"))
                {
                    Intent intent = new Intent(getActivity(), CalcCientiffica.class);
                    intent.putExtra("US", username);
                    intent.putExtra("AS", selct);
                    startActivity(intent);
                    getActivity().finish();
                }
                else{
                    Toast.makeText(getActivity(), "Seleccione alguna calculadora", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
