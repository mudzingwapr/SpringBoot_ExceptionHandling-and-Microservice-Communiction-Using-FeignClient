package com.mudzingwa.Product.ServiceImplementation;

import com.mudzingwa.Product.Entities.Product;
import com.mudzingwa.Product.Repositories.ProductRepositorie;
import com.mudzingwa.Product.Response.ProductResponse;
import com.mudzingwa.Product.Services.ProductServiceInterf;
import com.mudzingwa.Product.dtos.ProductDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImplemention implements ProductServiceInterf {
    private final ModelMapper modelMapper;
    private final ProductRepositorie productRepositorie;
        @Override
    public ProductResponse saveProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto,Product.class);
        Product product1= productRepositorie.save(product);
        ProductResponse productResponse= new ProductResponse();
        productResponse.setProduct(product1);
        productResponse.setMessage("created successfully");
        return productResponse;
    }

    @Override
    public List<Product> findAll() {
            List<Product> productList = productRepositorie.findAll();
           return productList;
    }

    @Override
    public Product findById(Integer id) {
        return productRepositorie.findById(id).get();
    }

    @Override
    public String delete(Integer id) {
        return null;
    }

    @Override
    public ProductResponse updateProduct(ProductDto productDto, Integer integer) {
        return null;
    }
}
