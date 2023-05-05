<%-- 
    Document   : response
    Created on : 5/05/2023, 03:25:29 PM
    Author     : julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <h1>Cual es mi edad?</h1>  
    <h2>
    <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" 
/> 
      
     <jsp:setProperty name="mybean" property="name" /> 
     <jsp:setProperty name="mybean" property="fecha" />
    
        <jsp:getProperty name="mybean" property="name" />, tu edad es:<jsp:getProperty name="mybean" property="fecha" />
    </h2>
    
</body>
</html>
