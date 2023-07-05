package com.mudzingwa.Customer.Repositories;

import com.mudzingwa.Customer.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
