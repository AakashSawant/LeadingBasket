<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
	<title>LeadingBasket</title>
</head>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="bootstrapvalidator/dist/css/bootstrapValidator.css">
<link rel="stylesheet" href="bootstrapvalidator/dist/css/bootstrapValidator.min.css">
<script type="text/javascript"src="bootstrapvalidator/dist/js/bootstrapValidator.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
<script type="text/javascript">
$("#state").change(function() {
	  if ($(this).data('options') === undefined) {
	    /*Taking an array of all options-2 and kind of embedding it on the select1*/
	    $(this).data('options', $('#city option').clone());
	  }
	  var id = $(this).val();
	  var options = $(this).data('options').filter('[value=' + id + ']');
	  $('#city').html(options);
	});
</script>
<body>
<div class="container">

    <form class="well form-horizontal" action="/user/userSave" method="post">
<fieldset>

<!-- Form Name -->
<legend><center><h2><b>Registration Form</b></h2></center></legend><br>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">First Name</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="first_name" placeholder="First Name" class="form-control"  type="text" required="required">
    </div>
  </div>
</div>

<!-- Text input-->


<div class="form-group">
  <label class="col-md-4 control-label" >Last Name</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="last_name" placeholder="Last Name" class="form-control"  type="text" required="required" >
    </div>
  </div>
</div>

<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">Contact No.</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input name="mobile" placeholder="(+91)" class="form-control" type="text" required="required">
    </div>
  </div>
</div>

<!-- Date-->
  <div class="form-group">
  <label class="col-md-4 control-label ">Date of Birth</label>  
    <div class="col-md-4">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon glyphicon-calendar"></i></span>
  <input name="dob" placeholder="dd-mm-yy" class="form-control" type="date" required="required">
    </div>
  </div>
</div>


<!-- Text input-->
 <div class="form-group">
  <label class="col-md-4 control-label">E-Mail</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="email" placeholder="E-Mail Address" class="form-control"  type="text" required="required">
    </div>
  </div>
</div>
  
<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Address</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
  <textarea  name="address" class="form-control" rows="5" required="required"></textarea>
   
    </div>
  </div>
</div>
<!--gender-->

<div class="form-group">
  <label class="col-md-4 control-label">Select Gender</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
		<label class="radio-inline"><input type="radio" value="MALE" name="gender" checked>MALE</label>
		<label class="radio-inline"><input type="radio" value="FEMALE" name="gender">FEMALE</label>
  </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Password</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon  glyphicon-pawn"></i></span>
  <input name="user_password" placeholder="Password" class="form-control"  type="password" required="required">
    </div>
  </div>
</div>

<!--state-->
<div class="form-group"> 
  <label class="col-md-4 control-label">State</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
    <select name="state" id="state" class="form-control selectpicker" required="required">
      <option value="">Select State</option>
   		<c:forEach var="state" items="${state}">
   			<option value="${state.id}">${state.state_name}</option>
   		</c:forEach>	
       </select>
  </div>
</div>
</div>

<!--city-->
<div class="form-group"> 
  <label class="col-md-4 control-label">City</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
    <select name="city" id="city" class="form-control selectpicker" required="required">
      <option value="">Select City</option>
     		<c:forEach var="city" items="${city}">
   			<option value="${city.id}">${city.city_name}</option>
   		</c:forEach>	
      </select>
  </div>
</div>
</div>



<!-- Select Basic -->

<!-- Success message 
<div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i> Success!.</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-6 control-label"></label>
  <div class="col-md-4"><br>
    &nbsp&nbsp&nbsp<button type="submit" class="btn btn-warning">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT <span class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
  </div>
</div>

</fieldset>
</form>
</div>
    </div><!-- /.container -->
	
	</body>
	</html>