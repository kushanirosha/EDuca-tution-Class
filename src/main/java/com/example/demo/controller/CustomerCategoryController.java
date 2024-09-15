package com.example.demo.controller;


import com.example.demo.model.Customer;
import com.example.demo.model.CustomerCategory;
import com.example.demo.service.CustomerCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerCategoryController {

    @Autowired
    private CustomerCategoryService customerCategoryService;


    @RequestMapping(value ="/get-All-Customer-Categories" , method = RequestMethod.GET)
    public List<CustomerCategory> getAllCustomerCategories(){
        List<CustomerCategory> customerCategories = this.customerCategoryService.getAllCustomerCategories();
        return customerCategories;
    }

}
