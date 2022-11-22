package com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.service;

import com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.domain.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getAllProducts();

    boolean deleteProductById(int productId);
}
