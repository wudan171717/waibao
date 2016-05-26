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
	@Resource//����springע����ԴuserService
	private UserService userService;
	
	//����һ
	@RequestMapping("/check_name.form")//spring MVC �Զ�ע��HTTPSERVLETREQUSET
	
	//�е�ֱ�ӣ�ȱ����Ҫ�Լ�������������ת������֧���ļ��ϴ�����
	public void checkname(HttpServletRequest req,HttpServletResponse resp) {
		resp.setContentType("text/html;charset=utf-8");
		String username=req.getParameter("username");
		PrintWriter out;
		try {
			User user=userService.checkname(username);
			out = resp.getWriter();
			if(user==null){
				out.print("����ʹ��");
			}else{
				out.print("���û���������");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	}
