package com.example.demo.service;

import com.example.demo.dao.CustomerCategoryDAO;
import com.example.demo.dto.CustomerCategoryDTO;
import com.example.demo.model.CustomerCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerCategoryService {

    @Autowired
    private CustomerCategoryDAO customerCategoryDAO;

    public CustomerCategoryDTO saveAndUpdateCustomerCategory(CustomerCategoryDTO customerCategoryDTO) {
        CustomerCategory cus1 = null;

        if (customerCategoryDTO.getCustomerCategoryId() == null) {
            cus1 = new CustomerCategory();

        }else {
            cus1 = this.customerCategoryDAO.findByCustomerCategoryId(customerCategoryDTO.getCustomerCategoryId());
        }

        cus1.setCustomerCategoryName(customerCategoryDTO.getCustomerCategoryName());
        cus1.setStatus(customerCategoryDTO.getStatus());

        CustomerCategory cus2 = this.customerCategoryDAO.saveAndFlush(cus1);
        return new CustomerCategoryDTO(cus2);

    }

    public List<CustomerCategory> getAllCustomerCategories(){
        List<CustomerCategory> customerCategories = customerCategoryDAO.findAll();
        return customerCategories;
    }

    public CustomerCategoryDTO getCustomerCategoryById(Integer customerCategoryId){
        CustomerCategory customerCategory = this.customerCategoryDAO.findByCustomerCategoryId(customerCategoryId);
        CustomerCategoryDTO customerCategoryDTO = new CustomerCategoryDTO(customerCategory);

        return customerCategoryDTO;
    }

}
