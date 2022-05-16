//Name: Suleyman Onur  Surname: Dogan
//StudenID: 200201203
//Department: Computer Engineering
import java.lang.Math;
import java.util.*;


public class Hw4_Dogan_SuleymanOnur {
    public static void main(String[] args) {
        System.out.println("Part-1:");
        Scanner kb = new Scanner(System.in);
        int [] array = new int[10];
        for (int j = 0; j < array.length ; j++)
        {
            System.out.print ("Enter number "+(j+1)+":");
            array[j] = kb.nextInt();
        }
        System.out.print("Your original array is: ");
        printArray(array);
        System.out.println();
        System.out.print("Sorted array: ");
        sortArray(array);
        System.out.println();


        System.out.println("\nPart-2:");
        System.out.print("Enter number of strings:");
        int n=kb.nextInt();
        ArrayList<String> arraylist=new ArrayList<String>();
        System.out.println("Enter "+n+" strings:");
        for (int j = 1; j < n+1 ; j++)
        {
            System.out.print("");
            String news = kb.next();
            arraylist.add(news);
        }
        arrayListSummary(arraylist);


        System.out.println("\nPart-3:");
        System.out.print("Enter numbers of string:");
        int ns=kb.nextInt();
        ArrayList<String> arrls=new ArrayList<String>();
        System.out.println("Enter "+ns+" strings:");
        for (int j = 0; j < ns+1 ; j++)
        {
            System.out.print("");
            String news = kb.nextLine();
            arrls.add(news);
        }
        arrls.remove(0);
        System.out.print("Enter the value of k (stretch value): ");
        int k=kb.nextInt();
        System.out.println("The original arraylist is: "+arrls);
        System.out.print("The repeated arraylist is: ");
        repeatElements(arrls,k);

        System.out.println("\nPart-4");

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        double sum = 0;
        double count = 0;
        double sum2 = 0;
        double count2 = 0;
        System.out.print("Enter the size of array (n): ");
        int nn = kb.nextInt();
        int[] myArray = new int[nn];
        System.out.print("Enter " + nn + " integers: ");
        for(int i = 0 ; i < nn ; i++) {
            myArray[i] = kb.nextInt();
            sum += myArray[i];
            count += 1;
            if(!myArrayList.contains(myArray[i])) {
                myArrayList.add(myArray[i]);
            }
        }
        for(int i = 0 ; i < myArrayList.size(); i++ ) {
            sum2 += myArrayList.get(i);
            count2 += 1;
        }

        System.out.print("1 - The values of myArray are: ");
        System.out.print("[");
        for (int j = 0; j < myArray.length; j++)
        {
            System.out.print(myArray[j]+", ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("2 - The sum is: " + sum + "." + " The mean is: " + sum/count);
        System.out.println("3 - The values of myArrayList are: " + myArrayList);
        System.out.println("4 - The sum is: " + sum2 + ". The mean is: " + sum2/count2);

    }

    public static void printArray(int[] array)
    {
        for (int j = 0; j <array.length; j++)
        {
            System.out.print (array[j] + " ");
        }
    }
    public static void sortArray(int[] arr)
    {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void arrayListSummary(ArrayList<String> al){
        ArrayList<String> real=new ArrayList<String>();

        for (int i = 0; i < al.size(); i++) {
            String item = al.get(i);
            real.add(item);
        }
        System.out.print("1-The original version of array list is: ");
        System.out.println(al);
        System.out.print("2 - The sorted version of the arraylist is: ");
        Collections.sort(real);
        System.out.println(real);
        System.out.println("3 – The sizes of the elements of the array list are: ");
        for (int i = 0; i < al.size(); i++) {
            String item = al.get(i);
            int itemLength = item.length();
            System.out.println(al.get(i)+" "+itemLength+" characters");
        }
        System.out.print("4 – The reversed version of the arraylist is: ");
        Collections.reverse(real);
        System.out.println(real);
    }
    public static void repeatElements(ArrayList<String> al,int k){
        ArrayList<String> neal=new ArrayList<String>();
        for (int i = 0; i < al.size(); i++) {

            String item = al.get(i);
            for (int j=0;j<k;j++){
                neal.add(item);
            }
        }
        System.out.println(neal);
    }

}