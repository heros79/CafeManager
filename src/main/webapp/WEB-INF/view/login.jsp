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

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Log in</title>

</head>

<body>

<div class="container">

  <form:form method="POST" action="${contextPath}/login" class="form-signin">
    <h2 class="form-heading">Log in</h2>
    <div class="form-group ${error != null ? 'has-error' : ''}">
      <span>${message}</span>
      <input name="username" type="text" class="form-control" placeholder="Username"
             autofocus="true"/>
      <input name="password" type="password" class="form-control" placeholder="Password"/>
      <span>${error}</span>
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

      <button type="submit">Log In</button>

    </div>



  </form:form>

</div>
</body>
</html>
