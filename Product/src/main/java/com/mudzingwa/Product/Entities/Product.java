package com.mudzingwa.Product.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product_tab")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pid;
    private String pname;
    private Double price;
    private String brand;
    private String type;
}
