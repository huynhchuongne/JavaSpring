/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnc.repository.impl;
import com.hnc.pojo.Category;
import com.hnc.repository.CategoryRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ASUS
 */
@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository{   
    @Autowired
    private LocalSessionFactoryBean factory;
            
    @Override
    public List<Category> getCates(){
            Session s = this.factory.getObject().getCurrentSession();
//            Query q = s.createQuery("From Category");
            Query q = s.createNamedQuery("Category.findAll", Category.class);
            return q.getResultList();
        
    }
}
