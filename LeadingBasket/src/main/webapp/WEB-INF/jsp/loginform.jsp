<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
	<title>LeadingBasket</title>
</head>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="/bootstrapvalidator/dist/css/bootstrapValidator.css">
<link rel="stylesheet" href="/bootstrapvalidator/dist/css/bootstrapValidator.min.css">
<script type="text/javascript"src="/bootstrapvalidator/dist/js/bootstrapValidator.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	

<body>
<div class="container">

    <form class="well form-horizontal" action="/user/successlogin" method="post">
<fieldset>

<!-- Form Name -->
<legend><center><h2><b>Login Form</b></h2></center></legend><br>

<!-- email input-->

<div class="form-group">
  <label class="col-md-4 control-label">Email</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="email" placeholder="Enter Email Address" class="form-control"  type="email" required="required">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Password</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="password" placeholder="Enter Password" class="form-control"  type="password" required="required" >
    </div>
  </div>
</div>
<!-- Button -->
<div class="form-group">
  <label class="col-md-6 control-label"></label>
  <div class="col-md-4"><br>
    <button type="submit" class="btn btn-warning">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspLogin <span class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
  </div>
</div>

</fieldset>
</form>
</div>
</body>
</html>