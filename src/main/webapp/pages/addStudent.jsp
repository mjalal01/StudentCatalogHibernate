<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Add Student</title>
    </head>
    <body>
        Add Student
        <br/>
        <form name ="form1" action="${pageContext.request.contextPath}/ServletAdd" method="post">
            Name: <input type="text" name="name" >
            <br/>
            <br/>
            Address:
            <br/>
            Street Name: <input type="text" name="streetName">
            <br/>
            Street Number: <input type="text" name="streetNumber">
            <br/>
            Country: <input type="text" name="country">
            <br/>
            <input type="submit" name="add" value="Add">
        </form>
    </body>
</html>