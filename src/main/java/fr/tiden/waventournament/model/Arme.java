package fr.tiden.waventournament.model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Arme {

    private Long id;

    private String libelle;

    private Classe classe;
}
