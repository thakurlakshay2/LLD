package SOLIDprinciple.SingleResponsiblityPrinciple;

public class Invoice {
    private  Marker marker;  //example of HAS -A relationship (Aggregation OOPS);
    private int quantity;


    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price= marker.price*this.quantity;
        return price;
    }

    public void printInvoice(){
        //print invoice
    }

    public void saveToDB(){
        // save the data into DB
    }

}
