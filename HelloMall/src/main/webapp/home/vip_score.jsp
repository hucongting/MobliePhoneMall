<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>会员积分</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/shopping-mall-index.css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/zhonglin.js"></script>
</head>

<body>
	<jsp:include page="top.jsp"></jsp:include>
	
    	<div class="member f-r">
            <div class="mem-info1">
            	<div class="title">
                	<h3>会员积分</h3>
                </div>
                <div class="mem-con1">
                	<dl class="f-l">
                    	<dt><a href="#"><img src="images/data-tu2.gif" /></a></dt>
                        <dd>
                        	<a href="#">RH了</a>
                            <a href="#">zhao601884596</a>
                        </dd>
                        <div style="clear:both;"></div>
                    </dl>
                    <ul class="f-l">
                    	<li>
                        	<p>其他积分</p>
                            <span>689</span>
                        </li>
                    	<li>
                        	<p>其他积分</p>
                            <span>689</span>
                        </li>
                        <div style="clear:both;"></div>
                    </ul>
                    <a href="#" class="duihuan f-l">兑换超值商品或参加活动</a>
                    <div style="clear:both;"></div>
                </div>
            </div>
            <div class="mem-info2">
            	<div class="title">
                	<h3>积分获取</h3>
                </div>
                <ul>
                	<li class="current" jfhq="qb"><a href="JavaScript:;">全部</a></li>
                	<li jfhq="gmsp"><a href="JavaScript:;">购买商品</a></li>
                	<li jfhq="cjhd"><a href="JavaScript:;">参加活动</a></li>
                	<li jfhq="qd"><a href="JavaScript:;">签到</a></li>
                    <div style="clear:both;"></div>
                </ul>
                <div class="mem-con2">
                	<dl hpjf="gmsp">
                        <dt>
                            <h3>购买商品获得共<span>688积分</span></h3>
                            <p>您可以通过购物下单获取积分</p>
                        </dt>
                        <dd>
                            <a href="score_store.jsp">去商城购物</a>
                        </dd>
                        <div style="clear:both;"></div>
                    </dl>
                    <dl hpjf="cjhd">
                        <dt>
                            <h3>参加商城活动获得共<span>688积分</span></h3>
                            <p>您可以通过参加商城活动获取积分</p>
                        </dt>
                        <dd>
                            <a href="#">去商城活动</a>
                        </dd>
                        <div style="clear:both;"></div>
                    </dl>
                    <dl hpjf="qd">
                        <dt>
                            <h3>签到获得共 <span>688积分</span></h3>
                            <p>您可以通过每天签到获取积分</p>
                        </dt>
                        <dd>
                            <a href="#">签到</a>
                            <span>获得 +10积分</span>
                        </dd>
                        <div style="clear:both;"></div>
                    </dl>
                </div>
            </div>
        </div>
        <div style="clear:both;"></div>
    </div>
    
    <!--底部服务-->
    <jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>
