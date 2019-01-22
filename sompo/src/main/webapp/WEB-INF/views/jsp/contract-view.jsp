<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Sompo Contract</title>
</head>
<body>
	<a href="<c:url value="/contract-list" />" >List Contract</a><br />
	<a href="<c:url value="/agent-list" />" >List Agent</a><br />
	<h1>View Contract:</h1>	
	contractId: ${contract.contractId} <br/>
	contractEff: ${contract.contractEff} <br/>
	contractExp: ${contract.contractExp} <br/>
	agentId: ${contract.agentId} <br/>
</body>
</html>