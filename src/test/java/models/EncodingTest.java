package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public void isKeySet_true(){
        Encoding encoding = new Encoding(1,"one");
        assertEquals(true, encoding.isKeySet());
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}