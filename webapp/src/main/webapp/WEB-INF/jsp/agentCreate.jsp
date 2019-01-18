<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Agent Create</title>
	<link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/resources/css/custom.css' />" rel="stylesheet"></link>
</head>

<body>

 	<div class="form-container">
 	
 	<h1>Register Form</h1>
 	
	<form:form method="POST" modelAttribute="agent" class="form-horizontal">

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="agentName">agentName</label>
				<div class="col-md-7">
					<form:input type="text" path="agentName" id="agentName" class="form-control input-sm"/>
					
					<div class="has-error">
						<form:errors path="agentName" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="agentAddress">agentAddress</label>
				<div class="col-md-7">
					<form:input type="text" path="agentAddress" id="agentAddress" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="agentAddress" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="agentPhone">agentPhone</label>
				<div class="col-md-7">
					<form:input type="text" path="agentPhone" id="agentPhone" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="agentPhone" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>


		<div class="row">
			<div class="form-actions floatRight">
				<input type="submit" value="Register" class="btn btn-primary btn-sm">
			</div>
		</div>
	</form:form>
	</div>
</body>
</html>