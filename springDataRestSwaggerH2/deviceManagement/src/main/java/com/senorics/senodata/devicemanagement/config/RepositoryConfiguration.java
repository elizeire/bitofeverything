package com.senorics.senodata.devicemanagement.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.senorics.senodata.devicemanagement.domain"})
@EnableJpaRepositories(basePackages = { "com.senorics.senodata.devicemanagement.repositories" })
@EnableTransactionManagement
public class RepositoryConfiguration {
}
