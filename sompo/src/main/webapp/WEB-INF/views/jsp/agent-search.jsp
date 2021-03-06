<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Sompo Agent</title>
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
	<c:url value="/agent-save" var="urlSave" />
	<c:url value="/agent-view" var="urlView" />
	<c:url value="/agent-update" var="urlUpdate" />
	<c:url value="/agentDelete" var="urlDelete" />

	<%@ include file="layout/nav.jsp"%>
	<div class="container mt-3">
		<span><a class="navbar-brand">Search for Agents</a></span> <br /> <br />
		<br /> <br /> <br />
		<c:url value="/searchAgent" var="searchAgent" />
		<form:form action="${searchAgent}" method="POST"
			modelAttribute="agent">
			<!-- search input -->
			<div class="form-group">
				<label for="comment">Search for</label> <input class="form-control"
					id="myInput" placeholder="Keyword...">
			</div>
			<table class="table table-hover">
				<tr class="warning">
					<th>Agent ID</th>
					<th>Name</th>
					<th>Address</th>
					<th>Phone</th>
				</tr>
				<c:if test="${not empty listAgent}">
					<c:forEach var="agent" items="${listAgent}">
						<tbody id="myTable">

							<tr style="border: 1px black solid">
								<td class="success">${agent.agentId}</td>
								<td class="success">${agent.agentName}</td>
								<td class="success">${agent.agentAddress}</td>
								<td class="success">${agent.agentPhone}</td>

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