/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnc.repository.impl;
import com.hnc.pojo.Product;
import com.hnc.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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
public class ProductRepositoryImpl implements ProductRepository{
    private static final int PAGE_SIZE = 4 ;
    
    @Autowired
    private LocalSessionFactoryBean factory;
    
    @Override
    public List<Product> getProducts(Map<String, String> params) {
      Session s = this.factory.getObject().getCurrentSession();
          CriteriaBuilder b = s.getCriteriaBuilder();
          CriteriaQuery<Product> q = b.createQuery(Product.class);
          Root root = q.from(Product.class);
          q.select(root);
          
          
          if (params != null){
             List<Predicate> predicates = new ArrayList<>();
             String kw = params.get("q");
             if (kw != null && !kw.isEmpty()){
                 Predicate p1 = b.like(root.get("name"), String.format("%%%s%%", kw));
                 predicates.add(p1);
             }
             
             String fromPrice = params.get("fromPrice");
             if (fromPrice != null && !fromPrice.isEmpty()){
               Predicate p2 = b.greaterThan(root.get("price"), Double.valueOf(fromPrice));
               predicates.add(p2);
             }
             
             String toPrice = params.get("toPrice");
             if (toPrice != null && !toPrice.isEmpty()){
               Predicate p3 = b.lessThan(root.get("price"), Double.valueOf(toPrice));
               predicates.add(p3);
             }    
             
             String cateId = params.get("cateId");
             if (cateId != null && !cateId.isEmpty()){
               Predicate p4 = b.equal(root.get("categoryId"), Integer.parseInt(cateId));
               predicates.add(p4);
             }
             
             q.where(predicates.toArray(Predicate[]::new));                                           
          }            
          
          q.orderBy(b.desc(root.get("id")));
          Query query = s.createQuery(q);
          
          if (params != null){
           String page = params.get("page");
             if (page != null && !page.isEmpty()){
               int p = Integer.parseInt(page);
               int start = (p - 1) * PAGE_SIZE;  
               
               query.setMaxResults(PAGE_SIZE);
               query.setFirstResult(start);
             }
          }
          
          return query.getResultList();
    }
    
    @Override
    public void addOrUpdate(Product p){
      
         Session s = this.factory.getObject().getCurrentSession();
              if (p.getId() !=  null){                  
              s.update(p);
              }
              else{
                  s.save(p);
              }
         
           
    } 
    
    @Override
    public void deleteProduct(int ProductId){
       Session s = this.factory.getObject().getCurrentSession();
         Product p = this.getProductById(ProductId);
         s.delete(p);      
    }
    @Override
    public Product getProductById(int productId){
       Session s = this.factory.getObject().getCurrentSession();
         return s.get(Product.class, productId);
    }
}
