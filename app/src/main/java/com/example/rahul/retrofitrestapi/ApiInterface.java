package com.example.rahul.retrofitrestapi;

import com.example.rahul.retrofitrestapi.DashBoardRequest.DashBoardRequest;
import com.example.rahul.retrofitrestapi.DashBoardResponse.DashBoardResponsePojo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
    // @Header({"Content-Type: application/json"})
//
//    @POST("advoman/api/api.php")
//    Call<registerResponsePojo> register
//            (@Body RegisterRequest body);
//
//    @POST("advoman/api/api.php")
//    Call<LoginRes> login
//            (@Body LoginReq body);
//
//    @POST("advoman/api/api.php")
//    Call<OtpResp> otp
//            (@Body OtpReq body);


    @POST("advoman/api/api.php")
    Call<DashBoardResponsePojo> dashboard
            (@Body DashBoardRequest body);


}
