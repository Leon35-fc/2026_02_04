package fabiocarlino.u5l3;

import fabiocarlino.u5l3.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        Menu menu = context.getBean(Menu.class);

//        Pizza margherita = context.getBean("margherita", Pizza.class);
//
        System.out.println(menu);
        context.close();
//
//        Ordine ordine = context.getBean(Ordine.class);
//
//        System.out.println(ordine);
    }

}