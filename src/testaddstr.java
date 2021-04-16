package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstr {

    @Test
    public void test() {
        jUnitTesting junitstr = new jUnitTesting();
        String result = junitstr.addString("Project", "work");
        assertEquals("Projectwork", result);
    }

}