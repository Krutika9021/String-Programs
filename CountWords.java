// How do you count the number of words in String
 

public class CountWords
{
     public static int 
     countWords(String str)
     {
        if (str == null || str.isEmpty())
            return 0;
        
        String[] words = str.split("\\s+");
      
        return words.length;
    }
    public static void main(String args[])
    {
        String str =  "One two       three\n four\tfive ";
          
        System.out.println("No of words : " + countWords(str));
    }
}
