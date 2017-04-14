package com.example.ericksson.tallerandroid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ericksson.tallerandroid.R;
import com.example.ericksson.tallerandroid.retrofit.model.ChampionInfo;
import com.example.ericksson.tallerandroid.retrofit.services.RiotServices;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ActivityRetrofit extends AppCompatActivity {

    @BindView(R.id.id_champion)
    TextView idChampion;
    @BindView(R.id.botEnabled)
    TextView botEnabled;
    @BindView(R.id.freeToPlay)
    TextView freeToPlay;
    @BindView(R.id.botMMEnabled)
    TextView botMMEnabled;
    @BindView(R.id.rankedPlayEnabled)
    TextView rankedPlayEnabled;

    @BindView(R.id.imagen)
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart(){
        super.onStart();

        RiotServices riotServices = RiotServices.retrofit.create(RiotServices.class);

        Call<ChampionInfo> call = riotServices.infoForChampion("LAS", 2, "8ff87a6b-c86e-4f96-9426-8b5e467b24e1");

        call.enqueue(new Callback<ChampionInfo>() {
            @Override
            public void onResponse(Call<ChampionInfo> call, Response<ChampionInfo> response) {
                if (response.isSuccessful()){
                    idChampion.setText(String.valueOf(response.body().getId()));
                    botEnabled.setText(String.valueOf(response.body().getBotEnabled()));
                    freeToPlay.setText(String.valueOf(response.body().getFreeToPlay()));
                    botMMEnabled.setText(String.valueOf(response.body().getBotMmEnabled()));
                    rankedPlayEnabled.setText(String.valueOf(response.body().getRankedPlayEnabled()));

                }
                else {
                    Log.e("not successful", "xD");
                }
            }

            @Override
            public void onFailure(Call<ChampionInfo> call, Throwable t) {
                Log.e("fallo", "xD");
            }
        });

    }
}
