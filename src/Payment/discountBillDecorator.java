/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

/**
 *
 * @author Owner
 */
public class discountBillDecorator extends paymentDecorator {

    private double DiscountedTotal;
    private double total;

    public discountBillDecorator(Bill decoratedBill) {
        super(decoratedBill);
    }

   public void setTotal(double total){
       this.total = total;
   }

    @Override
    public double getTotal() {
        decoratedBill.getTotal();
        return DiscountedTotal = setBillDiscount(decoratedBill);
    }

    private double setBillDiscount(Bill decoratedBill) {

        double discountTot = total;
        double discount;
        discount = ((discountTot / 100.0) * 10);
        discountTot = discountTot - discount;
        return discountTot;
    }
}
