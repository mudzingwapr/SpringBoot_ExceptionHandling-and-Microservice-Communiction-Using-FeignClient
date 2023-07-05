package com.mudzingwa.Customer.Services;

import com.mudzingwa.Customer.Entities.Customer;
import com.mudzingwa.Customer.Response.CustomerResponse;
import com.mudzingwa.Customer.dtos.Customerdto;

import java.util.List;

public interface CustomerServiceInterF {
    public Customer createCustomer(Customerdto customerdto);
    public CustomerResponse findCustomer(Integer id);
     public List<CustomerResponse> findAll();

}
