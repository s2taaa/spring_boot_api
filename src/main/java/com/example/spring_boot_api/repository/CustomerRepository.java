package com.example.spring_boot_api.repository;

import com.example.spring_boot_api.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

}
