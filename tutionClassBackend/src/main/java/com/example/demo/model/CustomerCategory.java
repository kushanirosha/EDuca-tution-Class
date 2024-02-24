package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "t_customer_category")
public class CustomerCategory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "CUSTOMER_CATEGORY_ID")
    private Integer customerCategoryId;

    @Column(name = "CUSTOMER_CATEGORY_NAME")
    private String customerCategoryName;

    @Column(name = "STATUS")
    private String status;


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
