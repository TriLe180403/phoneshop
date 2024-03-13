package com.example.springdatajpa.Service;

import com.example.springdatajpa.dto.ProductDto;
import com.example.springdatajpa.model.Product;
import com.example.springdatajpa.model.User;
import com.example.springdatajpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void save(ProductDto productDto, User user){
        Product product = new Product(productDto.getProductName(), productDto.getPrice(),
                productDto.getPhoto(), productDto.getPrice(), productDto.getQuantity(), productDto.getDescription());
    }


    @Override
    public Product findProductById(Integer id) {
        return productRepository.findProductById(id);
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }
}
