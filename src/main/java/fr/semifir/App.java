package fr.semifir;

import fr.semifir.entities.Vehicule;
import fr.semifir.entities.Voiture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("fr.semifir")
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(App.class);
        Vehicule voiture = ctx.getBean(Voiture.class);
        System.out.println(voiture);
    }

}
