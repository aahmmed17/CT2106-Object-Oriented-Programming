import java.util.ArrayList;

public class Order
{
   
    public Customer customer;
    private ShoppingCart cart;
    private Address address;
    private Address deliveryAddress;
    private ArrayList<Item> orderList;
    public long orderNum;
    
    
   public Order(Customer customer, ShoppingCart cart, Address address)
   {
       this.customer = customer;
       this.cart = cart;
       this.address = address;
    orderNum = makeOrderNo();
    orderList = new ArrayList<>();
   }
   
   //generates random order number
    private long makeOrderNo()
    {
        return (long)(Math.random() * 999999 + 100000);
        
    }
    
   public long getorderNum(){
       return orderNum;
   }
   
   public String getNCustomer() {
        return customer.getName();
    }
    
    public String getECustomer(){
        return customer.getEmail();
    }
    
    public int getNoItems(){
        return cart.numItems();
    }
    
    public double getTotalP(){
        return cart.getTotal();
    }
    
    
   public ShoppingCart getShoppingCart(){
       return cart;
   }
   
   public Address getAddress(){
       return address;
   }
   
  
    
   
    
   
   
   
   

      
  
}
