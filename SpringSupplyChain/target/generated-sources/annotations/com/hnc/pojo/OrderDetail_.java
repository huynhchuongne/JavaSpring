package com.hnc.pojo;

import com.hnc.pojo.Product;
import com.hnc.pojo.SaleOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-06T00:02:19")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Long> unitPrice;
    public static volatile SingularAttribute<OrderDetail, Integer> quantity;
    public static volatile SingularAttribute<OrderDetail, Product> productId;
    public static volatile SingularAttribute<OrderDetail, SaleOrder> orderId;
    public static volatile SingularAttribute<OrderDetail, Integer> id;

}