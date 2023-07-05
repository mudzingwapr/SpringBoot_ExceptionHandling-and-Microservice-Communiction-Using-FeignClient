package com.mudzingwa.Product.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String pname;
    private Double price;
    private String brand;
    private String type;
}
