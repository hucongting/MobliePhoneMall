<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/shopping-mall-index.css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/zhonglin.js"></script>
</head>

<body>

	<jsp:include page="index_top.jsp"></jsp:include>
	<div class="sign-con w1200">
	<img src="images/logn-tu.gif" class="sign-contu f-l" />
    <div class="sign-ipt f-l">
    	<p>用户名</p>
        <input type="text" placeholder="手机号/邮箱" />
        <p>密码</p>
        <input type="text" placeholder="密码可见" /><br />
        <button class="slig-btn">登录</button>
        <p>已有账号？请<a href="#">登录</a><a href="#" class="wj">忘记密码？</a></p>
        <div class="sign-qx">
        	<a href="#" class="f-r"><img src="images/sign-xinlan.gif" /></a>
        	<a href="#" class="qq f-r"><img src="images/sign-qq.gif" /></a>
            <div style="clear:both;"></div>
        </div>
    </div>
    <div style="clear:both;"></div>
</div>

    <!--底部服务-->
    <jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>
