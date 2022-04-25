package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {
    private Pet pet;

    @Before
    public void setObjectUnderTest() {
        pet = new Pet("Test Name", "Test Species");

    }

    @Test
    public void listOfVaccinations() {
        String expected = "Rabies, Distemper, Parvo";

        List<String> testList = new ArrayList<>();
        testList.add("Rabies");
        testList.add("Distemper");
        testList.add("Parvo");

        pet.setVaccinations(testList);

        String output = pet.listVacciations();

        Assert.assertEquals(expected, output);
    }

    @Test
    public void singleVaccination() {
        String expected = "Rabies";

        List<String> testList = new ArrayList<>();
        testList.add("Rabies");

        pet.setVaccinations(testList);

        String output = pet.listVacciations();

        Assert.assertEquals(expected, output);
    }

    @Test
    public void noVaccinations() {
        String expected = "";

        List<String> testList = new ArrayList<>();

        pet.setVaccinations(testList);

        String output = pet.listVacciations();

        Assert.assertEquals(expected, output);
    }
}

