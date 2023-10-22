package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel, ViewManagerModel viewManagerModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(String success) {

    }

    @Override
    public void prepareFailureView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setError(error);
        clearViewModel.fireProperyChanged();
    }
}
