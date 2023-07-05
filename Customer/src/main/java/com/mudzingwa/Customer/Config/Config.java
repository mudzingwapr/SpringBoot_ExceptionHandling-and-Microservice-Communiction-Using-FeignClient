package com.mudzingwa.Customer.Config;

import com.mudzingwa.Customer.Entities.Product;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
      @Bean
    public Customerfein customerfein(){
        return id -> new Product();
    }
}
