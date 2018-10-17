package com.example.thirdtest;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FifthFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fifth_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView textView1 = (TextView) getActivity().findViewById(R.id.text_52);
        TextView textView2 = (TextView) getActivity().findViewById(R.id.text_54);

        textView1.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction= getFragmentManager().beginTransaction();//Fragment中

                transaction.replace(R.id.right_layout, new FifthOneFragment());
// transaction.hide(MyTaskGridViewFragment.this);
// transaction.add(R.id.content, myTaskFragment, "myTaskFragment");
                transaction.addToBackStack(null);
                transaction.commit();

            }});
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}