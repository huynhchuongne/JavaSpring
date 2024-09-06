/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnc.service.impl;

import com.hnc.filters.Cart;
import com.hnc.repository.ReceiptRepository;
import com.hnc.service.ReceiptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class ReceiptServiceImpl implements ReceiptService{
    @Autowired
    private  ReceiptRepository receiptRepo;

    @Override
    public void addReceipt(List<Cart> carts) {
       this.receiptRepo.addReceipt(carts);
    }
}
