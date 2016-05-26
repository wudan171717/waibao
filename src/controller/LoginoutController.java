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
		//����������洫��һЩ����
		HttpSession session=req.getSession();
		session.invalidate();
		return "redirect:index.jsp";
		}
}
