package nz.ac.eitamazingtranslator;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        TranslationDictionary dictionary=new TranslationDictionary();

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
