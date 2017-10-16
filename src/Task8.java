import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String password = "Polska";

        String typedText;
        do{
            System.out.print("Podaj hasło: ");
            typedText = scanner.nextLine();
            if(password.equals(typedText)){
                break;
            }else{
                System.out.println("Błędne hasło");
            }
        }while (true);

        System.out.println("Zalogowano poprawnie");
    }
}
