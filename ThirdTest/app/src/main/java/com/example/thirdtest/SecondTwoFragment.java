package com.example.thirdtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondTwoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_two_fragment, container, false);
        return view;

    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView textView = (TextView) getActivity().findViewById(R.id.text_222);
        final ImageView imageView = (ImageView) getActivity().findViewById(R.id.photo_222);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (imageView.getDrawable().getCurrent().getConstantState().equals(getResources().getDrawable(R.drawable.checkbox_off).getConstantState())){
                imageView.setImageResource(R.drawable.checkbox_on);
            }
                else if(imageView.getDrawable().getCurrent().getConstantState().equals(getResources().getDrawable(R.drawable.checkbox_on).getConstantState())) {
                    imageView.setImageResource(R.drawable.checkbox_off);
                }
            }
        });
}}