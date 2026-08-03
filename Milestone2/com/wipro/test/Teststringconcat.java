package com.wipro.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.wipro.task.Dailytask;

public class Teststringconcat {

    @Test
    public void testDoStringConcat() {

        Dailytask obj = new Dailytask();
        assertEquals("Hello World",
                obj.doStringConcat("Hello", "World"));
    }
}