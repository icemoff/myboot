package org.bjf.springboot.servlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.File;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Created by binjinfeng on 2017/3/16.
 */
@WebServlet(loadOnStartup = 2, urlPatterns = "/initServlet")
public class InitServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        getServletContext().log("=========================================my init servlet: after spring=========================================");
        // 获取spring工厂
        WebApplicationContext wac =
                WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        //        WebContextUtil.setWac(wac);
        String path = this.getServletContext().getRealPath(File.separator);
        //        WebContextUtil.setContextPath(path);
        super.init();
    }
}
