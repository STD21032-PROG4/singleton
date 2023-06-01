package org.singleton;

public class Main {
    public static void main(String[] args) {
        ClassUniqueInstance classSingleton = ClassUniqueInstance.INSTANCE;
        System.out.println(classSingleton.getClick());
    }
}