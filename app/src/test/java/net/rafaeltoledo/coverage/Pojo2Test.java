package net.rafaeltoledo.coverage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Pojo2Test {

    @Test
    public void testPojo() {
        Pojo2 p = new Pojo2();

        p.setThing("String1");

        assertEquals("String1", p.getThing());
    }
}