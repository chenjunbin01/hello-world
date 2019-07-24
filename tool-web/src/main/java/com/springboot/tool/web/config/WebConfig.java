package com.springboot.tool.web.config;

import com.springboot.tool.core.config.SqlPrintInterceptor;
import com.springboot.tool.web.filter.ServletLogFilter;
import com.springboot.tool.web.util.ApplicationContextUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.*;

import javax.servlet.Filter;
import java.util.List;


/**
 * @Author chenjunbin
 * @Date 2019/5/27
 * @Description
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {





    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
    @Bean
    public Filter servletLogFilter() {
        return new ServletLogFilter();
    }


    @Bean
    public ApplicationContextUtil applicationContextUtil() {
        return new ApplicationContextUtil();
    }

    //将要执行的sql进行日志打印(不想拦截，就把这方法注释掉)
    @Bean
    public SqlPrintInterceptor sqlPrintInterceptor(){
        return new SqlPrintInterceptor();
    }



}
