package app.response_objects;

/**
 * Created by Dawid Pawlak.
 */
public class TaskResultResponse {

    private String status;

    private TaskResult result;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskResult getResult() {
        return result;
    }

    public void setResult(TaskResult result) {
        this.result = result;
    }
}
