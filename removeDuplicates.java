// How to remove all duplicates from a given string?

import java.util.Arrays;
import java.util.*;   

class removeDuplicates   
{   
    static void removeDuplicate(char str[], int length)   
    {   
        int index = 0;   
        for (int i = 0; i < length; i++)   
        {   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }    
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    public static void main(String[] args)   
    {   
        String info = "This is the program on string assignment";  
        char str[] = info.toCharArray();  
        int len = str.length;   
        removeDuplicate(str, len);   
    }   
}  