package kz.one.lab.lesson4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//swagger доступен по адресу localhost:port/swagger-ui.html
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfoAll()).select()
                .apis(RequestHandlerSelectors.basePackage("kz.one.lab")).paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfoAll() {
        return new ApiInfoBuilder()
                .title("One Lab First WebService")
                .version("1.0.0")
                .build();
    }

}
