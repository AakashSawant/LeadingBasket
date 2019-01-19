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


</head>
<body>
	<!-- <div class="loader"></div>-->
	<section class="menu cid-r9bRLUSb5x" once="menu" id="menu2-9">
		<nav
			class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-fixed-top navbar-toggleable-sm">
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<div class="hamburger">
					<span></span> <span></span> <span></span> <span></span>
				</div>
			</button>
			<div class="menu-logo">
				<div class="navbar-brand">
					<span class="navbar-logo"> <a href="/"> <img
							src="assets/images/ic1.png" title="LendingBasket"
							style="height: 3.8rem; width: 10.8rem; margin-left: -1em; padding-left: 10px;">
					</a>
					</span>
				</div>
			</div>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav nav-dropdown nav-right"
					data-app-modern-menu="true">
					<c:forEach var="prlist" items="${services}">
						<li class="nav-item"><a
							class="nav-link link text-white display-4" href="${prlist.name}">${prlist.name}</a></li>
					</c:forEach>
					<li class="nav-item dropdown"><a
						class="nav-link link text-white dropdown-toggle display-4"
						data-toggle="dropdown-submenu" aria-expanded="false">Tool</a>
						<div class="dropdown-menu">
							<a class="text-white dropdown-item display-4"
								href="/emiCalculator">Emi Calculator</a><a
								class="text-white dropdown-item display-4"
								href="/unitConversion" aria-expanded="false">Unit Converter</a><a
								class="text-white dropdown-item display-4"
								href="/janatriCalculator" aria-expanded="false">Jantri
								Calculator</a>
						</div></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-4" href="/aboutUs">
							About Us &nbsp;</a></li>
					<li class="nav-item"><a
						class="nav-link link text-white display-4" href="/userlogin">Login</a></li>
				</ul>

			</div>
		</nav>
	</section>

	<section class="section-table cid-remAClIgQm" id="table1-4">


		<div class="container container-table">
			<h2
				class="mbr-section-title mbr-fonts-style align-center pb-3 display-2">
				User Details</h2>
			<h3
				class="mbr-section-subtitle mbr-fonts-style align-center pb-5 mbr-light display-5">
				Help us verify the information you provided in your application</h3>
			<div class="table-wrapper">
				<div class="container scroll">
					<table class="table isSearch" cellspacing="0">
						<thead>
							<tr class="table-heads ">
								<th class="head-item mbr-fonts-style display-7">User Name</th>
								<th class="head-item mbr-fonts-style display-7">Mobile</th>
								<th class="head-item mbr-fonts-style display-7">Amount</th>
								<th class="head-item mbr-fonts-style display-7">Loan
									Category</th>
							</tr>
						</thead>
						<tbody>

							<tr>
								<td class="body-item mbr-fonts-style display-7">${userdt.userMaster.first_name}
								</td>
								<td class="body-item mbr-fonts-style display-7">${userdt.userMaster.mobile}
								</td>
								<td class="body-item mbr-fonts-style display-7">${userdt.loan_Amount}
								</td>
								<td class="body-item mbr-fonts-style display-7">${userdt.ls.loan_sub_cat_name}
								</td>
							</tr>

						</tbody>
					</table>
				</div>

			</div>
		</div>
	</section>
	<section class="mbr-section form1 cid-rfqI1EO1o7" id="form1-2">

		<div class="container">
			<div class="row justify-content-center">
				<div class="title col-12 col-lg-8">
					<h2
						class="mbr-section-title align-center pb-3 mbr-fonts-style display-2">
						Document Upload Form</h2>
					<h3
						class="mbr-section-subtitle align-center mbr-light pb-3 mbr-fonts-style display-5">
						Easily add Documents <br> According these Documents We
						Provide Your ${userdt.ls.loan_sub_cat_name}
					</h3>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row justify-content-center">
				<div class="media-container-column col-lg-8"
					data-form-type="formoid">
					<div data-form-alert="" hidden="">Thanks for filling out the
						form!</div>

					<form class="mbr-form" action="" method="post"
						data-form-title="Mobirise Form">
						<input type="hidden" name="email" data-form-email="true"
							value="xeACxMHKYmeUvGJ7Eq2DpbqhUikK4wxwI0SJZxZkQ173DX/Dicks4yzZUSpxpQFoPB8WZjoU2qr9a8O1xgFgAjp+8wkkbHD/nyynAdbJvGBelfuqPgl8BX68harZmyC5">
						<div class="row row-sm-offset">
							<div class="col-md-7 multi-horizontal" data-for="name">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7"
										for="name-form1-2">Document Name</label> <input type="text"
										readonly="readonly" class="form-control" name="name"
										data-form-field="Name" id="name-form1-2">
								</div>
							</div>
							<div class="col-md-4 multi-horizontal" data-for="phone">
								<div class="form-group">
									<label class="form-control-label mbr-fonts-style display-7"
										for="phone-form1-2">Browse File </label> <input type="file"
										class="form-control" name="phone" data-form-field="Phone"
										id="phone-form1-2">
								</div>
							</div>
						</div>
						<span class="input-group-btn"><button href="" type="submit"
								class="btn btn-primary btn-form display-4">Upload
								Documents</button></span>
					</form>
				</div>
			</div>
		</div>
	</section>
	<section class="footer4 cid-r9c3xhuDfg" id="footer4-p">

		<div class="container">
			<div class="media-container-row content mbr-white">
				<div class="col-md-3 col-sm-2">
					<div class="col-sm-1 img-logo">
						<a href="/"> <img src="assets/images/ic1.png"
							alt="Lending Basket"
							style="height: 6.0rem; width: 12.8rem; margin-left: -1em; padding-bottom: 1em;">
						</a>
					</div>

					<p class="mbr-text mbr-fonts-style mbr-links-column display-7">
						205, Devraj Mall,<br>Opp Haveli Mandir, India Colony,<br>Thakkarbappanagar,<br>Ahmedabad-382
						350<br> Phone: +91 92272 18147

					</p>
				</div>
				<div class="col-md-2 col-sm-4">
					<p class="mb-4 foot-title mbr-fonts-style display-7">ENGAGE</p>
					<p class="mbr-text mbr-fonts-style foot-text display-7">
						<a href="" class=" link text-white">Success Stories</a><br> <a
							href="" class=" link text-white">Become a Partner</a> <br> <a
							href="" class=" link text-white">Find a Partner</a><br>
					</p>
				</div>
				<div class="col-md-2 col-sm-4">
					<p class="mb-4 foot-title mbr-fonts-style display-7">SUPPORT</p>
					<p class="mbr-text mbr-fonts-style foot-text display-7">
						<a href="" class=" link text-white">Help Center</a><br> <a
							href="" class="link text-white">Terms &amp; Conditions</a><br>
						<a href="" class="link text-white">Know Issue</a><br>

					</p>
				</div>
				<div class="col-md-4 offset-md-1 col-sm-12">
					<p class="mb-4 foot-title mbr-fonts-style display-7">SUBSCRIBE
					</p>
					<p class="mbr-text mbr-fonts-style form-text display-7">Get
						offers and discount in your services</p>
					<div class="media-container-column">
						<div data-form-alert="" hidden="" class="align-center">Thanks
							for filling out the form!</div>


						<form class="form-inline" action="/subscribe" method="post">

							<div class="form-group">
								<input type="email"
									class="form-control input-sm input-inverse my-2" name="emid"
									required="required" data-form-field="emid" placeholder="Email"
									id="email-footer4-p">
							</div>
							<div class="input-group-btn m-2">
								<input class="btn btn-primary display-4" type="submit"
									role="submit">
							</div>
						</form>


					</div>
					<p class="mb-4 mbr-fonts-style foot-title display-7">CONNECT
						WITH US</p>
					<div class="social-list pl-0 mb-0">
						<div class="soc-item">
							<a href=" " target="_blank"> <span
								class="socicon-twitter socicon mbr-iconfont mbr-iconfont-social"></span>
							</a>
						</div>
						<div class="soc-item">
							<a href="#" target="_blank"> <span
								class="socicon-facebook socicon mbr-iconfont mbr-iconfont-social"></span>
							</a>
						</div>
						<div class="soc-item">
							<a href="#" target="_blank"> <span
								class="socicon-youtube socicon mbr-iconfont mbr-iconfont-social"></span>
							</a>
						</div>
						<div class="soc-item">
							<a href="#" target="_blank"> <span
								class="socicon-instagram socicon mbr-iconfont mbr-iconfont-social"></span>
							</a>
						</div>
						<div class="soc-item">
							<a href="#" target="_blank"> <span
								class="socicon-googleplus socicon mbr-iconfont mbr-iconfont-social"></span>
							</a>
						</div>
						<div class="soc-item">
							<a href="#" target="_blank"> <span
								class="socicon-behance socicon mbr-iconfont mbr-iconfont-social"></span>
							</a>
						</div>
					</div>
				</div>
			</div>

		</div>
	</section>

	<script src="assets/web/assets/jquery/jquery.min.js"></script>
	<script src="assets2/web/assets/jquery/jquery.min.js"></script>
	<script src="assets/popper/popper.min.js"></script>
	<script src="assets/tether/tether.min.js"></script>
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets2/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/smoothscroll/smooth-scroll.js"></script>
	<script src="assets/dropdown/js/script.min.js"></script>
	<script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>
	<script src="assets/viewportchecker/jquery.viewportchecker.js"></script>
	<script src="assets/ytplayer/jquery.mb.ytplayer.min.js"></script>
	<script src="assets/vimeoplayer/jquery.mb.vimeo_player.js"></script>
	<script src="assets/bootstrapcarouselswipe/bootstrap-carousel-swipe.js"></script>
	<script src="assets/parallax/jarallax.min.js"></script>
	<script src="assets/mbr-switch-arrow/mbr-switch-arrow.js"></script>
	<script src="assets/theme/js/script.js"></script>
	<script src="assets/slidervideo/script.js"></script>
	<script src="assets/formoid/formoid.min.js"></script>
	<script src="assets/datatables/data-tables.bootstrap4.min.js"></script>
	<script src="assets/datatables/jquery.data-tables.min.js"></script>

	<div id="scrollToTop" class="scrollToTop mbr-arrow-up">
		<a style="text-align: center;"><i></i></a>
	</div>
	<input name="animation" type="hidden">
</body>
</html>