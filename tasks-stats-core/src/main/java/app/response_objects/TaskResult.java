package app.response_objects;

import java.util.List;

/**
 * Created by Dawid Pawlak.
 */
public class TaskResult {

    private List<Problem> problems;

    private List<ProblemStatistics> problemStatistics;


    public List<Problem> getProblems() {
        return problems;
    }

    public void setProblems(List<Problem> problems) {
        this.problems = problems;
    }

    public List<ProblemStatistics> getProblemStatistics() {
        return problemStatistics;
    }

    public void setProblemStatistics(List<ProblemStatistics> problemStatistics) {
        this.problemStatistics = problemStatistics;
    }
}
