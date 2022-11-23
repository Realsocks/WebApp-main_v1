package com.example.demo.repos;

import com.example.demo.Entitys.Workers;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

import javax.annotation.Resource;

public class WorkersRepo {
    @Bean
    public Jackson2RepositoryPopulatorFactoryBean getRespositoryPopulator() {
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources((org.springframework.core.io.Resource[]) new Resource[]{(Resource) new ClassPathResource("Workers.json")});
        return factory;
    }
}
