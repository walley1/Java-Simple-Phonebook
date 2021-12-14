//Add class comment and @ tags
 /**
  * This class represents a phone book entry (contact) that has a first name, a last name, and a phone number.
  * 
  * @author Austin Walley
  * @version 10/23/2021
  */

public class PhoneBookEntry implements Comparable<PhoneBookEntry>
{
    private String fName;
    private String lName;
    private String pNum;

    /** 
     * Constructor that takes the two names and phone number as param.
     * @param fName if valid.
     * @param lName if valid.
     * @param pNum if valid.
     * */         
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

    /** 
     * Mutator method that sets first name.
     * @param fName if valid.
     * */
    public void setFirstName(String fName) 
    {
        if (fName == null)
        {
            throw new IllegalArgumentException("First name cannot be empty");
        }
        this.fName = fName;
    }
    
    /** 
     * Mutator method that sets last name.
     * @param lName if valid.
     * */
    public void setLastName(String lName) 
    {
        if (lName == null)
        {
            throw new IllegalArgumentException("Last name cannot be empty");
        }   
        this.lName = lName;
    }
    
    /** 
     * Mutator method that sets phone number.
     * @param pNum if valid.
     * */
    public void setPhoneNum(String pNum) 
    {
        if (pNum == null)
        {
            throw new IllegalArgumentException("Phone number cannot be empty");
        }    
        this.pNum = pNum;
    }
    
    /** 
     * Accessor method that gets first name.
     * @return first name.
     * */
    public String getFirstName() 
    {
        return fName;
    }
    
    /** 
     * Accessor method that gets last name.
     * @return last name.
     * */
    public String getLastName() 
    {
        return lName;
    }
    
    /** 
     * Accessor method that gets phone number.
     * @return phone number.
     * */
    public String getPhoneNum() 
    {
        return pNum;
    }
    
    /** 
     * toString method that returns phone book entry.
     * @return formatted phone book entry.
     * */
    public String toString() 
    {
        return "Name: " + fName + " " + lName + "\nPhone Number: " + pNum;
    }
    
    /** 
     * Compareto method that sorts phone book entries.
     * @param e PhoneBookEntry.
     * @return e PhoneBookEntry at index.
     * */
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
