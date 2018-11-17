package com.example.arjun27.dagger.withmvpdagger.api;

import com.example.arjun27.dagger.withmvpdagger.response.Example;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ZomatoAPI {

    @GET("api/v2.1/categories")
    Call<Example> getTopGames(@Header("Client-Id") String clientId);


    @GET("api/v2.1/categories")
    Observable<Example> getTopGamesObservable(@Header("Client-Id") String clientId);



}
