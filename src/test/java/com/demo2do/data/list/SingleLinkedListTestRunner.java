package com.demo2do.data.list;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Test Runner for SingleLinkedList
 */
public class SingleLinkedListTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SingleLinkedListTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
