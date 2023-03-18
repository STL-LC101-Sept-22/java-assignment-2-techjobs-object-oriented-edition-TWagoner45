package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    public JobTest(){

    }
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();  //initialized here, so lose scope outside of curly braces
        Job job2 = new Job();
    assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public  void testJobConstructorSetsAllFields(){
        Job testJob;
        testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

    assertTrue(testJob.getName() instanceof String);
    assertEquals("Product Tester", testJob.getName()); //return boolean
    assertTrue(testJob.getEmployer() instanceof Employer);
    assertEquals("ACME", testJob.getEmployer().getValue()); //method chaining
    assertTrue(testJob.getLocation() instanceof Location);
    assertEquals("Desert", testJob.getLocation().getValue());
    assertTrue(testJob.getPositionType() instanceof PositionType);
    assertEquals("Quality Control", testJob.getPositionType().getValue());
    assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Persistence", testJob.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality(){  //create 2 new jobs exact same properties
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        Job testJob2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        Assert.assertFalse( testJob.equals(testJob2)); //Assert is class
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){  //check f&l character of string and new line using charat
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        char letter[] = testJob.toString().toCharArray();  //thank goodness for intellij
        assertEquals('\n', letter[0]);  // do i need the [] for the index of?
        assertEquals('\n', letter[letter.length-1]);  // from 0 to n-1 n is length of the string (value of last letter, cause dont know how long)
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        //assert weather those things are equal at the end  declare string
        String blanks = "\n" + "ID: " + testJob.getId() + "\n" +
                "Name: " + testJob.getName() + "\n" +
                "Employer: " + testJob.getEmployer() + "\n" +
                "Location: " + testJob.getLocation() + "\n" +
                "Position Type: " + testJob.getPositionType() + "\n" +
                "Core Competency: " + testJob.getCoreCompetency() + "\n";
        assertEquals( blanks, testJob.toString());

    }


    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        String blanks = "\n" + "ID: " + testJob.getId() + "\n" +
                "Name: " + testJob.getName() + "\n" +
                "Employer: " + testJob.getEmployer() + "\n" +
                "Location: " + testJob.getLocation() + "\n" +
                "Position Type: " + testJob.getPositionType() + "\n" +
                "Core Competency: " + "Data not available" + "\n";
        assertEquals(testJob.toString(), blanks);
    }

    private void assertNotEquals(int id, int id1) {
    }
}


