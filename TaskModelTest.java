package com.example.taskmanager;

import com.example.taskmanager.model.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskModelTest {

    @Test
    public void testTaskCreation() {
        Task task = new Task();
        task.setTitle("Sample Task");
        task.setDescription("Sample Description");
        task.setCompleted(false);
        
        assertNotNull(task);
        assertEquals("Sample Task", task.getTitle());
    }
}
