<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
   <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- index.html >>> Main.html로 타이틀 변경 -->
    <title>classManage</title>
    <!-- Main : css-->
    <link rel="stylesheet" href="./Wep-CSS/ClassManage.css">

    <!-- plugins:css -->
    <link rel="stylesheet" href="./ClassLight/template/vendors/feather/feather.css">
    <link rel="stylesheet" href="./ClassLight/template/vendors/ti-icons/css/themify-icons.css">
    <link rel="stylesheet" href="./ClassLight/template/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <link rel="stylesheet" href="./ClassLight//template/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
    <link rel="stylesheet" href="./ClassLight//template/vendors/ti-icons/css/themify-icons.css">

    <link rel="stylesheet" type="text/css" href="./template/js/select.dataTables.min.css">
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="./ClassLight/template/css/vertical-layout-light/style.css">
    <!-- endinject -->
    <link rel="shortcut icon" href="./ClassLight/template/images/favicon.png" />
    
   
</head>

<body>
  <div class="container-scroller">
    <!-- partial:partials/_navbar.html -->


    <!-- 1. 네비게이션바 -->
    <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
      <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <!-- 로고이미지 : tempLogo폴더 안에 "자산 3.png" -->
        <a class="navbar-brand brand-logo mr-5" href="main.jsp"><img src="./ClassLight/tempLogo/자산 3.png" class="mr-2"
            alt="logo" /></a>
        <!-- 최소화로고이미지 :  -->
        <a class="navbar-brand brand-logo-mini" href="main.jsp"><img src="./ClassLight/tempLogo/자산 4.png" alt="logo" /></a>
      </div>
      <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
        <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
          <span class="icon-menu"></span>
        </button>
        <ul class="navbar-nav mr-lg-2">
          <li class="nav-item nav-search d-none d-lg-block">
            <div class="input-group">
              <div class="input-group-prepend hover-cursor" id="navbar-search-icon">
                <span class="input-group-text" id="search">
                  <i class="icon-search"></i>
                </span>
              </div>
              <input type="text" class="form-control" id="navbar-search-input" placeholder="Search now"
                aria-label="search" aria-describedby="search">
            </div>
          </li>
        </ul>
        <ul class="navbar-nav navbar-nav-right">
          <li class="nav-item dropdown">
            <!-- 사이드바 A태그 -->
            <a class="nav-link count-indicator dropdown-toggle" id="notificationDropdown" href="#"
              data-toggle="dropdown">
              <i class="icon-bell mx-0"></i>
              <span class="count"></span>
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list"
              aria-labelledby="notificationDropdown">
              <p class="mb-0 font-weight-normal float-left dropdown-header">Notifications</p>
              <a class="dropdown-item preview-item">
                <div class="preview-thumbnail">
                  <div class="preview-icon bg-success">
                    <i class="ti-info-alt mx-0"></i>
                  </div>
                </div>
                <div class="preview-item-content">
                  <h6 class="preview-subject font-weight-normal">Application Error</h6>
                  <p class="font-weight-light small-text mb-0 text-muted">
                    Just now
                  </p>
                </div>
              </a>

          <li class="nav-item nav-profile dropdown">
            <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" id="profileDropdown">
              <img src="./ClassLight/template/images/faces/face23.jpg" alt="profile" />
            </a>
            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
              <a class="dropdown-item">
                <i class="ti-settings text-primary"></i>
                Settings
              </a>
              <a class="dropdown-item" href="./Main.html">
                <i class="ti-power-off text-primary"></i>
                Logout
              </a>
            </div>
          </li>
          <li class="nav-item nav-settings d-none d-lg-flex">
            <a class="nav-link" href="#">
              <i class="icon-ellipsis"></i>
            </a>
          </li>
        </ul>
        <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button"
          data-toggle="offcanvas">
          <span class="icon-menu"></span>
        </button>
      </div>
    </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <!-- partial:partials/_settings-panel.html -->
      <div class="theme-setting-wrapper">
        <div id="settings-trigger"><i class="ti-settings"></i></div>
        <div id="theme-settings" class="settings-panel">
          <i class="settings-close ti-close"></i>
          <p class="settings-heading">SIDEBAR SKINS</p>
          <div class="sidebar-bg-options selected" id="sidebar-light-theme">
            <div class="img-ss rounded-circle bg-light border mr-3"></div>Light
          </div>
          <div class="sidebar-bg-options" id="sidebar-dark-theme">
            <div class="img-ss rounded-circle bg-dark border mr-3"></div>Dark
          </div>
          <p class="settings-heading mt-2">HEADER SKINS</p>
          <div class="color-tiles mx-0 px-4">
            <div class="tiles success"></div>
            <div class="tiles warning"></div>
            <div class="tiles danger"></div>
            <div class="tiles info"></div>
            <div class="tiles dark"></div>
            <div class="tiles default"></div>
          </div>
        </div>
      </div>
      <div id="right-sidebar" class="settings-panel">
        <i class="settings-close ti-close"></i>
        <ul class="nav nav-tabs border-top" id="setting-panel" role="tablist">
          <li class="nav-item">
            <a class="nav-link active" id="todo-tab" data-toggle="tab" href="#todo-section" role="tab"
              aria-controls="todo-section" aria-expanded="true">TO DO LIST</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="chats-tab" data-toggle="tab" href="#chats-section" role="tab"
              aria-controls="chats-section">CHATS</a>
          </li>
        </ul>
        <div class="tab-content" id="setting-content">
          <div class="tab-pane fade show active scroll-wrapper" id="todo-section" role="tabpanel"
            aria-labelledby="todo-section">
            <div class="add-items d-flex px-3 mb-0">
              <form class="form w-100">
                <div class="form-group d-flex">
                  <input type="text" class="form-control todo-list-input" placeholder="Add To-do">
                  <button type="submit" class="add btn btn-primary todo-list-add-btn" id="add-task">Add</button>
                </div>
              </form>
            </div>

            <h4 class="px-3 text-muted mt-5 font-weight-light mb-0">Events</h4>
            <div class="events pt-4 px-3">
              <div class="wrapper d-flex mb-2">
                <i class="ti-control-record text-primary mr-2"></i>
                <span>Feb 11 2018</span>
              </div>
              <p class="mb-0 font-weight-thin text-gray">Creating component page build a js</p>
              <p class="text-gray mb-0">The total number of sessions</p>
            </div>
            <div class="events pt-4 px-3">
              <div class="wrapper d-flex mb-2">
                <i class="ti-control-record text-primary mr-2"></i>
                <span>Feb 7 2018</span>
              </div>
              <p class="mb-0 font-weight-thin text-gray">Meeting with Alisa</p>
              <p class="text-gray mb-0 ">Call Sarah Graves</p>
            </div>
          </div>
        </div>
      </div>
      <!-- partial -->
      <!-- partial:partials/_sidebar.html -->

      <!-- ***** 사이드바 ****** -->
      <!-- ul > li (각 메뉴)-->
      <nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">

          <!-- 1) Dashboard 메뉴 -->
          <li class="nav-item">
            <!-- 메뉴 클릭시 이동경로 / 스타일클래스 -->
            <a class="nav-link" href="ClassManage.jsp">
              <!-- 아이콘 -->
              <i class="icon-grid menu-icon"></i>
              <!-- 메뉴이름 -->
              <span class="menu-title">수업 진행</span>
            </a>
          </li>
          <!-- 2) 수업진행 -->
          <li class="nav-item">
            <a class="nav-link" href="ReadyToClass.jsp">
              <i class="icon-layout menu-icon"></i>
              <span class="menu-title">수업 준비</span>
            </a>
          </li>
          <li class="nav-item">
            <!-- 3) 수업관리 -->
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
              <i class="icon-bar-graph menu-icon"></i>
              <span class="menu-title">수업 관리</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="ui-basic">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="Ex-manage.jsp">분석 조회</a></li>
                <li class="nav-item"> <a class="nav-link" href="Product-manage.jsp">제품연동관리</a></li>
              </ul>
            </div>
          </li>

          <!-- 4) 게시판 -->
          <li class="nav-item">
            <a class="nav-link" href="./Board.jsp">
              <i class="icon-head menu-icon"></i>
              <span class="menu-title">게시판</span>
            </a>
          </li>
        </ul>
      </nav>





      <!-- partial -->
      <div class="main-panel">

        <div class="content-wrapper">
          <div class="main">

            <!-- 배치도-->
            <div class="seat-position">
              <!--강의실 선택 버튼 토글-->
              <div class="btn-group">
                <label type="button" class="btn btn-primary">강의실 선택</label>
                <label type="button" class="btn btn-primary dropdown-toggle dropdown-toggle-split"
                  id="dropdownMenuSplitButton1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <span class="sr-only">Toggle Dropdown</span>
                </label>
                
                <div class="dropdown-menu" aria-labelledby="dropdownMenuSplitButton1" style="">
                  <a class="dropdown-item" id="class1" href="#">IoT 강의실5</a>
                  <a class="dropdown-item" id="class2" href="#">빅데이터 강의실4</a>
                  <a class="dropdown-item" id="class3" href="#">인공지능 강의실3</a>
                  <div class="dropdown-divider"></div>
                </div>
              </div>
              <script>
                funtion = categoryChange(e){
                	var class_05 =["별찍기 실습","포켓몬 실습","계산기 프로그램 실습"];
                	var class_04 =[""];
                	var class_03=[""];
                	var target= document.getElementById("class");
                	
                	if(e.value == "05") var d = class_05;
                	else if(e.value == "04") var d = class_04;
                	else if(e.value == "03") var d = class_03;
                	
                	target.options.length = 0;
                
                
                for(x in d){
                	var opt = 
                		document.createElement("a");
                	    opt.value = d[x];
                	    opt.innerHTML = d[x];
                	    target.appendChild(opt);
                }
                
                }
              
              
              </script>
              
              <!-- 문제 선택 버튼 토글 -->
              <div class="btn-group">
                <label type="button" class="btn btn-primary">문제 선택</label>
                <label type="button" class="btn btn-primary dropdown-toggle dropdown-toggle-split"
                  id="dropdownMenuSplitButton1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <span class="sr-only">Toggle Dropdown</span>
                </label> 
                <nav id="class_nav">
                <div class="dropdown-menu" aria-labelledby="dropdownMenuSplitButton1" >
                  <a class="dropdown-item" href="#">별찍기 실습</a>
                  <a class="dropdown-item" href="#">포켓몬 실습</a>
                  <a class="dropdown-item" href="#">계산기 프로그램 실습</a>
                  <div class="dropdown-divider"></div>
                </div>
                </nav>
              </div>
              <!-- 자리 배치도 -->
              <div class="card">
                <div class="card-body">
                  <div>
                    <h4 class="card-title">자리 배치도</h4>
                  </div>

                  <div>
                    <div id="row1">
                      <table border="1px">
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                      </table>
                    </div>

                    <div id="row2">
                      <table border="1px">
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>

                      </table>
                    </div>

                    <div id="row3">
                      <table border="1px">
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>
                        <tr>
                          <td></td>
                          <td></td>
                        </tr>

                      </table>

                    </div>

                  </div>
                </div>

              </div>

            </div>
          </div>
          <div>
          </div>

          <!--타이머-->

          <div class="timer">
            <div id="timer_title">
              <h2>실습시간 제어</h2>
            </div>

            <!-- 남은 시간 표시 -->
            <div id="time-left">03:12</div>

            <!-- 타이머 버튼-->
            <div id="timer-button">
              <button type="button" class="btn btn-primary">일시정지</button>
              <button type="button" class="btn btn-primary">시간추가</button>
              <button type="button" class="btn btn-primary">타이머 종료</button>
            </div>

          </div>

          <!-- led 제어 -->
          <div class="control_led">
            <div id="control_led_title">
              <h2>led 제어</h2>
            </div>
            <!-- led 제어 버튼-->
            <div id="led-button">
              <button type="button" class="btn btn-primary">기기 ON</button>
              <button type="button" class="btn btn-primary">기기 OFF</button>
            </div>
            
          </div>
        </div>

      </div>

    </div>



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