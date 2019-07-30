package org.xstefank.lt;

import org.junit.Assert;
import org.junit.Test;

public class SomeTest {
    @Test
    public void testTwo() {
        Assert.assertEquals("tryThis", System.getProperty("myProperty"));
    }
}
