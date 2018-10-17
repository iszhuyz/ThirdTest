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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;


public class FourthOneFragment extends Fragment {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.fourth_one_fragment, container, false);
        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextClock textClock1 = (TextClock) getActivity().findViewById(R.id.time_411);
        TextClock textClock2 = (TextClock) getActivity().findViewById(R.id.time_412);
        TextClock textClock3 = (TextClock) getActivity().findViewById(R.id.time_413);
        TextClock textClock4 = (TextClock) getActivity().findViewById(R.id.time_414);

        pref = getActivity().getSharedPreferences("check_stateone", Context.MODE_PRIVATE);
//        final SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getActivity());
        final int check1 = pref.getInt("check_state",1);
        final int check2 = check1;

        final ImageView imageView1 = (ImageView) getActivity().findViewById(R.id.photo_412);
        final ImageView imageView2 = (ImageView) getActivity().findViewById(R.id.photo_414);
        final ImageView imageView3 = (ImageView) getActivity().findViewById(R.id.photo_416);
        final ImageView imageView4 = (ImageView) getActivity().findViewById(R.id.photo_418);

        if (check1 == 1) {
            imageView1.setImageResource(R.drawable.checkbox_on);
            imageView2.setImageResource(R.drawable.checkbox_off);
            imageView3.setImageResource(R.drawable.checkbox_off);
            imageView4.setImageResource(R.drawable.checkbox_off);
        }
        else if (check1 == 2) {
            imageView1.setImageResource(R.drawable.checkbox_off);
            imageView2.setImageResource(R.drawable.checkbox_on);
            imageView3.setImageResource(R.drawable.checkbox_off);
            imageView4.setImageResource(R.drawable.checkbox_off);
        }
        else if (check1 == 3) {
            imageView1.setImageResource(R.drawable.checkbox_off);
            imageView2.setImageResource(R.drawable.checkbox_off);
            imageView3.setImageResource(R.drawable.checkbox_on);
            imageView4.setImageResource(R.drawable.checkbox_off);
        }
        else if (check1 == 4){
            imageView1.setImageResource(R.drawable.checkbox_off);
            imageView2.setImageResource(R.drawable.checkbox_off);
            imageView3.setImageResource(R.drawable.checkbox_off);
            imageView4.setImageResource(R.drawable.checkbox_on);
        }
        else{


        }

        textClock1.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)

            public void onClick(View v) {


                if (check2 != 1) {
                    imageView1.setImageResource(R.drawable.checkbox_on);
                    imageView2.setImageResource(R.drawable.checkbox_off);
                    imageView3.setImageResource(R.drawable.checkbox_off);
                    imageView4.setImageResource(R.drawable.checkbox_off);
                    editor = pref.edit();
                    editor.putInt("check_state", 1);

                }
                else{


                }
                editor.apply();
                getActivity().onBackPressed();


            }
        });
        textClock2.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            public void onClick(View v) {

                if (check2 != 2) {
                    imageView1.setImageResource(R.drawable.checkbox_off);
                    imageView2.setImageResource(R.drawable.checkbox_on);
                    imageView3.setImageResource(R.drawable.checkbox_off);
                    imageView4.setImageResource(R.drawable.checkbox_off);
                    editor = pref.edit();
                    editor.putInt("check_state", 2);

                }
                else{


                }
                editor.apply();
                getActivity().onBackPressed();
            }
        });
        textClock3.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            public void onClick(View v) {

                if (check2 != 3) {
                    imageView1.setImageResource(R.drawable.checkbox_off);
                    imageView2.setImageResource(R.drawable.checkbox_off);
                    imageView3.setImageResource(R.drawable.checkbox_on);
                    imageView4.setImageResource(R.drawable.checkbox_off);
                    editor = pref.edit();
                    editor.putInt("check_state", 3);

                }
                else{


                }
                editor.apply();
                getActivity().onBackPressed();
            }
        });
        textClock4.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            public void onClick(View v) {

                if (check2 != 4) {

                    imageView1.setImageResource(R.drawable.checkbox_off);
                    imageView2.setImageResource(R.drawable.checkbox_off);
                    imageView3.setImageResource(R.drawable.checkbox_off);
                    imageView4.setImageResource(R.drawable.checkbox_on);
                    editor = pref.edit();
                    editor.putInt("check_state", 4);

                }
                else{


                }

                editor.apply();
                getActivity().onBackPressed();
            }
        });

    }}