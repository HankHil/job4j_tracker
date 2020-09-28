package ru.job4j.tracker;

public class FindByNameAction implements UserAction{
    @Override
    public String name() {
        return "=== Find items by name ====";
}

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter item's name: ");
        Item[] foundByName = tracker.findByName(name);
        if (foundByName.length > 0) {
            for (int index = 0; index < foundByName.length; index++) {
                Item founds = foundByName[index];
                System.out.println("Item {id= " + founds.getId() + ", name= " + founds.getName());
                System.out.println();
            }
        }else{
            System.out.println("Items not found");
        }
        return true;
    }
}