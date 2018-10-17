package com.example.thirdtest;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.NetworkUtils;
import android.net.ethernet.EthernetManager;
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
import android.widget.TextView;
import android.widget.Toast;


public class SecondOne2Fragment extends Fragment {
    private ReceiverBroadcast networkChangeReceiver;
    //  NETWORK_STATE_CHANGED_ACTION

    @Override
    public void onAttach(Context context) {
        networkChangeReceiver = new ReceiverBroadcast();
        IntentFilter filter = new IntentFilter();
        filter.addAction(EthernetManager.ETHERNET_STATE_CHANGED_ACTION);
        filter.addAction(EthernetManager.NETWORK_STATE_CHANGED_ACTION);

        //只有持有相同的action的接受者才能接收此广播  
        getActivity().registerReceiver(networkChangeReceiver, filter);
        super.onAttach(context);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.second_one2_fragment, container,false);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button0 = (Button) getActivity().findViewById(R.id.button_2121);
        Button button1 = (Button) getActivity().findViewById(R.id.button_2122);
        final EditText editText0 = (EditText) getActivity().findViewById(R.id.edit_2121);
        final EditText editText1 = (EditText) getActivity().findViewById(R.id.edit_2122);
        final EditText editText2 = (EditText) getActivity().findViewById(R.id.edit_2123);
        final EditText editText3 = (EditText) getActivity().findViewById(R.id.edit_2124);
        final EditText editText4 = (EditText) getActivity().findViewById(R.id.edit_2125);

        button0.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                EthernetManager ethernetManager = (EthernetManager)getActivity().getSystemService(
            getActivity().ETHERNET_SERVICE);
    DhcpInfo dhcpInfo = ethernetManager.getDhcpInfo();

                if (editText0.getText().toString().equals("") || editText1.getText().toString().equals("")||
                editText2.getText().toString().equals("") ||editText3.getText().toString().equals("") ||
                editText4.getText().toString().equals("")) {
                    Toast.makeText(getActivity(), "输入信息不能为空！", Toast.LENGTH_SHORT).show();
                    editText0.setText(NetworkUtils.intToInetAddress(dhcpInfo.ipAddress).getHostAddress());
                    editText1.setText(NetworkUtils.intToInetAddress(dhcpInfo.gateway).getHostAddress());
                    editText2.setText(NetworkUtils.intToInetAddress(dhcpInfo.netmask).getHostAddress());
                    editText3.setText(NetworkUtils.intToInetAddress(dhcpInfo.dns1).getHostAddress());
                    editText4.setText(NetworkUtils.intToInetAddress(dhcpInfo.dns2).getHostAddress());
                    return;
                } else {
                    Toast.makeText(getActivity(), "正在连接请稍后...", Toast.LENGTH_LONG).show();

                }

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


    }class ReceiverBroadcast extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            EthernetManager ethernetManager = (EthernetManager)context.getSystemService(
                    Context.ETHERNET_SERVICE);
            DhcpInfo dhcpInfo = ethernetManager.getDhcpInfo();

            final EditText editText0 = (EditText) getActivity().findViewById(R.id.edit_2121);
            final EditText editText1 = (EditText) getActivity().findViewById(R.id.edit_2122);
            final EditText editText2 = (EditText) getActivity().findViewById(R.id.edit_2123);
            final EditText editText3 = (EditText) getActivity().findViewById(R.id.edit_2124);
            final EditText editText4 = (EditText) getActivity().findViewById(R.id.edit_2125);

            editText0.setText(NetworkUtils.intToInetAddress(dhcpInfo.ipAddress).getHostAddress());
            editText1.setText(NetworkUtils.intToInetAddress(dhcpInfo.gateway).getHostAddress());
            editText2.setText(NetworkUtils.intToInetAddress(dhcpInfo.netmask).getHostAddress());
            editText3.setText(NetworkUtils.intToInetAddress(dhcpInfo.dns1).getHostAddress());
            editText4.setText(NetworkUtils.intToInetAddress(dhcpInfo.dns2).getHostAddress());
        }
    }

    @Override
    public void onDestroyView() {
        getActivity().unregisterReceiver(networkChangeReceiver);
        super.onDestroyView();
    }}