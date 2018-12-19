package com.example.rahul.retrofitrestapi.DashBoardResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashBoardDataResponse {
    @SerializedName("dashboardStatus")
    @Expose
    private String dashboardStatus;

    @SerializedName("totalAmountEarned")
    @Expose
    private String totalAmountEarned;

    @SerializedName("level1Joins")
    @Expose
    private String level1Joins;

    @SerializedName("level1Amount")
    @Expose
    private String level1Amount;

    public String getDashboardStatus() {
        return dashboardStatus;
    }

    public void setDashboardStatus(String dashboardStatus) {
        this.dashboardStatus = dashboardStatus;
    }

    public String getTotalAmountEarned() {
        return totalAmountEarned;
    }

    public void setTotalAmountEarned(String totalAmountEarned) {
        this.totalAmountEarned = totalAmountEarned;
    }

    public String getLevel1Joins() {
        return level1Joins;
    }

    public void setLevel1Joins(String level1Joins) {
        this.level1Joins = level1Joins;
    }

    public String getLevel1Amount() {
        return level1Amount;
    }

    public void setLevel1Amount(String level1Amount) {
        this.level1Amount = level1Amount;
    }
}