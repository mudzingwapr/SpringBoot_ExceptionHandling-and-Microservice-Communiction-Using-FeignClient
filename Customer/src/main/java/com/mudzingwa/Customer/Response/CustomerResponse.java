package com.mudzingwa.Customer.Response;

import com.mudzingwa.Customer.Entities.Customer;
import com.mudzingwa.Customer.Entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private Customer customer;
    private Product product;
}
