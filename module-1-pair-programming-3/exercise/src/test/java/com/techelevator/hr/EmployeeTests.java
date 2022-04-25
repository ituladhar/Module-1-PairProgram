package com.techelevator.hr;

import com.techelevator.crm.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.", employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.", 100, employee.getSalary(), 0.0);
    }

    @Test
    public void getCustomerSubtotal() {
        Employee employee = new Employee("Bryce", "Meador");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Grooming", 25.00);
        testMap.put("Walking", 10.00);
        testMap.put("Sitting", 20.00);

        double methods = employee.getBalanceDue(testMap);

        Assert.assertEquals("The subtotal is incorrect", 50.00, methods, 0.0);
    }

    @Test
    public void getCustomerSubtotalWalking() {
        Employee employee = new Employee("Bryce", "Meador");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Walking", 10.00);

        double methods = employee.getBalanceDue(testMap);

        Assert.assertEquals("Walking was not discounted", 5.00, methods, 0.0);
    }

    @Test
    public void getCustomerSubtotalNoWalking() {
        Employee employee = new Employee("Bryce", "Meador");
        Map<String, Double> testMap = new HashMap<>();
        testMap.put("Grooming", 25.00);
        testMap.put("Sitting", 20.00);

        double methods = employee.getBalanceDue(testMap);

        Assert.assertEquals("The subtotal is incorrect",45.00, methods, 0.0);
    }
    @Test
    public void getCustomerSubtotalNoServices() {
        Employee employee = new Employee("Bryce", "Meador");
        Map<String, Double> testMap = new HashMap<>();

        double methods = employee.getBalanceDue(testMap);

        Assert.assertEquals("The subtotal is incorrect", 0.00, methods, 0.0);
    }
}