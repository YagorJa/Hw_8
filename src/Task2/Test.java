package Task2;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple();
        try {
            Field field = Apple.class.getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple,"Зелёное");
            System.out.println("Цвет: " + field.get(apple));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
