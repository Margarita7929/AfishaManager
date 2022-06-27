package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {


    @Test
    public void getFiveFilms() {
        AfishaManager manager = new AfishaManager();
        manager.save("One");
        manager.save("Two");
        manager.save("Three");
        manager.save("Four");
        manager.save("Five");
        String[] actual = manager.findAll();
        String[] expected = {"One", "Two", "Three", "Four", "Five"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getOneFilm() {
        AfishaManager manager = new AfishaManager();
        manager.save("One");

        String[] actual = manager.findAll();
        String[] expected = {"One"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getTenFilms() {
        AfishaManager manager = new AfishaManager();
        manager.save("One");
        manager.save("Two");
        manager.save("Three");
        manager.save("Four");
        manager.save("Five");
        manager.save("Six");
        manager.save("Seven");
        manager.save("Eight");
        manager.save("Nine");
        manager.save("Ten");
        String[] actual = manager.findAll();
        String[] expected = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void standardOutPutTenFilms() {
        AfishaManager manager = new AfishaManager();
        manager.save("One");
        manager.save("Two");
        manager.save("Three");
        manager.save("Four");
        manager.save("Five");
        manager.save("Six");
        manager.save("Seven");
        manager.save("Eight");
        manager.save("Nine");
        manager.save("Ten");
        String[] actual = manager.findLast();
        String[] expected = {"Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getOneAboveStandardOutPut() {
        AfishaManager manager = new AfishaManager(11);
        manager.save("One");
        manager.save("Two");
        manager.save("Three");
        manager.save("Four");
        manager.save("Five");
        manager.save("Six");
        manager.save("Seven");
        manager.save("Eight");
        manager.save("Nine");
        manager.save("Ten");
        manager.save("Eleven");
        String[] actual = manager.findLast();
        String[] expected = {"Eleven", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void oneBelowStandardOutPut() {
        AfishaManager manager = new AfishaManager(9);
        manager.save("One");
        manager.save("Two");
        manager.save("Three");
        manager.save("Four");
        manager.save("Five");
        manager.save("Six");
        manager.save("Seven");
        manager.save("Eight");
        manager.save("Nine");

        String[] actual = manager.findLast();
        String[] expected = {"Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void standardOutPutNineFilms() {
        AfishaManager manager = new AfishaManager();
        manager.save("One");
        manager.save("Two");
        manager.save("Three");
        manager.save("Four");
        manager.save("Five");
        manager.save("Six");
        manager.save("Seven");
        manager.save("Eight");
        manager.save("Nine");

        String[] actual = manager.findLast();
        String[] expected = {"Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void standardOutPutElevenFilms() {
        AfishaManager manager = new AfishaManager();
        manager.save("One");
        manager.save("Two");
        manager.save("Three");
        manager.save("Four");
        manager.save("Five");
        manager.save("Six");
        manager.save("Seven");
        manager.save("Eight");
        manager.save("Nine");
        manager.save("Ten");
        manager.save("Eleven");
        String[] actual = manager.findLast();
        String[] expected = {"Eleven", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void oneOupPutFiveFilms() {
        AfishaManager manager = new AfishaManager(1);
        manager.save("One");
        manager.save("Two");
        manager.save("Three");
        manager.save("Four");
        manager.save("Five");

        String[] actual = manager.findLast();
        String[] expected = {"Five"};

        assertArrayEquals(expected, actual);

    }
}
