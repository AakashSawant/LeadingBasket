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
							style="height: 3.8rem; width: 10.8rem; margin-left: -1em;padding-left: 10px;">
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
						class="nav-link link text-white display-4" href="userlogin">Login</a></li>
				</ul>

			</div>
		</nav>
	</section>

	<section class="mbr-section content5 cid-r9c0RcM19Y" id="content5-j">
		<div class="container">
			<div class="media-container-row">
				<div class="title col-12 col-md-8">
					<br>
					<h2
						class="align-center mbr-bold mbr-white pb-3 mbr-fonts-style display-1">
						${title}</h2>
				</div>
			</div>
		</div>
	</section>


	<section class="accordion1 cid-r9c2PwA95U" id="accordion1-m">

		<div class="container">
			<div class="media-container-row">
				<div class="col-12 col-md-8">
					<div class="section-head text-center space30">
						<h2 class="mbr-section-title pb-5 mbr-fonts-style display-2">
							Documents</h2>
					</div>
					<div class="clearfix"></div>
					<div id="bootstrap-accordion_5"
						class="panel-group accordionStyles accordion" role="tablist"
						aria-multiselectable="true">
						<div class="card">
							<div class="card-header" role="tab" id="headingOne">
								<a role="button" class="panel-title collapsed text-black"
									data-toggle="collapse" data-core="" href="#collapse1_5"
									aria-expanded="false" aria-controls="collapse1">
									<h4 class="mbr-fonts-style display-5">
										<span class="sign mbr-iconfont mbri-arrow-down inactive"></span>
										Salaried
									</h4>
								</a>
							</div>
							<div id="collapse1_5" class="panel-collapse noScroll collapse "
								role="tabpanel" aria-labelledby="headingOne"
								data-parent="#bootstrap-accordion_5">
								<div class="panel-body p-4 mbr-fonts-style panel-text display-7">

									<ul type="square">
										<c:forEach items="${docs}" var="doc" end="18">
											<li>${doc.name}</li>
										</c:forEach>
									</ul>

								</div>
							</div>
						</div>
						<div class="card">
							<div class="card-header" role="tab" id="headingTwo">
								<a role="button" class="collapsed panel-title text-black"
									data-toggle="collapse" data-core="" href="#collapse2_5"
									aria-expanded="false" aria-controls="collapse2">
									<h4 class="mbr-fonts-style display-5">
										<span class="sign mbr-iconfont mbri-arrow-down inactive"></span>
										Self Employed
									</h4>

								</a>
							</div>

							<div id="collapse2_5" class="panel-collapse noScroll collapse"
								role="tabpanel" aria-labelledby="headingTwo"
								data-parent="#bootstrap-accordion_5">

								<div class="panel-body p-4 mbr-fonts-style panel-text display-7">

									<ul type="circle">
										<c:forEach items="${docs}" var="doc">
											<li>${doc.name}</li>
										</c:forEach>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="cid-rdwZRdymN4 mbr-fullscreen mbr-parallax-background"
		id="header15-c">


		<div class="mbr-overlay"
			style="opacity: 0.5; background-color: rgb(7, 59, 76);"></div>

		<div class="container align-right">
			<div class="row">
				<div class="mbr-white col-lg-8 col-md-7 content-container">
					<h1
						class="mbr-section-title mbr-bold pb-3 mbr-fonts-style display-1">
						Apply ${title}</h1>
					<p class="mbr-text pb-3 mbr-fonts-style display-5">
						Apply ${title} using this Form.<br> Fill The Details
						Carefully<br>We Contact you and provide this Service
					</p>
				</div>
				<div class="col-lg-4 col-md-5">
					<div class="form-container">
						<div class="media-container-column">

							<form class="mbr-form" action="/applyNewHome" method="post"
								id="applyForm">

								<div data-for="first_name">
									<div class="form-group">
										<input type="text" class="form-control px-3" name="first_name"
											tabindex="1" id="first_name" data-form-field="first_name"
											autofocus="autofocus" value="${user.first_name}"
											readonly="readonly" placeholder="First Name">
									</div>
								</div>
								<div data-for="email">
									<div class="form-group">
										<input type="email" class="form-control px-3" name="email"
											autofocus="autofocus" tabindex="2" value="${user.email}"
											readonly="readonly" data-form-field="Email"
											placeholder="Email [Optional]" id="email">
									</div>
								</div>
								<div data-for="phone">
									<div class="form-group">
										<input type="tel" class="form-control px-3" name="phone"
											data-form-field="phone" placeholder="Phone*"
											value="${user.mobile}" readonly="readonly"
											autofocus="autofocus" tabindex="3" required="required"
											id="phone-header15-c">
									</div>
								</div>
								<div data-for="amount">
									<div class="form-group">
										<input type="text" class="form-control px-3" name="amount"
											data-form-field="amount" placeholder="Amount*"
											autofocus="autofocus" tabindex="4" required="required">
									</div>
									
								</div>
								<div data-for="bank">
									<div class="form-group">
										<select class="form-control px-3" name="bank"
											data-form-field="Bank" 
											autofocus="autofocus" tabindex="4" required="required">
												<option>Select Bank</option>
												<c:forEach items="${banks}"  var="bnname">
												<option value="${bnname.bm.id}">${bnname.bm.name }</option>
												</c:forEach>
											</select>
									</div>
									
								</div>
								<div class="input-group-btn m-2">
									<input class="btn btn-primary display-4" type="submit"
										role="submit">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="section-table cid-remAClIgQm" id="table1-4">


		<div class="container container-table">
			<h2
				class="mbr-section-title mbr-fonts-style align-center pb-3 display-2">
				BANKS</h2>
			<h3 class="mbr-section-subtitle mbr-fonts-style align-center pb-5 mbr-light display-5">
				We Provide ${title} By Following Banks
				</h3>
			<div class="table-wrapper">
				<div class="container scroll">
					<table class="table isSearch" cellspacing="0">
						<thead>
							<tr class="table-heads ">
								<th class="head-item mbr-fonts-style display-7">Bank Name</th>
								<th class="head-item mbr-fonts-style display-7">File Charge</th>
								<th class="head-item mbr-fonts-style display-7">Loan
									Category</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="banks" items="${banks}">
								<tr>
									<td class="body-item mbr-fonts-style display-7">
										${banks.bm.name}</td>
									<td class="body-item mbr-fonts-style display-7">
										${banks.file_charge}</td>
									<td class="body-item mbr-fonts-style display-7">
										${banks.ls.name}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
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
							style="height: 6.0rem; width: 12.8rem;margin-left: -1em; padding-bottom: 1em;">
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