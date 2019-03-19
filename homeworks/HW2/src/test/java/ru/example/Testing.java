package ru.example;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class Testing {
    @org.junit.Test
    public void test1() throws Exception {
        assertEquals("Unexpected value", Main.count("test1.txt"), 1);
    }
    @org.junit.Test
    public void test2() throws Exception {
        assertEquals("Unexpected value", Main.count("test2.txt"), 2);
    }
}
