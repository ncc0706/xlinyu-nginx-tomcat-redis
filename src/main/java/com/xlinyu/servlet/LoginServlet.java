package com.xlinyu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xlinyu.domain.User;

public class LoginServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("...........init.........");
	}
	
	/**
	 * 处理登陆业务
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setId(System.currentTimeMillis()+"");
		user.setUsername(username);
		user.setPassword(password);
		
		String path = request.getContextPath();
		
		if("admin".equals(username) && "admin".equals(password)){
			request.getSession().setAttribute("u", username);
			response.sendRedirect(path + "/index.jsp");
			
		}else{
			System.out.println("用户名或密码错误");
			request.getRequestDispatcher(path + "/login.jsp").forward(request, response);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("...........destroy.........");
	}
	
	
}
