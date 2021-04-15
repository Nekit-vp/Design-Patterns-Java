package my_example;

import java.io.InvalidClassException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BirdProxy extends Bird {
    Object bird;

    public BirdProxy(Object bird) {
//        todo: add exception

        if (!TypesChecker.is_equal(Bird.class, bird.getClass())) {
            try {
                throw new InvalidClassException(bird.getClass().getName() +
                        "has not declared Bird interface methods");
            } catch (InvalidClassException e) {
                e.printStackTrace();
            }
        }
        this.bird = bird;
    }

    @Override
    void fly() {
        try {
            Method fly = bird.getClass().getDeclaredMethod("fly");
            Object invoke = fly.invoke(bird);
//          return invoke;
        } catch (NoSuchMethodException |
                InvocationTargetException |
                IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
