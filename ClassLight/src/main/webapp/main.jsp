<%@page import="com.smhrd.model.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- index.html >>> Main.html로 타이틀 변경 -->
<title>Main</title>
<!-- Main : css-->
<link rel="stylesheet" href="./Wep-CSS/Main.css">

<!-- plugins:css -->
<link rel="stylesheet"
	href="./ClassLight/template/vendors/feather/feather.css">
<link rel="stylesheet"
	href="./ClassLight/template/vendors/ti-icons/css/themify-icons.css">
<link rel="stylesheet"
	href="./ClassLight/template/vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- Plugin css for this page -->
<link rel="stylesheet"
	href="./ClassLight//template/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
<link rel="stylesheet"
	href="./ClassLight//template/vendors/ti-icons/css/themify-icons.css">

<link rel="stylesheet" type="text/css"
	href="./template/js/select.dataTables.min.css">
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet"
	href="./ClassLight/template/css/vertical-layout-light/style.css">
<!-- endinject -->
<link rel="shortcut icon"
	href="./ClassLight/template/images/favicon.png" />
</head>

<body>

	
	<div class="container-scroller">
		<!-- 1. 네비게이션바 -->
		<nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
			<div
				class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
				<!-- 로고이미지 : tempLogo폴더 안에 "자산 3.png" -->
				<a class="navbar-brand brand-logo mr-5" href="main.jsp"><img
					src="./ClassLight/tempLogo/자산 3.png" class="mr-2" alt="logo" /></a>
				<!-- 최소화로고이미지 :  -->
				<a class="navbar-brand brand-logo-mini" href="main.jsp"><img
					src="./ClassLight/tempLogo/자산 4.png" alt="logo" /></a>
			</div>
			<!-- 상단 고정 바-->
			<div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
				<ul class="navbar-nav mr-lg-2">
					<li class="nav-item nav-search d-none d-lg-block">
						<div class="input-group">
							<div class="input-group-prepend hover-cursor"
								id="navbar-search-icon">
								<span class="input-group-text" id="search"> </span>
							</div>
						</div>
					</li>
				</ul>
				<ul class="navbar-nav navbar-nav-right">
					<li class="nav-item dropdown">
						<!-- 사이드바 A태그 --> <a class="menu" id="notificationDropdown"
						href="login.jsp"> <span>로그인</span>
					</a> <a class="menu" href="join.jsp"> <span>회원가입</span>
					</a>
					</li>
				</ul>
		</nav>
	</div>
	</div>
	<!-- 메인 상단 메시지 작성하는 부분-->
	<h3 class="font-weight-bold">Welcome Aamir</h3>
	<h3 class="font-weight-normal mb-0">
		</h6>
		</div>
		<div class="col-12 col-xl-4">
			<div class="justify-content-end d-flex">
				<div class="dropdown flex-md-grow-1 flex-xl-grow-0"></div>
			</div>
		</div>
		</div>
		</div>
		</div>
		</div>

		<!-- main 이미지-->
		<div class="card tale-bg">
			<div class="card-people mt-auto">
				<img src="./ClassLight/template/images/dashboard/people.svg"
					alt="people">

				<div class="weather-info">
					<div class="d-flex">
						<div></div>
						<div class="ml-2"></div>
					</div>

				</div>
			</div>
		</div>
		</div>
		</div>
		<footer class="footer">
			<div
				class="d-sm-flex justify-content-center justify-content-sm-between">
				<span
					class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright
					© 2021. Premium <a href="https://www.bootstrapdash.com/"
					target="_blank">Bootstrap admin template</a> from BootstrapDash.
					All rights reserved.
				</span> <span
					class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted
					& made with <i class="ti-heart text-danger ml-1"></i>
				</span>
			</div>
		</footer>
		<!-- partial -->
		</div>
		<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
		</div>
		<!-- container-scroller -->

		<!-- plugins:js -->
		<script src="./ClassLight/template/vendors/js/vendor.bundle.base.js"></script>
		<!-- endinject -->
		<!-- Plugin js for this page -->
		<script src="./ClassLight/template/vendors/chart.js/Chart.min.js"></script>
		<script
			src="./ClassLight/template/vendors/datatables.net/jquery.dataTables.js"></script>
		<script
			src="./ClassLight/template/vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
		<script src="./ClassLight/template/js/dataTables.select.min.js"></script>

		<!-- End plugin js for this page -->
		<!-- inject:js -->
		<script src="./ClassLight/template/js/off-canvas.js"></script>
		<script src="./ClassLight/template/js/hoverable-collapse.js"></script>
		<script src="./ClassLight/template/s/template.js"></script>
		<script src="./ClassLight/template/js/settings.js"></script>
		<script src="./ClassLight/template/js/todolist.js"></script>
		<!-- endinject -->
		<!-- Custom js for this page-->
		<script src="./ClassLight/template/js/dashboard.js"></script>
		<script src="./ClassLight/template/js/Chart.roundedBarCharts.js"></script>
		<!-- End custom js for this page-->
</body>

</html>