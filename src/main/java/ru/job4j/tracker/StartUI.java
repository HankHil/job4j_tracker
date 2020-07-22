package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("a");
        tracker.add(item);
        Item a = new Item();
        a = tracker.findById();
        System.out.println(a);
    }
}
