package org.sang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@MapperScan("org.sang.mapper")
@EnableCaching
public class HrserverApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		System.out.print("视频上传项目启动类2.==="+"\n");
		return application.sources(HrserverApplication.class);
	}

	public static void main(String[] args) {
		//System.out.print("视频上传项目启动类1.==="+"\n");
		SpringApplication.run(HrserverApplication.class, args);
	}
}
