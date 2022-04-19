package fr.tiden.waventournament.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {

    private Long id;

    private String username;

    private String email;

    private String password;

    private List<Deck> decks;

    private boolean estAdmin;
}
