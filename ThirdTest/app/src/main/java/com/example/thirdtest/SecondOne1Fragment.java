package com.example.thirdtest;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;


public class SecondOne1Fragment extends Fragment {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.second_one1_fragment, container,false);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        pref = PreferenceManager.getDefaultSharedPreferences(getActivity());
        Button button0 = (Button) getActivity().findViewById(R.id.button_2111);
        Button button1 = (Button)getActivity().findViewById(R.id.button_2112);

        final EditText editText0 = (EditText) getActivity().findViewById(R.id.edit_2111);
        final EditText editText1 = (EditText) getActivity().findViewById(R.id.edit_2112);

        String account = pref.getString("account","");
        String password = pref.getString("password","");
        editText0.setText(account);
        editText1.setText(password);


        button0.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                String account = editText0.getText().toString();
                String password = editText1.getText().toString();
                if (account.equals("") ||password.equals("")) {
                    Toast.makeText(getActivity(), "账户名和密码不能为空，请重新输入。", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    Toast.makeText(getActivity(), "正在连接请稍后...", Toast.LENGTH_LONG).show();
                    editor = pref.edit();
                    editor.putString("account", account);
                    editor.putString("password", password);

                }
                editor.apply();
            }});
            button1.setOnClickListener(new View.OnClickListener() {
                @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
                @Override
                public void onClick(View v) {
                    //getFragmentManager().popBackStack();
                    getActivity().onBackPressed();//销毁自己

                    }


            }
        );
    }
//    @Override
//    public void onResume() {
//        final RadioButton radioButton = getActivity().findViewById(R.id.radiobutton_211);
//
//        super.onResume();
//
//        getView().setFocusableInTouchMode(true);
//
//        getView().setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN && i == KeyEvent.KEYCODE_BACK){
//                    getFragmentManager().popBackStack();
//
//                    return true;
//                }
//                return false;
//            }
//        });
//    }
}
