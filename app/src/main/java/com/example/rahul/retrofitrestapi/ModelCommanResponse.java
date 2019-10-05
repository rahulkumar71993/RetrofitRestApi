package com.example.rahul.retrofitrestapi;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelCommanResponse {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("MobileNo")
    @Expose
    private String mobileNo;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("pwd")
    @Expose
    private String pwd;
    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("DeviceID")
    @Expose
    private Object deviceID;
    @SerializedName("Wallet")
    @Expose
    private Long wallet;
    @SerializedName("apartment")
    @Expose
    private Object apartment;
    @SerializedName("area")
    @Expose
    private Object area;
    @SerializedName("landmark")
    @Expose
    private Object landmark;
    @SerializedName("States")
    @Expose
    private Object states;
    @SerializedName("city")
    @Expose
    private Object city;
    @SerializedName("PinCode")
    @Expose
    private Object pinCode;
    @SerializedName("Addresss")
    @Expose
    private Object addresss;
    @SerializedName("img")
    @Expose
    private String img;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(Object deviceID) {
        this.deviceID = deviceID;
    }

    public Long getWallet() {
        return wallet;
    }

    public void setWallet(Long wallet) {
        this.wallet = wallet;
    }

    public Object getApartment() {
        return apartment;
    }

    public void setApartment(Object apartment) {
        this.apartment = apartment;
    }

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public Object getLandmark() {
        return landmark;
    }

    public void setLandmark(Object landmark) {
        this.landmark = landmark;
    }

    public Object getStates() {
        return states;
    }

    public void setStates(Object states) {
        this.states = states;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getPinCode() {
        return pinCode;
    }

    public void setPinCode(Object pinCode) {
        this.pinCode = pinCode;
    }

    public Object getAddresss() {
        return addresss;
    }

    public void setAddresss(Object addresss) {
        this.addresss = addresss;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}