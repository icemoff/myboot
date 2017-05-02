package org.bjf.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by binjinfeng on 2017/3/16.
 */
@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        event.getServletContext().log("=========================================MyListener启动: before spring=========================================");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("=========================================MyListener  销毁=========================================");
    }
}
