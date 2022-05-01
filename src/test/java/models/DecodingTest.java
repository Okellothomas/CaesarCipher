package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {

    @Test
    public void getInputKeys(){
        Decoding decoding = new Decoding(1, "one");
        assertEquals(1, decoding.getInputKey());
    }

    @Test
    public void getUserInputs(){
        Decoding decoding =  new Decoding(1, "one");
        assertEquals("one", decoding.getUserInput());
    }

    @Test
    public void decode_UserInputString_true(){
        Decoding decoding = new Decoding(1,"A");
        assertEquals("Z",decoding.decode());
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}