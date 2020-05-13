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
public class n2 extends Fragment {
    private ViewPager viewPager;
    private View view;
    TextView textNextFace2;
    Button Next2;
    public n2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initializeInflater(inflater, container);

        //initialize components
        initializeComponents();

        //add click event to text Next and prev text
        addClickNextAndPrev();

        //return
        return view;
    }
    public void initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_n2, container, false);
    }

    public void initializeComponents() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);

        textNextFace2 = view.findViewById(R.id.textInc2);
        Next2=view.findViewById(R.id.skip2);
    }

    public void addClickNextAndPrev() {

        textNextFace2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
        Next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
    }
}
