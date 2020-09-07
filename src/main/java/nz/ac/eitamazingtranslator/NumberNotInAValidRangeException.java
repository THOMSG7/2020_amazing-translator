package nz.ac.eitamazingtranslator;

public class NumberNotInAValidRangeException extends Exception {

    private int value;

    public NumberNotInAValidRangeException(int value) {
        this.value=value;
    }

    @Override
    public String getMessage() {
        return "The value typed: "+value+" is not in the acceptable range (1 to 30)";
    }
}
