package com.hnc.pojo;

import com.hnc.pojo.Category;
import com.hnc.pojo.Comment;
import com.hnc.pojo.OrderDetail;
import com.hnc.pojo.OutWh;
import com.hnc.pojo.ProdTag;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-06T00:02:19")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> image;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Boolean> active;
    public static volatile SetAttribute<Product, OutWh> outWhSet;
    public static volatile SetAttribute<Product, OrderDetail> orderDetailSet;
    public static volatile SingularAttribute<Product, String> manufacturer;
    public static volatile SingularAttribute<Product, Date> createdDate;
    public static volatile SetAttribute<Product, Comment> commentSet;
    public static volatile SetAttribute<Product, ProdTag> prodTagSet;
    public static volatile SingularAttribute<Product, Long> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, Category> categoryId;

}