import java.io.IOException;
import java.util.Scanner;

public class Logic {

    public void guessingTheWord() throws IOException {

        Dictionary d = new Dictionary();
        String word = (d.wordChoice(d.fillingOutTheDictionary()));
        StringBuilder userWord = new StringBuilder();
        while (userWord.length()!= word.length())
            userWord.append("_");

        int mistakes = 0;
        Scanner scanner = new Scanner(System.in);
        char character = ' ';
        StringBuilder wrongLetters = new StringBuilder();
        while(mistakes != 6 && !(word.equals(userWord.toString()))){
            System.out.println(word);
            System.out.println("Слово: "+ userWord);
            System.out.println("Ошибки (" + mistakes + "): "+ wrongLetters);
            System.out.print("введите букву: ");
            character = scanner.next().charAt(0);
            System.out.println();

            boolean token = false;
            for(int i = 0; i < word.length(); i++){
                if (word.charAt(i) == character) {
                    userWord.setCharAt(i,character);
                    token = true;
                }
            }
            if (!token){
                mistakes++;
                wrongLetters.append(character);
            }
        }
        if (mistakes == 6){
            System.out.println();
            System.out.println("Вы проиграли :(");
            System.out.println("Загаданное слово: " + word);
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("ВЫ ВЫЙГРАЛИ!!!");
            System.out.println("Загаданное слово: " + word);
            System.out.println("Количество ошибок = " + mistakes);
            System.out.println();
        }
    }
}
