package com.example.thirdtest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SecondOneFragment extends Fragment{

//    @Override
//    public void onResume() {
//        super.onResume();
//        MyListView listView = getView().findViewById(R.id.list_view);
//        listView.setFocusable(false);
//
//    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.second_one_fragment, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RadioButton radioButton =(RadioButton) getActivity().findViewById(R.id.radiobutton_211);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment videoFragment = new SecondOneFragment();
//                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//                transaction.add(R.id.right_layout, videoFragment).commit();
//                Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_LONG).show();
//                if(null != SecondFragment){
//
//                    transaction.hide(aFragment);
//
//                }
//
//                if (bFragment == null) {
//                    bFragment = new BFragment();
//                    transaction.add(R.id.content, bFragment);
//                } else {
//                    transaction.show(bFragment);
//                }
//
//                transaction.commit();
                FragmentTransaction  transaction= getFragmentManager().beginTransaction();//Fragment中

                transaction.replace(R.id.right_layout, new SecondOne1Fragment());
// transaction.hide(MyTaskGridViewFragment.this);
// transaction.add(R.id.content, myTaskFragment, "myTaskFragment");
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        RadioButton radioButton1 =(RadioButton) getActivity().findViewById(R.id.radiobutton_213);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Fragment videoFragment = new SecondOneFragment();
//                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//                transaction.add(R.id.right_layout, videoFragment).commit();
//                Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_LONG).show();
//                if(null != SecondFragment){
//
//                    transaction.hide(aFragment);
//
//                }
//
//                if (bFragment == null) {
//                    bFragment = new BFragment();
//                    transaction.add(R.id.content, bFragment);
//                } else {
//                    transaction.show(bFragment);
//                }
//
//                transaction.commit();
                FragmentTransaction  transaction= getFragmentManager().beginTransaction();//Fragment中

                transaction.replace(R.id.right_layout, new SecondOne2Fragment());
// transaction.hide(MyTaskGridViewFragment.this);
// transaction.add(R.id.content, myTaskFragment, "myTaskFragment");
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
//    @Override
////    public void onDetach() {
////        super.onDetach();
////        getActivity().findViewById(R.id.text_22).requestFocus();
////    }
}



