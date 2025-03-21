public class TransactionTest
{

    
    
public TransactionTest()
{
    
}
    
    
    
public static void main(String[] args)
{
 TransactionTest test = new TransactionTest();
 test.transaction1();
 test.transaction2();
 test.transaction3();
  
}


public void transaction1(){
    Item item1 = new Item("Monitor", 198732);
    Item item2 = new Item("Headphones",213259);
    Item item3 = new Item("Book", 800701);
    
    
    Customer customer = new Customer("John", "Doe", "lambda@gzail.com");
    ShoppingCart cart = new ShoppingCart(customer);
    Address address = new Address(10, "Hilly Roads", "H91 WIXP"); 
    
    System.out.println("\n***********************************************************************");
    
    cart.list.add(item1);
    cart.list.add(item2);
    cart.list.add(item3);
    
    
    item1.setPrice(150);
    item2.setPrice(60);
    item3.setPrice(15);
    
    cart.numItems();
    cart.listItem();
    cart.totalPrItem();
    cart.closed();
    
    Order order = new Order(customer, cart, address);
    cart.clear();
    
    Payment payment = new Payment(order, "MasterCard", 1234567891234567L, 8, 25);
    
    payment.Valid();
    
    Email email = new Email(order);
    if (payment.isValid()){
       email.orderSuccess();
    }
    else{
        email.orderFailure();
    }
}


public void transaction2(){
    Item item1 = new Item("Calculator", 162902);
    Item item2 = new Item("Keyboard",647328);
    Item item3 = new Item("Charging", 200701);
    
    
    Customer customer = new Customer("Keelan", "Spellman", "abc@quirk.com");
    ShoppingCart cart = new ShoppingCart(customer);
    Address address = new Address(15, "Salty Springs", "H91 D3P0"); 
    
    System.out.println("\n***********************************************************************");
    
    cart.list.add(item1);
    cart.list.add(item2);
    cart.list.add(item3);
    
    
    item1.setPrice(7);
    item2.setPrice(45);
    item3.setPrice(15);
    
    //removing first item in cart
    cart.removeItem(1);
    
    cart.numItems();
    cart.listItem();
    cart.totalPrItem();
    cart.closed();
    
    Order order = new Order(customer, cart, address);
    cart.clear();
    
    //user inputs payment information however card type is incorrect
    Payment payment = new Payment(order, "MisterCard", 9034564597623567L, 12, 26);
    
    payment.Valid();
    
    Email email = new Email(order);
    if (payment.isValid()){
       email.orderSuccess();
    }
    else{
        email.orderFailure();
    }
    
}

public void transaction3(){
    
}


}

