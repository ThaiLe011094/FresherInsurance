<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Sompo Agent</title>
</head>
<body>
	<a href="<c:url value="/agent-list" />" >List Agent</a><br />
	<h1>View Agent:</h1>	
	agentId: ${agent.agentId} <br/>
	agentName: ${agent.agentName} <br/>
	agentAddress: ${agent.agentAddress} <br/>
	agentPhone: ${agent.agentPhone} <br/>
</body>
</html>