package fr.tiden.waventournament.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Classe {

    private Long id;

    private String libelle;

    private List<Arme> armes;

    private List<Sort> sorts;
}
