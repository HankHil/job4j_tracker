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
            return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] res = new Item[size];
        int i = 0;
        for (int index = 0; index < size; index++) {
            Item found = items[index];
            if (found.getName().equals(key)) {
                res[i] = found;
                i++;
            }
            return Arrays.copyOf(res, i);
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