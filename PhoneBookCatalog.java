import java.util.*;
 /**
  * This class models a phone book catalog that contains individual PhoneBookEntry objects.
  * 
  * @author Austin Walley
  * @version 10/23/2021
  */

public class PhoneBookCatalog 
{
    private ArrayList<PhoneBookEntry> phonebook;
    
    public PhoneBookCatalog() 
    {
        phonebook = new ArrayList<>();
    }
    
    public void addEntry(PhoneBookEntry pbEntry) 
    {
        if (pbEntry == null) 
        {
            throw new IllegalArgumentException("Phone Book Entry null");
        }
        phonebook.add(pbEntry);
    }

    public PhoneBookEntry getEntry(int index) 
    {
        if (index < 0 || index >= phonebook.size())
        {
            throw new IllegalArgumentException("Index out of range");
        }    
        return phonebook.get(index);
    }
    
    public PhoneBookEntry removeEntry(int index) 
    {
        if (index < 0 || index >= phonebook.size())
        {
            throw new IllegalArgumentException("Index out of range");
        }
        return phonebook.remove(index);
    }
   
    public void sort()
    {
        Collections.sort(phonebook);
    }
    
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
