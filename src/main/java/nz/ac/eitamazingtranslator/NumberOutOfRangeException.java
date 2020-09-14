package nz.ac.eitamazingtranslator;

public class NumberOutOfRangeException extends Exception {

    private int value;

    public NumberOutOfRangeException(int value) {
        this.value=value;
    }

    @Override
    public String getMessage() {
        return "The value typed: "+value+" is not in the acceptable range (1 to 30)";
    }
}
