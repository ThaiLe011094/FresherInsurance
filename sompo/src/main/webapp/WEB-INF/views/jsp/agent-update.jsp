<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Sompo Agent</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<%@ include file="layout/nav.jsp" %>
	<a href="<c:url value="/agent-list" />">List Agent</a>
	<br />
	<h1 class="navbar-brand">Edit Agent:</h1>
	<c:url value="/updateAgent" var="updateAgent" />
	<form:form action="${updateAgent}" method="POST" modelAttribute="agent">
		<div class="form-group">
	    Agent ID: <form:input path="agentId" readonly="true" class="form-control"  /> <br/> <br/> 
	    </div>
	    <div class="form-group">
    	Agent Name: <form:input path="agentName" class="form-control"  /> <br/> <br/>
    	</div>
    	<div class="form-group">
    	Agent Address: <form:input path="agentAddress" class="form-control"  /> <br/> <br/>
    	</div>
    	<div class="form-group">
    	Agent Phone: <form:input path="agentPhone" class="form-control" /> <br/> <br/>
    	</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
</div>
</body>
</html>