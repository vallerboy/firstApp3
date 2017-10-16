import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj N: ");

        int numberN = scanner.nextInt();

        int generatedNumber = 1;
        for(int i = 1; i <= numberN; i++){
            generatedNumber *= i;
        }
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Silnia z ");
        stringBuilder.append(numberN);
        stringBuilder.append(": ");
        stringBuilder.append(generatedNumber);


        System.out.println("Silnia z " + numberN + ": " + generatedNumber);
    }
}
