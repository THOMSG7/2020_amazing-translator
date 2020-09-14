package nz.ac.eitamazingtranslator;

public interface IDictionaries {
    void initializeDataSource();
    String getFromDataSource(int number, int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException;
    boolean isInitialized();
}
