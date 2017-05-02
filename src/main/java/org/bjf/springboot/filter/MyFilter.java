package org.bjf.springboot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Created by binjinfeng on 2017/3/16.
 */
@WebFilter()
public class MyFilter implements Filter {

    FilterConfig config;

    @Override
    public void init(FilterConfig config) throws ServletException {
        this.config = config;
        config.getServletContext().log("=========================================MyFilter启动:init=========================================");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        config.getServletContext().log("=========================================MyFilter拦截请求:doFilter=========================================");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        config.getServletContext().log("==>MyFilter destroy");
    }
}
