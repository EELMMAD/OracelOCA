package se.oracel.elmira.objectwiseTests.dataTypes;

class A1{
    static int i = 10;  //5
    static { System.out.println("A1 Loaded "); } //4
}
public class A{
    static { System.out.println("A Loaded "); }    //1
    public static void main(String[] args){
        System.out.println(" A should have been loaded");  //2
        A1 a1 = null;
        System.out.println(" A1 should not have been loaded");  //3
        System.out.println(a1.i);
    }
}
