package com.example.demo.service;

import com.example.demo.dto.CustomerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;


    @Test
    void saveAndUpdateCustomer1() {
        CustomerDTO c1 = new CustomerDTO();
        c1.setCustomerCategoryId(3);
        c1.setCustomerName("Mangalika Dissanayake");
        c1.setMobileNumber("0335677899");
        c1.setAddress("No:12/A, Kottawa, Pannipitiya");
        c1.setGender("Female");
        c1.setStatus("ACT");

        this.customerService.saveAndUpdateCustomer(c1);
    }

    @Test
    void getAllCustomers() {

        this.customerService.getAllCustomers();

    }


    @Test
    void getCustomerById() {

        this.customerService.getCustomerById(4);

    }

    @Test
    void getAllMaleCustomers() {
        this.customerService.getAllMaleCustomers("Male");
    }
}