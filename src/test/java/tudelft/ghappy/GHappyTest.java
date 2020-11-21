package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;
import tudelft.roman.RomanNumeral;

public class GHappyTest {
    private GHappy gHappyString;

    @BeforeEach
    public void initialize() {
        this.gHappyString = new GHappy();
    }


    @ParameterizedTest(name = "str={0},  result={1}")
    @CsvSource({ "'',false", "'g',false", "'h',false" })
    public void stringLessThanLen2(String str, boolean expectedResult) {
        boolean result = gHappyString.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "str={0},  result={1}")
    @CsvSource({ "'gh',false", "'hg',false","'gg',true","'hh',false" })
    public void stringLen2(String str, boolean expectedResult) {
        boolean result = gHappyString.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "str={0},  result={1}")
    @CsvSource({ "'gab',false", "'agb',false", "'ahg',false" })
    public void justOneG(String str, boolean expectedResult) {
        boolean result = gHappyString.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "str={0},  result={1}")
    @CsvSource({ "'ggb',true", "'agg',true", "'ghg',false" })
    public void has2Gs(String str, boolean expectedResult) {
        boolean result = gHappyString.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "str={0},  result={1}")
    @CsvSource({ "'ggga',true", "'ggag',true", "'gagg',true","'aggg',true" })
    public void above2Gs(String str, boolean expectedResult) {
        boolean result = gHappyString.gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
}
