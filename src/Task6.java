import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
       final int number = 444;
       Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj!");
        System.out.println("Wpisuj i odgaduj");

        int userInput;

        do{
            System.out.print("Podaj liczbę: ");
            userInput = scanner.nextInt();
            if(userInput < number){
                System.out.println("Celuj wyzej");
            }else if(userInput > number){
                System.out.println("Celuj nizej");
            }
//            if(userInput < number){
//                System.out.println("Celuj wyzej");
//            }
//            if(userInput > number){
//                System.out.println("Celuj nizej");
//            }
        }while (userInput != number);

        /////
    }
}
