package com.example.demo.dto;

import com.example.demo.model.Customer;

public class CustomerDTO {

    private Integer customerId;

    private  Integer customerCategoryId;

    private String customerName;

    private String mobileNumber;

    private String address;

    private String gender;

    private String status;

    public CustomerDTO() {
    }

    public CustomerDTO(Customer customer) {
        this.customerId = customer.getCustomerId();
        this.customerCategoryId = customer.getCustomerCategory().getCustomerCategoryId();
        this.customerName = customer.getCustomerName();
        this.mobileNumber = customer.getMobileNumber();
        this.address = customer.getAddress();
        this.gender = customer.getGender();
        this.status = customer.getStatus();


    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCustomerCategoryId() {
        return customerCategoryId;
    }

    public void setCustomerCategoryId(Integer customerCategoryId) {
        this.customerCategoryId = customerCategoryId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
