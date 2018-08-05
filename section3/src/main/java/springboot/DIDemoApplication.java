package springboot;

import org.springframework.context.ConfigurableApplicationContext;
import springboot.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIDemoApplication {

    public static void main(String[] args) {
//
//        ApplicationContext context = SpringApplication.run(DIDemoApplication.class);
//
//        MyController myController = context.getBean("myController", MyController.class);
//
//        myController.hello();


        //another way to achieve this is, which closes the application context
        SpringApplication app = new SpringApplication(DIDemoApplication.class);
        final ConfigurableApplicationContext applicationContext = app.run(args);

        MyController controller = applicationContext.getBean("myController", MyController.class);

        controller.hello();

        applicationContext.close();


//        System.out.println(context.getBean(PropertyInjectedControllerUsingSpring.class).sayHello());
//        System.out.println(context.getBean(SetterInjectedControllerUsingSpring.class).sayHello());
//        System.out.println(context.getBean(ConstructorInjectedControllerWithSpring.class).sayHello());



    }
}
