package fr.tiden.waventournament.model;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Sort {

    private Long id;

    private String libelle;

    private String description;

    private Classe classe;
}
