package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public void getInputKeys(){
        Encoding encoding = new Encoding(1,"one");
        assertEquals(1, encoding.getInputKeys());
    }

    @Test
    public void getUserInputs(){
        Encoding encoding = new Encoding(1,"one");
        assertEquals("one", encoding.getUserInputs());
    }

    @Test
    public void encode_UserInputString_true(){
        Encoding encoding = new Encoding(1,"Thomas");

    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}