<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; charset=UTF-8" %>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="navbar navbar-expand-md navbar-dark bg-dark mb-4" role="navigation">
    <a class="navbar-brand" href="#">Assignment Java Fresher</a>
    
    
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    
    
    
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            
           
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="dropdown1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Agent</a>
                <ul class="dropdown-menu" aria-labelledby="dropdown1">
                    <li class="dropdown-item" ><a href="<c:url value="/agent-save" />">Create Agent</a></li>
                    <li class="dropdown-item" ><a href="<c:url value="/agent-update" />">Modify Agent</a></li>
                    <li class="dropdown-item" ><a href="<c:url value="/agent-view" />">Inquiry Agent</a></li>
                    <li class="dropdown-item" ><a href="<c:url value="/agent-save" />">Search Agent</a></li>
            
                </ul>
            </li>
            
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="dropdown2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Contract</a>
                <ul class="dropdown-menu" aria-labelledby="dropdown2">
                    <li class="dropdown-item" ><a href="<c:url value="/contract-save" />">Create Contract</a></li>
                    <li class="dropdown-item" ><a href="<c:url value="/contract-update" />">Modify Contract</a></li>
                    <li class="dropdown-item" ><a href="<c:url value="/contract-view" />">Inquiry Contract</a></li>
                    <li class="dropdown-item" ><a href="#">Search Contract</a></li>
                </ul>
            </li>
        </ul>
       
    </div>
</div>

<form role="main" class="container">
    <div class="jumbotron text-center">
        <h1>Spring MVC and Hibernate</h1>
        <p class="lead text-info">Lê Thái <br> Phan Thị Tường Vi</p>
    </div>
</form>