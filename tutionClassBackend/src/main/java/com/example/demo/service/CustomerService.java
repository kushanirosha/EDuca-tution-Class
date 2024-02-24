package com.example.demo.service;


import com.example.demo.dao.CustomerCategoryDAO;
import com.example.demo.dao.CustomerDAO;
import com.example.demo.dto.CustomerDTO;
import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private CustomerCategoryDAO customerCategoryDAO;

    public CustomerDTO saveAndUpdateCustomer(CustomerDTO customerDTO){
        Customer c1 = null;

        if (customerDTO.getCustomerId() == null){
            c1 = new Customer();
        }else {
            c1 = this.customerDAO.findByCustomerId(customerDTO.getCustomerId());
        }

        c1.setCustomerCategory(this.customerCategoryDAO.findByCustomerCategoryId(customerDTO.getCustomerCategoryId()));
        c1.setCustomerName(customerDTO.getCustomerName());
        c1.setMobileNumber(customerDTO.getMobileNumber());
        c1.setAddress(customerDTO.getAddress());
        c1.setGender(customerDTO.getGender());
        c1.setStatus(customerDTO.getStatus());

        Customer c2 = this.customerDAO.saveAndFlush(c1);
        return new CustomerDTO(c2);

    }

    public List<Customer> getAllCustomers(){
        List<Customer> customers = this.customerDAO.findAll();
        return customers;
    }

    public CustomerDTO getCustomerById(Integer customerId){
        Customer customer = this.customerDAO.findByCustomerId(customerId);
        CustomerDTO customerDTO = new CustomerDTO(customer);

        return customerDTO;
    }

    public CustomerDTO getAllMaleCustomers(String gender){
        Customer customer = this.customerDAO.findByGender(gender);
        CustomerDTO customerDTO = new CustomerDTO(customer);

        return customerDTO;
    }
}
