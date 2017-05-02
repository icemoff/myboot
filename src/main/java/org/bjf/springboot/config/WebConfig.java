package org.bjf.springboot.config;

import org.bjf.springboot.interceptor.MvcInterceptor;
import org.bjf.springboot.servlet.InitServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by binjinfeng on 2017/3/16.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {


  /**
   * servlet
   */
//    @Bean
  public ServletRegistrationBean addServlet() {
    ServletRegistrationBean registration = new ServletRegistrationBean();
    registration.setServlet(new InitServlet());
    //        registration.setUrlMappings(Arrays.asList("/testServlet"));
    registration.setLoadOnStartup(1);
    return registration;
  }

  /**
   * spring mvc 拦截器
   */
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new MvcInterceptor()).addPathPatterns("/**");
  }
}
