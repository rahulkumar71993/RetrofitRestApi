package com.example.rahul.retrofitrestapi.DashBoardResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashBoardResponsePojo
{


    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("data")
    @Expose
    private DashBoardDataResponse data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessagee() {
        return message;
    }

    public void setMessagee(String message) {
        this.message = message;
    }

    public DashBoardDataResponse getData() {
        return data;
    }

    public void setData(DashBoardDataResponse data) {
        this.data = data;
    }
}
