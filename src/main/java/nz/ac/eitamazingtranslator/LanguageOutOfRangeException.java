package nz.ac.eitamazingtranslator;

public class LanguageOutOfRangeException extends Exception {

    private string value;

    public LanguageOutOfRangeException(string value) {
        this.value=value;
    }

    InMemoryTranslationsDictionary.intializeTranslations()

    @Override
    public String getMessage() {
        return "The value typed: "+value+" is not in the acceptable range (Einz to Dreiβig)";
    }
}
