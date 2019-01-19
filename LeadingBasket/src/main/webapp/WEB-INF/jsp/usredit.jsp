<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lending Basket</title>
<link rel="stylesheet"
	href="assets/web/assets/mobirise-icons/mobirise-icons.css">
<link rel="icon" href="assets/images/logo2.png" type="image/gif"
	sizes="16x16">
<link rel="stylesheet" href="assets/tether/tether.min.css">
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="assets/bootstrap/css/bootstrap-grid.min.css">
<link rel="stylesheet"
	href="assets/bootstrap/css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="assets/dropdown/css/style.css">
<link rel="stylesheet" href="assets/animatecss/animate.min.css">
<link rel="stylesheet" href="assets/socicon/css/styles.css">
<link rel="stylesheet" href="assets/theme/css/style.css">
<link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css"
	type="text/css">
<link rel="stylesheet" href="assets2/tether/tether.min.css">
<link rel="stylesheet"
	href="assets/datatables/data-tables.bootstrap4.min.css">

<link rel="stylesheet"
	href="assets2/bootstrap/css/bootstrap-grid.min.css">
<link rel="stylesheet"
	href="assets2/bootstrap/css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="assets2/dropdown/css/style.css">

<link rel="stylesheet" href="assets2/socicon/css/styles.css">
<link rel="stylesheet" href="assets2/theme/css/style.css">
<link rel="stylesheet" href="assets2/mobirise/css/mbr-additional.css"
	type="text/css">
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="title col-12 col-lg-8">
				<h2
					class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">
					Welcome user</h2>
				<h3
					class="mbr-section-subtitle align-center mbr-light pb-3 mbr-fonts-style display-5">
					Easily Update Details That Updated From You</h3>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row justify-content-center">
			<div class="media-container-column col-lg-8" data-form-type="formoid">
				<div data-form-alert="" hidden="">Thanks for filling out the
					form!</div>

				<form class="mbr-form" action="" method="post" data-form-title="">
					<input type="hidden" name="email" data-form-email="true"
						value=" ">
					<div class="row row-sm-offset">
						<div class="col-md-4 multi-horizontal" data-for="firstname">
							<div class="form-group">
								<label class="form-control-label mbr-fonts-style display-7"
									for="name-form1-2">First Name</label>
									 <input type="text" value=""
									class="form-control" name="firstname" data-form-field="FirstName"
									required="required" id="name-form1-2">
							</div>
						</div>
						<div class="col-md-4 multi-horizontal" data-for="lastname">
							<div class="form-group">
								<label class="form-control-label mbr-fonts-style display-7"
									for="email-form1-2">Last Name</label> <input type="text"
									class="form-control" name="lastname" data-form-field="LastName"
									required="required" id="email-form1-2" value="">
							</div>
						</div>
						<div class="col-md-4 multi-horizontal" data-for="phone">
							<div class="form-group">
								<label class="form-control-label mbr-fonts-style display-7"
									for="phone-form1-2">Phone</label> <input type="tel"
									class="form-control" name="phone" data-form-field="Phone"
									id="phone-form1-2" value="">
							</div>
						</div>
						<div class="col-md-4 multi-horizontal" data-for="email">
							<div class="form-group">
								<label class="form-control-label mbr-fonts-style display-7"
									for="email-form1-2">Email</label> <input type="email"
									class="form-control" name="email" data-form-field="Email"
									required="required" id="email-form1-2" value="">
							</div>
						</div>
						<div class="col-md-4 multi-horizontal" data-for="dob">
							<div class="form-group">
								<label class="form-control-label mbr-fonts-style display-7"
									for="email-form1-2">Date Of Birth</label> <input type="date"
									class="form-control" name="dob" data-form-field="dob"
									required="required" id="email-form1-2" value="">
							</div>
						</div>
						<div class="col-md-4 multi-horizontal" data-for="password">
							<div class="form-group">
								<label class="form-control-label mbr-fonts-style display-7"
									for="email-form1-2">Password</label> <input type="password"
									class="form-control" name="password" data-form-field="password"
									required="required" id="email-form1-2" value="">
							</div>
						</div>
											</div>
					<div class="form-group" data-for="message">
						<label class="form-control-label mbr-fonts-style display-7"
							for="message-form1-2">Message</label>
						<textarea type="text" class="form-control" name="message" rows="5"
							data-form-field="Message" id="message-form1-2"></textarea>
					</div>
					<div class="col-md-6 multi-horizontal" data-for="state">
							<div class="form-group">
								<label class="form-control-label mbr-fonts-style display-7"
									for="email-form1-2">State</label>
									 <select class="form-control" name="state" data-form-field="state"
									required="required" id="email-form1-2">
									<option>asjs</option>
									</select> 
								
							</div>
						</div>																			
					

					<span class="input-group-btn"><button href="" type="submit"
							class="btn btn-primary btn-form display-4">SEND FORM</button></span>
				</form>
			</div>
		</div>
	</div>
	</section>
</body>
</html>