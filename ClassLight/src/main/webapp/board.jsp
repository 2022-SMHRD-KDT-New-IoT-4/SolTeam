<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Board</title>

<!-- Required meta tags -->
   <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- index.html >>> Main.html로 타이틀 변경 -->
    <title>classManage</title>
    <!-- Main : css-->
    <link rel="stylesheet" href="./Wep-CSS/Board.css">

    <!-- plugins:css -->
    <link rel="stylesheet" href="./ClassLight/template/vendors/feather/feather.css">
    <link rel="stylesheet" href="./ClassLight/template/vendors/ti-icons/css/themify-icons.css">
    <link rel="stylesheet" href="./ClassLight/template/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <link rel="stylesheet" href="./ClassLight//template/vendors/datatables.net-bs4/dataTables.bootstrap4.css">
    <link rel="stylesheet" href="./ClassLight//template/vendors/ti-icons/css/themify-icons.css">

    <link rel="stylesheet" type="text/css" href="./ClassLight/template/js/select.dataTables.min.css">
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
        <a class="navbar-brand brand-logo mr-5" href="mainTeacher.jsp"><img src="./ClassLight/tempLogo/자산 3.png" class="mr-2"
            alt="logo" /></a>
        <!-- 최소화로고이미지 :  -->
        <a class="navbar-brand brand-logo-mini" href="mainTeacher.jsp"><img src="./ClassLight/tempLogo/자산 4.png" alt="logo" /></a>
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
						<!-- 사이드바 A태그 --> <a
						class="nav-link count-indicator dropdown-toggle"
						id="notificationDropdown" href="#" data-toggle="dropdown"> <i
							class="icon-bell mx-0"></i> <span class="count"></span>
					</a>
						<div
							class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list"
							aria-labelledby="notificationDropdown">
							<p class="mb-0 font-weight-normal float-left dropdown-header">Notifications</p>
							<a class="dropdown-item preview-item">
								<div class="preview-thumbnail">
									<div class="preview-icon bg-success">
										<i class="ti-info-alt mx-0"></i>
									</div>
								</div>
								<div class="preview-item-content">
									<h6 class="preview-subject font-weight-normal">Application
										Error</h6>
									<p class="font-weight-light small-text mb-0 text-muted">
										Just now</p>
								</div>
							</a> <a class="dropdown-item preview-item">
								<div class="preview-thumbnail">
									<div class="preview-icon bg-warning">
										<i class="ti-settings mx-0"></i>
									</div>
								</div>
								<div class="preview-item-content">
									<h6 class="preview-subject font-weight-normal">Settings</h6>
									<p class="font-weight-light small-text mb-0 text-muted">
										Private message</p>
								</div>
							</a> <a class="dropdown-item preview-item">
								<div class="preview-thumbnail">
									<div class="preview-icon bg-info">
										<i class="ti-user mx-0"></i>
									</div>
								</div>
								<div class="preview-item-content">
									<h6 class="preview-subject font-weight-normal">New user
										registration</h6>
									<p class="font-weight-light small-text mb-0 text-muted">2
										days ago</p>
								</div>
							</a>
						</div>
					</li>
					<li class="nav-item nav-profile dropdown"><a
						class="nav-link dropdown-toggle" href="#" data-toggle="dropdown"
						id="profileDropdown"> <img src="./ClassLight/template/images/faces/face23.jpg"
							alt="profile" />
					</a>
						<div class="dropdown-menu dropdown-menu-right navbar-dropdown"
							aria-labelledby="profileDropdown">
							<a class="dropdown-item"> <i class="ti-settings text-primary"></i>
								Settings
							</a> <a class="dropdown-item" href="main.jsp"> <i
								class="ti-power-off text-primary"></i> Logout
							</a>
						</div></li>
					<li class="nav-item nav-settings d-none d-lg-flex"><a
						class="nav-link" href="#"> <i class="icon-ellipsis"></i>
					</a></li>
				</ul>
				<button
					class="navbar-toggler navbar-toggler-right d-lg-none align-self-center"
					type="button" data-toggle="offcanvas">
					<span class="icon-menu"></span>
				</button>
			</div>
		</nav>
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_settings-panel.html -->
			<div class="theme-setting-wrapper">
				<div id="settings-trigger">
					<i class="ti-settings"></i>
				</div>
				<div id="theme-settings" class="settings-panel">
					<i class="settings-close ti-close"></i>
					<p class="settings-heading">SIDEBAR SKINS</p>
					<div class="sidebar-bg-options selected" id="sidebar-light-theme">
						<div class="img-ss rounded-circle bg-light border mr-3"></div>
						Light
					</div>
					<div class="sidebar-bg-options" id="sidebar-dark-theme">
						<div class="img-ss rounded-circle bg-dark border mr-3"></div>
						Dark
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
				<ul class="nav nav-tabs border-top" id="setting-panel"
					role="tablist">
					<li class="nav-item"><a class="nav-link active" id="todo-tab"
						data-toggle="tab" href="#todo-section" role="tab"
						aria-controls="todo-section" aria-expanded="true">TO DO LIST</a></li>
					<li class="nav-item"><a class="nav-link" id="chats-tab"
						data-toggle="tab" href="#chats-section" role="tab"
						aria-controls="chats-section">CHATS</a></li>
				</ul>
				<div class="tab-content" id="setting-content">
					<div class="tab-pane fade show active scroll-wrapper"
						id="todo-section" role="tabpanel" aria-labelledby="todo-section">
						<div class="add-items d-flex px-3 mb-0">
							<form class="form w-100">
								<div class="form-group d-flex">
									<input type="text" class="form-control todo-list-input"
										placeholder="Add To-do">
									<button type="submit"
										class="add btn btn-primary todo-list-add-btn" id="add-task">Add</button>
								</div>
							</form>
						</div>
						<div class="list-wrapper px-3">
							<ul class="d-flex flex-column-reverse todo-list">
								<li>
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox"> Team review meeting
											at 3.00 PM
										</label>
									</div> <i class="remove ti-close"></i>
								</li>
								<li>
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox"> Prepare for
											presentation
										</label>
									</div> <i class="remove ti-close"></i>
								</li>
								<li>
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox"> Resolve all the low
											priority tickets due today
										</label>
									</div> <i class="remove ti-close"></i>
								</li>
								<li class="completed">
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox" checked> Schedule
											meeting for next week
										</label>
									</div> <i class="remove ti-close"></i>
								</li>
								<li class="completed">
									<div class="form-check">
										<label class="form-check-label"> <input
											class="checkbox" type="checkbox" checked> Project
											review
										</label>
									</div> <i class="remove ti-close"></i>
								</li>
							</ul>
						</div>
						<h4 class="px-3 text-muted mt-5 font-weight-light mb-0">Events</h4>
						<div class="events pt-4 px-3">
							<div class="wrapper d-flex mb-2">
								<i class="ti-control-record text-primary mr-2"></i> <span>Feb
									11 2018</span>
							</div>
							<p class="mb-0 font-weight-thin text-gray">Creating component
								page build a js</p>
							<p class="text-gray mb-0">The total number of sessions</p>
						</div>
						<div class="events pt-4 px-3">
							<div class="wrapper d-flex mb-2">
								<i class="ti-control-record text-primary mr-2"></i> <span>Feb
									7 2018</span>
							</div>
							<p class="mb-0 font-weight-thin text-gray">Meeting with Alisa</p>
							<p class="text-gray mb-0 ">Call Sarah Graves</p>
						</div>
					</div>
					<!-- To do section tab ends -->
					<div class="tab-pane fade" id="chats-section" role="tabpanel"
						aria-labelledby="chats-section">
						<div
							class="d-flex align-items-center justify-content-between border-bottom">
							<p
								class="settings-heading border-top-0 mb-3 pl-3 pt-0 border-bottom-0 pb-0">Friends</p>
							<small
								class="settings-heading border-top-0 mb-3 pt-0 border-bottom-0 pb-0 pr-3 font-weight-normal">See
								All</small>
						</div>
						<ul class="chat-list">
							<li class="list active">
								<div class="profile">
									<img src="./ClassLight/template/images/faces/face1.jpg" alt="image"><span
										class="online"></span>
								</div>
								<div class="info">
									<p>Thomas Douglas</p>
									<p>Available</p>
								</div> <small class="text-muted my-auto">19 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img src="./ClassLight/template/images/faces/face2.jpg" alt="image"><span
										class="offline"></span>
								</div>
								<div class="info">
									<div class="wrapper d-flex">
										<p>Catherine</p>
									</div>
									<p>Away</p>
								</div>
								<div class="badge badge-success badge-pill my-auto mx-2">4</div>
								<small class="text-muted my-auto">23 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img src="./ClassLight/template/images/faces/face3.jpg" alt="image"><span
										class="online"></span>
								</div>
								<div class="info">
									<p>Daniel Russell</p>
									<p>Available</p>
								</div> <small class="text-muted my-auto">14 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img src="./ClassLight/template/images/faces/face4.jpg" alt="image"><span
										class="offline"></span>
								</div>
								<div class="info">
									<p>James Richardson</p>
									<p>Away</p>
								</div> <small class="text-muted my-auto">2 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img src="./ClassLight/template/images/faces/face5.jpg" alt="image"><span
										class="online"></span>
								</div>
								<div class="info">
									<p>Madeline Kennedy</p>
									<p>Available</p>
								</div> <small class="text-muted my-auto">5 min</small>
							</li>
							<li class="list">
								<div class="profile">
									<img src="./ClassLight/template/images/faces/face6.jpg" alt="image"><span
										class="online"></span>
								</div>
								<div class="info">
									<p>Sarah Graves</p>
									<p>Available</p>
								</div> <small class="text-muted my-auto">47 min</small>
							</li>
						</ul>
					</div>
					<!-- chat tab ends -->
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
            <a class="nav-link" href="classAction.jsp">
              <!-- 아이콘 -->
              <i class="icon-grid menu-icon"></i>
              <!-- 메뉴이름 -->
              <span class="menu-title">수업 진행</span>
            </a>
          </li>
          <!-- 2) 수업진행 -->
          <li class="nav-item">
            <a class="nav-link" href="readyToClass.jsp">
              <i class="icon-layout menu-icon"></i>
              <span class="menu-title">수업 준비</span>
            </a>
          </li>
          <li class="nav-item">
            <!-- 3) 수업관리 -->
            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
              <i class="icon-bar-graph menu-icon"></i>
              <span class="menu-title">수업 관리</span>
            </a>
            <div class="collapse" id="ui-basic">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href="exManage.jsp">분석 조회</a></li>
                <li class="nav-item"> <a class="nav-link" href="productManage.jsp">제품연동관리</a></li>
              </ul>
            </div>
          </li>

					<!-- 4) 게시판 -->
					<li class="nav-item"><a class="nav-link" href="board.jsp">
							<i class="icon-head menu-icon"></i> <span class="menu-title">게시판</span>
					</a></li>
				</ul>
			</nav>




			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<table class="display expandable-table" style="width: 100%">
						<thead>
							<tr>
								<th id="title" height="100px" style="
                		padding-left: 17px;
               			padding-top: 3px;
                		"><h1 align="center">게시판</h1></th>
							</tr>
						</thead>
					</table>
					<br>

					<div class="col-lg-12 grid-margin stretch-card">
						<div class="card">
							<div class="card-body">
								<h1 class="card-title">우리반 게시판입니다</h1>
								<div id="divbtn">
									<p class="card-description">
										<button type="button"
											class="btn btn-outline-secondary btn-icon-text">
											글쓰기 <i class="ti-file btn-icon-append"></i>
										</button>
									</p>
								</div>
								<div class="table-responsive">
									<table class="table table-striped">
										<thead>
											<tr>
												<th>번호</th>
												<th>작성자</th>
												<th>내용</th>
												<th>작성일자</th>
												<th>조회수</th>
											</tr>
										</thead>
										<tbody>

											<tr>
												<td class="py-1">
													<h4>10</h4>
												</td>
												<td>
													<h4>김운비</h4>
												</td>
												<td>
													<h4>프로젝트 하느라 다들 너무 고생많았어요 ㅠㅠ</h4>
												</td>
												<td>
													<h4>23년 1월 26일</h4>
												</td>
												<td>
													<h4>777</h4>
												</td>
											</tr>
											<tr>
												<td class="py-1">
													<h4>9</h4>
												</td>
												<td>
													<h4>이인영</h4>
												</td>
												<td>
													<h4>솔팀이란것이 너무 자랑스럽습니다 ㅠ0ㅠ 감격의 눈물~</h4>
												</td>
												<td>
													<h4>23년 1월 25일</h4>
												</td>
												<td>
													<h4>37</h4>
												</td>
											</tr>
											<tr>
												<td class="py-1">
													<h4>8</h4>
												</td>
												<td>
													<h4>정인홍</h4>
												</td>
												<td>
													<h4>수업이 너무 재미있어요 ^___^</h4>
												</td>
												<td>
													<h4>23년 1월 24일</h4>
												</td>
												<td>
													<h4>50</h4>
												</td>
											</tr>
											<tr>
												<td class="py-1">
													<h4>7</h4>
												</td>
												<td>
													<h4>정윤한</h4>
												</td>
												<td>
													<h4>어서 취직하고싶네요~~</h4>
												</td>
												<td>
													<h4>23년 1월 23일</h4>
												</td>
												<td>
													<h4>45</h4>
												</td>
											</tr>
											<tr>
												<td class="py-1">
													<h4>6</h4>
												</td>
												<td>
													<h4>이채영</h4>
												</td>
												<td>
													<h4>우리반 분위기 짱좋음</h4>
												</td>
												<td>
													<h4>23년 1월 20일</h4>
												</td>
												<td>
													<h4>53</h4>
												</td>
											</tr>
											<tr>
												<td class="py-1">
													<h4>5</h4>
												</td>
												<td>
													<h4>이솔</h4>
												</td>
												<td>
													<h4>솔팀 짱입니다!!!!!</h4>
												</td>
												<td>
													<h4>23년 1월 14일</h4>
												</td>
												<td>
													<h4>37</h4>
												</td>
											</tr>
											<tr>
												<td class="py-1">
													<h4>4</h4>
												</td>
												<td>
													<h4>김운비</h4>
												</td>
												<td>
													<h4>여러분!!! 지각하지마세요!!!!!</h4>
												</td>
												<td>
													<h4>23년 1월 13일</h4>
												</td>
												<td>
													<h4>48</h4>
												</td>
											</tr>
											<tr>
												<td class="py-1">
													<h4>3</h4>
												</td>
												<td>
													<h4>김운비</h4>
												</td>
												<td>
													<h4>공지사항입니다!! 여러분~~</h4>
												</td>
												<td>
													<h4>23년 1월 11일</h4>
												</td>
												<td>
													<h4>56</h4>
												</td>
											</tr>
											<tr>
												<td class="py-1">
													<h4>2</h4>
												</td>
												<td>
													<h4>류승주</h4>
												</td>
												<td>
													<h4>저 시험 대박났습니다!!!</h4>
												</td>
												<td>
													<h4>23년 1월 9일</h4>
												</td>
												<td>
													<h4>42</h4>
												</td>
											</tr>
											<tr>
												<td class="py-1">
													<h4>1</h4>
												</td>
												<td>
													<h4>김경진</h4>
												</td>
												<td>
													<h4>안녕하세요 게시판에 첫글입니다..</h4>
												</td>
												<td>
													<h4>23년 1월 9일</h4>
												</td>
												<td>
													<h4>35</h4>
												</td>
											</tr>
										</tbody>

									</table>
									<div id="btn">
										<button type="button" class="btn btn-primary">이전</button>
										&nbsp;
										<button type="button" class="btn btn-primary">다음</button>
									</div>
								</div>
							</div>
						</div>
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


</body>

</html>