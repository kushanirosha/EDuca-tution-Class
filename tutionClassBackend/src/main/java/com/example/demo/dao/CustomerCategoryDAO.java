package com.example.demo.dao;


import com.example.demo.model.CustomerCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCategoryDAO  extends JpaRepository<CustomerCategory , Integer> {

    CustomerCategory findByCustomerCategoryId(Integer customerCategoryId);
}
