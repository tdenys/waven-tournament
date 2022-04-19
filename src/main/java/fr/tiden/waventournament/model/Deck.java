package fr.tiden.waventournament.model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Deck {

    private Long id;

    private Classe classe;

    private Arme arme;

    private Utilisateur auteur;

    private String titre;

    private String description;

}
