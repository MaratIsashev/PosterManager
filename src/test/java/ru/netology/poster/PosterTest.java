package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test
    public void addOne() {
        Poster poster = new Poster();
        poster.add("poster1");

        String[] actual = poster.findAll();
        String[] expected = {"poster1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addFew() {
        Poster poster = new Poster();
        poster.add("poster1");
        poster.add("poster2");
        poster.add("poster3");

        String[] actual = poster.findAll();
        String[] expected = {"poster1", "poster2", "poster3"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addNothing() {
        Poster poster = new Poster();

        String[] actual = poster.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast10From3() {
        Poster poster = new Poster();
        poster.add("poster1");
        poster.add("poster2");
        poster.add("poster3");

        String[] actual = poster.findLast();
        String[] expected = {"poster3", "poster2", "poster1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast10From11() {
        Poster poster = new Poster();
        poster.add("poster1");
        poster.add("poster2");
        poster.add("poster3");
        poster.add("poster4");
        poster.add("poster5");
        poster.add("poster6");
        poster.add("poster7");
        poster.add("poster8");
        poster.add("poster9");
        poster.add("poster10");
        poster.add("poster11");

        String[] actual = poster.findLast();
        String[] expected = {"poster11", "poster10", "poster9","poster8","poster7","poster6","poster5","poster4","poster3","poster2"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast5From11() {
        Poster poster = new Poster(5);
        poster.add("poster1");
        poster.add("poster2");
        poster.add("poster3");
        poster.add("poster4");
        poster.add("poster5");
        poster.add("poster6");
        poster.add("poster7");
        poster.add("poster8");
        poster.add("poster9");
        poster.add("poster10");
        poster.add("poster11");

        String[] actual = poster.findLast();
        String[] expected = {"poster11","poster10","poster9","poster8","poster7"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast11From11() {
        Poster poster = new Poster(11);
        poster.add("poster1");
        poster.add("poster2");
        poster.add("poster3");
        poster.add("poster4");
        poster.add("poster5");
        poster.add("poster6");
        poster.add("poster7");
        poster.add("poster8");
        poster.add("poster9");
        poster.add("poster10");
        poster.add("poster11");

        String[] actual = poster.findLast();
        String[] expected = {"poster11", "poster10", "poster9","poster8","poster7","poster6","poster5","poster4","poster3","poster2","poster1"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
