package com.kbstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
// 1. 스프링부트 어플리케이션임을 알려줌
// 2. component scanning을 가능케함
// 3. auto-configuration을 가능케함
public class Clone0427Application {

    public static void main(String[] args) {
        SpringApplication.run(Clone0427Application.class, args);
    }
    // main 메소드는 어플리케이션 시작 포인트

    @Bean
    // bean type을 선언하기 위해 사용
    public InternalResourceViewResolver setupViewResolver() {
        // view resolver : resolving (view names)-->(actual view objects)
        // InternalResourceViewResolver :
        // 특히 (JSP view names) --> (JSP files in '/views/' directory')
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/views/");
        // prefix : 접두사
        resolver.setSuffix(".jsp");
        // suffix : 접미사

        // controller메소드가 view name을 return 하면
        // viewresolver가 받아서 자동으로 해당 경로와 이름의 jsp파일을 찾고
        // Spring MVC framework로 view object으로 보냄
        return resolver;
    }



}
