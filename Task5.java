import java.util.Scanner;

public class Task5 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    

        System.out.println("Enter three numbers: ");

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();

        scanner.close();

        if (input1==input2 && input2==input3) {
            System.out.println("All numbers are equal");

        } else if(input1>input2 &&input1>input3) {
            System.out.println("The largest number is "+input1);
        }else if(input2>input1&&input1>input3){
            System.out.println("The largest number is "+input2);
        
        }else{
        System.out.println("The largest number is "+input3);
        }

        
        
}
}
