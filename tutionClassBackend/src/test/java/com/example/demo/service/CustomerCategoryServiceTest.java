package com.example.demo.service;

import com.example.demo.dto.CustomerCategoryDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerCategoryServiceTest {

    @Autowired
    private CustomerCategoryService customerCategoryService;


    @Test
    void saveAndUpdateCustomerCategory() {
        CustomerCategoryDTO cus1 = new CustomerCategoryDTO();
        cus1.setCustomerCategoryName("Regular Customer");
        cus1.setStatus("ACT");

        this.customerCategoryService.saveAndUpdateCustomerCategory(cus1);
    }


    @Test
    void getAllCustomerCategories() {

        this.customerCategoryService.getAllCustomerCategories();

    }

    @Test
    void getCustomerCategoryById() {

        this.customerCategoryService.getCustomerCategoryById(4);

    }
}