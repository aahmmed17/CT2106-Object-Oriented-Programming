 

public class Customer
{

        private String firstName;
        private String surName;
        private String emailAddress;
        private final long customerId;
        
        
    public Customer(String firstName, String surName, String emailAddress){
    this.firstName = firstName;
    this.surName = surName;
    this.emailAddress = emailAddress;
    customerId = makeCustomerId(); 
    }
    
    public long getId(){
         return customerId;
    }
    
    public String getName(){
        return surName;
    }
    
    public String getEmail(){
        return emailAddress;
    }
    
    private long makeCustomerId()
    {
        return (long)(Math.random() * 999999 + 100000);
        
    }
    
}
