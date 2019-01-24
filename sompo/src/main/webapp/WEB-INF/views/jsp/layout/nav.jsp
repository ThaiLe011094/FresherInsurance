<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <body>
<div class="navbar navbar-expand-md navbar-dark bg-dark mb-4" role="navigation">
    <a class="navbar-brand" href="<c:url value="/index" />">Assignment Java Fresher</a>
    
    
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    
    <c:url value="/agent-save" var="urlSave" />
	<c:url value="/agent-list" var="urlView" />
	<c:url value="/agent-update" var="urlUpdate" />
	<c:url value="/agentDelete" var="urlDelete" />
	<c:url value="/contract-save" var="cSave" />
	<c:url value="/contract-list" var="cView" />
	<c:url value="/contract-update" var="cUpdate" />
	<c:url value="/contractDelete" var="cDelete" />
    
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="<c:url value="/index" />">Home <span class="sr-only">(current)</span></a>
            </li>
            
           
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="dropdown1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Agent</a>
                <ul class="dropdown-menu" aria-labelledby="dropdown1">
                	<li class="dropdown-item" ><a href="${urlList}">List Agent</a></li>
                    <li class="dropdown-item" ><a href="${urlSave}">Create Agent</a></li>
                    <li class="dropdown-item" ><a href="${urlSearch}">Search Agent</a></li>
                </ul>
            </li>
            
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="dropdown2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Contract</a>
                <ul class="dropdown-menu" aria-labelledby="dropdown2">
                	<li class="dropdown-item" ><a href="${cList}">List Contract</a></li>
                    <li class="dropdown-item" ><a href="${cSave}">Create Contract</a></li>
                    <li class="dropdown-item" ><a href="${cSearch}">Search Contract</a></li>
                </ul>
            </li>
        </ul>
       
    </div>
</div>
</body>