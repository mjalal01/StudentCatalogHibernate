<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Modify Student</title>
    </head>
    <body>
        Modify Student
        <br/>
        <form name ="form1" action="${pageContext.request.contextPath}/ServletModify" method="post">
            Id Student: <input type="text" name="idStudent" value="${student.idStudent}" readonly="readonly">
            <br/>
            Name: <input type="text" name="name" value="${student.name}">
            <br/>

            <br/>
            Address:
            <br/>
            Street Name: <input type="text" name="streetName" value="${student.address.streetName}">
            <br/>
            Street Number: <input type="text" name="streetNumber" value="${student.address.streetNumber}">
            <br/>
            Country: <input type="text" name="country" value="${student.address.country}">
            <br/>

            <input type="submit" name="modify" value="modify">
            <input type="submit" name="delete" value="delete">

            <!--  We do not need to handle hidden values since we will 
            rely on the object in session for editing -->
        </form>
    </body>
</html>