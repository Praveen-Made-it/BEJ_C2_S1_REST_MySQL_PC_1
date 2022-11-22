/*
 *Author Name:Praveen Kumar
 *Date: 22-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.service;

import com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.domain.Product;
import com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public boolean deleteProductById(int productId) {
        return false;
    }
}
