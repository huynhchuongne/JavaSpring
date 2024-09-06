<%-- 
    Document   : login
    Created on : Aug 31, 2024, 7:57:57 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/login" var="action"/>
<form method="post" action="${action}">
    <div class="form-floating mb-3 mt-3">
        <input type="text" class="form-control" id="email" placeholder="Tên đăng nhập" name="username">
        <label for="email">Tên đăng nhập</label>
    </div>

    <div class="form-floating mt-3 mb-3">
        <input type="password" class="form-control" id="pwd" placeholder="Mật khẩu" name="password">
        <label for="pwd">Mật khẩu</label>
    </div>
    <div class="form-floating mt-3 mb-3">
        <input type="submit" value="Đăng nhâp" class="btn btn-danger"/>
    </div>
</form>