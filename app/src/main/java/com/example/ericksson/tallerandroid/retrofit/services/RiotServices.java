package com.example.ericksson.tallerandroid.retrofit.services;
//Created by ericksson on 04-04-17.

import com.example.ericksson.tallerandroid.retrofit.model.ChampionInfo;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RiotServices {

    String API_BASE_URL = "https://api.github.com/";

    @GET("https://las.api.riotgames.com/api/lol/{region}/v1.2/champion/{id}")
    Call<ChampionInfo> infoForChampion(@Path("region") String region, @Path("id") int id, @Query("api_key") String apiKey);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}