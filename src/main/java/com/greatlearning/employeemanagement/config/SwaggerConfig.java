package com.greatlearning.employeemanagement.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

	@Bean
	public Docket employeeApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Employee-API").select()
				.apis(RequestHandlerSelectors.basePackage("com.greatlearning.employeemanagement.controller")).build()
				.apiInfo(metaInfo());

	}

	private ApiInfo metaInfo() {
		return new ApiInfoBuilder().title("API Rest").description("\"API Rest\"").version("1.0.0")
				.license("Apache License Version 2.0").licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
				.build();
	}
}
