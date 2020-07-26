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

    public Item[] findAll() {
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
        }
            return Arrays.copyOf(res, i);
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl){
            item.setId(id);
            items[index] = item;
            return true;
        } return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
       boolean rsl = index != -1;
       if (rsl){
            int start = index + 1;
            int distPos = index;
            int number = size - index;
            System.arraycopy(items, start, items, distPos, number);
            items[size - 1] = null;
            size--;
            return true;
        } return rsl;
        }
    }
