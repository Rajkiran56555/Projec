<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Your Btech College</title>
</head>
<body>
<h2>
Find Your BTech College here
</h2>
<form action="find" method="get">
Enter Rank:<input type="text" name="rank"><br>
Gender:  Male<input type="radio" name="gender" value="male"> 
Female <input type="radio" name="gender" value="female">
<br>
Select Category:
<select name="category">
<option value="OC">OC</option>
<option value="BC-A">BC-A</option>
</select>
<br>
Select Your preferred District: <select name="district">
<option value="Warangal">Hyderabad</option>
<option value="Rangareddy">Ranga Reddy</option>
</select>
<input type=submit value="Submit">

</form>
Table here
<br>
<c:if test="${colleges.size()>=1}">
<table style="border:1px solid black">
<c:forEach var="emp" items="${colleges}">   
   <tr style="border:1px solid black"> 
   <td style="border:1px solid black"> 
  ${emp.college} 
  </td>
   <td style="border:1px solid black"> 
  ${emp.branch} 
  </td>
   <td style="border:1px solid black"> 
  ${emp.district} 
  </td>
   <td style="border:1px solid black"> 
  ${emp.OC_B} 
  </td>
   </tr>  
   </c:forEach> 
   </table>
   </c:if>
  <c:if test="${colleges.size()<1}">
  No Results Found
  </c:if>
</body>
</html>