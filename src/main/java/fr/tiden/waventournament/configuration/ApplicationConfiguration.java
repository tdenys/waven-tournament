package fr.tiden.waventournament.configuration;

import fr.tiden.waventournament.model.Arme;
import fr.tiden.waventournament.model.Classe;
import fr.tiden.waventournament.model.Sort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public List<Classe> getClasses() {

        List<Arme> armes = getArmes();
        List<Sort> sorts = getSorts();

        Classe c1 = new Classe(1L, "Iop", armes, sorts);
        Classe c2 = new Classe(2L, "Crâ", armes, sorts);

        return List.of(c1, c2);
    }

    @Bean
    public List<Arme> getArmes() {

        List<Classe> classes = getClasses();

        Arme a1 = new Arme(1L, "Justelame Brutale", classes.get(0));
        Arme a2 = new Arme(2L, "Bouvaloir Orok", classes.get(0));
        Arme a3 = new Arme(3L, "Flamboyante Kasaï", classes.get(0));
        Arme a4 = new Arme(4L, "Larmaguedon Spectral", classes.get(0));
        Arme a5 = new Arme(5L, "Glaive Stalaktoss", classes.get(0));

        return List.of(a1, a2, a3, a4, a5);
    }

    @Bean
    public List<Sort> getSorts() {

        List<Classe> classes = getClasses();

        Sort s1 = new Sort(1L, "Fulgur", "Inflige 10 dégâts et l'état HUILE", classes.get(0));
        Sort s2 = new Sort(2L, "Super patate de forain", "Inflige 25 dégâts", classes.get(0));

        return List.of(s1, s2);
    }
}
