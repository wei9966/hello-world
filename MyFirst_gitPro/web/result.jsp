<%--
  Created by IntelliJ IDEA.
  User: WB
  Date: 2020/1/7
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <table>
        <tr>
            <th colspan="2">用户输入的信息</th>
        </tr>
        <tr>
            <td>
                用户名:
            </td>
            <td><%=request.getAttribute("username")%></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><%=request.getAttribute("password")%></td>
        </tr>
        <tr>
            <td>
                <%String hobby[]= (String[]) request.getAttribute("hobby");
                 for (int i=0;i<hobby.length;i++){
                     out.print(hobby[i]);
                 }
                %>
            </td>
        </tr>
    </table>
</body>
</html>
