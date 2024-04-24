package SOLIDprinciple.OpenClosePrinciple;

import SOLIDprinciple.SingleResponsiblityPrinciple.Invoice;

// DAO - data access layer
public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void  saveToDB(){

    }

    public void savToFile(String fileName){
        //save invoice in the file with given name
    }
}
