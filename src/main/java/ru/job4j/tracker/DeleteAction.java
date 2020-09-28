package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "=== Delete item ====";
}

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter item's id: "));
        if (tracker.delete(id)) {
            System.out.print("Done!");
        } else {
            System.out.print("Exeption! Wrong id!");
        }
        return true;
    }
}