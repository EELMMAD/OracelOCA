package se.oracel.elmira.debugging;

public class OrderProcess {
    public static void main(String[] args) {
        String[] orderList = {"shirt", "pants", "shoes", "socks", "belt", "sweater", "gloves"};
        int topSize = 5;

    OrderProcess orderProcess = new OrderProcess();
    String[] topList = orderProcess.getTopOrders(orderList, 5);

    for(String order: topList){
        System.out.println(order);
    }

    }

    public String[] getTopOrders(String[] orderList, int topSize){
        String[] topOrders = new String[topSize];
        for(int i = 0; i < topSize; i++){
            topOrders[i] = orderList[i];
        }
        return topOrders;
    }
}
