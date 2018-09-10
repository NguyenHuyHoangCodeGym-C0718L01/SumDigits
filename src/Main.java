import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int a = scanner.nextInt();

        System.out.println("Sum digits: " + sumDigit(a));
    }
    
    public static int sumDigit(int a){
        String temp = Integer.toString(a);
        char[] array = temp.toCharArray();
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += Integer.parseInt(String.valueOf(array[i]));
        }
        return sum;
    }
}
