<%--
  Created by IntelliJ IDEA.
  User: Kushal
  Date: 09-02-2026
  Time: 08:48 pm
  To change this template use File | Settings | File Templates.
--%>
<%--if you want to use El you must have to set isELIgnored="false" in page declarative --%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <center>
        <h1>This is Welcome page</h1>
        <h1>My name is ${name}</h1>
        <h1>My id is ${id}</h1>
        <h1>abcd from a to z ${abcd}</h1>
    </center>
</body>
</html>
