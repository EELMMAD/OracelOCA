package se.oracel.elmira.objectwiseTests.dataTypes;

public class EqualTest {
    public static void main(String args[]){
        Integer i = new Integer(1) ;
        Long m = new Long(1);
        if( i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");
    }
}
