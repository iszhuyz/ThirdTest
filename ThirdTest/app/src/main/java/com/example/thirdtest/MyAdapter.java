package com.example.thirdtest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<MyItem> listinfos;

    public MyAdapter(Context context, List<MyItem> listinfos){
        this.context =context;
        this.listinfos = listinfos;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listinfos.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return listinfos.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        convertView = LayoutInflater.from(context).inflate(R.layout.list_color, null);
        TextView tv = (TextView) convertView.findViewById(R.id.text1);
        MyItem persionInfo = listinfos.get(position);
        tv.setText(persionInfo.getNameString());
        return convertView;
    }
}