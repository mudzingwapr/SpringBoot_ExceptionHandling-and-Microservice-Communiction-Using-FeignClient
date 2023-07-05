package com.mudzingwa.Customer.ServiceImplementation;

import com.mudzingwa.Customer.Config.Customerfein;
import com.mudzingwa.Customer.Entities.Customer;
import com.mudzingwa.Customer.Entities.Product;
import com.mudzingwa.Customer.Exception.ResourceNotFoundException;
import com.mudzingwa.Customer.Repositories.CustomerRepository;
import com.mudzingwa.Customer.Response.CustomerResponse;
import com.mudzingwa.Customer.Services.CustomerServiceInterF;
import com.mudzingwa.Customer.dtos.Customerdto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class CustmerServiceimple implements CustomerServiceInterF {
private final CustomerRepository customerRep;
private final ModelMapper modelMapper;
private final Customerfein customerfein;
    @Override
    public Customer createCustomer(Customerdto customerdto) {
        Customer customer = modelMapper.map(customerdto,Customer.class);
        customerRep.save(customer);
        return customer;
    }
    @Override
    public CustomerResponse findCustomer(Integer id) {
        Customer customer= customerRep.findById(id).orElseThrow(()-> new ResourceNotFoundException("Customer","userid",id));
        Product product=  customerfein.getproduct(id);
        CustomerResponse customerResponse= new  CustomerResponse();
        customerResponse.setCustomer(customer);
        customerResponse.setProduct(product);
        return customerResponse;
    }

    @Override
    public List<CustomerResponse> findAll() {
        return null;
    }
}
