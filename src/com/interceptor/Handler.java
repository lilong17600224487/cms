package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class Handler extends HandlerInterceptorAdapter{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
//			Object arg2) throws Exception {
//		String url=request.getRequestURI();
//		if(url.indexOf("login")>=0){
//			System.out.println("我登录进来了");
//			return true;
//		}
//		HttpSession session=request.getSession();
//		User user = (User) session.getAttribute("user");
//		if(user!=null){
//			System.out.println("我有user");
//			return true;
//		}
//		request.getRequestDispatcher("/login.jsp").forward(request, response);
//		System.out.println("重新登陆");
//		return false;
//	}

}
