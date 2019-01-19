<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agent Create</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>

<body>

	<div class="form-container">

		<h1>Register Form</h1>

		<form:form method="POST" modelAttribute="agent"
			class="form-horizontal">

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="agentName">agentName</label>
					<div class="col-md-7">
						<form:input type="text" path="agentName" id="agentName"
							class="form-control input-sm" />

						<div class="has-error">
							<form:errors path="agentName" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="agentAddress">agentAddress</label>
					<div class="col-md-7">
						<form:input type="text" path="agentAddress" id="agentAddress"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="agentAddress" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="agentPhone">agentPhone</label>
					<div class="col-md-7" class="form-control input-sm">
						<form:input type="text" path="agentPhone" id="agentPhone"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="agentPhone" class="help-inline" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Register"
						class="btn btn-primary btn-sm">
				</div>
			</div>

		</form:form>
	</div>
</body>
</html>