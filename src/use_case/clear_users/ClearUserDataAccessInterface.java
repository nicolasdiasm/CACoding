package use_case.clear_users;

// TODO Complete me

import java.io.IOException;
import java.util.ArrayList;

public interface ClearUserDataAccessInterface {
    void delete();
    boolean isEmpty();
    ArrayList<String> getUsernames();
}
