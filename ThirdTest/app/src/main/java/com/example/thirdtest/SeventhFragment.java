package com.example.thirdtest;

import android.annotation.TargetApi;
import android.app.AlertDialog;
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
import android.widget.TextView;
import android.widget.Toast;

public class SeventhFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.seventh_fragment, container, false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final EditText editText = (EditText) getActivity().findViewById(R.id.edit_71);
        Button button =(Button) getActivity().findViewById(R.id.button_71);

        button.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("10086")){
                    FragmentTransaction transaction= getFragmentManager().beginTransaction();
                    transaction.replace(R.id.right_layout, new SeventhOneFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();
                }

                else {
                    Toast.makeText(getActivity(), "您输入的密码有误", Toast.LENGTH_LONG).show();
                }

            }
        });
    }}
