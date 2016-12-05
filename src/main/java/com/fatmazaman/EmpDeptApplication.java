package com.fatmazaman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;

@SpringBootApplication
@EnableSwagger2
@ComponentScan("com.fatmazaman")
public class EmpDeptApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDeptApplication.class, args);
	}
	@Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("fatmazaman")
                .apiInfo(apiInfo())
                .select()
                .build();
    }
     
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Employee Department project")
                .description("Employee Department Project as an assignment")
                .build();
}
}
