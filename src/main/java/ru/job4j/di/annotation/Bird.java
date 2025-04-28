package ru.job4j.di.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Bird implements Pet<Bird> {
    @Value("${bird.name:Kesha}")
    private String name;

    @Override
    public String print() {
        return "Bird name = %s".formatted(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
