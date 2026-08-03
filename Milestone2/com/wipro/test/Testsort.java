package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import com.wipro.task.Dailtask;
public class TestSort {
    @Test
    public void testSortValues() {
        Dailytask obj = new Dailytask();
        int input[] = {5, 2, 8, 1, 3};
        int expected[] = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, obj.sortValues(input));
    }
}