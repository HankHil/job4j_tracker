package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] all = tracker.findAll();
                int i = 0;
                for (int index = 0; index < all.length; index++) {
                    System.out.println(all[index].getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter item's id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter item's new name: ");
                String newName = scanner.nextLine();
                Item newItem = new Item(newName);
                if (tracker.replace(id, newItem)) {
                    System.out.print("Done!");
                } else {
                    System.out.print("Exeption! Wrong id!");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter item's id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.print("Done!");
                } else {
                    System.out.print("Exeption! Wrong id!");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter item's id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = new Item();
                item = tracker.findById(id);
                System.out.println(item.getName());
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter item's name: ");
                String name = scanner.nextLine();
                Item[] foundByName = tracker.findByName(name);
                for (int index = 0; index < foundByName.length; index++) {
                 Item founds = foundByName[index];
                    System.out.println("Item {id= " + founds.getId() + ", name= " + founds.getName());
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}