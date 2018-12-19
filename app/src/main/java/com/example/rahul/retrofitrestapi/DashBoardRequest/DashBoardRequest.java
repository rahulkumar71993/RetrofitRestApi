package com.example.rahul.retrofitrestapi.DashBoardRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashBoardRequest
{
    @SerializedName("action")
    @Expose
    private String action;

    @SerializedName("data")
    @Expose
    private DashBoardDataRequest data;

    public String getAction() {
        return action;
    }

    public void setAction(String action)
    {
        this.action = action;
    }

    public DashBoardDataRequest getData() {
        return data;
    }

    public void setData(DashBoardDataRequest data) {
        this.data = data;
    }
}
