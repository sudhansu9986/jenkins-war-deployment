package com.sudhansu.demoapp.jenkinswardeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsWarDeploymentApplication extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JenkinsWarDeploymentApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(JenkinsWarDeploymentApplication.class, args);
	}
}
