package nz.ac.eitamazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class RealOneDictionary implements IDictionaries{
    private List<String> germanTranslation = new ArrayList<>();
    private List<String> frenchTranslation = new ArrayList<>();

    public void initializeDataSource() {

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


    }

    public String getFromDataSource(int number, int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException{
        if (number < 1 || number > 30) {
            throw new NumberOutOfRangeException(number);

        }


        if (languageOption==1){
            return frenchTranslation.get(number - 1);
        }
        else if (languageOption==2){
            return germanTranslation.get(number - 1);
        }
        else {
            throw new LanguageNotSupportedException("Error");
        }

    }

    @Override
    public boolean isInitialized() {
        return frenchTranslation.size()==30 && germanTranslation.size()==30;
    }

}
