<!--suppress XmlHighlighting -->
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 8/7/2017
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">


    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>


    <title>New Waiter</title>
</head>


<body>
<div class="container">

    <form:form method="POST" modelAttribute="userForm" class="form-signin">
    <h2 class="form-signin-heading">Create your account</h2>

        <spring:bind path="firstName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="firstName" class="form-control" placeholder="Firstname"
                            autofocus="true"></form:input>
                <form:errors path="firstName"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="lastName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="lastName" class="form-control" placeholder="Lastname"
                            autofocus="true"></form:input>
                <form:errors path="lastName"></form:errors>
            </div>
        </spring:bind>

    <spring:bind path="login">
    <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="text" path="login" class="form-control" placeholder="Username"
                    autofocus="true"></form:input>
        <form:errors path="login"></form:errors>
    </div>
    </spring:bind>

    <spring:bind path="passwordHash">
    <div class="form-group ${status.error ? 'has-error' : ''}">
        <form:input type="password" path="passwordHash" class="form-control" placeholder="Password"></form:input>
        <form:errors path="passwordHash"></form:errors>
    </div>
    </spring:bind>

    <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</div>
</body>
</html>
