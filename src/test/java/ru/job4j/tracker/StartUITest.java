package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    /*@Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {"replaced item"};
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));*/
    }

    /*@Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item newItem = new Item("new item");
        tracker.add(newItem);
        String[] answers = {newItem.getId()};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(newItem.getId());
        assertThat(deleted,is(nullValue()));
    }*/
}