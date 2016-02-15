import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TaskTest {

  @Test
  public void newTask_instatiateCorrectly_true() {
    Task testTask = new Task("Wash the dishes");
    assertEquals(true, testTask instanceof Task);
  }

  @Test
  public void newTask_displayATask() {
    Task testTask = new Task("Wash the dishes");
    assertEquals("Wash the dishes", testTask.getDescription());
  }
}
