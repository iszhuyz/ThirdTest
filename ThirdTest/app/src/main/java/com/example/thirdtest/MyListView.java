package com.example.thirdtest;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ListView;

public class MyListView extends ListView {


    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override

    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect){
        int lastSelectItem = getSelectedItemPosition();

        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus){
            setSelection(lastSelectItem);
        }


    }
}

