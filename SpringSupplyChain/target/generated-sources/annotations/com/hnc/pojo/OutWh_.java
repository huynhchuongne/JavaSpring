package com.hnc.pojo;

import com.hnc.pojo.Product;
import com.hnc.pojo.SaleOrder;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-06T00:02:19")
@StaticMetamodel(OutWh.class)
public class OutWh_ { 

    public static volatile SingularAttribute<OutWh, String> quantity;
    public static volatile SingularAttribute<OutWh, Product> productId;
    public static volatile SingularAttribute<OutWh, SaleOrder> orderId;
    public static volatile SingularAttribute<OutWh, Date> dateOut;
    public static volatile SingularAttribute<OutWh, Integer> id;

}