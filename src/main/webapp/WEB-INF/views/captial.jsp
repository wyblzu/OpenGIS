<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: wyb
  Date: 2017/2/25
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:forEach items="${captialList}" var = "captial">--%>
    <%--<li id="kkk_<c:out value="captial.id"/>"></li>--%>
<%--</c:forEach>--%>
<ul>
    <c:forEach items="${captialList}" var = "captial" varStatus="status">
        <li>${captial.id}</li>
        <li>${captial.name}</li>
        <li>${captial.pinyin}</li>
    </c:forEach>
</ul>
<h1></h1>
</body>
</html>
