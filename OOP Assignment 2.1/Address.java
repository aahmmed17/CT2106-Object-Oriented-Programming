
public class Address{
    
   private int doorNum;
   private String addLine;
   private String eirCode;
   
public Address(int doorNum, String addLine, String eirCode)
{
   this.doorNum = doorNum;
   this.addLine = addLine;
   this.eirCode = eirCode; 
}


public int getDoorNum()
{
    return doorNum;
}

public void setDoorNum(int dNum)
{
    doorNum = dNum;
}

public String getAddLine()
{
   return addLine; 
}

public void setAddLine(String aLine)
{
  addLine = aLine;
}

public String getEirCode()
{
    return eirCode;
}

public void setEirCode(String eCode)
{
    eirCode = eCode;
}

}