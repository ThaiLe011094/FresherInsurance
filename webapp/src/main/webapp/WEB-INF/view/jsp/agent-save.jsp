<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Sompo Agent</title>
</head>
<body>
	<a href="<c:url value="/agent-list" />" >List Agent</a><br />

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