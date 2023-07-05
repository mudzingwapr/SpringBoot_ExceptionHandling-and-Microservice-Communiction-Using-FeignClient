package com.mudzingwa.Product.Repositories;

import com.mudzingwa.Product.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositorie extends JpaRepository<Product,Integer> {

}
