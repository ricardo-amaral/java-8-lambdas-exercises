package com.insightfullogic.java8.examples.chapter4;


import org.junit.Assert;
import org.junit.Test;

public class MusicalCarriageTest {

    @Test
    public void rocksLikeACarriage() {
        Assert.assertEquals("... from side to side", new MusicalCarriage().rock());
    }

}
