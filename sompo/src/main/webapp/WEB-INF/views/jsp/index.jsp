

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html lang="en">
<head>
<title>Java Fresher</title>
<meta charset="UTF-8">
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
	<!-- agent url -->
	<c:url value="/agent-list" var="urlList" />
	<c:url value="/agent-save" var="urlSave" />
	<c:url value="/agentDelete" var="urlDelete" />
	<c:url value="/agent-search" var="urlSearch" />
	
	<!-- contract url -->
	<c:url value="/contract-list" var="cList" />
	<c:url value="/contract-save" var="cSave"/>
	<c:url value="/contractDelete" var="cDelete"/>
	<c:url value="/contract-search" var="cSearch" />
	
	<%@ include file="layout/nav.jsp" %>

<form role="main" class="container">
    <div class="jumbotron text-center">
        <h1>Spring MVC and Hibernate</h1>
        <p class="lead text-info">Phan Thi Tuong Vi <br> Le Thai </p>
    </div>
</form>
</body>