package se.oracel.elmira.objectwiseTests.constructorsMethodaIncapsulation;

public class ChangeTest {
    private int myValue = 0;

    public void showOne(int myValue){
        myValue = myValue;
    }

    public void showTwo(int myValue){
        this.myValue = myValue;
    }
    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showOne(100);
        System.out.println(ct.myValue);
        ct.showTwo(200);
        System.out.println(ct.myValue);
    }
}
