/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner obj =new Scanner(System.in);
    Scanner obj1 =new Scanner(System.in);
    
    System.out.println("Enter the first string");
       String str1=obj.nextLine();
       System.out.println("Enter the second string");
       String str2=obj.nextLine();
     System.out.println(" Enter the string ");
     String bstr=obj1.nextLine();
     StringBuffer bs=new StringBuffer(bstr);
     int opr=0;
     do
     {
    System.out.println("Enter your choice");
    System.out.println("Enter 1 for displaying the string \n Enter 2 for calculating the length of the string \n Enter 3 for comparing the two strings \n Enter 4 for finding character at particular position \n Enter 5 for substring \n Enter 6 for converting the string to lowercase \n Enter 7 for converting the string to uppercase \n Enter 8 for reversing the string \n Enter 9 for checking the string is pallindrome or not \n Enter 10 for appending the new string to original string \n Enter 11 to replace the characters in the string ");
     opr=obj.nextInt();
    
    switch(opr)
    {
        case 1:  System.out.println("The first string is "+str1);
       System.out.println("The second string is "+str2);
        break;
        case 2:
        System.out.println("The length of the first string is "+str1.length()); 
        System.out.println("The length of second string is "+str2.length()) ;
        break;
        case 3:boolean b;
        b=str1.equals(str2 );
        if(b==true)
        {
            System.out.println("The two strings are equal");
        }
        else
        {
            System.out.println("The two strings are not equal");
        }
        break;
        case 4:
        System.out.println("Enter the position");
        int pos=obj.nextInt();
        System.out.println("The character at position "+pos+" is "+str1.charAt(pos));
        break;
        case 5:System.out.println("enter from where you want the substring");
        int possub=obj.nextInt();
        System.out.println("The substring is "+str1.substring(possub));
        break;
        case 6:
        System.out.println("The string in lower case is "+str1.toLowerCase());
        break;
        case 7:
        System.out.println("The string in upper case is "+str1.toUpperCase());
        break;
        case 8:
        
        System.out.println("The reverse of the string is "+bs.reverse());
        break;
        case 9:
        String rev=new String();
    
    bs.reverse();
    rev=bs.toString();
    if(bstr.equals(rev))
    System.out.println("String is palindrome.");
    else
    System.out.println("String is not palindrome.");
        break;
        case 10:
         System.out.print("Enter a string which you want to append: ");
    String dtr=obj1.nextLine();
    StringBuffer dg=new StringBuffer(dtr);
    System.out.print("String after appending: ");
    System.out.println(bs.append(dg));
        break;
        case 11:
        char ch,ch1;
        
        System.out.println("Enter the character of the string you want to replace and the new character");
         String fd=obj1.next();
         String fd1=obj1.next();
          ch=fd.charAt(0);
          ch1=fd1.charAt(0);
        System.out.println("The new string after replacement is"+bstr.replace(ch,ch1));
        break;
        
        
    
    }
    }while(opr!=0);

	}
}

