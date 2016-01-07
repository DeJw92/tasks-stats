package app.controllers;

import app.response_objects.Problem;
import app.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Dawid Pawlak.
 */

@RestController
@RequestMapping(value="/tasks")
public class TasksController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(value="/all", method= RequestMethod.GET)
    public ResponseEntity<List<Problem>> getAllProblems() {
        List<Problem> problems = taskService.getAll();
        return new ResponseEntity<List<Problem>>(problems, HttpStatus.OK);
    }

}
