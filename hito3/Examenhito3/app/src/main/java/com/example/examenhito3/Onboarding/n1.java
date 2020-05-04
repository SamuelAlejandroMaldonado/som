package com.example.examenhito3.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.examenhito3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class n1 extends Fragment {
    private ViewPager viewPager;
    private View view;
  TextView   textNextFace;
  Button Next;
    public n1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialize viewpager from main activity
        initializeInflater(inflater, container);

        //initialize components
        initializeComponents();

        //add click event to text Next and prev text
        addClickNextAndPrev();

        //return
        return view;
    }

    public void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_n1, container, false);
    }

    public void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);

        textNextFace = view.findViewById(R.id.textInc);
        Next=view.findViewById(R.id.skip1);
    }

    public void addClickNextAndPrev() {

        textNextFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
    }
}