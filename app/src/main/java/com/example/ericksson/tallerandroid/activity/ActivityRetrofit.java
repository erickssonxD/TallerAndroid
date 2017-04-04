package com.example.ericksson.tallerandroid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ericksson.tallerandroid.R;
import com.example.ericksson.tallerandroid.retrofit.model.ChampionInfo;
import com.example.ericksson.tallerandroid.retrofit.services.RiotServices;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ActivityRetrofit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
    }

    @Override
    protected void onStart(){
        super.onStart();



        // Fetch a list of the Github repositories.
        RiotServices riotServices = RiotServices.retrofit.create(RiotServices.class);

        Call<ChampionInfo> call = riotServices.infoForChampion(1);

        /*
        try {
            ChampionInfo result = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        call.enqueue(new Callback<ChampionInfo>() {
            @Override
            public void onResponse(Call<ChampionInfo> call, Response<ChampionInfo> response) {
                if (response.isSuccessful()){
                    Log.e("id", String.valueOf(response.body().getId()));
                }
            }

            @Override
            public void onFailure(Call<ChampionInfo> call, Throwable t) {

            }
        });

    }
}
