package org.xstefank.lt;

import org.junit.Assert;
import org.junit.Test;

public class SomeTest {
    @Test
    public void testTwo() {
        Assert.assertEquals(System.getProperty("os.name"), "Linux");
    }

    @Test
    public void mavenTest() {
        Assert.assertEquals(getClass().getPackage().getImplementationVersion(), "3.0.5");
    }
}
