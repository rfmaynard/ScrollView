package com.example.ryan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //android studio wanted ScrollView to be final and initialize it as well.
        //here we initialize the button(s) and view from activity_main.xml
        Button jump = findViewById(R.id.jumpTop);
        Button downOne = findViewById(R.id.downPage);
        Button upOne = findViewById(R.id.upPage);
        final ScrollView sv = findViewById(R.id.sv);

        //set an onClickListener for when we want to jump to the top
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the height of the ScrollView to help determine where to jump
                int height = sv.getHeight();
                sv.smoothScrollTo(0, height - height);
                //height minus the height to indicate we want to go to the top
                // if we want to go to the bottom, we just use height
            }
        });

        //set an onClickListener for going down one page
        downOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //View.FOCUS_DOWN allows us to travel down one page exactly, on any supported device.
                //by page, we refer to the height of the screen.
                sv.pageScroll(View.FOCUS_DOWN);
            }
        });

        //set an onClickListener for going up one page
        upOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //View.FOCUS_UP allows us to travel up one page exactly, on any supported device.
                //by page, we refer to the height of the screen.
                sv.pageScroll(View.FOCUS_UP);
            }
        });
    }
}
