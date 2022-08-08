//5) How to check if two strings are rotations of each other?


public class rotations
{
    static boolean areRotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
    }

    public static void main (String[] args)
    {
        String s1 = "AACD";
        String s2 = "ACDA";
 
        if (areRotations(s1, s2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}