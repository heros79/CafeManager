<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 8/7/2017
  Time: 3:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title></title>
</head>
<body>

<form:form method="POST" modelAttribute="selectForm" class = "form-control">
    <div class="container">
            <form:select path="" id="user" class = "form-control">
                <form:option value="NONE" label="--- Select ---" />
                <form:options items="userList" itemValue="login"/>
            </form:select>
    </div>
    <input class="btn-default btn btn1" type="submit" name="submit" value="Submit">
</form:form>

</body>
</html>
