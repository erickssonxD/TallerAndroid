package com.example.ericksson.tallerandroid.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ericksson.tallerandroid.R;
import com.example.ericksson.tallerandroid.Util.Constants;
import com.example.ericksson.tallerandroid.Util.TallerActions;

public class ServiceCallerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_caller);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent serviceIntent = new Intent(this, IntentServiceEjemplo.class)
                .setAction(TallerActions.ACTION_MULTIPLY)
                .putExtra(Constants.NUMERO_1, 123)
                .putExtra(Constants.NUMERO_2, 321);
        startService(serviceIntent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(resultReceiver, new IntentFilter(TallerActions.ACTION_RECEIVE_RESULT));

    }
    @Override
    protected void onPause() {
        unregisterReceiver(resultReceiver);
        super.onPause();
    }


    BroadcastReceiver resultReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int result = intent.getExtras().getInt(Constants.RESULT);
        }
    };

    @Override
    protected void onStop() {
        super.onStop();
    }
}
