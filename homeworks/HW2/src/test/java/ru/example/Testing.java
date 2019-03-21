package ru.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class Testing {
    @org.junit.Test
    public void test1() throws Exception {
        assertThat(Mygame.count("test1.txt"), is(equalTo(1)));
    }

    @org.junit.Test
    public void test2() throws Exception {
        assertThat(Mygame.count("test2.txt"), is(equalTo(2)));
    }
}
