package se.oracel.elmira.objectwiseTests.api;

public class Test1 {
    public static void main(String[] args) {
        char ch = "12345".charAt(3);
        System.out.println(ch); //4

        String st = "12345";
        char myChar = st.charAt(st.length());
        System.out.println(myChar);
    }
}
