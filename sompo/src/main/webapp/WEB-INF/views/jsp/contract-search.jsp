<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Sompo Contract</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<style>
.navbar-brand {
	font-size: 30px;
	text-align: center;
}
</style>
</head>

<body>
	<c:url value="/contract-save" var="cSave" />
	<c:url value="/contract-view" var="cView" />
	<c:url value="/contract-update" var="cUpdate" />
	<c:url value="/contractDelete" var="cDelete" />

	<%@ include file="layout/nav.jsp"%>
	<div class="container mt-3">
		<span><a class="navbar-brand">Search for Contracts</a></span> <br /> <br />
		<br /> <br /> <br />
		<c:url value="/searchContract" var="searchContract" />
		<form:form action="${searchContract}" method="POST"
			modelAttribute="contract">
			<!-- search input -->
			<div class="form-group">
				<label for="comment">Search for</label> <input class="form-control"
					id="myInput" placeholder="Keyword...">
			</div>
			<table class="table table-hover">
				<tr class="warning">
					<th>Contract ID</th>
					<th>Efficiency Date</th>
					<th>Expiration Date</th>
					<th>Contract ID</th>
				</tr>
				<c:if test="${not empty listContract}">
					<c:forEach var="contract" items="${listContract}">
						<tbody id="myTable">

							<tr style="border: 1px black solid">
								<td class="success">${contract.contractId}</td>
								<td class="success">${contract.contractEff}</td>
								<td class="success">${contract.contractExp}</td>
								<td class="success">${contract.agentId}</td>

							</tr>
						</tbody>
					</c:forEach>
				</c:if>
			</table>
		</form:form>
	</div>
	<hr class="clearfix w-100 d-md-none pb-3">
	<hr class="clearfix w-100 d-md-none pb-3">
	<script>
	$(document).ready(function(){
		  $("#myInput").on("keyup", function() {
		    var value = $(this).val().toLowerCase();
		    $("#myTable tr").filter(function() {
		      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
		    });
		  });
		});
		</script>

</body>
</html>