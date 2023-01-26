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
<link rel="stylesheet" href="./Wep-CSS/JoinSuccess.css">

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
    <%  
     String name =(String)session.getAttribute("name");
     String id = (String)session.getAttribute("id");
          
     %>
  <div class="container-scroller">
    <div class="container-fluid page-body-wrapper full-page-wrapper">
      <div class="content-wrapper d-flex align-items-center auth px-0">
        <div class="row w-100 mx-0">

          <div class="col-lg-4 mx-auto">
            <div class="brand-logo">
              <img src="./ClassLight/tempLogo/자산 3.png" alt="logo">
            </div>
            <h1><%=name %>님의 회원가입을</h1><br>
            <h1>축하드립니다.</h1>
            <hr>
            <hr>
            <h4><%=name %> 님의 아이디는 <%=id %> 입니다</h4>
            <hr>
            <hr>
            <div class="cen">
              <a class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn"
                href="mainTeacher.jsp">시작하기</a>
            </div>

          </div>
        </div>
      </div>
      <!-- content-wrapper ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
   <!-- content-wrapper ends -->
          <!-- partial:partials/_footer.html -->
          <footer class="footer">
            <div class="d-sm-flex justify-content-center justify-content-sm-between">
              <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2021. Premium <a
                  href="https://www.bootstrapdash.com/" target="_blank">Bootstrap admin template</a> from BootstrapDash.
                All rights reserved.</span>
              <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with <i
                  class="ti-heart text-danger ml-1"></i></span>
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