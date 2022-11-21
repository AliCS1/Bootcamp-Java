package todo;

import java.util.ArrayList;

public class Todo {

    ArrayList<String> todo = new ArrayList<String>();
    public static void main(String[] args) {
    }

    public ArrayList<String> GetTasks() {
        return todo;
    }

    public void addTask(String task) {
        todo.add(task);
    }
    
}
