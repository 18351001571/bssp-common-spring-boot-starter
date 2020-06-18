package com.cloud.bssp.knife4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableConfigurationProperties(Knife4jProperties.class)
@ConditionalOnClass(Knife4jProperties.class)
@ConditionalOnProperty(prefix = "knife4j" ,havingValue = "true", name = "isOpen")
@EnableSwagger2
public class SwaggerConfiguration {

    @Autowired
    private Knife4jProperties knife4jProperties;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(knife4jProperties.getBasePackage()))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(knife4jProperties.getTitle())
                .description(knife4jProperties.getDescribe())
                .termsOfServiceUrl(knife4jProperties.getServiceUrl())
                .contact(knife4jProperties.getAuthor())
                .version(knife4jProperties.getVersion())
                .build();
    }
}