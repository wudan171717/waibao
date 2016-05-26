<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
     <title>用户登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style>
      html,body{width: 100%;height: 100%}
      *{margin: 0;padding: 0;outline: none}
      .wrap{width: 1000px;margin: 0 auto}
      body{
        background: url('./task2/images/bg.png') top center no-repeat;
      }
      .login{
        float: right;
        margin-top: 50px;
        padding: 60px;
        width: 330px;
        height: 400px;
        background: #fff;
        opacity: .7;
        border-radius: 10px;
        box-shadow: 0 0 11px #6a6a6a;
      }
      .login input{
        padding:15px;
        width: 100%;
        border-radius: 10px;
        text-indent: 50px;
        font-size: 16px;
        border: 1px solid #b4b4b4;
      }
      .login .group{
        margin-top: 30px;
        position: relative;
      }
      .login .group img{
        position: absolute;
        left: 10px;
        top: 7px
      }
      .footer{
        position: absolute;
        left: 0;
        bottom: 0;
        width: 100%;
        height: 96px;
        line-height: 30px;
        padding-top: 20px;
        background: #343434;
        opacity: .67;
      }
      .footer p{
        font-size: 16px;
        color: #dcdcdc;
        text-align: center;
      }
      .btn{
        display: inline-block;
        width: 140px;
        height: 50px;
        color: #fff;
        text-decoration: none;
        text-align: center;
        line-height: 50px;
        border-radius: 5px;
      }
      .teacher{
        background: #f68b66;
      }
      .student{
        background: #6b8196;
      }
      .register{
        color: #818181;
        font-size: 16px;
        text-decoration: underline;
      }
    </style>

  </head>
  
  <body>
    <div class="wrap">
      <div class="login"> 
      <form action="${base}login-action.form" method="post">
			     	
        <img src="./task2/images/title.png" alt="login"/>
        <div class="group">
          <img src="./task2/images/user.png" alt="user"/>
          <input type="text" name="username" placeholder="请输入学号"/>
        </div>
        <div class="group">
          <img src="./task2/images/lock.png" alt="lock"/>
          <input type="password" name="pwd" placeholder="请输入密码"/>
        </div>
        <div class="group">
          <button type="submit" class="btn teacher">教工登录</button>
          <button type="submit" class="btn student">学生登录</button>
        </div>
        <div class="group">
          <a href="#" class="register">立即注册！</a>
        </div>
        </form>
      </div>
    </div>
    <div class="footer">
      <p>备案号：黔ICP备14006773号-2 地址：徐州市西安路41号</p>
      <p>技术支持：SuperMartin</p>
    </div>
  </body>
</html>
