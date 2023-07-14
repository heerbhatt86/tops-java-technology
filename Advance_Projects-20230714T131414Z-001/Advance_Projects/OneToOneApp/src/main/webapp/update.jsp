<%@page import="com.bean.Emp"%>
<%@page import="java.io.ObjectInputStream.GetField"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<style type="text/css">
tr,td{
padding: 10px;
}

</style>
</head>
<body>
<%
Emp e=(Emp)request.getAttribute("e");
if(request.getAttribute("msg")!=null){
	 out.println("<b style= color:blue;>"+request.getAttribute("msg")+"</style></b>");
 }
%>
<form name = "insert"  method = "post" action="Empcontroller">
<table>
<tr>
<td><input type = "hidden" name="eid" value = "<%=e.getEid()%>">   

</tr>

<tr>
<td> First name</td>
<td><input type = "text" name = "fname" value = "<%= e.getEinfo().getFname()%>"></td>
</tr>
<tr>
<td> Last name</td>
<td><input type = "text" name = "lname" value = "<%= e.getEinfo().getLname()%>"></td>
</tr>
<tr>
<td> Email</td>
<td><input type = "text" name = "email" value = "<%= e.getEinfo().getEmail()%>"></td>
</tr>
<tr>
<td> JOB</td>
<td><input type = "text" name = "job" value = "<%= e.getJob()%>"></td>
</tr>
<tr>
<td> Dept</td>
<td><input type = "text" name = "dept" value = "<%= e.getDept()%>"></td>
</tr>

<tr>

<tr>
<td colspan ="2" align ="center">
<input type = "submit" name="action" value ="update" class="btn btn-primary"> 
</td>
</tr>


</table>

</form>

</body>
</html>