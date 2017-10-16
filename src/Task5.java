import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbę N: ");

        int someNumber = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for(int i = 1; i <= someNumber; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
