package com.jamieadkins.gwent.data.interactor;

import com.jamieadkins.commonutils.mvp.BaseInteractor;
import com.jamieadkins.gwent.data.Card;
import com.jamieadkins.gwent.data.Deck;
import com.jamieadkins.gwent.deck.DecksPresenter;

/**
 * Deck manipulation class.
 */

public interface DecksInteractor extends BaseInteractor<DecksPresenter> {

    void createNewDeck(String name, String faction);

    void addCardToDeck(Deck deck, Card card);

    void removeCardFromDeck(Deck deck, Card card);
}
