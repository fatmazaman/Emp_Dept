package com.fatmazaman.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.fatmazaman.dao.model"})
@EnableJpaRepositories(basePackages = {"com.fatmazaman.dao.repository"})
public class RepositoryConfig{

}
