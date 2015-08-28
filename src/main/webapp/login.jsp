<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
   <meta charset="utf-8" />
   <title>登录</title>
   <meta content="width=device-width, initial-scale=1.0" name="viewport" />
   <meta content="" name="description" />
   <meta content="" name="author" />
   <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   <link href="assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   <link href="css/style.css" rel="stylesheet" />
   <link href="css/style-responsive.css" rel="stylesheet" />
   <link href="css/style-default.css" rel="stylesheet" id="style_color" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="lock">
    <div class="lock-header">
        <!-- BEGIN LOGO -->
        <a class="center" id="logo" href="index.html">
            <img class="center" alt="logo" src="img/logo.png">
        </a>
        <!-- END LOGO -->
    </div>
    <div class="login-wrap">
        <div class="metro single-size red">
            <div class="locked">
                <i class="icon-lock"></i>
                <span>登录</span>
            </div>
        </div>
        
        <form action="loginPro.action" method="post">
	        <div class="metro double-size green">
		        <div class="input-append lock-input">
		            <input type="text" name="user.name" class="" placeholder="Username">
		        </div>
	        </div>
	        <div class="metro double-size yellow">
	            <div class="input-append lock-input">
	                <input type="password" name="user.password" class="" placeholder="Password">
	            </div>
	        </div>
	        <div class="metro single-size terques login">
	            <form action="index.html">
	                <button type="submit" class="btn login-btn">
	                 	   登录
	                    <i class=" icon-long-arrow-right"></i>
	                </button>
	            </form>
	        </div>
		</form>
        
        <div class="login-footer">
            <div class="remember-hint pull-left">
                <input type="checkbox" id=""> 记住密码
            </div>
            <div class="forgot-hint pull-right">
                <a id="forget-password" class="" href="javascript:;">忘记密码?</a>
            </div>
        </div>
    </div>
</body>
<!-- END BODY -->
</html>