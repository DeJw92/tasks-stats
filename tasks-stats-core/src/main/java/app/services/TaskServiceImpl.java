package app.services;

import app.response_objects.Problem;
import app.response_objects.TaskResult;
import app.response_objects.TaskResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dawid Pawlak.
 */

@Service
public class TaskServiceImpl implements TaskService{

    private final String ALL_TASKS_URL = "http://codeforces.com/api/problemset.problems";

    private final String SUCCESS_STATUS = "OK";
    @Autowired
    private RestTemplate restTemplate;

    public List<Problem> getAll() {
        TaskResultResponse taskResultResponse = restTemplate.getForObject(ALL_TASKS_URL, TaskResultResponse.class);
        if(SUCCESS_STATUS.equals(taskResultResponse.getStatus())) {
            TaskResult result = taskResultResponse.getResult();
            return result.getProblems();
        }
        return new ArrayList<Problem>();
    }


}
