package com.example.ericksson.tallerandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.ericksson.tallerandroid.R;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @OnClick(R.id.button_listo)
    public void buttonListo(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}