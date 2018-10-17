package com.example.thirdtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.DhcpInfo;
import android.net.NetworkUtils;
import android.net.ethernet.EthernetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdFragment extends Fragment {

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_fragment, container, false);

        Button button1 = (Button) view.findViewById(R.id.button_31);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "正在连接请稍后...", Toast.LENGTH_LONG).show();
            }
        });
        return view;

    }





    class ReceiverBroadcast extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            EthernetManager ethernetManager = (EthernetManager)context.getSystemService(
                    Context.ETHERNET_SERVICE);
            DhcpInfo dhcpInfo = ethernetManager.getDhcpInfo();

            TextView textView1 = (TextView) getActivity().findViewById(R.id.text_32);
            TextView textView2 = (TextView) getActivity().findViewById(R.id.text_33);
            TextView textView3 = (TextView) getActivity().findViewById(R.id.text_34);
            EditText editText1 = (EditText) getActivity().findViewById(R.id.edit_31);
            EditText editText2 = (EditText) getActivity().findViewById(R.id.edit_32);

            textView1.setText("IP地址：   "+NetworkUtils.intToInetAddress(dhcpInfo.ipAddress).getHostAddress());
            textView2.setText("子网掩码：   "+NetworkUtils.intToInetAddress(dhcpInfo.gateway).getHostAddress());
            textView3.setText("默认网关：   "+NetworkUtils.intToInetAddress(dhcpInfo.netmask).getHostAddress());
            editText1.setText(NetworkUtils.intToInetAddress(dhcpInfo.dns1).getHostAddress());
            editText2.setText(NetworkUtils.intToInetAddress(dhcpInfo.dns2).getHostAddress());
        }
    }

    @Override
    public void onDestroyView() {
        getActivity().unregisterReceiver(networkChangeReceiver);
        super.onDestroyView();
    }
}