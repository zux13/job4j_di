package ru.job4j.di.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ru.job4j.di.aop")
@EnableAspectJAutoProxy
public class Config {
}
