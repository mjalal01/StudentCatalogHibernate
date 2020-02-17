<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>List of Students</title>
    </head>
    <body>
        List of Students
        <br/>
        <a href="/StudentCatalogHib/pages/addStudent.jsp">
            AddStudent
        </a>
        <br/>
        <table border="1">
            <tr>
                <th>Student ID</th>
                <th>Name</th>
                <th>Street name</th>
                <th>Street number</th>
                <th>Country</th>
            </tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.id_student}</td>
                    <td>${student.name}</td>
                    <td>${student.address.street_name }</td>
                    <td>${student.address.street_number }</td>
                    <td>${student.address.country }</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>