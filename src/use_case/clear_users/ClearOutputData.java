package use_case.clear_users;

import java.util.ArrayList;

public class ClearOutputData {
    private final ArrayList<String> delUsernames;

    public ClearOutputData(ArrayList<String> delUsernames) {
        this.delUsernames = delUsernames;
    }

    public ArrayList<String> getDelUsernames() {
        return delUsernames;
    }
}
