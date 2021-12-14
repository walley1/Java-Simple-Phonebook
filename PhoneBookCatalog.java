import java.util.*;
//Add class comment and @ tags
 /**
  * This class will model a phone book catalog that contains individual PhoneBookEntry objects.
  * 
  * @author Austin Walley
  * @version 10/23/2021
  */

public class PhoneBookCatalog 
{
    private ArrayList<PhoneBookEntry> phonebook;
    
    /** 
     * Constructor that takes no param and initializes instance variable as ArrayList of type PhoneBookEntry.
     * */
    public PhoneBookCatalog() 
    {
        phonebook = new ArrayList<>();
    }
    
    /** 
     * The addEntry method that takes a PhoneBookEntry object as a param and adds it to the ArrayList. 
     * @param pbEntry object.
     * */
    public void addEntry(PhoneBookEntry pbEntry) 
    {
        if (pbEntry == null) 
        {
            throw new IllegalArgumentException("Phone Book Entry null");
        }
        phonebook.add(pbEntry);
    }
    
    /** 
     * The getEntry method that takes an int as param and returns the entry located at that index in the ArrayList.
     * @param index int.
     * @return PhoneBookEntry at index.
     * */
    public PhoneBookEntry getEntry(int index) 
    {
        if (index < 0 || index >= phonebook.size())
        {
            throw new IllegalArgumentException("Index out of range");
        }    
        return phonebook.get(index);
    }
    
    /** 
     * The removeEntry method that takes an int as param and removes the entry located at that index in the ArrayList
     * @param index int
     * @return PhoneBookEntry at index 
     * */
    public PhoneBookEntry removeEntry(int index) 
    {
        if (index < 0 || index >= phonebook.size())
        {
            throw new IllegalArgumentException("Index out of range");
        }
        return phonebook.remove(index);
    }

    /** 
     * The sort() method that uses the Collections sort method to sort the catalog.
     * */    
    public void sort()
    {
        Collections.sort(phonebook);
    }
    
    /** 
     * The toString() method that formats the phone book.
     * @return output of the formatted string.
     * */
    public String toString() 
    {
        String output = "";
        for(int i=0;i<phonebook.size();i++)
        {
            output=output+phonebook.get(i).toString()+"\n--------------------\n";
        }
        return output;
    }   

}
