package se.oracel.elmira.udemy.practiceTest1;


class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Q9 {
    public static void change(Message m) { //Line n5
        m = new Message(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }

    public static void main(String[] args) {
        Message obj = new Message(); //Line n1
       // obj.print(); //Line n2
        change(obj); //Line n3
       // obj.print(); //Line n4
    }
}
