<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Sompo Contract</title>
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
</style>
</head>
<body>
	<c:url value="/contract-save/" var="cSave" />
	<c:url value="/contract-view/" var="cView" />
	<c:url value="/contract-update/" var="cUpdate" />
	<c:url value="/contractDelete/" var="cDelete" />

	<%@ include file="layout/nav.jsp"%>
	<span><a class="navbar-brand">List of Contracts</a></span>

	<br />
	<br />
	<br />
	<br />
	<br />

	<div class="btn-group btn-group-justified">
		<a href="${cSave}" class="btn btn-primary">Add Contract</a>
	</div>

	<br>
	<br>


	<table class="table table-hover">
		<tr>
			<th>Contract ID</th>
			<th data-formatter="dateFormat">Effective Day</th>
			<th data-formatter="dateFormat">Expiry Day</th>
			<th>Agent ID</th>
			
		</tr>
		<c:if test="${not empty listContract}">
			<c:forEach var="contract" items="${listContract}">
				<tr style="border: 1px black solid">
					<td>${contract.contractId}</td>
					<td  data-formatter="dateFormat" type="date">${contract.contractEff}</td>
					<td data-formatter="dateFormat">${contract.contractExp}</td>
					<td>${contract.agentId}</td>
					<td><a href="${cView}/${contract.contractId}">View</a></td>
					<td><a href="${cUpdate}/${contract.contractId}">Edit</a></td>
					<td><a href="${cDelete}/${contract.contractId}">Delete</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>

	<hr class="clearfix w-100 d-md-none pb-3">
	<hr class="clearfix w-100 d-md-none pb-3">
	<script >
		function dateFormat(value, row, index) {
			return moment(value).format('DD/MM/YYYY');
		}
	</script>
	
</body>
</html>