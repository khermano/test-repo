package org.xstefank.lt;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {
    @Test
    public void testOne() {
        Assert.assertEquals("me", "you");
    }

    @Test
    public void testTwo() {
        Assert.assertEquals("you", "you");
    }
}
