package SOLIDprinciple.OpenClosePrinciple;


import SOLIDprinciple.SingleResponsiblityPrinciple.Marker;

//excatly like Invoice class but only single reason to change
public class sInvoice {
    private Marker marker;  //example of HAS -A relationship (Aggregation OOPS);
    private int quantity;


    public sInvoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price= marker.price*this.quantity;
        return price;
    }

}
