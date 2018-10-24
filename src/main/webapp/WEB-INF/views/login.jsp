<%@ page import="org.springframework.web.bind.annotation.ModelAttribute" %>
<%@ page import="model.Login" %><%--
  Created by IntelliJ IDEA.
  User: Surface Pro 4
  Date: 2018/10/24
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div style="width: 30%; padding-top: 30px" align="center">
    <f:form method="post" modelAttribute="login">
        <f:input path="account" type="text" name="name" placeholder="username"></f:input>
        <f:input path="password" type="text" name="pass" placeholder="password"></f:input>
        <f:button type="submit" >login</f:button>
    </f:form>
</div>
</body>
</html>
