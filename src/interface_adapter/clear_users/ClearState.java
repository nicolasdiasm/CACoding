package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String success = null;
    private String error = null;

    public ClearState(ClearState copy) {
        success = copy.success;
        error = copy.error;
    }

    public ClearState() {}

    public String getSuccess() { return success; }

    public String getError() { return error; }

    public void setSuccess(String success) { this.success = success; }

    public void setError(String success) { this.success = success; }
}
