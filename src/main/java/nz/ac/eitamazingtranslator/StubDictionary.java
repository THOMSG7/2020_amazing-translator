package nz.ac.eitamazingtranslator;

public class StubDictionary implements IDictionaries{
    @Override
    public void initializeDataSource() {

    }

    @Override
    public String getFromDataSource(int number, int languageOption) throws NumberOutOfRangeException, LanguageNotAcceptable {
        if (languageOption==1) {
            switch (number) {
                case 1:
                    return "un";
                case 2:
                    return "Deus";
                case 12:
                    return "Duze";

                default:
                    throw new NumberOutOfRangeException(number);
            }
        } else if (languageOption == 2) {
            switch (number) {
                case 1:
                    return "Einz";
                case 2:
                    return "Zinz";
                default:
                    throw new NumberOutOfRangeException(number);

            }
        }else
            throw new LanguageNotAcceptable();

    }

    @Override
    public boolean isInitialized() {
        return true;
    }

}
