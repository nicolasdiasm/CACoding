package use_case.clear_users;

// TODO Complete me


import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary userPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
    }

    @Override
    public void execute(){
        if (userDataAccessObject.isEmpty()) {
            ClearOutputData clearOutputData = new ClearOutputData(new ArrayList<>());
            userPresenter.prepareSuccessView(clearOutputData);
        } else {
            ArrayList<String> delUsernames = userDataAccessObject.getUsernames();
            ClearOutputData clearOutputData = new ClearOutputData(delUsernames);
            userDataAccessObject.delete();
            userPresenter.prepareSuccessView(clearOutputData);
        }
    }
}
