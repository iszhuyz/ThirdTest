package com.example.thirdtest;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SeventhOneFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.seventh_one_fragment, container, false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final TextView textView0 = (TextView) getActivity().findViewById(R.id.text_714);
        TextView textView1 = (TextView) getActivity().findViewById(R.id.text_715);
        TextView textView2 = (TextView) getActivity().findViewById(R.id.text_712);



        final ImageView imageView0 = (ImageView) getActivity().findViewById(R.id.photo_713);
        final ImageView imageView1 = (ImageView) getActivity().findViewById(R.id.photo_715);
        textView2.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction= getFragmentManager().beginTransaction();
                transaction.replace(R.id.right_layout, new SeventhOne1Fragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        textView0.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                if (imageView0.getDrawable().getCurrent().getConstantState().
                equals(getResources().getDrawable(R.drawable.checkbox_off).getConstantState()))
                {
                    imageView0.setImageResource(R.drawable.checkbox_on);
                }
                else if(imageView0.getDrawable().getCurrent().getConstantState().
                equals(getResources().getDrawable(R.drawable.checkbox_on).getConstantState()))
                {
                    imageView0.setImageResource(R.drawable.checkbox_off);
                }
             }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                if (imageView1.getDrawable().getCurrent().getConstantState().equals(getResources().
                getDrawable(R.drawable.checkbox_off).getConstantState()))
                {
                    imageView1.setImageResource(R.drawable.checkbox_on);
                }
                else if(imageView1.getDrawable().getCurrent().getConstantState().equals(getResources().
                getDrawable(R.drawable.checkbox_on).getConstantState()))
                {
                    imageView1.setImageResource(R.drawable.checkbox_off);
                }
            }
        });
    }
}