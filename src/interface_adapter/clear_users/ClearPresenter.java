package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }


    @Override
    public void prepareSuccessView(ClearOutputData delUsernames) {
        ClearState clearState = clearViewModel.getState();
        clearState.setDelUsernames(delUsernames.getDelUsernames());
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
    }
}

