package com.example.rahul.retrofitrestapi;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    // @Header({"Content-Type: application/json"})
    @FormUrlEncoded
    @POST("Login")
    Call<ModelCommanResponse> login(@Field("Email") String Email, @Field("pwd") String pwd, @Field("deviceID") String deviceID, @Field("LoginType") String LoginType);

    @POST("ProductList")
    Call<ModelProductListResponse> getProduct();

}
