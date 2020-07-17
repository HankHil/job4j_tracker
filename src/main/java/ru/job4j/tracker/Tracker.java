package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(items[]) {
        Item[] itemsWithoutNull = new Item[size];
        itemsWithoutNull = Arrays.copyOf(items, size);
            return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] res = new Item[size];
        for (int index = 0; index < size; index++) {
            Item found = items[index];
            if (found.getName() == key) {
                int i = 0;
                res[i] = found;
                i++;
            }
            return res;
        }
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}