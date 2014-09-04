package com.demo2do.data.list;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test case for SingleLinkedList
 */
public class SingleLinkedListTest {

    private List<Integer> inputs = new ArrayList<Integer>();

    /**
     * execute for each test, before executing test
     */
    @Before
    public void before() {
        for (int i = 1; i <= 5; i++) {
            inputs.add(i);
        }
    }

    /**
     * execute for each test, after executing test
     */
    @After
    public void after() {
        inputs.clear();
    }

    @Test
    public void testPush() {
        SingleLinkedList<Integer> iList = new SingleLinkedList<Integer>();

        for(Integer i : inputs) {
            iList.push(i);
        }

        Assert.assertEquals("List[ 5, 4, 3, 2, 1 ]", iList.toString());
    }

}
