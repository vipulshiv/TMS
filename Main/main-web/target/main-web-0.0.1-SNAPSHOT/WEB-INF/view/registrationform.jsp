<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<script type="text/javascript">
            function validate()
            {
            	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
            	
            	var name = document.getElementById("name");
                var contact = document.getElementById("contact");
                var address = document.getElementById("address");
                var loginname = document.getElementById("loginname");
                var password = document.getElementById("password");
                var email = document.getElementById("email");
				var contact2 = document.getElementById("contact").value;
				//var d = document.getElementById("password").value;
                var valid = true;
                if(name.value.length<=0 || contact.value.length<=0 
                	|| address.value.length<=0 || loginname.value.length<=0
                	|| password.value.length<=0 || email.value.length<=0)
                    {
                        alert("Don't leave the field empty!");
                        valid = false;
                    }
                    else if(isNaN(contact2)){
                       	alert("Invalid contact No please Enter proper No.");
                   		valid = false;
                	}else{
                		if(email.value.match(mailformat)){
                			valid = true;
                		}else{
                			alert("Invalid EMail Id.Please enter the valid email Id.");
                			valid = false;
                		}
                	}
                return valid;
            };
            

        </script>
</head>
<body>
<form:form method="Post" action="register"
	commandName="registration" onsubmit="return validate();">
	<table>
	
	<tr>
			<td>Name:<FONT color="red"><form:errors
				path="name" /></FONT></td>
	</tr>
	<tr>
			<td><form:input id="name" path="name" /></td>
	</tr>
	<tr>
			<td>Contact :<FONT color="red"><form:errors
				path="contact" /></FONT></td>
	</tr>
	<tr>
			<td><form:input id="contact" path="contact" /></td>
	</tr>
	<tr>
			<td>Address :<FONT color="red"><form:errors
				path="address" /></FONT></td>
	</tr>
	<tr>
			<td><form:input id="address" path="address" /></td>
	</tr>
	
		<tr>
			<td>Login Name:<FONT color="red"><form:errors
				path="loginname" /></FONT></td>
		</tr>
		<tr>
			<td><form:input id="loginname" path="loginname" /></td>
		</tr>
		<tr>
			<td>Password:<FONT color="red"><form:errors
				path="password" /></FONT></td>
		</tr>
		<tr>
			<td><form:password id="password" path="password" /></td>
		</tr>
		<tr>
			<td>Email:<FONT color="red"><form:errors path="email" /></FONT></td>
		</tr>
		<tr>
			<td><form:input id="email" path="email" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>