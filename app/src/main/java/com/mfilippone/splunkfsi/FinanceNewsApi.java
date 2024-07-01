package com.mfilippone.splunkfsi;

import com.mfilippone.splunkfsi.pojo.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FinanceNewsApi {
    @GET("news/all")
    Call<News> getAllDetails(@Query("exchanges") String exchanges, @Query("api_token") String api_token);
}
