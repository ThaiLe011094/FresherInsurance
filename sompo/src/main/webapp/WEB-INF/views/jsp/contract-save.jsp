<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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

</head>
<body>
<%@include file="layout/nav.jsp" %>
	<a href="<c:url value="/contract-list" />" >List Contract</a><br />
	<a href="<c:url value="/agent-list" />" >List Agent</a><br />

	<h2 class="navbar-brand">Add new Contract:</h2>
	<c:url value="/saveContract" var="saveContract"/>
	<form:form action="${saveContract}" method="POST"
		modelAttribute="contract">
		
		<div class="form-group">
			<label for="effday">Effective Day:</label>
			<form:input path="contractEff" type="text" class="form-control" id="effday"
				placeholder="MM/dd/yyyy" />
		</div>
    	 
    	 
    	 <div class="form-group">
			<label for="expday">Expiry Day:</label>
			<form:input path="contractExp" type="text" class="form-control" id="expday"
				placeholder="MM/dd/yyyy" />
		</div>
    	
    	
    	<div class="form-group">
			<label for="name">Agent ID</label>
			<form:input path="agentId" type="text" class="form-control" id="name"
				placeholder="Agent ID..." />
			<button class="btn pull-right" >search agent ID</button>
		</div>
		<button type="submit"  class="btn btn-primary">Submit</button>
	</form:form>

</body>
</html>