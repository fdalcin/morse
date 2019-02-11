import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Translator translator = new Translator();

        System.out.println("Type a message to translate to morse code:");

        String morse = translator.toMorse(scanner.nextLine());

        System.out.println("Sentence translated is:");
        System.out.println(morse);

        System.out.println("Now, type a morse code to translate:");

        String sentence = translator.fromMorse(scanner.nextLine());

        System.out.println("Morse code translated is:");
        System.out.println(sentence);
    }
}
