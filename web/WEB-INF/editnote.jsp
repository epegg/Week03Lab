<%-- 
    Document   : editnote
    Created on : Sep 20, 2018, 12:14:56 PM
    Author     : 752814
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <form method="post" action="note">
            <h1>Simple Note Keeper</h1>
            <h2>Edit Note</h2>
            <h3>Title: <input type="text" id="title" name="title" value="${note.title}"/></h3>
            <h3>Contents: <textarea id="contents" name="contents">${note.contents}</textarea></h3>
            <a href="viewnote.jsp"><input type="submit" value="Save"></a>
        </form>
    </body>
</html>
