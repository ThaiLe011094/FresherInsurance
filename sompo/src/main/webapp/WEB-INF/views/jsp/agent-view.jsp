
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html lang="en">
<head>
<title>Create Agent</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
	<%@ include file="layout/nav.jsp"%>
	<div class="container">
		<a href="<c:url value="/agent-list" />">List Agent</a><br /> <a
			href="<c:url value="/contract-list" />">List Contract</a><br /> <br>
		<br>
		<h2 class="navbar-brand">View Agent</h2>
		<form>
			<c:url value="/agent-view" var="viewAgent" />
			<form:form action="${viewAgent}" method="POST" modelAttribute="agent">
				<div class="form-group">
					<label for="name">Agent ID:</label> ${agent.agentId}
				</div>
				<div class="form-group">
					<label for="name"> Agent Name: </label> ${agent.agentName}
				</div>
				<div class="form-group">
					<label for="address"> Agent Address: </label> ${agent.agentAddress}
				</div>
				<div class="form-group">
					<label for="name"> Agent Phone: </label> <span>${agent.agentPhone}
					</span>
				</div>
			</form:form>
		</form>
	</div>

</body>