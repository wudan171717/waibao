package interceptor;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse resp, Object handler, Exception e)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest req, HttpServletResponse resp,
			Object handler, ModelAndView mv) throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
			Object handler) throws Exception {
		Object user=req.getSession().getAttribute("user");
		if(user!=null){
			System.out.println(user);
			return true;
			}
		ServletContext ctx=req.getSession().getServletContext();
		resp.sendRedirect(ctx.getContextPath()+"/login/login.form");
		return false;
	}

}
