package com.example.springdatajpa.Service;

import com.example.springdatajpa.dto.ProductDto;
import com.example.springdatajpa.model.Product;
import com.example.springdatajpa.model.User;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {


    void save(ProductDto productDto, User user);



    Product findProductById(Integer id);

    void delete(Integer id);

    void update(Product product);
}
