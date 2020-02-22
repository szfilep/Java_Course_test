import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testSolution() {
    Task task = new Task();
    // put your test here
    Assert.assertEquals("10+10 should be 20", 20,task.add(10, 10));
    Assert.assertEquals("5+10 should be 20", 15,task.add(5, 10));
  }

  @Test
  public void testSolution2() {
    Task task = new Task();
    // put your test here
    Assert.assertEquals("FAIL", 21,task.add(10, 10));

  }
}