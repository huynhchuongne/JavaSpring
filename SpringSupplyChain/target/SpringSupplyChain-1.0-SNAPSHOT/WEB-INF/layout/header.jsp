<%-- 
    Document   : header
    Created on : Aug 21, 2024, 3:49:45 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="<c:url value="/" />">Supply chain Admin</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/" />">Trang chủ</a>
                </li>
                <c:forEach items="${categories}" var="c">
                    <c:url value="/" var="cPath">
                        <c:param name="cateId" value="${c.id}" />
                    </c:url>
                    <li class="nav-item">
                        <a class="nav-link" href="${cPath}">${c.name}</a>
                    </li>
                </c:forEach>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/stats" />">
                        Thống kê
                    </a>
                </li>
                <s:authorizee  access="!isAuthenticated()">
                    <a class="nav-item" href="<c:url value="/login"/>">đăng nhập</a>
                </s:authorizee>
                <s:authorize access="isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link" href="<c:url value="/" />">
                            Xin chào <s:authentication property="principal.username" />!
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="btn btn-danger" href="<c:url value="/logout" />">
                            Đăng xuất
                        </a>
                    </li>
                </s:authorize>
            </ul>
        </div>
    </div>  
</nav>

