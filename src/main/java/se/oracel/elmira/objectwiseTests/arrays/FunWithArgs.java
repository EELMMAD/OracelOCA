package se.oracel.elmira.objectwiseTests.arrays;

public class FunWithArgs {
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }
    public static void main(String[] args) {
        FunWithArgs fwa = new FunWithArgs();
        args = new String[]{"a", "b", "c"};
        String[][] newargs = {args};
        fwa.main(newargs);
    }
}
