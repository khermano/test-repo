package org.xstefank.lt;

import org.junit.Assert;
import org.junit.Test;

public class SomeTest {
    @Test
    public void testTwo() {
        Assert.assertEquals("Linux", System.getProperty("os.name"));
    }

    @Test
    public void mavenTest() {
        Assert.assertEquals("3.0.5", System.getProperty("teamcity.agent.jvm.os.version"));
    }
}
