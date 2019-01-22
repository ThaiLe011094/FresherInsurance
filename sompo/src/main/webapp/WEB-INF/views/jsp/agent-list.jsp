<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Sompo Agent</title>
<style>
table, th, td {
	border: 1px solid black;
}
td {
	padding-right: 30px;
}
</style>
</head>
<body>
	<c:url value="/agent-save/" var="urlSave"/>
	<c:url value="/agent-view/" var="urlView"/>
	<c:url value="/agent-update/" var="urlUpdate"/>
	<c:url value="/agentDelete/" var="urlDelete"/>
	<h1>List Agent:</h1>
	<a href="${urlSave}">Add Agent</a>
	<br />
	<br />


	<table>
		<tr>
			<th>agentID</th>
			<th>agentName</th>
			<th>agentAddress</th>
			<th>agentPhone</th>
			<th>View</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:if test="${not empty listAgent}">
			<c:forEach var="agent" items="${listAgent}">
				<tr style="border: 1px black solid">
					<td>${agent.agentId}</td>
					<td>${agent.agentName}</td>
					<td>${agent.agentAddress}</td>
					<td>${agent.agentPhone}</td>
					<td> <a href="${urlView}/${agent.agentId}">View</a></td>
					<td> <a href="${urlUpdate}/${agent.agentId}">Edit</a></td>
					<td> <a href="${urlDelete}/${agent.agentId}">Delete</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>

</body>
</html>