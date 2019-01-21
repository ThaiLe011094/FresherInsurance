<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Sompo Agent</title>
</head>
<body>
	<a href="<c:url value="/agent-list" />">List Agent</a>
	<br />

	<h1>Edit Agent:</h1>
	<c:url value="/updateAgent" var="updateAgent" />
	<form:form action="${updateAgent}" method="POST" modelAttribute="agent">
	    agentId: <form:input path="agentId" readonly="true" /> <br/> <br/>
    	agentName: <form:input path="agentName" /> <br/> <br/>
    	agentAddress: <form:input path="agentAddress" /> <br/> <br/>
    	agentPhone: <form:input path="agentPhone" /> <br/> <br/>
		<button type="submit">Submit</button>
	</form:form>

</body>
</html>