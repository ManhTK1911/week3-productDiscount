<%--
  Created by IntelliJ IDEA.
  User: manhtk
  Date: 03/11/2019
  Time: 00:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<form action="/product" method="post">
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<fieldset style="width: fit-content">
        <legend><h2>Discount Price Calculator</h2></legend>
        <label>Product Description: </label><br/>
        <input type="text" name="product" placeholder="product..." value=""/><br/><br/>
        <label>List Price: </label><br/>
        <input type="text" name="price" placeholder="price..." value=""/><br/><br/>
        <label>Discount Percent: </label><br/>
        <input type="text" name="percent" placeholder="discount percent..." value=""/><br/><br/>
        <input type="submit" id="submit" value="Calculate Discount"/>
    </fieldset>
</form>
</body>
</html>
