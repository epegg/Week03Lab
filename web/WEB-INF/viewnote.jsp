<%-- 
    Document   : viewnote
    Created on : Sep 20, 2018, 12:14:30 PM
    Author     : 752814
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <form method="get" action="note">
            <h1>Simple Note Keeper</h1>
            <h2>View Note</h2>
            <h3>Title: ${note.title}</h3>
            <h3>Contents: ${note.contents}</h3>
            <a href="note?edit">edit</a>
        </form>
    </body>
</html>
