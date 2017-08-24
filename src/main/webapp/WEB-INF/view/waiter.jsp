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

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">


    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

    <title></title>
</head>
<body>

<form:form method="POST" modelAttribute="selectForm">
    <div class="container">
            <form:select path="login">
                <form:option value="NONE" label="--- Select ---" />
                <form:options items="${usersList}" itemValue="id" itemLabel="login"/>
            </form:select>
    </div>


      <input class="btn-default btn btn1" type="submit" name="submit" value="Submit">
</form:form>

<form:form method="POST" modelAttribute="selectTable">
    <div class="container">
        <form:select path="tableId">
            <form:option value="0" label="--- Select ---" />
            <form:options items="${tablesList}" itemValue="tableId" itemLabel="tableNumber"/>
        </form:select>
    </div>
</form:form>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>

</body>
</html>
