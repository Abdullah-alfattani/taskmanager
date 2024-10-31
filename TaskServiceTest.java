package com.example.taskmanager;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import com.example.taskmanager.service.TaskService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    public TaskServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSaveTask() {
        Task task = new Task();
        task.setTitle("Test Task");

        when(taskRepository.save(task)).thenReturn(task);

        Task savedTask = taskService.saveTask(task);
        assertNotNull(savedTask);
        assertEquals("Test Task", savedTask.getTitle());
    }
}
