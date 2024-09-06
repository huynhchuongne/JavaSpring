package com.hnc.pojo;

import com.hnc.pojo.Delivery;
import com.hnc.pojo.OrderDetail;
import com.hnc.pojo.OutWh;
import com.hnc.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-06T00:02:19")
@StaticMetamodel(SaleOrder.class)
public class SaleOrder_ { 

    public static volatile SingularAttribute<SaleOrder, Date> createdDate;
    public static volatile SingularAttribute<SaleOrder, Integer> id;
    public static volatile SetAttribute<SaleOrder, OutWh> outWhSet;
    public static volatile SingularAttribute<SaleOrder, User> userId;
    public static volatile SetAttribute<SaleOrder, OrderDetail> orderDetailSet;
    public static volatile SetAttribute<SaleOrder, Delivery> deliverySet;

}