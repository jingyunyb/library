<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
   <title>图书--添加图书</title>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="fixed-top">

   <!-- BEGIN HEADER -->
   <%@include file="../header.jsp"%>
   <!-- END HEADER -->

   <!-- BEGIN CONTAINER -->
   <div id="container" class="row-fluid">
      <!-- BEGIN SIDEBAR -->
      <div class="sidebar-scroll">
          <div id="sidebar" class="nav-collapse collapse">

              <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
              <div class="navbar-inverse">
                  <form class="navbar-search visible-phone">
                      <input type="text" class="search-query" placeholder="Search" />
                  </form>
              </div>
              <!-- END RESPONSIVE QUICK SEARCH FORM -->
              <!-- BEGIN SIDEBAR MENU -->
              <%@include file="../menu.jsp"%>
              <!-- END SIDEBAR MENU -->
          </div>
      </div>
      <!-- END SIDEBAR -->
      <!-- BEGIN PAGE -->  
      <div id="main-content">
         <!-- BEGIN PAGE CONTAINER-->
         <div class="container-fluid">
            <!-- BEGIN PAGE HEADER-->   
            <div class="row-fluid">
               <div class="span12">
                   <!-- BEGIN THEME CUSTOMIZER-->
                   <div id="theme-change" class="hidden-phone">
                       <i class="icon-cogs"></i>
                        <span class="settings">
                            <span class="text">Theme Color:</span>
                            <span class="colors">
                                <span class="color-default" data-style="default"></span>
                                <span class="color-green" data-style="green"></span>
                                <span class="color-gray" data-style="gray"></span>
                                <span class="color-purple" data-style="purple"></span>
                                <span class="color-red" data-style="red"></span>
                            </span>
                        </span>
                   </div>
                   <!-- END THEME CUSTOMIZER-->
                  <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                   <h3 class="page-title">
                    	 图书列表
                   </h3>
                   <ul class="breadcrumb">
                       <li>
                           <a href="#">Home</a>
                           <span class="divider">/</span>
                       </li>
                       <li>
                           <a href="#">图书</a>
                           <span class="divider">/</span>
                       </li>
                       <li class="active">
                           	图书列表
                       </li>
                       <li class="pull-right search-wrap">
                           <form action="search_result.html" class="hidden-phone">
                               <div class="input-append search-input-area">
                                   <input class="" id="appendedInputButton" type="text">
                                   <button class="btn" type="button"><i class="icon-search"></i> </button>
                               </div>
                           </form>
                       </li>
                   </ul>
                   <!-- END PAGE TITLE & BREADCRUMB-->
               </div>
            </div>
            <!-- END PAGE HEADER-->
            	<!-- BEGIN PAGE CONTENT-->
				<div id="page-wraper">

					<div class="row-fluid">
						<div class="span12">
							<!-- BEGIN SAMPLE FORMPORTLET-->
							<div class="widget green">
								<div class="widget-title">
									<h4>
										<i class="icon-reorder"></i> 图书添加
									</h4>
									<span class="tools"> <a href="javascript:;"
										class="icon-chevron-down"></a> <a href="javascript:;"
										class="icon-remove"></a>
									</span>
								</div>
								<div class="widget-body">
									<!-- BEGIN FORM-->
									<form action="addBookPro.action" class="form-horizontal">
										<div class="control-group">
											<label class="control-label">书名</label>
											<div class="controls">
												<input type="text" class="input-large" name="book.name"/>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">作者</label>
											<div class="controls">
												<input type="text" class="input-large" name="book.author"/>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">简介</label>
											<div class="controls">
												<textarea rows="" cols="" class="input-large" name="book.description"></textarea>
											</div>
										</div>
										<div class="form-actions">
											<button type="submit" class="btn blue">
												<i class="icon-ok"></i> Save
											</button>
											<button type="button" class="btn">
												<i class=" icon-remove"></i> Cancel
											</button>
										</div>
									</form>
									<!-- END FORM-->
								</div>
							</div>
							<!-- END SAMPLE FORM PORTLET-->
						</div>
					</div>
				</div>
				<!-- END PAGE CONTENT-->         
         </div>
         <!-- END PAGE CONTAINER-->
      </div>
      <!-- END PAGE -->  
   </div>
   <!-- END CONTAINER -->

   <!-- BEGIN FOOTER -->
   <%@include file="../footer.jsp"%>
   <!-- END FOOTER -->
   
   
</body>
<!-- END BODY -->
</html>
