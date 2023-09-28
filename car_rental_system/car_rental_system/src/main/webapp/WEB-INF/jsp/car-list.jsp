
<!-- car-list.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Cars</title>
</head>
<body>
    <h1>List of Cars</h1>
    <!-- Add a table to display the list of cars -->
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Make</th>
                <th>Model</th>
                <!-- Add more table headers as needed -->
            </tr>
        </thead>
        <tbody>
            <!-- Loop through the list of cars and display them in rows -->
            <c:forEach items="${cars}" var="car">
                <tr>
                    <td>${car.id}</td>
                    <td>${car.make}</td>
                    <td>${car.model}</td>
                    <!-- Add more table data columns as needed -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
    