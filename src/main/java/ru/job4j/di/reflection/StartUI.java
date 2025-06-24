package ru.job4j.di.reflection;

public class StartUI {

    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value) {
        store.add(value);
    }

    public void addFromInput(String question) {
        add(consoleInput.askStr(question));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
