// @outhor : onurdogan

import java.util.Scanner;

public class CS_2_2 {
public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		System.out.print("Enter the first string:");
        String a2 = kb.nextLine();
        System.out.print("Enter the second string:");
        String b2 = kb.nextLine();
        System.out.println("Words containing tea:");
        checkChars(a2,b2);
		
	}		
	public static void checkChars(String a,String str1){
        String[] arr = a.split(" "); //split string into words in array

        for ( String str2 : arr ) { // get words from array
                int i=0 ;
                int j=0;
                int k=0;
                while (i<str1.length() && j<str2.length()){
                        if (str1.charAt(i)==str2.charAt(j)){ //check word contains words of string 1
                                i++;
                                j=0;
                        }

                        if (str1.length()==i){ // If word contains words of str2, check lengths
                                System.out.println(str2);
                                // If lengths are equal, print it.
                        }
                        else {
                                j++;
                        }
                }
        }
    }
}
