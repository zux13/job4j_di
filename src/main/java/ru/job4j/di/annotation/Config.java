package ru.job4j.di.annotation;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "ru.job4j.di.annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Primary
    @Order(11)
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Order(4)
    @Bean(name = "SecondDog")
    public Dog getDog() {
        return new Dog("SecondDog");
    }

    @Order(-1)
    @Bean
    public Dog someDog() {
        return new Dog("Dog");
    }
}
