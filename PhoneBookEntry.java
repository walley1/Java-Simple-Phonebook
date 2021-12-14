 /**
  * This class represents a phone book entry that has a first name, a last name, and a phone number.
  * 
  * @author Austin Walley
  * @version 10/23/2021
  */

public class PhoneBookEntry implements Comparable<PhoneBookEntry>
{
    private String fName;
    private String lName;
    private String pNum;
    
    public PhoneBookEntry(String fName, String lName, String pNum) 
    {
        if (fName == null)
        {
            throw new IllegalArgumentException("First name cannot be empty");
        }
        if (lName == null)
        {
            throw new IllegalArgumentException("Last name cannot be empty");
        }   
        if (pNum == null)
        {
            throw new IllegalArgumentException("Phone number cannot be empty");
        }
    }

    public void setFirstName(String fName) 
    {
        if (fName == null)
        {
            throw new IllegalArgumentException("First name cannot be empty");
        }
        this.fName = fName;
    }
    
    public void setLastName(String lName) 
    {
        if (lName == null)
        {
            throw new IllegalArgumentException("Last name cannot be empty");
        }   
        this.lName = lName;
    }
    
    public void setPhoneNum(String pNum) 
    {
        if (pNum == null)
        {
            throw new IllegalArgumentException("Phone number cannot be empty");
        }    
        this.pNum = pNum;
    }
    
    public String getFirstName() 
    {
        return fName;
    }
    
    public String getLastName() 
    {
        return lName;
    }
    
    public String getPhoneNum() 
    {
        return pNum;
    }
    
    public String toString() 
    {
        return "Name: " + fName + " " + lName + "\nPhone Number: " + pNum;
    }

    public int compareTo(PhoneBookEntry e) 
    {
        if (this.lName == e.lName)
        {
            return 0;
        }
        else if(this.fName == e.fName)
        {
            return 0;
        }
        return (e.toString()).compareTo(this.lName);
    }
    
}
