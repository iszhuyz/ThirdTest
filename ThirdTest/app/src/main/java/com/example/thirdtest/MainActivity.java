package com.example.thirdtest;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements AdapterView.OnItemSelectedListener {
    List<MyItem> listinfoInfos=new ArrayList<>();
    private MyListView listView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }


    private void initView() {
        MyItem myItem0 = new MyItem("关于本机");
        listinfoInfos.add(myItem0);
        MyItem myItem1 = new MyItem("网络配置");
        listinfoInfos.add(myItem1);
        MyItem myItem2 = new MyItem("网络信息");
        listinfoInfos.add(myItem2);
        MyItem myItem3 = new MyItem("日期和时间");
        listinfoInfos.add(myItem3);
        MyItem myItem4 = new MyItem("显示");
        listinfoInfos.add(myItem4);
        MyItem myItem5 = new MyItem("存储信息");
        listinfoInfos.add(myItem5);
        MyItem myItem6 = new MyItem("高级设置");
        listinfoInfos.add(myItem6);
        MyItem myItem7 = new MyItem("恢复出厂设置");
        listinfoInfos.add(myItem7);

        listView =  (MyListView) findViewById(R.id.list_view);
        listinfoInfos.get(0).setChick(true);
        adapter = new MyAdapter(this, listinfoInfos);
        listView.setAdapter(adapter);
        replaceFragment(new FirstFragment());
        listView.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch((int) id){
            case 0:
                replaceFragment(new FirstFragment());
                break;
            case 1:
                replaceFragment(new SecondFragment());
                break;
            case 2:

                replaceFragment(new ThirdFragment());
                break;
            case 3:

                replaceFragment(new FourthFragment());
                break;
            case 4:

                replaceFragment(new FifthFragment());
                break;

            case 5:

                replaceFragment(new SixthFragment());
                break;
            case 6:
                replaceFragment(new SeventhFragment());
                break;
            case 7:

                replaceFragment(new EighthFragment());
//                Intent intent = new Intent(this,Main2Activity.class);
//                startActivity(intent);
                break;

            default:
                break;
        }

        adapter.notifyDataSetChanged();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction= fragmentManager.beginTransaction();
        transaction.replace(R.id.right_layout, fragment);
        transaction.commit();
    }
}


