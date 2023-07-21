<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Overwatch Heroes</title>
</head>
<body>
    <h1>Overwatch Heroes</h1>

    <h2>Find Hero by ID</h2>
    <form action="${pageContext.request.contextPath}/api/heroes/${param.id}" method="GET">
        <label for="heroId">Hero ID:</label>
        <input type="number" name="id" id="heroId" required>
        <button type="submit">Find Hero</button>
    </form>

    <h2>All Heroes</h2>
    <ul>
        <c:forEach items="${heroes}" var="hero">
            <li>${hero.name} (${hero.role})</li>
        </c:forEach>
    </ul>

<h2>Create New Hero</h2>
<form action="${pageContext.request.contextPath}/api/heroes" method="POST">
    <label for="name">Name:</label>
    <input type="text" name="name" id="name" required><br>

    <label for="ultimate">Ultimate Ability:</label>
    <input type="text" name="ultimateability" id="ultimate" required><br>

    <label for="role">Role:</label>
    <input type="text" name="role" id="role" required><br>

    <label for="age">Age:</label>
    <input type="number" name="age" id="age" required><br>

    <label for="nationality">Nationality:</label>
    <input type="text" name="nationality" id="nationality" required><br>

    <label for="weapon">Weapon:</label>
    <input type="text" name="weapon" id="weapon" required><br>

    <button type="submit">Create Hero</button>
</form>



    <h2>Update Hero by ID</h2>
<form action="${pageContext.request.contextPath}/api/heroes/${param.updateId}" method="POST">
    <input type="hidden" name="_method" value="PUT">

    <label for="updateName">Name:</label>
    <input type="text" name="name" id="updateName" required><br>

    <label for="updateUltimate">Ultimate Ability:</label>
    <input type="text" name="ultimateability" id="updateUltimate" required><br>

    <label for="updateRole">Role:</label>
    <input type="text" name="role" id="updateRole" required><br>

    <label for="updateAge">Age:</label>
    <input type="number" name="age" id="updateAge" required><br>

    <label for="updateNationality">Nationality:</label>
    <input type="text" name="nationality" id="updateNationality" required><br>

    <label for="updateWeapon">Weapon:</label>
    <input type="text" name="weapon" id="updateWeapon" required><br>

    <button type="submit">Update Hero</button>
</form>


  			 <h2>Delete Hero by ID</h2>
		<form action="${pageContext.request.contextPath}/api/heroes/${param.deleteId}" method="POST">
   		<input type="hidden" name="_method" value="DELETE">
    	<input type="number" name="id" id="deleteId" required>
    	<button type="submit">Delete Hero</button>
</form>

</body>
</html>
