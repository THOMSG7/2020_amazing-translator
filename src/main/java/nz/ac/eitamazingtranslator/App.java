package nz.ac.eitamazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> germanTranslation = new ArrayList<>();
        germanTranslation.add("Einz");
        germanTranslation.add("Zwei");
        germanTranslation.add("Einz");

        List<String> frenchTranslation = new ArrayList<>();
        frenchTranslation.add("Onze");
        frenchTranslation.add("Einz");
        frenchTranslation.add("Einz");

        System.out.println("What is the number to translate?");
        Scanner scanner = new Scanner(System.in);
        String numberisstring = scanner.nextLine();
        Integer number = null;
        try {
            number = Integer.parseInt(numberisstring);
            System.out.println(number);
        }
        catch (NumberFormatException nfe) {
            System.out.println("The number has to be numeric");
            System.exit(0);
        }
        System.out.println("What is the language: 1 is French, 2 is German?");

        Integer option = null;
        try {
            option = Integer.parseInt(optionisstring);
            System.out.println(option);
        }
        catch (NumberFormatException nfe) {
            System.out.println("The option has to be numeric");
            System.exit(0);
        }

        if (option == 1) {
            string translation = frenchTranslation.get(number - 1);
        }

    }
}
