<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
#container {
  width:800px;
  margin: 0 auto;
}
#maintable{
width : 800px;
}

</style>

<body>
<div id = "container">
<form>
<table id = "maintable" border="1">
   <tr style = "height:50px">
   <td><jsp:include page = "Header.jsp"></jsp:include></td>
   </tr>
   
   <tr>
   <td><jsp:include page = "Menu.jsp"></jsp:include></td>
   </tr>
   
   <tr style ="height:200px">
   <td><jsp:include page = "body.jsp"></jsp:include></td>
   </tr>
   
   <tr style = "height:50px">
   <td><jsp:include page = "Footer.jsp"></jsp:include></td>
   </tr>
   
</table>
</form>
</div>
</body>
</html>