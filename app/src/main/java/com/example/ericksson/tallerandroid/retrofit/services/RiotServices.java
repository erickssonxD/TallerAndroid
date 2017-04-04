package com.example.ericksson.tallerandroid.retrofit.services;
//Created by ericksson on 04-04-17.

import retrofit2.http.GET;
import retrofit2.http.Path;


public interface ServiceRetrofit {
    @GET("/users/{user}/repos")
    Call<Champion> reposForUser(
            @Path("user") String user
    );
}