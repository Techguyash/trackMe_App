package com.coma.Repository;

import com.coma.Entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long>{
    
}
