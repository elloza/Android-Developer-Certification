package com.lozasolutions.androiddevcerttraining.ui.main;

import com.lozasolutions.androiddevcerttraining.data.model.Ribot;
import com.lozasolutions.androiddevcerttraining.ui.base.MvpView;

import java.util.List;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
