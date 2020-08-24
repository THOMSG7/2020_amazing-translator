package nz.ac.eitamazingtranslator;

public class inputCollector {
    public static void number(String arps) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.println;
        InputCollector collector = new InputCollector();
        Integer number = null;
        try {
            number = collection.collectionNumber(input);
        }
        catch (UserInputException nfe) {
            return null;
        }
    }

    //method
    public Integer collectNumber(String input) {
        //Exception catches non numeric
        try {
            Integer number = Integer.parseInt(input);
        }
        catch {
            (NumberInputException nfe) {
                throw new UserInputException();
            }
        }
        return number;
    }
}
