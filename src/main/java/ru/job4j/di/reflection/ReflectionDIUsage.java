package ru.job4j.di.reflection;

public class ReflectionDIUsage {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.addFromInput("What's your name?");
        ui.print();
    }
}
