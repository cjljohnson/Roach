package com.jamieadkins.gwent.card;

import com.jamieadkins.commonutils.mvp.BasePresenter;
import com.jamieadkins.commonutils.mvp.BaseView;
import com.jamieadkins.gwent.data.CardDetails;
import com.jamieadkins.gwent.data.Deck;

/**
 * Specifies the contract between the view and the presenter.
 */

public interface CardsContract {
    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showCard(CardDetails card);
    }

    interface Presenter extends BasePresenter {
        void sendCardToView(CardDetails card);

        void stop();
    }
}
