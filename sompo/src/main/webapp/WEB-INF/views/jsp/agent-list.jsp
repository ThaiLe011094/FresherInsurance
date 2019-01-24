<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Sompo Agent</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style>
.navbar-brand {
	font-size: 30px;
	text-align: center;
}
</style>
</head>

<body>
	<c:url value="/agent-save" var="urlSave" />
	<c:url value="/agent-view" var="urlView" />
	<c:url value="/agent-update" var="urlUpdate" />
	<c:url value="/agentDelete" var="urlDelete" />

	<%@ include file="layout/nav.jsp"%>
	<div>
		<span><a class="navbar-brand">List of Agents</a></span>

		<br /> <br /> <br /> <br /> <br />

		<div class="btn-group btn-group-justified">
			<a href="${urlSave}" class="btn btn-primary">Add Agent</a>
		</div>

		<br>
		<br>
		
		<table class="table table-hover" id="myTable">
			<tr class="warning">
				<th>Agent ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>Phone</th>
			</tr>
			<c:if test="${not empty listAgent}">
				<c:forEach var="agent" items="${listAgent}">
					<tr style="border: 1px black solid">
						<td class="success">${agent.agentId}</td>
						<td class="success">${agent.agentName}</td>
						<td class="success">${agent.agentAddress}</td>
						<td class="success">${agent.agentPhone}</td>
						<td><a href="${urlView}/${agent.agentId}">View</a></td>
						<td><a href="${urlUpdate}/${agent.agentId}">Edit</a></td>
						<td><a href="${urlDelete}/${agent.agentId}">Delete</a></td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
	<hr class="clearfix w-100 d-md-none pb-3">
	<hr class="clearfix w-100 d-md-none pb-3">

</body>
</html>