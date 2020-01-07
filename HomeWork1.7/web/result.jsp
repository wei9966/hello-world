<%--
  Created by IntelliJ IDEA.
  User: WB
  Date: 2020/1/7
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String username= request.getParameter("username");
    String password= request.getParameter("password");
    String info[]= (String[])request.getParameterValues("info");
%>
<table border="1" align="center">
    <tr>
        <th colspan="2">填写的注册信息</th>
    </tr>
    <tr>
        <td>用户名:</td>
        <td>
            <%=username%>
        </td>
    </tr>
    <tr>
        <td>密码:</td>
        <td><%=password%>
        </td>
    </tr>
    <tr>
        <td>信息来源:</td>
        <td>
            <% for (int i=0;i<info.length;i++){
                out.print(info[i]);
            }%>
        </td>
    </tr>
</table>
</body>
</html>
