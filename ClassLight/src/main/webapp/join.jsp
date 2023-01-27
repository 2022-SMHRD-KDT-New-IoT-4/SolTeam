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
<title>Join</title>
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
	href="./ClassLight/template/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
<link rel="stylesheet"
	href="./ClassLight/template/vendors/ti-icons/css/themify-icons.css">

<link rel="stylesheet" type="text/css"
	href="./ClassLight/template/js/select.dataTables.min.css">
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
		<div class="container-fluid page-body-wrapper full-page-wrapper">
			<div class="content-wrapper d-flex align-items-center auth px-0">
				<div class="row w-100 mx-0">
					<div class="col-lg-4 mx-auto">
						<div class="auth-form-light text-left py-5 px-4 px-sm-5">
							<div class="brand-logo">
								<img src="./ClassLight/tempLogo/자산 3.png" alt="logo">
							</div>
							<form class="pt-3" action="Join.do" method="post">
								<div class="form-group">
									<input type="id" name="id" class="form-control form-control-lg"
										id="exampleInputId" placeholder="아이디">
								</div>
								<div class="form-group">
									<input type="password" name="pw"
										class="form-control form-control-lg"
										id="exampleInputPassword1" placeholder="비밀번호">
								</div>
								<div class="form-group">
									<input type="password" class="form-control form-control-lg"
										id="exampleInputPassword2" placeholder="비밀번호 확인">
								</div>
								<div class="form-group">
									<input type="text" name="name"
										class="form-control form-control-lg" id="exampleInputName"
										placeholder="이름">
								</div>
								<div class="form-group">
									<input type="date" name="birth"
										class="form-control form-control-lg" id="exampleInputBirth">
								</div>
								<div class="form-group">
									<select name="job" id="jobType" onchange="jobKindchange(this)"
										class="form-control form-control-lg"
										style="color: black; padding-left: 31.04px;">
										<option value="1">강사</option>
										<option value="2">학생</option>
									</select>
								</div>
								<div class="form-group">
								    <p>반 선택 (학생 선택 시 기입 항목)</p>
									<select name="clas" id="jobTypeDetail" class="form-control form-control-lg" style="color: black"></select>
								</div>
								<br>
								<!-- 학생을 골랐을 때 반을 선택할 수 있게 함 -->
								<script type="text/javascript">
									function jobKindchange(e) {
										var clas = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ];
										var target = document
												.getElementById("jobTypeDetail");

										if (e.value == "2")
											var d = clas;

										for (x in d) {
											var opt = document
													.createElement("option");
											opt.value = d[x];
											opt.innerHTML = d[x];
											target.appendChild(opt);
										}
									}
								</script>
								<div class="mt-3">
									<input type="submit" value="가입완료" class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn">
								</div>
								<div class="text-center mt-4 font-weight-light">
									계정이 이미 있으십니까?<a href="login.jsp"
										class="text-primary">로그인</a>
								</div>

							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- content-wrapper ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	 <!-- plugins:js -->
        <script src="./ClassLight/template/vendors/js/vendor.bundle.base.js"></script>
        <!-- endinject -->
        <!-- Plugin js for this page -->
        <script src="./ClassLight/template/vendors/chart.js/Chart.min.js"></script>
        <script src="./ClassLight/template/vendors/datatables.net/jquery.dataTables.js"></script>
        <script src="./ClassLight/template/vendors/datatables.net-bs4/dataTables.bootstrap4.js"></script>
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