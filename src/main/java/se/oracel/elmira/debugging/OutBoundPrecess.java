package se.oracel.elmira.debugging;

public class OutBoundPrecess {
    public static void main(String[] args) {
        OutBoundPrecess testOutboundProcess = new OutBoundPrecess();
        boolean freeShipping = false;
        System.out.println("free Shipping: " + freeShipping);
        testOutboundProcess.assignCarrier(freeShipping);

    }

    public void assignCarrier(boolean freeShipping){
        if(freeShipping){
            System.out.println("Use special carrier.");
        }else {
            System.out.println("Use regular carrier");
        }
        recordShippingCharge(freeShipping);
    }

    public void recordShippingCharge(boolean freeShipping){
        if(!freeShipping){
            System.out.println("Add $5 shipping charge");
        }else {
            System.out.println("No shipping charge");
        }
    }

    public static void out(Object o){
        System.out.println(o.toString());
    }
}
