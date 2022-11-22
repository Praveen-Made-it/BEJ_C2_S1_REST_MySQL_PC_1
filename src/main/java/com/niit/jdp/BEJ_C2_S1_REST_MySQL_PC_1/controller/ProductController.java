/*
 *Author Name:Praveen Kumar
 *Date: 22-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.controller;

import com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/v1/")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
}
