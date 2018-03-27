package com.hc.config;

import com.hc.interceptor.TestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截器按照顺序执行
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/interceptor/**");
        super.addInterceptors(registry);
    }
}
