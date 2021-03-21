<%--
  Created by IntelliJ IDEA.
  User: XUN~MLF
  Date: 2021/3/21
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath() + "/" ;
%>
<html>
<head>
    <title>功能入口</title>
    <base href="<%=basePath%>" />
</head>
<body>
<div align="center">
    <p>SSM整合例子</p>
    <table>
        <tr>
            <td><a href="addStudent.jsp">注册学生</a></td>
        </tr>
        <tr>
            <td><a href="listStudent.jsp">浏览学生</a></td>
        </tr>
    </table>
</div>

</body>
</html>
