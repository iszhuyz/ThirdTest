package com.example.thirdtest;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextClock;

import static android.content.Context.MODE_PRIVATE;

public class FourthFragment extends Fragment {

    private SharedPreferences pref;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fourth_fragment, container, false);
        return view;
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final TextClock textClock = (TextClock) getActivity().findViewById(R.id.time_41);
        TextClock textClock1 = (TextClock) getActivity().findViewById(R.id.time_42);
        final ImageView imageView = (ImageView) getActivity().findViewById(R.id.photo_47);
//  和二级碎片存储于同一文件夹，读取二级存储信息选择格式
        pref = getActivity().getSharedPreferences("check_stateone", Context.MODE_PRIVATE);
        final int check1 = pref.getInt("check_state",1);
        boolean check = pref.getBoolean("check_state1",false);

        if (check == true){
            textClock.setFormat24Hour("             使用24小时格式                 HH:mm");
            textClock.setFormat12Hour("             使用24小时格式                 HH:mm");
            imageView.setImageResource(R.drawable.checkbox_on);
        }
        else if (check == false){
            textClock.setFormat24Hour("             使用24小时格式                 aah:mm");
            textClock.setFormat12Hour("             使用24小时格式                 aah:mm");
            imageView.setImageResource(R.drawable.checkbox_off);
        }
        else{}
        if(check1 == 1){
            textClock1.setFormat24Hour("             选择日期格式                 yyyy-M-dd");
            textClock1.setFormat12Hour("             选择日期格式                 yyyy-M-dd");
        }
        else if(check1 == 2){
            textClock1.setFormat24Hour("             选择日期格式                 MM-dd-yyyy");
            textClock1.setFormat12Hour("             选择日期格式                 MM-dd-yyyy");
        }
        else if(check1 == 3){
            textClock1.setFormat24Hour("             选择日期格式                 dd-MM-yyyy");
            textClock1.setFormat12Hour("             选择日期格式                 dd-MM-yyyy");
        }
        else if(check1 == 4){
            textClock1.setFormat24Hour("             选择日期格式                 yyyy-dd-MM");
            textClock1.setFormat12Hour("             选择日期格式                 yyyy-dd-MM");
        }
        else{}

        textClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = pref.edit();
                if (imageView.getDrawable().getCurrent().getConstantState().equals(getResources().getDrawable(R.drawable.checkbox_off).getConstantState())){
                    imageView.setImageResource(R.drawable.checkbox_on);
                    editor.putBoolean("check_state1", true);
                    textClock.setFormat24Hour("             使用24小时格式                 HH:mm");
                    textClock.setFormat12Hour("             使用24小时格式                 HH:mm");
                }
                else if(imageView.getDrawable().getCurrent().getConstantState().equals(getResources().getDrawable(R.drawable.checkbox_on).getConstantState())) {
                    imageView.setImageResource(R.drawable.checkbox_off);

                    editor.putBoolean("check_state1", false);
                    textClock.setFormat24Hour("             使用24小时格式                 aah:mm");
                    textClock.setFormat12Hour("             使用24小时格式                 aah:mm");
                }

            editor.apply();
            }
        });
        textClock1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction transaction= getFragmentManager().beginTransaction();//Fragment中
                transaction.replace(R.id.right_layout, new FourthOneFragment());
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }}