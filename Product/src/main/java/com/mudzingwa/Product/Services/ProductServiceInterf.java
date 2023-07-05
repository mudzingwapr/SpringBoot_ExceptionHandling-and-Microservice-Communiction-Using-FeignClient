package com.mudzingwa.Product.Services;

import com.mudzingwa.Product.Entities.Product;
import com.mudzingwa.Product.Response.ProductResponse;
import com.mudzingwa.Product.dtos.ProductDto;

import java.util.List;

public interface ProductServiceInterf {
    public ProductResponse saveProduct(ProductDto productDto);
    public List<Product> findAll();
    public Product findById(Integer id);
    public String delete(Integer id);
    public ProductResponse updateProduct(ProductDto productDto,Integer integer);
}
