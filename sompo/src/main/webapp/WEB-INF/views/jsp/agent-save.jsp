<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!--  
<html>
<head>
<title>Sompo Agent</title>
</head>
<body>
	<a href="<c:url value="/agent-list" />" >List Agent</a><br />
	<a href="<c:url value="/contract-list" />" >List Contract</a><br />

	<h1>Add new Agent:</h1>
	<c:url value="/saveAgent" var="saveAgent"/>
	<form:form action="${saveAgent}" method="POST"
		modelAttribute="agent">
    	agentName: <form:input path="agentName" /> <br/> <br/>
    	agentAddress: <form:input path="agentAddress" /> <br/> <br/>
    	agentPhone: <form:input path="agentPhone" /> <br/> <br/>
		<button type="submit">Submit</button>
	</form:form>

</body>
</html>
-->


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
<%@include file="layout/nav.jsp" %>
	<div class="container">
		<a href="<c:url value="/agent-list" />">List Agent</a><br /> <a
			href="<c:url value="/contract-list" />">List Contract</a><br />
		<br>
		<br>
		<h2 class="navbar-brand">Add new Agent:</h2>
		<form:form action="${saveAgent}" method="POST"
		modelAttribute="agent">

			<div class="form-group">
				<label for="name">Name Agent:</label>
				<form:input path="agentName" type="text" class="form-control" id="agent" 
					placeholder="The name agent" />
			</div>
			<div class="form-group">
				<label for="address">Address Agent:</label>
				<form:input path="agentAddress" type="text" class="form-control"
					id="address" placeholder="Enter the address" />
			</div>

			<div class="form-group">
				<label for="mobile">Mobile Agent:</label>
				<form:input path="agentPhone" type="text" class="form-control"
					id="mobile" placeholder="Enter the mobile" />

			</div>


			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>

</body>