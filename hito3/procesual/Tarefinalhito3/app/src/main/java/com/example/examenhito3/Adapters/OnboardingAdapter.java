package com.example.examenhito3.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.examenhito3.Onboarding.n1;
import com.example.examenhito3.Onboarding.n2;
import com.example.examenhito3.Onboarding.n3;


public class OnboardingAdapter extends FragmentPagerAdapter
{
    public OnboardingAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new n1();
            case 1:
                return new n2();
            case 2:
                return new n3();

            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return 3;
    }
}
