package com.example.ericksson.tallerandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        Intent intent = new Intent(this, ActivityRetrofit.class);
        startActivity(intent);
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
