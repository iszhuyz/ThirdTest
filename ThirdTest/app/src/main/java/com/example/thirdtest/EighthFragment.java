package com.example.thirdtest;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;
public class EighthFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
 // TODO Auto-generated method stub
         View view = inflater.inflate(R.layout.eighth_fragment, null);
         //此处如果用getactivity（），会造成闪退！！！
         final EditText editText = (EditText) view.findViewById(R.id.edit_81);
         view.findViewById(R.id.button_81).setOnClickListener(new View.OnClickListener() {
    @Override
 public void onClick(View arg0) {
// TODO Auto-generated method stub
        if (editText.getText().toString().equals("10086")){
            Intent intent = new Intent(getActivity(),DialogActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getActivity(), "您输入的密码有误", Toast.LENGTH_LONG).show();
        }

       }
    });
         return view;
   }
}






//public class EighthFragment extends Fragment {
//
//
//    private Button button;
//    private EditText editText;
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.eighth_fragment, null);
//        button = view.findViewById(R.id.button_81);
//        editText = view.findViewById(R.id.edit_81);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (editText.getText().toString().equals("10086")) {
//                    Intent intent = new Intent(getActivity(), DialogActivity.class);
//                    startActivity(intent);
//                } else {
//                    Toast.makeText(getActivity(), "您输入的密码有误", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//        return super.onCreateView(inflater, container, savedInstanceState);
//    }
//}

//        button.setOnClickListener(new View.OnClickListener() {
//            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
//            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(getActivity(), DialogActivity.class);
//
//            }
//
//            });
//        return inflater.inflate(R.layout.eighth_fragment, container, false);


//public class EighthFragment extends Fragment {
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//
//        return inflater.inflate(R.layout.eighth_fragment, container, false);
//
//    }
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        final EditText editText = getActivity().findViewById(R.id.edit_81);
//        Button button =getActivity().findViewById(R.id.button_81);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
//            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
//            @Override
//            public void onClick(View v) {
//                if (editText.getText().toString().equals("10086")){
//                    Intent intent = new Intent(getActivity(),DialogActivity.class);
//                    startActivityForResult( intent,  0);
//            }
//
//                else {
//                    Toast.makeText(getActivity(), "您输入的密码有误", Toast.LENGTH_LONG).show();
//                }
//
//            }
//        });
//    }}

