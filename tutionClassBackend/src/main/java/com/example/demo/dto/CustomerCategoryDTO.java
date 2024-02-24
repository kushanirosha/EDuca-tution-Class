package com.example.demo.dto;

import com.example.demo.model.CustomerCategory;

public class CustomerCategoryDTO {

    private Integer customerCategoryId;

    private String customerCategoryName;

    private String status;

    public CustomerCategoryDTO() {
    }

    public CustomerCategoryDTO(CustomerCategory customerCategory) {
        this.customerCategoryId = customerCategory.getCustomerCategoryId();
        this.customerCategoryName = customerCategory.getCustomerCategoryName();
        this.status = customerCategory.getStatus();
    }



    public Integer getCustomerCategoryId() {
        return customerCategoryId;
    }

    public void setCustomerCategoryId(Integer customerCategoryId) {
        this.customerCategoryId = customerCategoryId;
    }

    public String getCustomerCategoryName() {
        return customerCategoryName;
    }

    public void setCustomerCategoryName(String customerCategoryName) {
        this.customerCategoryName = customerCategoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
