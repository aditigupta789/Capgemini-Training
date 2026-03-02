package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessorTest {

    @Test
    public void testConcatenate(){
        StringProcessor sp = new StringProcessor();
        assertEquals("abc", sp.concatenate("ab", "c"));
    }

    @Test
    public void testNullConcatenate(){
        StringProcessor sp = new StringProcessor();
        assertThrows(IllegalArgumentException.class, () -> sp.concatenate(null, null));
        assertThrows(IllegalArgumentException.class, () -> sp.concatenate("abc", null));
        assertThrows(IllegalArgumentException.class, () -> sp.concatenate(null, "abc"));
    }

    @Test
    public void testPalindromeTrue(){
        StringProcessor sp = new StringProcessor();
        assertTrue(sp.isPalindrome("abcba"));
    }

    @Test
    public void testPalindromeFalse(){
        StringProcessor sp = new StringProcessor();
        assertFalse(sp.isPalindrome("abcbdjnnka"));
        assertFalse(sp.isPalindrome(null));
    }

    public static void  main(String[] args) {
        ProcessorTest test = new ProcessorTest();
        test.testConcatenate();
        test.testPalindromeTrue();
        test.testPalindromeFalse();
    }
}
