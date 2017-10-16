public class Main {
    public static void main(String[] args) {
        int oskar = 5;
        int damin = 5;
        String test = "ala ma kota";

        /// petelka for
        for(int i = 0; i <= 10; i += 2){
           if(i == 6){
               break;
           }
            System.out.println(i);
        }

        // petelka while
        int counter = 0;
        while (counter < 10){
            System.out.println(counter);
            counter++;
        }

        // petelka do-while
        do{
            System.out.println(counter);
            counter++;
        }while (counter < 20);
    }
}
