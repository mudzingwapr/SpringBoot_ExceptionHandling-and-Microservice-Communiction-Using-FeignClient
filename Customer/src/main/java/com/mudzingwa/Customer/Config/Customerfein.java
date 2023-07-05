package com.mudzingwa.Customer.Config;

import com.mudzingwa.Customer.Entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8092/product",name = "product")
public interface Customerfein {
    @GetMapping("/{id}")
public Product getproduct(@PathVariable("id") Integer id);



}
