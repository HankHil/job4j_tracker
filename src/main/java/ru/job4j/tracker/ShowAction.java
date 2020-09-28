package ru.job4j.tracker;

public class ShowAction implements UserAction{
    @Override
    public String name() {
        return "=== Show all items ====";
}

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] all = tracker.findAll();
        for (int index = 0; index < all.length; index++) {
            System.out.println(all[index].getName());
            System.out.println();
        }
        return true;
    }
}