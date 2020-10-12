package nz.ac.eitamazingtranslator;

public class LanguageOutOfRangeException extends Exception {

    private String value;

    public LanguageOutOfRangeException(String value) {
        this.value=value;
    }

    @Override
    public String getMessage() {
        return "The value typed: "+value+" is not in the acceptable range (Einz to Dreiβig)";
    }
}
