package nz.ac.eitamazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class TranslationDictionary {

    private IDictionaries dictionaries;


    public boolean initializeDictionaries() {

        dictionaries.initializeDataSource();
    //We don't use it in the application itself
        return dictionaries.isInitialized();

    }

    public String getTranslation(Integer number, Integer languageOption) throws LanguageNotAcceptable,NumberOutOfRangeException{
        return dictionaries.getFromDataSource(number,languageOption);
    }

    public void setDictionaries(IDictionaries dictionaries) {
        this.dictionaries = dictionaries;
    }
}
