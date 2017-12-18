<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login </title>

<script type="text/javascript">
            function validate()
            {
                var a = document.getElementById("loginname");
                var b = document.getElementById("password");
                var valid = true;
                if(a.value.length<=0 || b.value.length<=0)
                    {
                        alert("Don't leave the field empty!");
                        valid = false;
                    }
                   /*  else{
                        if(isNaN(c) || isNaN(d)){
                            alert("Enter a number");
                    		valid = false;
                    	}
                	} */
                return valid;
            };

        </script>
</head>
<body>
<h3>Login Form</h3>
<FONT color="blue">
</FONT>
<form:form action="login"  commandName="login" onsubmit="return validate();">
	<table>
		<tr>
			<td>Login Name :<FONT color="red"><form:errors
				path="loginname" /></FONT></td>
		</tr>
		<tr>
			<td><form:input id="loginname" path="loginname" /></td>
		</tr>
		<tr>
			<td>Password :<FONT color="red"><form:errors
				path="password" /></FONT></td>
		</tr>
		<tr>
			<td><form:password id="password" path="password" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>