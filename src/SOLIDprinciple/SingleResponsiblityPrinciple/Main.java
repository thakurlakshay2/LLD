package SOLIDprinciple.SingleResponsiblityPrinciple;


// S - SINGLE Responsiblity principle -- meaning one reason to change
//using this code is -
    //easy to maintain
    //easy to understand
public class Main {
    public static void main(String[] args) {
        //CHECK whether "INVOICE" class follow single responsiblity principle
        // answer is no. why?,
        // one - just think what if I added "gst" to the calculation logic .
        // second -  print invoice  and save to db will also have a reason to change.




        //MUCH better approach is sInvoice, sInvoiceDAO, sInvoicePrinter............
    }
}
