import java.util.Scanner;

public class FamousQuotes {

    static String[] quotes = {"In the middle of every difficulty lies opportunity. - Albert Einstein",
            "In the middle of every difficulty lies opportunity. – Albert Einstein",
            "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. – Ralph Waldo Emerson",
            "Life is what happens when you're busy making other plans. – John Lennon",
            "It is never too late to be what you might have been. – George Eliot",
            "The journey of a thousand miles begins with one step. – Lao Tzu",
            "You miss 100% of the shots you don’t take. – Wayne Gretzky",
            "Success is not the key to happiness. Happiness is the key to success. – Albert Schweitzer",
            "The best way to predict the future is to create it. – Peter Drucker",
            "Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. – Buddha"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean reader = true;
        while (reader) {

            try {
                System.out.println("\nEnter a number 1 - 10 to select a quote: \n");
                int answer = scanner.nextInt();
                scanner.nextLine();

                System.out.println(quotes[answer]);

                System.out.println("To exit enter Y/N");
                String exit = scanner.nextLine();
                if (exit.equals("y")) {
                    break; }

            } catch (Exception e) {
                System.out.println("\nsorry that number was an invalid input try again: \n");
                int answer = scanner.nextInt();
                System.out.println(quotes[answer]);
            }
        }
    }


}
