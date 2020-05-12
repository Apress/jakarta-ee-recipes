<%-- 
    Document   : recipe01_09
    Author     : juneau
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recipe 1-9: JSP Page Example</title>
    </head>
    <body>
        <jsp:useBean id="dateBean" scope="application" class="org.jakartaeerecipes.chapter01.recipe01_09.DateBean"/>
        <h1>Hello World!</h1>
        <br/>
        <p>
            The current date is: ${dateBean.currentDate}!
        </p>
    </body>
</html>
