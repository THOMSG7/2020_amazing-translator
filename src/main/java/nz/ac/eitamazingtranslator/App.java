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
        germanTranslation.add("Drei");
        germanTranslation.add("Vier");
        germanTranslation.add("Fünf");
        germanTranslation.add("Sechs");
        germanTranslation.add("Sieben");
        germanTranslation.add("Acht");
        germanTranslation.add("Neun");
        germanTranslation.add("Zehn");
        germanTranslation.add("Elf");
        germanTranslation.add("Zwölf");
        germanTranslation.add("Dreizehn");
        germanTranslation.add("Vierzehn");
        germanTranslation.add("Fünfzehn");
        germanTranslation.add("Sechzehn");
        germanTranslation.add("Siebzehn");
        germanTranslation.add("Achtzehn");
        germanTranslation.add("Neunzehn");
        germanTranslation.add("Zwanzig");
        germanTranslation.add("Einundzwanzig");
        germanTranslation.add("Zweiundzwanzig");
        germanTranslation.add("Dreiundzwanzig");
        germanTranslation.add("Vierundzwanzig");
        germanTranslation.add("Fünfundzwanzig");
        germanTranslation.add("Sechsundzwanzig");
        germanTranslation.add("Siebenundzwanzig");
        germanTranslation.add("Achtundzwanzig");
        germanTranslation.add("Neunundzwanzig");
        germanTranslation.add("Dreiβig");

        List<String> frenchTranslation = new ArrayList<>();
        frenchTranslation.add("Un");
        frenchTranslation.add("Deux");
        frenchTranslation.add("Trois");
        frenchTranslation.add("Quatre");
        frenchTranslation.add("Cinq");
        frenchTranslation.add("Six");
        frenchTranslation.add("Sept");
        frenchTranslation.add("Huit");
        frenchTranslation.add("Neuf");
        frenchTranslation.add("Dix");
        frenchTranslation.add("Onze");
        frenchTranslation.add("Douze");
        frenchTranslation.add("Treize");
        frenchTranslation.add("Quatorze");
        frenchTranslation.add("Quinze");
        frenchTranslation.add("Seize");
        frenchTranslation.add("Dix-Sept");
        frenchTranslation.add("Dix-Huit");
        frenchTranslation.add("Dix-Neuf");
        frenchTranslation.add("Vingt");
        frenchTranslation.add("Vingt-Et-Un");
        frenchTranslation.add("Vingt-Deux");
        frenchTranslation.add("Vingt-Trois");
        frenchTranslation.add("Vingt-Quatre");
        frenchTranslation.add("Vingt-Cinq");
        frenchTranslation.add("Vingt-Six");
        frenchTranslation.add("Vingt-Sept");
        frenchTranslation.add("Vingt-Huit");
        frenchTranslation.add("Vingt-Neuf");
        frenchTranslation.add("Trente");

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
