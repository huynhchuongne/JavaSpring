/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hnc.repository;

import com.hnc.pojo.User;

/**
 *
 * @author ASUS
 */
public interface UserRepository {
    User getUserByUsername(String username);
    boolean authUser(String username, String password);
    User addUser(User user);
}
