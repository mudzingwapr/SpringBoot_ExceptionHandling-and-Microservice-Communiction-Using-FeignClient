package com.mudzingwa.Product.Response;

import com.mudzingwa.Product.Entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Product product;
    private String message;
}
