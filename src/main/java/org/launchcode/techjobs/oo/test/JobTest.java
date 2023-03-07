package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.PositionType;

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
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        //what goes into each section is there a list of data somewhere
    assertTrue(testJob.getName() instanceof String);
    assertEquals("Product Tester", testJob.getName()); //return boolean
    assertTrue(testJob.getEmployer() instanceof Employer);
    assertEquals("ACME", testJob.getEmployer().getValue()); //method chaining
    assertTrue(testJob instanceof Location);
    assertEquals("Desert", testJob.getLocation().getValue());
    assertTrue(testJob.getPositionType() instanceof PositionType);
    assertEquals("Quality Control", testJob.getPositionType().getValue());
    assertTrue(testJob instanceof CoreCompetency);
    assertEquals("Persistence", testJob.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality(){  //create 2 new jobs exact same properties
        Job testJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        Job testJob2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        Assert.assertFalse( testJob.equals(testJob2)); //Assert is class
    }

    @Test

    private void assertNotEquals(int id, int id1) {
    }
}


