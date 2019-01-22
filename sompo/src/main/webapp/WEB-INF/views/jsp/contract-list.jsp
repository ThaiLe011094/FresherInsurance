<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Sompo Contract</title>
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
	<c:url value="/contract-save/" var="cSave"/>
	<c:url value="/contract-view/" var="cView"/>
	<c:url value="/contract-update/" var="cUpdate"/>
	<c:url value="/contractDelete/" var="cDelete"/>
	<h1>List Contract:</h1>
	<a href="${cSave}">Add Contract</a>
	<br />
	<br />


	<table>
		<tr>
			<th>contractID</th>
			<th>contractEff</th>
			<th>contractExp</th>
			<th>agentId</th>
			<th>View</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:if test="${not empty listContract}">
			<c:forEach var="contract" items="${listContract}">
				<tr style="border: 1px black solid">
					<td>${contract.contractId}</td>
					<td>${contract.contractEff}</td>
					<td>${contract.contractExp}</td>
					<td>${contract.agentId}</td>
					<td> <a href="${cView}/${contract.contractId}">View</a></td>
					<td> <a href="${cUpdate}/${contract.contractId}">Edit</a></td>
					<td> <a href="${cDelete}/${contract.contractId}">Delete</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>

</body>
</html>