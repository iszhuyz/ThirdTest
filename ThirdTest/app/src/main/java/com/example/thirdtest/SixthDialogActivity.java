package com.example.thirdtest;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class SixthDialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_dialog);

        Button button1 = (Button) this.findViewById(R.id.button_611);
        Button button2 = (Button) this.findViewById(R.id.button_612);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
