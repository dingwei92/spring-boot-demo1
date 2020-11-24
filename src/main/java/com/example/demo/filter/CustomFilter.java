package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.*;

public class CustomFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化过滤器");
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter ...");
		chain.doFilter(request, response);
	}
	@Override
	public void destroy() {
		System.out.println("过滤器被销毁了");
	}
}
