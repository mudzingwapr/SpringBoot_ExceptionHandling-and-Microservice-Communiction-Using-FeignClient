package com.mudzingwa.Customer.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer pid;
    private String pname;
    private Double price;
    private String brand;
    private String type;
}
