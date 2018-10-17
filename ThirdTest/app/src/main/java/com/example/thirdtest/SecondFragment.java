package com.example.thirdtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.second_fragment, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView textView1 = (TextView) getActivity().findViewById(R.id.text_22);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction  transaction= getFragmentManager().beginTransaction();//Fragment中

                transaction.replace(R.id.right_layout, new SecondOneFragment());

                transaction.addToBackStack(null);
                transaction.commit();
          }
        });
        TextView textView2 = (TextView) getActivity().findViewById(R.id.text_23);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction  transaction= getFragmentManager().beginTransaction();//Fragment中

                transaction.replace(R.id.right_layout, new SecondTwoFragment());

                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

    }
}

