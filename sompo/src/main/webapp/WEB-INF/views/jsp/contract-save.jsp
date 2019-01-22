<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Sompo Contract</title>
</head>
<body>
	<a href="<c:url value="/contract-list" />" >List Contract</a><br />
	<a href="<c:url value="/agent-list" />" >List Agent</a><br />

	<h1>Add new Contract:</h1>
	<c:url value="/saveContract" var="saveContract"/>
	<form:form action="${saveContract}" method="POST"
		modelAttribute="contract">
    	contractEff: <form:input path="contractEff" /> <br/> <br/>
    	contractExp: <form:input path="contractExp" /> <br/> <br/>
    	agentId: <form:input path="agentId" /> <br/> <br/>
		<button type="submit">Submit</button>
	</form:form>

</body>
</html>