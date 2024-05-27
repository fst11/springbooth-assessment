package assessment.submission.services;

import assessment.submission.models.Task;
import assessment.submission.repositories.TaskRepository;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createNewTask(Task task) {
        return (Task) taskRepository.save(task);
    }

    public List getAllTask() {
        return (List) taskRepository.findAll();
    }

    public Task findTaskById(Long id) {
        return taskRepository.getById(id);
    }

    public List<Task> findAllCompletedTask() {
        return taskRepository.findByCompletedTrue();
    }

    public List<Task> findAllInCompleteTask() {
        return List<Task> taskRepository.findByCompletedFalse();
    }

    public void deleteTask(Long task) {
        taskRepository.delete(task);
    }

    public Task updateTask(Task task) {
        return (Task) taskRepository.save(task);
    }
}
