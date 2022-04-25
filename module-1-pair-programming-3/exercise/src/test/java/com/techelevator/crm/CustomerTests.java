package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

    @Test
    public void getCustomerSubtotal() {
        Customer customer = new Customer("Ishwor", "Tuladhar");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Grooming", 25.00);
        testMap.put("Walking", 10.00);
        testMap.put("Sitting", 20.00);

        double methods = customer.getBalanceDue(testMap);

        Assert.assertEquals(55.00, methods, 0.0);
    }

    @Test
    public void getCustomerSubtotal2() {
        Customer customer = new Customer("Ishwor", "Tuladhar");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Grooming", 25.00);
        testMap.put("Walking", 10.00);

        double methods = customer.getBalanceDue(testMap);

        Assert.assertEquals(35.00, methods, 0.00);
    }

    @Test
    public void getCustomerSubtotal1() {
        Customer customer = new Customer("Ishwor", "Tuladhar");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Grooming", 25.00);

        double methods = customer.getBalanceDue(testMap);

        Assert.assertEquals(25.00, methods, 0.00);
    }

    @Test
    public void getCustomerSubtotal0() {
        Customer customer = new Customer("Ishwor", "Tuladhar");
        Map<String, Double> testMap = new HashMap<>();

        double methods = customer.getBalanceDue(testMap);

        Assert.assertEquals(0.00, methods, 0.00);
    }
}