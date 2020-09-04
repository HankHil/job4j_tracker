package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] all = tracker.findAll();
                for (int index = 0; index < all.length; index++) {
                    System.out.println(all[index].getName());
                    System.out.println();
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                int id = Integer.valueOf(input.askStr("Enter item's id: "));
                String newName = input.askStr("Enter item's new name: ");
                Item newItem = new Item(newName);
                if (tracker.replace(id, newItem)) {
                    System.out.print("Done!");
                } else {
                    System.out.print("Exeption! Wrong id!");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                int id = Integer.valueOf(input.askStr("Enter item's id: "));
                if (tracker.delete(id)) {
                    System.out.print("Done!");
                } else {
                    System.out.print("Exeption! Wrong id!");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                int id = Integer.valueOf(input.askStr("Enter item's id: "));
                Item item = new Item();
                item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.getName());
                } else { System.out.println("Item not found"); }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String name = input.askStr("Enter item's name: ");
                Item[] foundByName = tracker.findByName(name);
                if (foundByName.length > 0) {
                for (int index = 0; index < foundByName.length; index++) {
                    Item founds = foundByName[index];
                    System.out.println("Item {id= " + founds.getId() + ", name= " + founds.getName());
                    System.out.println();
                } else { System.out.println("Items not found"); }
            } else if (select == 6) {
                run = false;
            }
        }
    }


    private void showMenu() {
            System.out.println("Menu.");
            System.out.println("0. Add new Item.");
            System.out.println("1. Show all items.");
            System.out.println("2. Edit item.");
            System.out.println("3. Delete item.");
            System.out.println("4. Find item by Id.");
            System.out.println("5. Find items by name.");
            System.out.println("6. Exit Program.");
    }


        public static void main(String[] args) {
            Input input = new ConsoleInput();
            Tracker tracker = new Tracker();
            new StartUI().init(input, tracker);
        }
}