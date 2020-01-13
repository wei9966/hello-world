<%--
  Created by IntelliJ IDEA.
  User: WB
  Date: 2020/1/13
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <style>
          div{
              border: 1px solid red;
              margin: 0 auto;
          }
      </style>
  </head>
  <body>
  <form action="cp" method="post">
      <div>
        <h1>画册报价</h1>
      </div>
      <div>
        客户名称:<input type="text" name="cName" id="cName">
        成品数量:<input type="text" name="count" id="count">
      </div>
    <div>
      <h1>封面</h1>
      <ul>
        <li>尺寸<span>
            <select name="fmSize" >
                <option value="32"  >大32开210*140</option>
                <option value="32" >正32开130*185</option>
                <option value="16" >大16开210*285</option>
                <option value="16" >正16开185*260</option>
                <option value="8" >大8开420*285</option>
                <option value="8" >正8开370*260</option>
                <option value="4" >大4开420*570</option>
                <option value="4" >正4开370*520</option>
            </select>
        </span>
            <select name="fSize">
                <option value="大度" name="fSize">大度</option>
                <option value="正度" name="fSize">正度</option>
            </select></li>
        <li>克数<span><input type="text" name="fmKg" id="fmKg"></span></li>
          <li>纸张类型<span>
              <select name="fPageType">
                  <option value="铜版纸">铜版纸</option>
                  <option value="双胶纸">双胶纸</option>
              </select>
          </span></li>
      </ul>
    </div>

  <div>
    <h1>内芯</h1>
    <ul>
      <li>尺寸<span><select name="nxSize">
                <option value="32" >大32开210*140</option>
                <option value="32" >正32开130*185</option>
                <option value="16" >大16开210*285</option>
                <option value="16" >正16开185*260</option>
                <option value="8" >大8开420*285</option>
                <option value="8" >正8开370*260</option>
                <option value="4" >大4开420*570</option>
                <option value="4" >正4开370*520</option>
            </select></span>
          <select name="nSize">
              <option value="大度" name="nSize">大度</option>
              <option value="正度" name="nSize">正度</option>
          </select>
      </li>
      <li>克数<span><input type="text" name="nxKg" id="nxKg"></span></li>
        <li>纸张类型<span>
              <select name="nPageType">
                  <option value="铜版纸">铜版纸</option>
                  <option value="双胶纸">双胶纸</option>
              </select>
          </span></li>
      <li>P数<span><input type="text" name="nxP" id="nxP"></span></li>
    </ul>
  </div>
  <div>
      <h1>后加工</h1>
      <ul>
          <li>复膜<span><input type="checkbox" name="fumo" id="fumo"></span></li>
          <li>胶装<span><input type="checkbox" name="jiaozhuang" id="jiaozhuang"></span></li>
          <li>骑马钉<span><input type="checkbox" name="qmd" id="qmd"></span></li>
          <li>其他加工<input type="text" name="other" id="other"></li>
      </ul>
  </div>
      <div>
      <input type="submit" value="提交">
      </div>
  </form>
  </body>
</html>
