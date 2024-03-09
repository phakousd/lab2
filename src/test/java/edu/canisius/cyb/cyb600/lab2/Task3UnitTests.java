package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        // Student should write test here
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a","b","c"));
        assertEquals(expected, task3.removeDuplicates("abcabc"));
    }

    @Test
    public void test_removeDuplicates_average(){
        // Student should write tests here
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a", "b", "c"));
        assertEquals(expected, task3.removeDuplicates("abc"));
    }

    @Test
    public void test_removeDuplicates_worst(){
        // Student should write tests here
        assertTrue(task3.removeDuplicates("").isEmpty());

    }

    @Test
    public void test_areTheseAnagrams_best(){
        // Student should write tests here
        assertTrue(task3.areTheseAnagrams("listen", "silent"));

    }

    @Test
    public void test_areTheseAnagrams_average(){
        // Student should write tests here
        assertFalse(task3.areTheseAnagrams("hello", "word"));

    }

    @Test
    public void test_areTheseAnagrams_worst(){
        // Student should write tests here
    assertFalse(task3.areTheseAnagrams(null, "test"));
    assertFalse(task3.areTheseAnagrams("test", null));
    }

}
