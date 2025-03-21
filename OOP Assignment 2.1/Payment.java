
    
    



public class Payment
{
    private int expiryYear;
    private int expiryMonth;
    private String cardType;
    private long cardNum;
    private String bankName;
    private boolean valid;
    
    public Payment(Order order, String cardType, long cardNum, int expiryMonth, int expiryYear)
    {
        this.cardType = cardType;
        this.valid = valid;    
    }
    
    private String cardNumStr = Long.toString(cardNum);
    
    public void Valid(){
        
    if (cardNumStr.length()== 16 || expiryMonth>10 && expiryYear>=24 || cardType=="MasterCard" || cardType=="Visa" )
    {
        valid = true;
        System.out.println("Card details successfully validated\n"); 
    }
    else 
     {valid = false;   
     System.out.println("Card details invalid, please try again\n");
    }
    }


    public boolean isValid()
    {
        return valid;
    }

 }   
    
    

