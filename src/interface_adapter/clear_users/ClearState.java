package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> delUsernames;

    public ClearState(ClearState copy) {
        delUsernames = copy.delUsernames;
    }

    public ClearState() {}

    public ArrayList<String> getDelUsernames() {
        return delUsernames;
    }

    public void setDelUsernames(ArrayList<String> delUsernames) {
        this.delUsernames = delUsernames;
    }

}
