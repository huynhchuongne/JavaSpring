/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hnc.service;

import com.hnc.filters.Cart;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ReceiptService {
    void addReceipt(List<Cart> carts);
}
