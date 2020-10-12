package nz.ac.eitamazingtranslator;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TranslationDictionariesTest {

    private TranslationDictionary dictionaries;

    /*public void setup() {
        //Stub
        dictionaries = new TranslationDictionary();

        //Mock
        ITranslationDatasource mock= Mockito.mock(ITranslationDatasource.class);
        try {
            Mokito.when(mock.getTranslationOf(number 1, languageOption 1)).thenReturn("Un");
            Mokito.when(mock.getTranslationOf(number 2, languageOption 1)).thenReturn("Deus");
            Mokito.when(mock.getTranslationOf(number 12, languageOption 1)).thenReturn("Douze");
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        }


        dictionaries.setDictionaries(new StubDictionary());
    }

    @Test
    public void getTranslationOf_12InFrench_douze() {
        TranslationDictionary dictionaires = new TranslationDictionary();
        dictionaires.initializeDictionaries();

        try {
            Assert.assertEquals("12 in french should have retured douze","Douze",dictionaires.getTranslation(12, 1));
            Assert.fail("It should fail with an unsupported language");
        } catch (LanguageNotAcceptable languageNotAcceptable) {
            languageNotAcceptable.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            Assert.fail("12 does not have any translation available");
        }


    }
    @Test(expected = LanguageNotAcceptable.class)
    public void getTranslationOf_12WithUnsupportedLanguage_throws_LanguageUnsupportedException() {
        TranslationDictionary dictionaires = new TranslationDictionary();
        dictionaires.initializeDictionaries();

        try {
            Assert.assertEquals("12 in french should have retured douze", "Douze", dictionaires.getTranslation(12, 1));
            Assert.fail("It should fail with an unsupported language");
        } catch (LanguageNotAcceptable languageNotAcceptable) {
            languageNotAcceptable.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            Assert.fail("12 does not have any translation available");
        }
    }*/
}
