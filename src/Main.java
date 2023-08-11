import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int arraySizeInput = Integer.parseInt(scanner.nextLine());
        int[] demoArray = new int[arraySizeInput];

        System.out.println("Enter the array elements...\n");
        for (int iterator = 0; iterator < demoArray.length; iterator++)
        {
            demoArray[iterator] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The array elemnents are...\n");
        for(int iterator =0; iterator < demoArray.length; iterator++)
        {
            System.out.print(demoArray[iterator] + " " );
        }
    }
}
