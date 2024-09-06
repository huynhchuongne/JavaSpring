/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hnc.repository;

import com.hnc.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public interface ProductRepository {
    List<Product> getProducts(Map<String, String> params);
    void addOrUpdate(Product p);
    void deleteProduct(int ProductId);
    Product getProductById(int productId);
}
