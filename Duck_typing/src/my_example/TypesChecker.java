package my_example;

import java.lang.reflect.Method;

public class TypesChecker {
    public static boolean is_equal(Class<?> interfaceClass,
                                   Class<?> T) {
        Method[] methods = interfaceClass.getMethods();
        boolean has_methods = true;
        for (Method method : methods) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();

            try {
                Method declaredMethod = T.getMethod(name,
                        parameterTypes);
                if (!declaredMethod.getReturnType().equals(returnType)) {
                    has_methods = false;
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                has_methods = false;
            }
            if (!has_methods) {
                break;
            }
        }
        return has_methods;
    }
}
