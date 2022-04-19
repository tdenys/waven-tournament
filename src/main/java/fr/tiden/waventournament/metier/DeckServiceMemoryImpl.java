package fr.tiden.waventournament.metier;

import fr.tiden.waventournament.model.Arme;
import fr.tiden.waventournament.model.Classe;
import fr.tiden.waventournament.model.Deck;
import fr.tiden.waventournament.model.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DeckServiceMemoryImpl implements DeckService {

    private List<Deck> decks;

    private List<Classe> classes; //futur ClasseService

    private List<Arme> armes; //futur ArmeService

    private List<Sort> sorts; //futur SortService

    @Override
    public List<Deck> listerDecks() {
        return decks;
    }

    @Override
    public Deck trouverDeck(Long id) {

        Deck deckATrouver = new Deck();
        for (Deck deck : decks) {
            if(deck.getId() == id) {
                deckATrouver = deck;
            }
        }

        return deckATrouver;
    }

    @Override
    public Deck creerDeck(Deck deck) {

        deck.setId(Long.valueOf(dernierId() + 1));
        decks.add(deck);

        return deck;
    }

    @Override
    public Deck supprimerDeck(Deck deckASupprimer) {

        decks.removeIf(deckASupprimer::equals);

        return deckASupprimer;
    }

    private int dernierId() {
        return decks.size() - 1;
    }
}
