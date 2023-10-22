package use_case.clear_users;

// TODO Complete me


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
            userPresenter.prepareFailureView("No users to be deleted.");
        }
        else {
            userDataAccessObject.delete();
            userPresenter.prepareSuccessView("All users deleted.");
        }
    }
}
