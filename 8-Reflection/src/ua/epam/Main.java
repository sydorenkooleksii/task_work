package ua.epam;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException {
        // write your code here
        Animal animal = new Animal("Bird", 2, 4);
        Pet pet = new Pet("Fish", 0, 8, "Mustafa");

        Class basic = Animal.class;
        String b = basic.getName();
        Object obj = basic.newInstance();
        System.out.println(b);
        System.out.println();

        Method[] methodsb = basic.getMethods();
        for (Method method : methodsb) {
            if (method.isAnnotationPresent(MyAnn.class)) {
                System.out.println("Method with annotation: ");
                method.invoke(obj);
                System.out.println(method.getName());
            }
        }

        Field[] fieldsBasic = basic.getDeclaredFields();
        getModifiersFields(fieldsBasic);
        Method[] method = basic.getMethods();
        for (Method md : method) {
            Annotation[] annotations = md.getAnnotations();
            if (annotations.length != 0) {
                System.out.println("List of annotations: ");
                for (Annotation a : annotations) {
                    System.out.println("@" + a.annotationType().getSimpleName() + " ");
                }
            }
        }

        Class child = Pet.class;
        String c = child.getName();
        Object objc = child.newInstance();
        System.out.println(c);
        System.out.println();

        Method[] methodsc = child.getMethods();
        for (Method methodc : methodsc) {
            if (methodc.isAnnotationPresent(MyAnn.class)) {
                System.out.println("Method with annotation: ");
                methodc.invoke(objc);
                System.out.println(methodc.getName());
            }
        }

        Field[] fieldsChildSuper = child.getSuperclass().getDeclaredFields();
        getModifiersFields(fieldsChildSuper);
        Field[] fieldsChild = child.getDeclaredFields();
        getModifiersFields(fieldsChild);
        Method[] methods = child.getMethods();
        for (Method m : methods) {
            Annotation[] annotations = m.getAnnotations();
            if (annotations.length != 0) {
                System.out.println("List of annotations: ");
                for (Annotation an : annotations) {
                    System.out.println("@" + an.annotationType().getSimpleName() + " ");
                }
            }
        }
    }

    private static void getModifiersFields(Field[] fieldsName) {

        for (Field field : fieldsName) {
            Class fieldType = field.getType();
            int m = field.getModifiers();
            System.out.println("Name = " + field.getName() + '\n' + "Type = " + fieldType.getName());
            if (Modifier.isPublic(m)) {
                System.out.println("Modifier = public");
                System.out.println();
            }
            if (Modifier.isPrivate(m)) {
                System.out.println("Modifier = privat");
                System.out.println();
            }
            if (Modifier.isProtected(m)) {
                System.out.println("Modifier = protected");
                System.out.println();
            }
            if (Modifier.isFinal(m)) {
                System.out.println("Modifier = final");
                System.out.println();
            }
            if (Modifier.isTransient(m)) {
                System.out.println("Modifier = transient");
                System.out.println();
            }
            if (Modifier.isVolatile(m)) {
                System.out.println("Modifier = volatile");
                System.out.println();
            }
            if (Modifier.isStatic(m)) {
                System.out.println("Modifier = static");
                System.out.println();
            }
        }
    }
}
