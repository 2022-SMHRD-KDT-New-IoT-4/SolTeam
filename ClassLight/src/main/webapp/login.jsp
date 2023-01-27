<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
    <div class="container-fluid page-body-wrapper full-page-wrapper">
      <div class="content-wrapper d-flex align-items-center auth px-0">
        <div class="row w-100 mx-0">
          <div class="col-lg-4 mx-auto">
            <div class="auth-form-light text-left py-5 px-4 px-sm-5">
              <div class="brand-logo">
                <img src="./ClassLight/tempLogo/자산 3.png" alt="logo">
              </div>
              <!-- <h4>Hello! let's get started</h4> -->
              <!-- <h6 class="font-weight-light">Sign in to continue.</h6> -->
              <form class="pt-3" action="Login.do" method="post">
                <div class="form-group">
                  <input type="id" name="id" class="form-control form-control-lg" id="exampleInputId" placeholder="아이디">
                </div>
                <div class="form-group">
                  <input type="password" name="pw" class="form-control form-control-lg" id="exampleInputPassword1" placeholder="비밀번호">
                </div>
                <div class="mt-3">
                  <input type="submit" class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn" value="로그인" >
                </div>
                <div class="my-2 d-flex justify-content-between align-items-center">
                </div>
                <div class="mb-2">
                </div>
                <div class="text-center mt-4 font-weight-light">
                  <a href="아이디 찾기" class="text-primary">아이디 찾기</a>
                  <span style="color: gray;"></span>
                  <a href="비밀번호 찾기" class="text-primary">비밀번호 찾기</a>
                  <span style="color: gray;"></span>
                  <a href="join.jsp" class="text-primary">회원가입</a>
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