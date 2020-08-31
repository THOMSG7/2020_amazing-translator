package nz.ac.eitamazingtranslator;

public interface IDictionaries {
    void initializeDataSource();
    String getFromDataSource(int number, int languageOption) throws LanguageNotAcceptable,NumberOutOfRangeException;
    boolean isInitialized();
}
