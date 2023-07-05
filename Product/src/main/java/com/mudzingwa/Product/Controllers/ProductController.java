package com.mudzingwa.Product.Controllers;

import com.mudzingwa.Product.Entities.Product;
import com.mudzingwa.Product.Response.ProductResponse;

import com.mudzingwa.Product.Services.ProductServiceInterf;
import com.mudzingwa.Product.dtos.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductServiceInterf productServiceInterf;
    @PostMapping("/save")
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductDto productDto){
        ProductResponse productResponse = productServiceInterf.saveProduct(productDto);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> findProduct(@PathVariable("id") Integer id){
     Product product= productServiceInterf.findById(id) ;
     return new ResponseEntity<>(product,HttpStatus.OK);
    }

}
