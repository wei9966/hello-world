<%--
  Created by IntelliJ IDEA.
  User: WB
  Date: 2020/1/7
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<html>
  <head>
    <title></title>
    <script>
      $(function () {
         $("#tijiao").click(function () {
            var username=$("#username").val();
            var password=$("#password").val();
            var info =new Array();
            var j=0;
            $(":input[type=checkbox]").each(function (i,n) {
                if (n.checked==true){
                    info[i]=$(n).val();
                    j++;
                }
            });
            var ru=username.match(/^[a-z0-9_-]{2,6}$/);
            var rp=password.match(/^[a-z0-9_-]{6,10}$/);
            if (ru==null&&rp==null){
                  $("#uh").show();
                  $("#ph").show();
            }else if (ru!=null&&rp==null){
                $("#ph").show();
                $("#uh").hide();
            }else if (ru==null&&rp!=null){
                $("#uh").show();
                $("#ph").hide();
            }else{
                $("#uh").hide();
                $("#ph").hide();
                location.href="result.jsp?username="+username+"&password="+password+"&info="+info;
            }
         });
      });
    </script>
  </head>
  <body>
    <table border="1" align="center">
      <tr>
        <th colspan="3">请输入注册信息</th>
      </tr>
      <tr>
        <td>用户名:</td>
        <td><input type="text" id="username" name="username"></td>
        <td hidden id="uh" style="color: red;">用户名必须是2-6位</td>
      </tr>
      <tr>
        <td>密码:</td>
        <td><input type="password" id="password" name="password"></td>
        <td hidden id="ph" style="color: red;">密码必须是6-10位</td>
      </tr>
      <tr>
        <td>信息来源:</td>
        <td>
          <input type="checkbox" value="报刊" name="info">报刊&nbsp;&nbsp;&nbsp;
          <input type="checkbox" value="网络" name="info">网络&nbsp;&nbsp;&nbsp;
          <input type="checkbox" value="朋友推荐" name="info">朋友推荐&nbsp;&nbsp;&nbsp;
          <input type="checkbox" value="电视" name="info">电视&nbsp;&nbsp;&nbsp;
        </td>
      </tr>
      <tr>
        <td colspan="3"><input type="button" value="提交" id="tijiao"></td>
      </tr>
    </table>
  </body>
</html>
