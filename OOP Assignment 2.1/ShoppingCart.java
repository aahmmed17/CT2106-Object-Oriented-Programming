import java.util.ArrayList;

public class ShoppingCart
{
 private double totalPrice;
 private boolean closed;
 public ArrayList<Item> list;   
 
 public ShoppingCart(Customer customer)
 {
     list = new ArrayList<>();
 }
    
 public void addItem(Item s)
 {
    if(!closed)
    {list.add(s);       
    }
    else{
    System.out.println("Sorry the Shopping Cart is closed");    
    }
}

public void removeItem(int index)
    {
        if(!closed && list.get(index)!=null)
        {
            list.remove(index);
        }
        else
        {
            System.out.println("Sorry the Shopping Cart is closed");
        }
    }

public Item getItem(int index){
  if(list.get(index)!=null)
  {
      return list.get(index);
  }
  else
  {
     System.out.println("This item object does not exist");
     return null;
  }
}

public int numItems()
{
    return list.size();
}

public void listItem()
{
    for(int i=0; i<numItems(); i++)
    {
        System.out.println(list.get(i).toString());
    }
}

//totals the prices of the items
public void totalPrItem()
{
    for(int i=0; i<numItems(); i++)
    {
        totalPrice = totalPrice + getItem(i).getPrice();
    }
    
    System.out.println("Total Price :€" + String.format("%.2f", totalPrice));
}

public double getTotal()
{
    return totalPrice;
}

 public void closed(){
        closed = true;
        System.out.println("The Shopping Cart is now closed");
    }

 public void clear (){
        list.clear();
    }
    
    
}
    
    
    
    
    

