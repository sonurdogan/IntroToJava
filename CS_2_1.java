// @outhor : onurdogan

import java.util.Scanner;

public class CS_2_1 {
public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //Inputs part
        System.out.print("Please enter a string:");
        String a = kb.nextLine();
        System.out.print("Please enter second string:");
        String b = kb.nextLine();
        countSubStr(a,b); //Inputs used in countsubstr method  
        removeSubStr(a,b); //Inputs used in removesubstr method 
}
public static void countSubStr(String a,String b)
{
	int lenofst=a.length();
	int lenofst2=b.length();
	int lenofst3,left,times;
	if (a.contains(b)) //Check string 1 contains string2
	{
		String anew= a.replace(b,""); //remove string2 from string 1
		lenofst3=anew.length();//length of the removed string
		
		//If we compare real string and removed string,
		//we can find how many times string 2 occurred via a length of string2.
		left=lenofst-lenofst3; 
		
		times=left/lenofst2;
	
		System.out.println("\""+b+"\""+" occours "+times+" times in "+"\""+a+"\"");
	}
	else {
		System.out.println(b+" occours 0 times in "+a);
	}
}
public static void removeSubStr(String a,String b)
{
	String strNew = a.replace(b, "");
	System.out.println("Removed string: "+strNew);
}

}

	
