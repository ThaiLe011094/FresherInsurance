<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Sompo Contract</title>
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
		<a href="<c:url value="/contract-list" />">List Contract</a><br /> <a
			href="<c:url value="/agent-list" />">List Agent</a><br />
		<h2 class="navbar-brand">View Contract</h2>


		<form action="">

			<c:url value="/contract-view" var="viewContract" />
			<form:form action="${viewContract}" method="POST"
				modelAttribute="contract">
				<div class="form-group">
					<label for="name">Contract ID:</label> ${contract.contractId}
				</div>
				<div class="form-group">
					<label for="name"> Effective Day: </label> ${contract.contractEff}
				</div>
				<div class="form-group" >
					<label for="address"> Expiry Day: </label> <label >${contract.contractExp}</label> 
				</div>
				<div class="form-group">
					<label for="name"> Agent ID: </label> <span>${contract.agentId}
					</span>
				</div>
			</form:form>

		</form>
	</div>

	
</body>
</html>