package com.example.rahul.retrofitrestapi;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelProductListResponse {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("success")
    @Expose
    private String success;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public class Datum {

        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("VehicleEquipmentName")
        @Expose
        private String vehicleEquipmentName;
        @SerializedName("Capacity")
        @Expose
        private String capacity;
        @SerializedName("VehicleEquipmentType")
        @Expose
        private String vehicleEquipmentType;
        @SerializedName("VehicleEquipmentregistrationNo")
        @Expose
        private String vehicleEquipmentregistrationNo;
        @SerializedName("Availablelocation")
        @Expose
        private String availablelocation;
        @SerializedName("RASexpiryDate")
        @Expose
        private String rASexpiryDate;
        @SerializedName("MonthlyPrice")
        @Expose
        private String monthlyPrice;
        @SerializedName("RASexpiryAttachment")
        @Expose
        private String rASexpiryAttachment;
        @SerializedName("FullDesc")
        @Expose
        private String fullDesc;
        @SerializedName("img")
        @Expose
        private String img;
        @SerializedName("MobileNmber")
        @Expose
        private String mobileNmber;
        @SerializedName("Email")
        @Expose
        private String email;
        @SerializedName("ProductDate")
        @Expose
        private String productDate;
        @SerializedName("Mobilization")
        @Expose
        private String mobilization;
        @SerializedName("Demobilization")
        @Expose
        private String demobilization;
        @SerializedName("MulkkyaDate")
        @Expose
        private String mulkkyaDate;
        @SerializedName("Attachment")
        @Expose
        private String attachment;
        @SerializedName("IVMSexpiredate")
        @Expose
        private String iVMSexpiredate;
        @SerializedName("IVMSexpiredateAttachment")
        @Expose
        private String iVMSexpiredateAttachment;
        @SerializedName("IVMSCompany")
        @Expose
        private String iVMSCompany;
        @SerializedName("thrdpartyCertificateexpiredate")
        @Expose
        private String thrdpartyCertificateexpiredate;
        @SerializedName("thrdpartyCertificateAttachment")
        @Expose
        private String thrdpartyCertificateAttachment;
        @SerializedName("CurrentKMHourreading")
        @Expose
        private String currentKMHourreading;
        @SerializedName("Address")
        @Expose
        private String address;
        @SerializedName("multiimg")
        @Expose
        private List<Object> multiimg = null;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getVehicleEquipmentName() {
            return vehicleEquipmentName;
        }

        public void setVehicleEquipmentName(String vehicleEquipmentName) {
            this.vehicleEquipmentName = vehicleEquipmentName;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }

        public String getVehicleEquipmentType() {
            return vehicleEquipmentType;
        }

        public void setVehicleEquipmentType(String vehicleEquipmentType) {
            this.vehicleEquipmentType = vehicleEquipmentType;
        }

        public String getVehicleEquipmentregistrationNo() {
            return vehicleEquipmentregistrationNo;
        }

        public void setVehicleEquipmentregistrationNo(String vehicleEquipmentregistrationNo) {
            this.vehicleEquipmentregistrationNo = vehicleEquipmentregistrationNo;
        }

        public String getAvailablelocation() {
            return availablelocation;
        }

        public void setAvailablelocation(String availablelocation) {
            this.availablelocation = availablelocation;
        }

        public String getRASexpiryDate() {
            return rASexpiryDate;
        }

        public void setRASexpiryDate(String rASexpiryDate) {
            this.rASexpiryDate = rASexpiryDate;
        }

        public String getMonthlyPrice() {
            return monthlyPrice;
        }

        public void setMonthlyPrice(String monthlyPrice) {
            this.monthlyPrice = monthlyPrice;
        }

        public String getRASexpiryAttachment() {
            return rASexpiryAttachment;
        }

        public void setRASexpiryAttachment(String rASexpiryAttachment) {
            this.rASexpiryAttachment = rASexpiryAttachment;
        }

        public String getFullDesc() {
            return fullDesc;
        }

        public void setFullDesc(String fullDesc) {
            this.fullDesc = fullDesc;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getMobileNmber() {
            return mobileNmber;
        }

        public void setMobileNmber(String mobileNmber) {
            this.mobileNmber = mobileNmber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getProductDate() {
            return productDate;
        }

        public void setProductDate(String productDate) {
            this.productDate = productDate;
        }

        public String getMobilization() {
            return mobilization;
        }

        public void setMobilization(String mobilization) {
            this.mobilization = mobilization;
        }

        public String getDemobilization() {
            return demobilization;
        }

        public void setDemobilization(String demobilization) {
            this.demobilization = demobilization;
        }

        public String getMulkkyaDate() {
            return mulkkyaDate;
        }

        public void setMulkkyaDate(String mulkkyaDate) {
            this.mulkkyaDate = mulkkyaDate;
        }

        public String getAttachment() {
            return attachment;
        }

        public void setAttachment(String attachment) {
            this.attachment = attachment;
        }

        public String getIVMSexpiredate() {
            return iVMSexpiredate;
        }

        public void setIVMSexpiredate(String iVMSexpiredate) {
            this.iVMSexpiredate = iVMSexpiredate;
        }

        public String getIVMSexpiredateAttachment() {
            return iVMSexpiredateAttachment;
        }

        public void setIVMSexpiredateAttachment(String iVMSexpiredateAttachment) {
            this.iVMSexpiredateAttachment = iVMSexpiredateAttachment;
        }

        public String getIVMSCompany() {
            return iVMSCompany;
        }

        public void setIVMSCompany(String iVMSCompany) {
            this.iVMSCompany = iVMSCompany;
        }

        public String getThrdpartyCertificateexpiredate() {
            return thrdpartyCertificateexpiredate;
        }

        public void setThrdpartyCertificateexpiredate(String thrdpartyCertificateexpiredate) {
            this.thrdpartyCertificateexpiredate = thrdpartyCertificateexpiredate;
        }

        public String getThrdpartyCertificateAttachment() {
            return thrdpartyCertificateAttachment;
        }

        public void setThrdpartyCertificateAttachment(String thrdpartyCertificateAttachment) {
            this.thrdpartyCertificateAttachment = thrdpartyCertificateAttachment;
        }

        public String getCurrentKMHourreading() {
            return currentKMHourreading;
        }

        public void setCurrentKMHourreading(String currentKMHourreading) {
            this.currentKMHourreading = currentKMHourreading;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public List<Object> getMultiimg() {
            return multiimg;
        }

        public void setMultiimg(List<Object> multiimg) {
            this.multiimg = multiimg;
        }
    }
}