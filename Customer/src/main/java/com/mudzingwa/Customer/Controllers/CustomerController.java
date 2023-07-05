package com.mudzingwa.Customer.Controllers;

import com.mudzingwa.Customer.Entities.Customer;
import com.mudzingwa.Customer.Entities.Product;
import com.mudzingwa.Customer.Response.CustomerResponse;
import com.mudzingwa.Customer.Services.CustomerServiceInterF;
import com.mudzingwa.Customer.dtos.Customerdto;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerServiceInterF customerServiceInterF;
    @PostMapping("/save")
    public ResponseEntity<Customer> createProduct(@RequestBody  Customerdto customerdto){
     Customer customer=  customerServiceInterF.createCustomer(customerdto) ;
      return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }
       @GetMapping("/{id}")
        public ResponseEntity<CustomerResponse> findProduct(@PathVariable("id") Integer id){
        CustomerResponse customerResponse= customerServiceInterF.findCustomer(id);
        return new ResponseEntity<>(customerResponse,HttpStatus.OK);

    }
}
