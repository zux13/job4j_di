package ru.job4j.di.reflection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di.reflection");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.addFromInput("What's your name?");
        ui.print();

        System.out.println("---");

        StartUI anotherUI = context.getBean(StartUI.class);
        anotherUI.add("apple");
        anotherUI.add("orange");
        anotherUI.addFromInput("What's for lunch?");
        anotherUI.print();
    }
}
