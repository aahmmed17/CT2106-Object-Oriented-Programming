

public class Email
{
    private Order order;
    
public Email(Order order)
{
    this.order = order;
}


    public void orderSuccess()
    {

        System.out.println("\nTo " + order.getECustomer()+   "\nOrder NO." + order.getorderNum()+ "\n Dear " + order.getNCustomer()+"," + "\n Your Order has been successfully processed");
        System.out.println("\nSummary; Items ordered:"+ order.getNoItems()+ ", Total Amount Paid €" + order.getTotalP());
        System.out.println("\nItems will be shipped to: \n" +order.getAddress().getDoorNum()+ " "+ order.getAddress().getAddLine()+"\n" + order.getAddress().getEirCode() + " in 3-5 business days");
    }
    
    public void orderFailure()
    {
        System.out.println("\nTo " + order.getECustomer()+   "\nOrder NO." + order.getorderNum()+ "\n Dear " + order.getNCustomer()+"," + "\n Unfortunately your order has failed to be processed");
        
    }
    
    
}
