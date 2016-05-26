package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.User;
import service.NameOrPwdException;
import service.NullParamException;
import service.UserService;
@Controller
@RequestMapping()
public class LoginController{

	@Resource//����springע����ԴuserService
	private UserService userService;
	
	@RequestMapping("/login.form")
	public String loginForm(){
		//����������洫��һЩ����
		return "login";//ӳ�䵽login.jsp
		}
	//����һ
	@RequestMapping("/login-action.form")//spring MVC �Զ�ע��HTTPSERVLETREQUSET
	
	//�е�ֱ�ӣ�ȱ����Ҫ�Լ�������������ת������֧���ļ��ϴ�����
	public String checkLogin(HttpServletRequest req) {
		
		//�����ָ���쳣
		/*String s=null;
		s.length();*/
		
		String username=req.getParameter("username");
     	String pwd=req.getParameter("pwd");
		try {
			User user=userService.login(username, pwd);
			System.out.println(user);
			req.getSession().setAttribute("name", user.getName());
			return "redirect:index.jsp";
		} catch (NameOrPwdException e) {
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "login";
		}catch (RuntimeException e){
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "error";
		}catch(NullParamException e){
			e.printStackTrace();
			req.setAttribute("message", e.getMessage());
			return "redirect:index.jsp";
		}

	}

	}
