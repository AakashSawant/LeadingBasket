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
	href="../assets/web/assets/mobirise-icons/mobirise-icons.css">
<link rel="icon" href="../assets/images/logo2.png" type="image/gif"
	sizes="16x16">
<link rel="stylesheet" href="../assets/tether/tether.min.css">
<link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="../assets/bootstrap/css/bootstrap-grid.min.css">
<link rel="stylesheet"
	href="../assets/bootstrap/css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="../assets/dropdown/css/style.css">
<link rel="stylesheet" href="../assets/animatecss/animate.min.css">
<link rel="stylesheet" href="../assets/socicon/css/styles.css">
<link rel="stylesheet" href="../assets/theme/css/style.css">
<link rel="stylesheet" href="../assets/mobirise/css/mbr-additional.css"
	type="text/css">
</head>
<body>
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
					<span class="navbar-logo"> <a href=""> <img
							src="../assets/images/ic1.png" title="LendingBasket"
							style="height: 3.8rem; width: 10.8rem; margin-left: -1em;">
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
					
					<li class="nav-item dropdown"><a
						class="nav-link link text-white dropdown-toggle display-4"
						data-toggle="dropdown-submenu" aria-expanded="false">${usname.first_name}</a>
						<div class="dropdown-menu dropdown-menu-right">
							<a class="text-white dropdown-item display-4"
								href="/editprof">Edit Profile</a><a
								class="text-white dropdown-item display-4"
								href="/recentActivity" aria-expanded="false">View Recent Activities</a><a
								class="text-white dropdown-item display-4"
								href="/logout" aria-expanded="false">Log Out</a>
						</div></li>
				</ul>

			</div>
		</nav>
	</section>

	<section class="carousel slide cid-r9bXovczpT" data-interval="false"
		id="slider1-c">

		<div class="full-screen">
			<div class="mbr-slider slide carousel" data-pause="true"
				data-keyboard="false" data-ride="carousel" data-interval="2000">
				<ol class="carousel-indicators">
					<li data-app-prevent-settings="" data-target="#slider1-c"
						class=" active" data-slide-to="0"></li>
					<li data-app-prevent-settings="" data-target="#slider1-c"
						data-slide-to="1"></li>
					<li data-app-prevent-settings="" data-target="#slider1-c"
						data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner" role="listbox">
					<div class="carousel-item slider-fullscreen-image active"
						data-bg-video-slide="false"
						style="background-image: url(../assets/images/1.jpg);">
						<div class="container container-slide">
							<div class="image_wrapper">
								<div class="mbr-overlay"></div>
								<img src="../assets/images/1.jpg">
								<div class="carousel-caption justify-content-center">
									<div class="col-10 align-center">
										<h2 class="mbr-fonts-style display-1">LOAN SERVICE</h2>
										<p class="lead mbr-text mbr-fonts-style display-5">Make
											Your dream home affordable</p>
										<div class="mbr-section-btn" buttons="0">
											<a class="btn btn-success display-4" href="/Loan Service">APPLY
												NOW</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="carousel-item slider-fullscreen-image"
						data-bg-video-slide="https://www.youtube.com/watch?v=fwkKc6M60-0">
						<div class="container container-slide">
							<div class="image_wrapper">
								<img src="../assets/images/2.jpg" style="opacity: 0;">
								<div class="carousel-caption justify-content-center">
									<div class="col-10 align-left">
										<h2 class="mbr-fonts-style display-1">FINANCIAL SERVICE</h2>
										<p class="lead mbr-text mbr-fonts-style display-5">Financial
											Freedom without Boundaries</p>
										<div class="mbr-section-btn" buttons="0">
											<a class="btn btn-primary display-4"
												href="/Financial Service">APPLY NOW</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="carousel-item slider-fullscreen-image"
						data-bg-video-slide="false"
						style="background-image: url(../assets/images/3.jpg);">
						<div class="container container-slide">
							<div class="image_wrapper">
								<div class="mbr-overlay"></div>
								<img src="../assets/images/3.jpg">
								<div class="carousel-caption justify-content-center">
									<div class="col-10 align-right">
										<h2 class="mbr-fonts-style display-1">ONLINE OR OFFLINE</h2>
										<p class="lead mbr-text mbr-fonts-style display-5">we do
											it all.</p>
										<div class="mbr-section-btn" buttons="0">
											<a class="btn btn-info display-4" href="/contectUs">Contect
												US</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<a data-app-prevent-settings=""
					class="carousel-control carousel-control-prev" role="button"
					data-slide="prev" href="#slider1-c"><span aria-hidden="true"
					class="mbri-left mbr-iconfont"></span><span class="sr-only">Previous</span></a><a
					data-app-prevent-settings=""
					class="carousel-control carousel-control-next" role="button"
					data-slide="next" href="#slider1-c"><span aria-hidden="true"
					class="mbri-right mbr-iconfont"></span><span class="sr-only">Next</span></a>
			</div>
		</div>

	</section>

	<section class="features8 cid-r9bXZNLNsj mbr-parallax-background"
		id="features8-d">



		<div class="mbr-overlay"
			style="opacity: 0.2; background-color: rgb(35, 35, 35);"></div>

		<div class="container">
			<div class="media-container-row">

				<div class="card  col-12 col-md-6 col-lg-3">
					<div class="card-img">
						<span class="mbri-desktop mbr-iconfont"></span>
					</div>
					<div class="card-box align-center">
						<h4 class="card-title mbr-fonts-style display-7">APPLY</h4>
						<p class="mbr-text mbr-fonts-style display-7">Enter your basic
							or personal information to get start</p>
						<br> <br> <br>
						<div class="mbr-section-btn text-center">
							<a href="/applyServices" class="btn btn-secondary display-4">
								More </a>
						</div>
					</div>
				</div>

				<div class="card  col-12 col-md-6 col-lg-3">
					<div class="card-img">
						<span class="mbri-touch mbr-iconfont"></span>
					</div>
					<div class="card-box align-center">
						<h4 class="card-title mbr-fonts-style display-7">GET APPROVED</h4>
						<p class="mbr-text mbr-fonts-style display-7">
							Link your business data and we will provide you with what you
							need.<br> <br> <br> <br>
						</p>
						<div class="mbr-section-btn text-center">
							<a href="/getApproved" class="btn btn-secondary display-4">
								More </a>
						</div>
					</div>
				</div>

				<div class="card  col-12 col-md-6 col-lg-3">
					<div class="card-img">
						<span class="mbri-responsive mbr-iconfont"></span>
					</div>
					<div class="card-box align-center">
						<h4 class="card-title mbr-fonts-style display-7">GET FUNDS</h4>
						<p class="mbr-text mbr-fonts-style display-7">Once approved
							provide us with your preferred bank account details and your loan
							will get disbursed at the earilest.</p>
						<br>
						<div class="mbr-section-btn text-center">
							<a href="/getFounds" class="btn btn-secondary display-4">
								More </a>
						</div>
					</div>
				</div>

			</div>
		</div>
	</section>

	<section class="mbr-section content5 cid-r9c0RcM19Y" id="content5-j">





		<div class="container">
			<div class="media-container-row">
				<div class="title col-12 col-md-8">
					<h2
						class="align-center mbr-bold mbr-white pb-3 mbr-fonts-style display-1">
						WHY LEADINGBASKET ?</h2>
					<h3
						class="mbr-section-subtitle align-center mbr-light mbr-white pb-3 mbr-fonts-style display-5">
						Its essist way to apply loan</h3>


				</div>
			</div>
		</div>
	</section>

	<section class="features1 cid-r8ZWGV6wz8" id="features1-8">




		<div class="container">
			<div class="media-container-row">

				<div class="card p-3 col-12 col-md-6 col-lg-4">
					<div class="card-img pb-3">
						<span class="mbri-bootstrap mbr-iconfont"></span>
					</div>
					<div class="card-box">
						<h4 class="card-title py-3 mbr-fonts-style display-5">
							Faster Peperless <br> Tranjections
						</h4>
						<p class="mbr-text mbr-fonts-style display-7">Time is the most
							precious asset. So we optimize the use of this asset by providing
							you with hassle-free documentation and faster loan process.</p>
					</div>
				</div>

				<div class="card p-3 col-12 col-md-6 col-lg-4">
					<div class="card-img pb-3">
						<span class="mbri-touch mbr-iconfont"></span>
					</div>
					<div class="card-box">
						<h4 class="card-title py-3 mbr-fonts-style display-5">
							24 X 7 <br> Accessibility
						</h4>
						<p class="mbr-text mbr-fonts-style display-7">Connectivity
							helps in building strong business relations. We optimize this
							relation by having 24x7 accessibility.</p>
					</div>
				</div>

				<div class="card p-3 col-12 col-md-6 col-lg-4">
					<div class="card-img pb-3">
						<span class="mbri-responsive mbr-iconfont"></span>
					</div>
					<div class="card-box">
						<h4 class="card-title py-3 mbr-fonts-style display-5">
							Effective Guidance At<br> Every Step
						</h4>
						<p class="mbr-text mbr-fonts-style display-7">We help you make
							better and smarter decisions regarding your financial queries at
							every stage.</p>
					</div>
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
							According FAQ</h2>
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
										What is Lenading Basket?
									</h4>
								</a>
							</div>
							<div id="collapse1_5" class="panel-collapse noScroll collapse "
								role="tabpanel" aria-labelledby="headingOne"
								data-parent="#bootstrap-accordion_5">
								<div class="panel-body p-4">
									<p class="mbr-fonts-style panel-text display-7">
									<ul type="square">
										<li>Lenading Basket provide many facilities to the user
											like loans, Legal & financial services and tools sitting at
											home.<br>
										</li>
										<li>We provide different types of service to take loan
											like car loan, home loan, mortgage loan, personal loan<br>
										</li>
										<li>Legal services includes rent agreement, leave and
											license agreement, construction Agreement, extra work
											agreement, mortgage deed, release deed etc.</li>
									</ul>
									</p>
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
										Is it good for me?
									</h4>
								</a>

							</div>
							<div id="collapse2_5" class="panel-collapse noScroll collapse"
								role="tabpanel" aria-labelledby="headingTwo"
								data-parent="#bootstrap-accordion_5">
								<div class="panel-body p-4">
									<p class="mbr-fonts-style panel-text display-7">.
									<ul type="square">
										<li>Yes, this plateform is for you because you can get
											any <strong>service at home</strong>
										</li>
										<li>This will save you a <strong>lot of time</strong></li>
										<li>The services we collect from your <strong>favorite
												bank branch</strong></li>
										<li>You can use our calculation tools <strong>free</strong>
											of charge
										</li>
									</ul>
									</p>
								</div>
							</div>
						</div>
						<!-- <div class="card">
							<div class="card-header" role="tab" id="headingThree">
								<a role="button" class="collapsed text-black panel-title"
									data-toggle="collapse" data-core="" href="#collapse3_5"
									aria-expanded="false" aria-controls="collapse3">
									<h4 class="mbr-fonts-style display-5">
										<span class="sign mbr-iconfont mbri-arrow-down inactive"></span>
										Why ?
									</h4>
								</a>
							</div>
							<div id="collapse3_5" class="panel-collapse noScroll collapse"
								role="tabpanel" aria-labelledby="headingThree"
								data-parent="#bootstrap-accordion_5">
								<div class="panel-body p-4">
									<p class="mbr-fonts-style panel-text display-7">
										Key differences from traditional builders:<br>*
										Minimalistic, extremely <strong>easy-to-use</strong> interface<br>*
										<strong>Mobile</strong>-friendliness, latest website blocks
										and techniques "out-the-box"<br>* <strong>Free</strong>
										for commercial and non-profit use
									</p>
								</div>
							</div>
						</div>
-->


					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="counters2 counters cid-r9c3dXNp21" id="counters2-o">





		<div class="container pt-4 mt-2">
			<div class="row justify-content-center">
				<div class="media-block" style="width: 38%;"></div>
				<div class="cards-block">
					<div class="cards-container">
						<div class="card px-3 align-left col-12 col-md-6">
							<div class="panel-item p-3">
								<div class="card-img pb-3">
									<span class="mbri-mobirise mbr-iconfont pr-2"></span>
									<h3 class="count py-3 mbr-fonts-style display-2">${banks}</h3>
								</div>
								<div class="card-text">
									<h4
										class="mbr-content-title mbr-bold mbr-fonts-style display-7">
										Connectivity</h4>
									<p class="mbr-content-text mbr-fonts-style display-7">We
										connected ${banks}+ banks with satisfy environment.</p>
								</div>
							</div>
						</div>
						<div class="card px-3 align-left col-12 col-md-6">
							<div class="panel-item p-3">
								<div class="card-img pb-3">
									<span class="mbri-extension mbr-iconfont pr-2"></span>
									<h3 class="count py-3 mbr-fonts-style display-2">
										<c:out value="${subs}" />
									</h3>
								</div>
								<div class="card-text">
									<h4
										class="mbr-content-title mbr-bold mbr-fonts-style display-7">
										Subscribers</h4>
									<p class="mbr-content-text mbr-fonts-style display-7">
										Our Services subscribe by
										<c:out value="${subs}" />
										users
									</p>
								</div>
							</div>
						</div>
						<div class="card px-3 align-left col-12 col-md-6">
							<div class="panel-item p-3">
								<div class="card-img pb-3">
									<span class="mbri-responsive mbr-iconfont pr-2"></span>
									<h3 class="count py-3 mbr-fonts-style display-2">50</h3>
								</div>
								<div class="card-text">
									<h4
										class="mbr-content-title mbr-bold mbr-fonts-style display-7">
										EXPERTS</h4>
									<p class="mbr-content-text mbr-fonts-style display-7">We
										having 50+ services experts for satisfy your quesions</p>
								</div>
							</div>
						</div>
						<div class="card px-3 align-left col-12 col-md-6">
							<div class="panel-item p-3">
								<div class="card-img pb-3">
									<span class="mbri-globe-2 mbr-iconfont pr-2"></span>
									<h3 class="count py-3 mbr-fonts-style display-2">${users }</h3>
								</div>
								<div class="card-texts">
									<h4
										class="mbr-content-title mbr-bold mbr-fonts-style display-7">
										Customers</h4>
									<p class="mbr-content-text mbr-fonts-style display-7">We
										satisfy more then ${users} peoples from our service</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="footer4 cid-r9c3xhuDfg" id="footer4-p">

		<div class="container">
			<div class="media-container-row content mbr-white">
				<div class="col-md-3 col-sm-2">
					<div class="col-sm-1 img-logo">
						<a href="/"> <img src="../assets/images/ic1.png"
							alt="Lending Basket"
							style="height: 4.0rem; width: 10.8rem; margin-left: -1em;">
						</a>
					</div>
					<p class="mb-3 mbr-fonts-style foot-title display-7"></p>
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


	<script src="../assets/web/assets/jquery/jquery.min.js"></script>
	<script src="../assets/popper/popper.min.js"></script>
	<script src="../assets/tether/tether.min.js"></script>
	<script src="../assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="../assets/smoothscroll/smooth-scroll.js"></script>
	<script src="../assets/dropdown/js/script.min.js"></script>
	<script src="../assets/touchswipe/jquery.touch-swipe.min.js"></script>
	<script src="../assets/viewportchecker/jquery.viewportchecker.js"></script>
	<script src="../assets/ytplayer/jquery.mb.ytplayer.min.js"></script>
	<script src="../assets/vimeoplayer/jquery.mb.vimeo_player.js"></script>
	<script src="../assets/bootstrapcarouselswipe/bootstrap-carousel-swipe.js"></script>
	<script src="../assets/parallax/jarallax.min.js"></script>
	<script src="../assets/mbr-switch-arrow/mbr-switch-arrow.js"></script>
	<script src="../assets/theme/js/script.js"></script>
	<script src="../assets/slidervideo/script.js"></script>
	<script src="../assets/formoid/formoid.min.js"></script>


	<div id="scrollToTop" class="scrollToTop mbr-arrow-up">
		<a style="text-align: center;"><i></i></a>
	</div>
	<input name="animation" type="hidden">
</body>
</html>