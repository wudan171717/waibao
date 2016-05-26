package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;
import service.UserService;
@Controller
@RequestMapping()
public class CheckNameController{
	@Resource//请求spring注入资源userService
	private UserService userService;
	
	//方法一
	@RequestMapping("/check_name.form")//spring MVC 自动注入HTTPSERVLETREQUSET
	
	//有点直接，缺点需要自己处理数据类型转换，不支持文件上传功能
	public void checkname(HttpServletRequest req,HttpServletResponse resp) {
		resp.setContentType("text/html;charset=utf-8");
		String username=req.getParameter("username");
		PrintWriter out;
		try {
			User user=userService.checkname(username);
			out = resp.getWriter();
			if(user==null){
				out.print("可以使用");
			}else{
				out.print("该用户名不可用");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	}
