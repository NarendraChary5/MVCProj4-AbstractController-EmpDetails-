<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${empList ne null}">
		<table align="center" width="90%" border="0">
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Designation</td>
				<td>Salary</td>
			</tr>
			<c:forEach var="emp" items="${empList}">
				<tr>
					<td><c:out value="${emp.id}" /></td>
					<td><c:out value="${emp.name}" /></td>
					<td><c:out value="${emp.desg}" /></td>
					<td><c:out value="${emp.salary}" /></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
	Record data found
	</c:otherwise>
</c:choose>