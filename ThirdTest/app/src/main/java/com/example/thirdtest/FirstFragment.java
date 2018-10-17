package com.example.thirdtest;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        TextView textView1 = (TextView) view.findViewById(R.id.text_12);
        TextView textView2 = (TextView) view.findViewById(R.id.text_13);
        TextView textView3 = (TextView) view.findViewById(R.id.text_14);
        TextView textView4 = (TextView) view.findViewById(R.id.text_15);
        TextView textView5 = (TextView) view.findViewById(R.id.text_16);
        TextView textView6 = (TextView) view.findViewById(R.id.text_17);
        TextView textView7 = (TextView) view.findViewById(R.id.text_18);
        TextView textView8 = (TextView) view.findViewById(R.id.text_19);
        TextView textView9 = (TextView) view.findViewById(R.id.text_1A);

        String deviceCategory =  Build.PRODUCT;
        String androidCategory  = new Build.VERSION().RELEASE;
        String softwareVersion = new Build.VERSION().INCREMENTAL;
        String macAddress = MacUtils.getMacAddr();
        String STBID = Build.SERIAL;
        String maab = Build.SERIAL;
        String csa = Build.MODEL;
        String tmma = Build.RADIO;
        String tma = Build.HARDWARE;

        textView1.setText("设备型号 ："+deviceCategory);
        textView2.setText("软件版本 ："+softwareVersion);
        textView3.setText("安卓版本 ："+androidCategory);
        textView4.setText("MAC地址 ："+macAddress);
        textView5.setText("STBID ："+STBID);
        textView6.setText("认证业务主地址 ：");
        textView7.setText("认证业务备地址 ：");
        textView8.setText("终端管理主地址 ：");
        textView9.setText("认证业务号 ：");


        return view;

    }

    /**
     * 获取Mac地址
     */
    public static class MacUtils {

        public static String getMacAddr() {
            try {
                List<NetworkInterface> all = Collections.list(NetworkInterface.getNetworkInterfaces());
                for (NetworkInterface nif : all) {
                    if (!nif.getName().equalsIgnoreCase("wlan0")) continue;

                    byte[] macBytes = nif.getHardwareAddress();
                    if (macBytes == null) {
                        return "";
                    }

                    StringBuilder res1 = new StringBuilder();
                    for (byte b : macBytes) {
                        res1.append(String.format("%02X:",b));
                    }

                    if (res1.length() > 0) {
                        res1.deleteCharAt(res1.length() - 1);
                    }
                    return res1.toString();
                }
            } catch (Exception ex) {
            }
            return "02:00:00:00:00:00";
        }

    }

}