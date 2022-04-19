package fr.tiden.waventournament.metier;

import fr.tiden.waventournament.model.Deck;

import java.util.List;

public interface DeckService {

    List<Deck> listerDecks();

    Deck trouverDeck(Long id);

    Deck creerDeck(Deck deck);

    Deck supprimerDeck(Deck deck);
}
