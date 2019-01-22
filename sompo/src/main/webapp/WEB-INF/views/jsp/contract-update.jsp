<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Sompo Contract</title>
</head>
<body>
	<a href="<c:url value="/contract-list" />">List Contract</a>
	<br />

	<h1>Edit Contract:</h1>
	<c:url value="/updateContract" var="updateContract" />
	<form:form action="${updateContract}" method="POST" modelAttribute="contract">
	    contractId: <form:input path="contractId" readonly="true" /> <br/> <br/>
    	contractEff: <form:input path="contractEff" /> <br/> <br/>
    	contractExp: <form:input path="contractExp" /> <br/> <br/>
    	agentId: <form:input path="agentId" readonly="true" /> <br/> <br/>
		<button type="submit">Submit</button>
	</form:form>

</body>
</html>