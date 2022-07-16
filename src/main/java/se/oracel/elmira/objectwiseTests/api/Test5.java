package se.oracel.elmira.objectwiseTests.api;

import java.util.ArrayList;
import java.util.Locale;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("1234".replace('1', '9'));
        System.out.println("hello world".equals("hello world"));
        System.out.println("HELLO world".equalsIgnoreCase("hello world"));
        System.out.println("hello".concat(" world").trim().equals("hello world"));
        System.out.println("hello world".compareTo("Hello world") < 0);
        System.out.println("Hello world".toLowerCase().equals("hello world"));
    }
}
