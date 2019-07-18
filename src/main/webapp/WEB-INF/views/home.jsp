<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login</title>
    </head>
    <body>
        <form:form id="loginForm" method="post" action="loginProcess" modelAttribute="login">
                 <table>
                      <tr>
                          <td>First Name:</td>
                          <td><form:input path="username" /></td>
                      </tr>
                      <tr>
                          <td>LPassword:</td>
                          <td><form:input path="password" /></td>
                      </tr>
                      <tr>
                          <td colspan="2">
                              <input type="submit" value="Save Changes" />
                          </td>
                      </tr>
                  </table>
              </form:form>

    </body>
</html>