package nz.ac.eitamazingtranslator;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
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


        TranslationDictionary dictionary = new TranslationDictionary();
        dictionary.setDictionaries(new RealOneDictionary());
        dictionary.initializeDictionaries();
        //REQ: 1
        System.out.println("Please enter a number between 1 and 30 to translate?");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println("The number to be translated is: " + number);

        Integer numberAsInteger=Integer.parseInt(number);

        //REQ: 2
        System.out.println("What is the language: 1 is French, 2 is German?");
        String optionisstring = scanner.nextLine();

        Integer optionAsInteger=Integer.parseInt(optionisstring);


        String translated = null;
        try {
            translated = dictionary.getTranslation(numberAsInteger - 1, optionAsInteger);
        } catch (LanguageNotAcceptable languageNotAcceptable) {

        } catch (NumberOutOfRangeException e) {

        }
        System.out.println(translated);


    }




}
