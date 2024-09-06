package com.hnc.pojo;

import com.hnc.pojo.SaleOrder;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-06T00:02:19")
@StaticMetamodel(Delivery.class)
public class Delivery_ { 

    public static volatile SingularAttribute<Delivery, Date> date;
    public static volatile SingularAttribute<Delivery, SaleOrder> orderId;
    public static volatile SingularAttribute<Delivery, Integer> id;
    public static volatile SingularAttribute<Delivery, String> evaluate;
    public static volatile SingularAttribute<Delivery, String> status;

}