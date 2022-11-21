package todo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TodoTest {
  // write test cases here
  @Test public void CheckEmptyTaskList() {
    Todo list = new Todo();
    ArrayList<String> expectedList = new ArrayList<String>();
    assertEquals("Checks if list is empty", expectedList, list.GetTasks());

  }

  @Test public void AddItemThenCheckTaskList() {
    Todo list = new Todo();
    list.addTask("Clean my room");

    ArrayList<String> expectedList = new ArrayList<String>();
    expectedList.add("Clean my room");
    assertEquals("returns list with data", expectedList, list.GetTasks());
  }
}