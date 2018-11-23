package com.example.zuul;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class ZuulDemoFilter extends ZuulFilter{
	
	@Override
	public boolean shouldFilter() {
		return true;
//		return false;
	}
	
	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
//		return null;
	}
 
	@Override
	public int filterOrder() {
		return 0;
	}
 
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();  
        HttpServletRequest request = ctx.getRequest();  
		
        System.out.println("rush zuul-1*******");
        System.out.println(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

		return null;
	}
 



}
