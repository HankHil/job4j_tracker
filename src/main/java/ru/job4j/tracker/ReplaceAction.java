package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter item's id: "));
        String newName = input.askStr("Enter item's new name: ");
        Item item = new Item(newName);
        item.setId(id);
        if (tracker.replace(id, item)) {
            System.out.print("Done!");
        } else {
            System.out.print("Exeption! Wrong id!");
        }
        return true;
    }
}
