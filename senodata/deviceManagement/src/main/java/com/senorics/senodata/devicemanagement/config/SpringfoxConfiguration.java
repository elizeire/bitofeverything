package com.senorics.senodata.devicemanagement.config;

import java.util.Collection;
import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2 @Import(SpringDataRestConfiguration.class) @Configuration public class SpringfoxConfiguration {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(getApiInfo());

    }

    private ApiInfo getApiInfo() {
        return new ApiInfo("Senorics Data Plataform REST API", "Senorics Data Plataform REST API",
                "version 0.0.1-SNAPSHOT", "Terms of use", getContact(), "license", "license url",
                getVendorExtensions());

    }

    private Collection<VendorExtension> getVendorExtensions() {
        return Collections.emptyList();
    }

    private Contact getContact() {

        return new Contact("Guilherme Elizeire", "www.elizeire.com", "elizeire@gmail.com");
    }

}
