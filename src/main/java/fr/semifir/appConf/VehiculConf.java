package fr.semifir.appConf;

import fr.semifir.entities.Vehicule;
import fr.semifir.entities.Voiture;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculConf {

    @Bean
    public Vehicule vehicule() {
        return new Vehicule();
    }

    @Bean
    public Voiture voiture() {
        return new Voiture();
    }
}
