/*
 How to remove characters from the first String which are present in the second String?
 */
public class removeDuplicateChar
{
     public static String removeChars(String s1,String s2)
    {
        for (int index = 0; index < s2.length(); index++)
        {
            char i = s2.charAt(index);
  
            while (s1.contains(i + "")) 
            {
                int itr = s1.indexOf(i);
                s1 = s1.replace((i + ""), "");
            }
        }
        return s1;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String s1, s2;
        s1 = "Assignment";
        s2 = "Assistant";
        System.out.println(removeChars(s1, s2));
    }
}