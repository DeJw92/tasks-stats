package app.services;

import app.response_objects.Problem;

import java.util.List;

/**
 * Created by Dawid Pawlak.
 */
public interface TaskService {
    List<Problem> getAll();
}
