package com.hnc.pojo;

import com.hnc.pojo.Comment;
import com.hnc.pojo.SaleOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-06T00:02:19")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SetAttribute<User, Comment> commentSet;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SetAttribute<User, SaleOrder> saleOrderSet;
    public static volatile SingularAttribute<User, Boolean> active;
    public static volatile SingularAttribute<User, String> avatar;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> userRole;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}