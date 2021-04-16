package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaddNumbers {

    @Test
    public void test() {
        jUnitTesting junit = new jUnitTesting();
        int result = junit.addNum(50, 40);
        assertEquals (90, result);
    }

}