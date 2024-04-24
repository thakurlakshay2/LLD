package SOLIDprinciple.OpenClosePrinciple;


// O -
public class Main {
    public static void main(String[] args) {
        //Idea is to extend a capability of a class, DO NOT Modify.
        // the feature might already in production , modifying it means downtime for that feature
        //for eg: Invoice DAO -> save to DB and also added saves to Local .(bad approach)
        //this will lead to downtime.

        //Better implementation is
        //make interface of InvoiceDAO , that contains save. the implement it to 2 classes
            //1. DatabaseInvoiceDAO
            //2. FileInvoiceDAO
    }
}
