package se.oracel.elmira.objectwiseTests.decisionConstructs;

public class TestClass3 {
    public static void main(String[] args)  {

        boolean hasParams = (args == null ? false : true);
        if(hasParams){
            System.out.println("has params");
        }{
            System.out.println("no params");
        }
    }
}
