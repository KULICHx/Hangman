import java.io.IOException;
import java.util.Scanner;

public class Hangman {

    static Logic logic = new Logic();
    static boolean flag = true;

    public static void main(String[] args) throws IOException {
        while (flag){
            logic.guessingTheWord();
            Restart();
        }
    }

    public static void Restart() throws IOException {
        System.out.println("Хотите сыграть ещё?");
        System.out.println("1: Да");
        System.out.println("2: нет");
        Scanner scanner = new Scanner(System.in);
        int scanNum = scanner.nextInt();
        if (scanNum == 1)
            flag = true;
        else if (scanNum == 2){
            System.out.println("До встречи чемпион)");
            flag = false;
        }
        else{
            System.out.println();
            System.out.println("Вы ввели что-то не то `:|");
            System.out.println();
            Restart();
            System.out.println();
        }
    }
}
