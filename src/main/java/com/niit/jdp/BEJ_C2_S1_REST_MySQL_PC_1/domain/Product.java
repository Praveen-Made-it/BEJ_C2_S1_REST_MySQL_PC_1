/*
 *Author Name:Praveen Kumar
 *Date: 22-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp.BEJ_C2_S1_REST_MySQL_PC_1.domain;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private double amountInStock;

    public Product() {
    }

    public Product(int productId, String productName, String productDescription, double amountInStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.amountInStock = amountInStock;
    }
}
