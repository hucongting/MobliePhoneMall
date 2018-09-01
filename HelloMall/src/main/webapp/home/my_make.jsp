<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>预约界面</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/shopping-mall-index.css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/zhonglin.js"></script>
</head>

<body>

	<jsp:include page="index_top.jsp"></jsp:include>
    <!--内容开始-->
    <div class="interface">
    	<div class="in-tit">
        	<h3>商品信息</h3>
        </div>
        <div class="commodity">
        	<div class="matong f-l">
            	<a href="#"><img src="images/in-matong.gif" /></a>
            </div>
            <div class="com-con f-l">
            	<h3>卫欲无限 新一代双漩冲刷虹吸式连体坐便器 马桶 座便器2163400mm坑距</h3>
                <p class="pt">重力出击，超强冲力，排污更流畅</p>
                <dl>
                	<dt>规格</dt>
                    <dd>尺码：400mml坑距<br />颜色：白色</dd>
                    <div style="clear:both;"></div>
                </dl>
                <dl>
                	<dt>促销</dt>
                    <dd><span class="sp1">满赠</span>      指定商品满1件，赠送卫欲无限 座便器配件三件套</dd>
                    <div style="clear:both;"></div>
                </dl>
                <dl>
                	<dt>送货至</dt>
                    <dd>重庆南岸区（包邮）</dd>
                    <div style="clear:both;"></div>
                </dl>
                <dl>
                	<dt>价格</dt>
                    <dd><span class="sp2">¥588.00</span></dd>
                    <div style="clear:both;"></div>
                </dl>
            </div>
            <div style="clear:both;"></div>
        </div>
    	<div class="in-tit">
        	<h3>客户信息</h3>
        </div>
        <div class="kehu">
        	<div class="p-ip">
            	<p>联系人</p>
                <input type="text" placeholder="请输入手机验证码" />
                <div style="clear:both;"></div>
            </div><br />
        	<div class="p-ip">
            	<p>联系方式</p>
                <input type="text" placeholder="请输入密码" />
                <div style="clear:both;"></div>
            </div><br />
        	<div class="p-ip">
            	<p>联系时间</p>
                <input type="text" placeholder="请再次确认密码" />
                <div style="clear:both;"></div>
            </div><br />
            <button>提交预约</button>
        </div>
    </div>
    
    <!--底部服务-->
    <div class="ft-service">
    	<div class="w1200">
        	<div class="sv-con-l2 f-l">
            	<dl>
                	<dt><a href="#">新手上路</a></dt>
                    <dd>
                    	<a href="#">购物流程</a>
                    	<a href="#">在线支付</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">配送方式</a></dt>
                    <dd>
                    	<a href="#">货到付款区域</a>
                    	<a href="#">配送费标准</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">购物指南</a></dt>
                    <dd>
                    	<a href="#">常见问题</a>
                    	<a href="#">订购流程</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">售后服务</a></dt>
                    <dd>
                    	<a href="#">售后服务保障</a>
                    	<a href="#">退款说明</a>
                    	<a href="#">新手选购商品总则</a>
                    </dd>
                </dl>
                <dl>
                	<dt><a href="#">关于我们</a></dt>
                    <dd>
                    	<a href="#">投诉与建议</a>
                    </dd>
                </dl>
                <div style="clear:both;"></div>
            </div>
        	<div class="sv-con-r2 f-r">
            	<p class="sv-r-tle">187-8660-5539</p>
            	<p>周一至周五9:00-17:30</p>
            	<p>（仅收市话费）</p>
            	<a href="#" class="zxkf">24小时在线客服</a>
            </div>
            <div style="clear:both;"></div>
        </div>
    </div>
    
    <jsp:include page="index_bottom.jsp"></jsp:include>
    
</body>
</html>
