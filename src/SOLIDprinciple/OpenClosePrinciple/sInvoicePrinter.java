package SOLIDprinciple.OpenClosePrinciple;

import SOLIDprinciple.SingleResponsiblityPrinciple.Invoice;

public class sInvoicePrinter {
    private Invoice invoice;

    public sInvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        //print invoice
    }
}
