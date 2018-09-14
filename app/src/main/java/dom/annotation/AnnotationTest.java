package dom.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationTest {

    @SafeVarargs
    public static void main(String... args) {
        Class<?> c = Person.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getAnnotation(WrappedMethod.class) != null) {
                System.out.print(method.getName() + "：" + method.getDefaultValue());
            }
        }
        System.out.println();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Column column = field.getAnnotation(Column.class);
            if (column != null) {
                System.out.print(field.getName() + "：" + column.name()  + ", ");
            }
        }
    }
}
