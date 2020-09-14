package nz.ac.eitamazingtranslator;

import java.util.Hashtable;

public interface TranslationDictionary {

    public Hashtable<SupportedLanguage, Hashtable<Integer, String>> getTranslations();
    public int intializeTranslations();

    public int getReverseTranslationOf(String word) {
        int index=germanTranslation.indexOf(word)
    }

}
