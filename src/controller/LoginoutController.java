package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class LoginoutController {
	

	@RequestMapping("/loginout.form")
	public String loginForm(HttpServletRequest req){
		//可以向表单界面传递一些参数
		HttpSession session=req.getSession();
		session.invalidate();
		return "redirect:index.jsp";
		}
}
