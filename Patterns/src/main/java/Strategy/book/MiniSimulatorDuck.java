package Strategy.book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MiniSimulatorDuck {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);

        Duck mallard = context.getBean(MallardDuck.class);
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck modal =  context.getBean(ModelDuck.class);
        modal.display();
        modal.performQuack();
        modal.performFly();
    }
}
