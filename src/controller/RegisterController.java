package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.NameOrPwdException;
import service.NullParamException;
import service.UserService;
import entity.User;

@Controller
@RequestMapping()
public class RegisterController {
	@Resource//请求spring注入资源userService
	private UserService userService;
	
	@RequestMapping("/register-action.form")
	public String Register(HttpServletRequest req) {
		String username=req.getParameter("username");
		String pwd=req.getParameter("pwd");
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String classes=req.getParameter("classes");
		String major=req.getParameter("major");
		String email=req.getParameter("email");
		
		try {
			userService.register(username, pwd,name,gender,classes,major,email);
			return "redirect:index.jsp";
		} 
		catch (RuntimeException e){
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "error";}

	}
}
